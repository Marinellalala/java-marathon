package com.java.marathon.sprint14_JavaStreamAPI.Question1;

// Let the key of Map is project name and value contains list of participants.
//        Create a Stream<String> nameList(Map<String, Stream<String>> map) method of the MyUtils class to build sorted stream of all participants without duplication.
//        Please ignore null or empty strings, extra spaces and case sensitivity.
//        Throw NullPointerException if map is null.
//        For example, for a given map
//        {"Desktop"=[" iVan", "PeTro ", " Ira "], "Web"=["STepan", "ira ", " Andriy ", "an na"], "Spring"=["Ivan", "Anna"]}
//        you should get
//        ["Andriy", "Anna", "Ira", "Ivan", "Petro ", "Stepan"]

import java.util.*;
import java.util.stream.Stream;

public class MyUtils {
    public Stream<String> nameList(Map<String, Stream<String>> map) {
        return Optional.of(map.values()).get().stream().filter(Objects::nonNull)
                .flatMap(stringStream1 -> stringStream1.filter(Objects::nonNull)
                        .map(s1 -> s1.replaceAll(" ", ""))).filter(s -> !s.isEmpty())
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase()).distinct().sorted();
    }

    public static void main(String[] args) {
        Map<String, Stream<String>> proj = new HashMap<>();
        Stream<String> a = Stream.of(" iVan", "PeTro ", " Ira ");
        Stream<String> b = Stream.of("STepan", "ira ", " Andriy ", "an na");
        Stream<String> c = Stream.of("Ivan", "Anna", null);
        proj.put("Desktop", a);
        proj.put("Web", b);
        proj.put("Spring", c);

        MyUtils myUtils = new MyUtils();
        myUtils.nameList(proj).forEach(System.out::println);

    }
}
