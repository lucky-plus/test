package cn.test.demo.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

    @Test
    public void test() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        // list.forEach(item -> System.out.println(item));
        list.stream().forEach(System.out::println); // 与上一行等价
    }

}
