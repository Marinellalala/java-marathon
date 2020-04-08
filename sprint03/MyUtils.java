import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Objects;
import java.util.Map;

public class MyUtils {

//    Question 1.
//    Create a arrSort() method of the MyUtils class to sort a two-dimensional integer array by descending the elements of the first column.  In the case of equality of elements in the first column, the elements of the second column must be sorted in ascending order.
//    For example, for a given array
//         1 2 3
//         1 4
//         3 2
//         3 3 5
//    you should get
//         3 2
//         3 3 5
//         1 2 3
//         1 4
    
    public int[][] arrSort(int[][] arr) {
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length == 0 || o2.length == 0) {
                return -1;
            }
            return Integer.compare(o2[0], o1[0]);
        });
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length == 0 || o2.length == 0) {
                return 1;
            }
            if (o1[0] == o2[0]) {
                if (o1.length > 1 && o2.length > 1) {
                    return Integer.compare(o1[1], o2[1]);
                }
                if (o1.length == 1 && o2.length > 1) {
                    return -1;
                }
                if (o1.length > 1) {
                    return 1;
                }
            }
            return 0;
        });
        return arr;
    }

//    Question 2.
//    Create the strSort() method of the MyUtils class to sort a list of stirngs
//    first by length and alphabetically within the same length. The original list must be unchanged.
//    For example, for a given list [zz, abc, aa, aaa] you should get [aa, zz, aaa, abc].

    public List<String> strSort(List<String> originList) {
        List<String> list = new ArrayList<>(originList);
        list.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        return list;
    }

//    Question 3.
//    Create a listMapCompare() method of the MyUtils class to compare the contents
//    of a list of strings and the values of a map.
//    For example, for a given list [aa, bb, aa, cc] and map {1=cc, 2=bb, 3=cc, 4=aa,
//    5=cc} you should get true.

    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        Set<String> listSet = new HashSet<>();
        Set<String> mapSet = new HashSet<>();
        for (String i : list) {
            listSet.add(i);
        }
        for (Map.Entry<String, String> item : map.entrySet()) {
            mapSet.add(item.getValue());
        }
        return listSet.containsAll(mapSet);
    }

//    Question 4.
//    Create a createNotebook() method of the MyUtils class to create a new map with name
//    as key and phone list as value.  The method receives a map  with phone as key and name as value.
//    For example, for a given map {0967654321=Petro, 0677654321=Petro, 0501234567=Ivan,
//    0970011223=Stepan, 0631234567=Ivan} you should get {Ivan=[0501234567, 0631234567],
//    Petro=[0967654321, 0677654321], Stepan=[0970011223]}.

    public Map<String, List<String>> createNotebook(Map<String, String> phones) {
        Map<String, List<String>> noteBook = new HashMap<>();
        for (Map.Entry<String, String> item : phones.entrySet()) {
            noteBook.putIfAbsent(item.getValue(), new ArrayList<>());
            noteBook.get(item.getValue()).add(item.getKey());
        }
        return noteBook;
    }

//    Question 5.
//    Create the commonStudents() method of the MyUtils class to return a HashSet of common
//    elements of two student lists.
//    For example, for a given list1 [Students [id=1, name=Ivan], Students [id=2, name=Petro],
//    Students [id=3, name=Stepan]] and list2 [Students [id=1, name=Ivan], Students [id=3, name=Stepan],
//    Students [id=4, name=Andriy]] you should get [Students [id=3, name=Stepan], Students [id=1, name=Ivan]].

    public static class Student {
        private int id;
        private String name;

        // Constructor, metthods, Code
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id &&
                    Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    public Set<Student> commonStudents(List<Student> list1, List<Student> list2) {
        Set<Student> people = new HashSet<Student>();
        for (Student student : list1) {
            for (Student stud : list2) {
                if (student.equals(stud)) {
                    people.add(student);
                    break;
                }
            }
        }
        return people;
    }
}