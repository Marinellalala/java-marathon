package com.java.marathon.sprint16_exersices.other;

public class Main {
//     static class Mapper{
//        public static <T> T map(T t){
//            return t;
//        }
//    }

    public static void main(String[] args) throws CloneNotSupportedException {

        // code from girls package
//        Girl girl = new Girl("Inna", 25);
//        Girl girl1 = new Girl("Inna", 25);
//        SuperGirl girl2 = new SuperGirl("Inna", 25, "gjgj");
//        System.out.println(girl.hashCode());
//        System.out.println(girl1.hashCode());
//        System.out.println(girl.equals(girl1));
//        System.out.println(Girl.count);

        // code from shapes package
//        Shape[] shapes = new Shape[3];
//        shapes[0] = new Circle("red", 1,2,3);
//        shapes[1] = new Rectangle("blue", 1,2,3,4);
//        shapes[2] = new Circle("green", 1,2,3);
//        for (Shape shape : shapes) {
//            System.out.println(shape.draw());


        Base d = new Derived();
        d.getValue();

//        String str =  Mapper.map("asdf");
//        System.out.println(str);
//        Random random = new Random();
//        System.out.println(
//        Stream.generate(()->random.nextInt(7))
//                .limit(4)
//                .max(Comparator.naturalOrder()));
////      .orElse(6));
//        String string = "1234";
//        string.codePoints();
//        string.chars().boxed();
//
//        try (Connection con = DriverManager.getConnection("hfjdhgkd", "root", "root")){
//            PreparedStatement statement = con.prepareStatement("fdggfgd(?, ?)");
//            statement.setInt(1, 100);
//            statement.setString(2, "fjhdk");
//
//        }

//        int t = 5, s = 4;
//        String str1 = t >= ++s? "yes" : "no";
//        System.out.println(str1);
//
//        int a = 3, b = 2;
//        String str2 = a-- == b ? "yes" : "no";
//        System.out.println(str2);

//        int i = 0;
//        do {
//            System.out.print(++i);
//        } while (i < 5);

//        for(int i = 10; i >0; i--){
//            System.out.println(i);
//        }

        int[] workHours = { 8, 6, 8, 7, 7 };

        for (int h = 0; h < workHours.length; h++) {
            System.out.println(workHours[h]);
        }

        for (int h : workHours) {
            System.out.println(h);
        }

//        Point point = new Point(10,10);
//        Point point1 = new Point(10,10);
//        System.out.println(point.toString());
//        System.out.println(point.equals(point1));
//        System.out.println(point.hashCode());
//        System.out.println(point1.hashCode());
//        System.out.println(point.getClass() == Point.class);  // когда приходит объект на вход, в завис от типа можно соверщать те или иные действия
//        Point clone = (Point) point.clone();
//        System.out.println((clone));

    }
}
