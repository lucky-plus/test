package cn.test.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Test2 {
    final public void test() {
        System.out.println("test2");
    }
    final public void test(int i) {
        System.out.println("test2" + i);
    }
}

public class Test extends Test2 {

    public static void main(String[] args) {
//        int[] a = new int[10];
//        for (int i : a) {
//            System.out.println(i);
//        }
//        System.out.println(a.length);
//        String str  = "";
//        str.length();
//        int i = 1;
//        System.out.println(i++);
//        System.out.println(++i);

        List list = new ArrayList(5);
        list.add("a");
        list.add("b");
        System.out.println(list.size());

        for (Object str : list) {
            list.remove(str);
        }
        System.out.println(list.size());



        Object[] arr = new Object[10];
        System.out.println(arr.length);
    }

}
