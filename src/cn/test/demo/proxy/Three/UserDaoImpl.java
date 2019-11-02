package cn.test.demo.proxy.Three;

/**
 * 目标对象,没有实现任何接口
 */
public class UserDaoImpl {
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
