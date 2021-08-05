package com.example.demo;


import java.util.*;

/**
 * @atuthor: mac
 * Create:  2020-03-22  21:03
 * Email: wangbo@unicloud.com
 */
public class Demo05 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "test1");
        map.put("b", "test2");
        map.put("c", "test3");
        map.put("d", "test4");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key is " + key + ",value is " + value);
        }


        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("a1", "ccc");


        System.out.println(1<<4);
        System.out.println(1<<30);

        System.out.println(Objects.hashCode("a"));
        System.out.println(Objects.hashCode("b"));
        System.out.println(Objects.hashCode("a") ^ Objects.hashCode("b"));

        HashMap<String, String> hashMap = new HashMap<>(16);
        hashMap.put("test", "abc");
    }

}
