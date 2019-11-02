package cn.test.demo.Map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("c","4");

        //1.通过keySet()来遍历
//        Iterator iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            String key = (String) iterator.next();
//            String value = map.get(key);
//            System.out.println(key + ":" +value);
//        }

        //2.通过values()来遍历
//        Iterator iterator = map.values().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        //3.通过entrySet()来遍历
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //4.通过java8新特性遍历
        map.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });

//        List list = new ArrayList(5);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.forEach((v) -> {
//            System.out.println(v);
//        });

    }
}
