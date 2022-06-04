package com.java.marathon.sprint15_JavaDataBaseConnectivity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyUtils {

    private Connection connection;
    private Statement statement;
    private String schemaName;

    public Connection createConnection() throws SQLException {
        DriverManager.registerDriver(new org.h2.Driver());
        connection = DriverManager.getConnection("jdbc:h2:mem:test", "", "");
        return connection;
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }

    public Statement createStatement() throws SQLException {
        statement = connection.createStatement();
        return statement;
    }

    public void closeStatement() throws SQLException {
        statement.close();
    }

    public void createSchema(String schemaName) throws SQLException {
        this.schemaName = schemaName;
        statement.executeUpdate("CREATE SCHEMA " + schemaName);
    }

    public void dropSchema() throws SQLException {
        statement.executeUpdate("drop SCHEMA " + schemaName);
    }

    public void useSchema() throws SQLException {
        statement.executeUpdate("use " + schemaName);
    }

    public void createTableRoles() throws SQLException {
        statement.executeUpdate("create table Roles(" +
                "id int AUTO_INCREMENT," +
                "roleName varchar," +
                "PRIMARY KEY (id))");
    }

    public void createTableDirections() throws SQLException {
        statement.executeUpdate("create table Directions(" +
                "id int AUTO_INCREMENT," +
                "directionName varchar," +
                "PRIMARY KEY (id))");
    }

    public void createTableProjects() throws SQLException {
        statement.executeUpdate("create table Projects(" +
                "id int AUTO_INCREMENT," +
                "projectName varchar," +
                "directionId int," +
                "PRIMARY KEY (id)," +
                "FOREIGN KEY (directionId) REFERENCES Directions(id))");
    }

    public void createTableEmployee() throws SQLException {
        statement.executeUpdate("create table Employee (" +
                "id int AUTO_INCREMENT," +
                "firstName varchar," +
                "roleId int," +
                "projectId int," +
                "PRIMARY KEY (id)," +
                "FOREIGN KEY (roleId) REFERENCES Roles(id)," +
                "FOREIGN KEY (projectId) REFERENCES Projects(id))");
    }

    public void dropTable(String tableName) throws SQLException {
        statement.executeUpdate("drop table " + tableName);
    }

    public void insertTableRoles(String roleName) throws SQLException {
        statement.executeUpdate(String.format("INSERT INTO Roles(roleName) VALUES('%s')", roleName));
    }

    public void insertTableDirections(String directionName) throws SQLException {
        statement.executeUpdate(String.format("INSERT INTO Directions(directionName) VALUES('%s')", directionName));
    }

    public void insertTableProjects(String projectName, String directionName) throws SQLException {
        statement.executeUpdate(String.format("INSERT INTO Projects(projectName, directionId) VALUES('%s', '%s')", projectName, getDirectionId(directionName)));
    }

    public void insertTableEmployee(String firstName, String roleName, String projectName) throws SQLException {
        statement.executeUpdate(String.format("INSERT INTO Employee(firstName, roleId, projectId) VALUES('%s', '%s', '%s')", firstName, getRoleId(roleName), getProjectId(projectName)));
    }

    public int getRoleId(String roleName) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT id FROM Roles WHERE roleName ='" + roleName + "';");
        int result = -1;
        if (resultSet.next()) {
            result = resultSet.getInt(1);
        }
        resultSet.close();
        return result;
    }

    public int getDirectionId(String directionName) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT id FROM Directions WHERE directionName='" + directionName + "';");
        int result = -1;
        if (resultSet.next()) {
            result = resultSet.getInt(1);
        }
        resultSet.close();
        return result;
    }

    public int getProjectId(String projectName) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT id FROM Projects WHERE projectName ='" + projectName + "';");
        int result = -1;
        if (resultSet.next()) {
            result = resultSet.getInt(1);
        }
        resultSet.close();
        return result;
    }

    public int getEmployeeId(String firstName) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT id FROM Employee WHERE firstName ='" + firstName + "';");
        int result = -1;
        if (resultSet.next()) {
            result = resultSet.getInt(1);
        }
        resultSet.close();
        return result;
    }

    public List<String> getAllRoles() throws SQLException {
        List<String> roles = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement("SELECT roleName FROM Roles");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            roles.add(resultSet.getString("roleName"));
        }
        resultSet.close();
        return roles;
    }

    public List<String> getAllDirestion() throws SQLException {
        List<String> directions = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT directionName FROM Directions");
        while (resultSet.next()) {
            directions.add(resultSet.getString("directionName"));
        }
        resultSet.close();
        return directions;
    }

    public List<String> getAllProjects() throws SQLException {
        List<String> projects = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT projectName FROM Projects");
        while (resultSet.next()) {
            projects.add(resultSet.getString("projectName"));
        }
        resultSet.close();
        return projects;
    }

    public List<String> getAllEmployee() throws SQLException {
        List<String> employee = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT firstName FROM Employee");
        while (resultSet.next()) {
            employee.add(resultSet.getString("firstName"));
        }
        resultSet.close();
        return employee;
    }

    public List<String> getAllDevelopers() throws SQLException {
        List<String> developers = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT firstName FROM Employee WHERE roleId = 1");
        while (resultSet.next()) {
            developers.add(resultSet.getString("firstName"));
        }
        resultSet.close();
        return developers;
    }

    public List<String> getAllJavaProjects() throws SQLException {
        List<String> javaDevelopers = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT projectName FROM Projects WHERE directionId  = 1");
        while (resultSet.next()) {
            javaDevelopers.add(resultSet.getString("projectName"));
        }
        resultSet.close();
        return javaDevelopers;
    }

    public List<String> getAllJavaDevelopers() throws SQLException {
        List<String> allJavaDevelopers = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT firstName FROM Employee WHERE roleId = 1 AND (projectId = 1 OR projectId = 2)");
        while (resultSet.next()) {
            allJavaDevelopers.add(resultSet.getString("firstName"));
        }
        resultSet.close();
        return allJavaDevelopers;
    }

    public static void main(String[] args) throws SQLException {
        MyUtils mu = new MyUtils();
        mu.createConnection();
        mu.createStatement();

        mu.createSchema("test");
        mu.createTableRoles();
        mu.createTableDirections();
        mu.createTableProjects();
        mu.createTableEmployee();

        mu.insertTableRoles("Developer");
        mu.insertTableRoles("DevOps");
        mu.insertTableRoles("QC");

        mu.insertTableDirections("Java");
        mu.insertTableDirections("Python");
        mu.insertTableDirections(".Net");

        mu.insertTableProjects("MoonLight", "Java");
        mu.insertTableProjects("Sun", "Java");
        mu.insertTableProjects("Mars", "Python");

        mu.insertTableEmployee("Ivan", "Developer", "MoonLight");
        mu.insertTableEmployee("Petro", "Developer", "Sun");
        mu.insertTableEmployee("Stepan", "Developer", "Mars");
        mu.insertTableEmployee("Andriy", "DevOps", "MoonLight");
        mu.insertTableEmployee("Vasyl", "DevOps", "Mars");
        mu.insertTableEmployee("Ira", "Developer", "MoonLight");
        mu.insertTableEmployee("Anna", "QC", "MoonLight");
        mu.insertTableEmployee("Olya", "QC", "Sun");
        mu.insertTableEmployee("Maria", "QC", "Mars");

        String out1 = mu.getAllRoles().stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println((out1.equals("[Developer, DevOps, QC]") ? "OK" : "FAIL") + " " + out1);

        String out2 = mu.getAllDirestion().stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println((out2.equals("[Java, Python, .Net]") ? "OK" : "FAIL") + " " + out2);

        String out3 = mu.getAllProjects().stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println((out3.equals("[MoonLight, Sun, Mars]") ? "OK" : "FAIL") + " " + out3);

        String out4 = mu.getAllEmployee().stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println((out4.equals("[Ivan, Petro, Stepan, Andriy, Vasyl, Ira, Anna, Olya, Maria]")
                ? "OK" : "FAIL") + " " + out4);

        String out5 = mu.getAllDevelopers().stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println((out5.equals("[Ivan, Petro, Stepan, Ira]") ? "OK" : "FAIL") + " " + out5);

        String out6 = mu.getAllJavaProjects().stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println((out6.equals("[MoonLight, Sun]") ? "OK" : "FAIL") + " " + out6);

        String out7 = mu.getAllJavaDevelopers().stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println((out7.equals("[Ivan, Petro, Ira]") ? "OK" : "FAIL") + " " + out7);
    }

}

