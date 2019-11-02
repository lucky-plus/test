package cn.test.demo.proxy.Two;

import cn.test.demo.proxy.IUserDao;
import cn.test.demo.proxy.UserDao;

public class TestTwo {
    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        IUserDao proxy = (IUserDao) new ProxyFactory(userDao).getInstance();
        proxy.save();
    }
}
