//package com.softserve.itacademy.exersices.JSON;
//
//import org.json.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class JSONObj {
//    public static void main(String[] args) {
////        Creating JSON Directly from JSONObject
//        JSONObject jo = new JSONObject();
//        jo.put("name", "jon doe");
//        jo.put("age", "22");
//        jo.put("city", "chicago");
////        Creating JSON from Map
//        Map<String, String> map = new HashMap<>();
//        map.put("name", "jon doe");
//        map.put("age", "22");
//        map.put("city", "chicago");
//        JSONObject jo2 = new JSONObject(map);
////          Creating JSONObject from JSON String
//        JSONObject jo1 = new JSONObject(
//                "{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}"
//        );
////        Serialize Java Object to JSON
////        DemoBean demo = new DemoBean();
////        demo.setId(1);
////        demo.setName("lorem ipsum");
////        demo.setActive(true);
////        JSONObject jo3 = new JSONObject(demo);
//
////        Creating JSONArray
//        JSONArray ja = new JSONArray();
//        ja.put(Boolean.TRUE);
//        ja.put("lorem ipsum");
//
//        JSONObject jo4 = new JSONObject();
//        jo.put("name", "jon doe");
//        jo.put("age", "22");
//        jo.put("city", "chicago");
//
//        ja.put(jo4);
////        Creating JSONArray Directly from JSON String
//        JSONArray ja1 = new JSONArray("[true, \"lorem ipsum\", 215]");
////        Creating JSONArray Directly from a Collection or an Array
//        List<String> list = new ArrayList<>();
//        list.add("California");
//        list.add("Texas");
//        list.add("Hawaii");
//        list.add("Alaska");
//
//        JSONArray ja2 = new JSONArray(list);
////        JSONTokener  (like string.toCharArray())
//        JSONTokener jt = new JSONTokener("lorem");
//
//        while(jt.more()) {
//            System.out.println(jt.next());
//        }
////        Producing JSONArray Directly from Comma Delimited Text (CDL)
//        JSONArray ja3 = CDL.rowToJSONArray(new JSONTokener("England, USA, Canada"));
////        Producing Comma Delimited Text from JSONArray
//        JSONArray ja4 = new JSONArray("[\"England\",\"USA\",\"Canada\"]");
//        String cdt = CDL.rowToString(ja);
////        Producing JSONArray of JSONObjects Using Comma Delimited Text
//        String string = "name, city, age \n" +
//                "john, chicago, 22 \n" +
//                "gary, florida, 35 \n" +
//                "sal, vegas, 18";
//
//        JSONArray result = CDL.toJSONArray(string);
//        // or
//        JSONArray ja5 = new JSONArray();
//        ja.put("name");
//        ja.put("city");
//        ja.put("age");
//
//        String string1 = "john, chicago, 22 \n"
//                + "gary, florida, 35 \n"
//                + "sal, vegas, 18";
//
//        JSONArray result1 = CDL.toJSONArray(ja, string1);
//// Converting a Cookie String into a JSONObject
//        String cookie = "username=John Doe; expires=Thu, 18 Dec 2013 12:00:00 UTC; path=/";
//        JSONObject cookieJO = Cookie.toJSONObject(cookie);
////        Converting a JSONObject into Cookie String
//        String cookie1 = Cookie.toString(cookieJO);
////        Converting JSONObject to HTTP Header
//        JSONObject jo5 = new JSONObject();
//        jo5.put("Method", "POST");
//        jo5.put("Request-URI", "http://www.example.com/");
//        jo5.put("HTTP-Version", "HTTP/1.1");
//        String httpStr = HTTP.toString(jo5);
////        Converting HTTP Header String Back to JSONObject
//        JSONObject obj = HTTP.toJSONObject("POST \"http://www.example.com/\" HTTP/1.1");
//    }
//}
//
//
//
