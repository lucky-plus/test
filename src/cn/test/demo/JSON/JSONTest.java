package cn.test.demo.JSON;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class JSONTest {
    public static void main(String[] args) {
        List<Integer> list = JSON.parseArray("[1,2,3]", Integer.class);
//        List<Integer> list = JSONObject.parseArray("[1,2,3]", Integer.class);
//        List<Integer> list = JSONArray.parseArray("[1,2,3]", Integer.class);
        for (Integer id : list) {
            System.out.println(id);
        }
        String jsonStr = JSON.toJSONString(list);
        System.out.println(jsonStr);
    }
}
