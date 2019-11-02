package cn.test.demo.proxy.one;

import cn.test.demo.proxy.IUserDao;
import cn.test.demo.proxy.UserDao;

public class TestOne {
    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save();
    }
}
