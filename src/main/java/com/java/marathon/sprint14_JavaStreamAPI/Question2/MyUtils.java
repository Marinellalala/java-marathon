package com.java.marathon.sprint14_JavaStreamAPI.Question2;

//Create a Map<String, Stream<String>> phoneNumbers(List<Stream<String>> list) method of the MyUtils class to build a Map of all phone numbers.
//        The key of Map is code of network and value contains sorted list of phones.
//        Remove all spaces, brakets and dashes from phone numbers.
//        For example, for a given
//        [["093 987 65 43", "(050)1234567", "12-345"], ["067-21-436-57", "050-2345678", "0939182736", "224-19-28"], ["(093)-11-22-334", "044 435-62-18", "721-73-45"]]
//        you should get
//        {"050"=["1234567", "2345678"], "067"=["2143657"], "093"=["9876543", "9182736", "1122334"], "044"=["4356218"], "loc"=["7217345", "2241928"], "err"=["12345"]}

import java.util.*;
import java.util.stream.Stream;

public class MyUtils {
    public Map<String, Stream<String>> phoneNumbers(List<Stream<String>> list) {
        Map<String, Stream<String>> map = new HashMap<>();
        list.stream().filter(Objects::nonNull).flatMap((Stream<String> stringStream) -> stringStream.filter(Objects::nonNull).map(s -> s.replaceAll("[ \\-()]", "")).filter(s-> !s.isEmpty())
        ).forEach(s -> {
            if (s.length() == 10) {
                map.put(s.substring(0, 3), Stream.concat(map.getOrDefault(s.substring(0, 3), Stream.empty()), Stream.of(s.substring(3,10))).distinct().sorted());
            }
            if (s.length() == 7) {
                map.put("loc", Stream.concat(map.getOrDefault("loc", Stream.empty()), Stream.of(s)).distinct().sorted());
            }
            if (s.length() < 7 || s.length() > 10){
                map.put("err", Stream.concat(map.getOrDefault("err", Stream.empty()), Stream.of(s)).distinct().sorted());
            }
        });
        return map;
    }

    public static void main(String[] args) {
        List<Stream<String>> list = new ArrayList<>();

        Stream<String> a = Stream.of("093 987 65 43", "(050)1234567", "12-345");
        Stream<String> b = Stream.of("067-21-436-57", "050-2345678", "0939182736", "224-19-28");
        Stream<String> c = Stream.of("(093)-11-22-334", "044 435-62-18", "721-73-45");
        list.add(a);
        list.add(b);
        list.add(c);

        MyUtils myUtils = new MyUtils();
        myUtils.phoneNumbers(list).entrySet().forEach(System.out::println);

    }
}
