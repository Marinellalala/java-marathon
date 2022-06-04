package com.java.marathon.sprint07_NestedInnerClassesEnums.Question5;

public class App {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook(4);
        System.out.println(addressBook.create("John", "Brown", "Address #1"));
        System.out.println(addressBook.create("Bohn", "Brown", "Address #1"));
        System.out.println(addressBook.update("John", "Brown", "Address #1123"));
        System.out.println(addressBook.read("John", "Brown"));
//        System.out.println(addressBook.create("John", "Brown", "Address #1"));
//        System.out.println(addressBook.update("John", "Brown", "Address #2"));
//        System.out.println(addressBook.read("John", "Brown"));
//        addressBook.sortedBy(SortOrder.ASC);
//        System.out.println(addressBook.read("Karen1", "Davis"));
//        addressBook.create("Steven", "Taylor", "Address #1");
//        addressBook.create("Susan", "Brown", "Address # 4");
//        System.out.println(addressBook.update("Steven", "Taylor", "Address #3"));
        System.out.println(addressBook.delete("John", "Brown"));
//        System.out.println(addressBook.update("John", "Brown", "Address #2"));
//        for (Object record : addressBook) {
//            System.out.println(record);
//        }
    }
}
