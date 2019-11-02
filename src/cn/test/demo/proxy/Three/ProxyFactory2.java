package cn.test.demo.proxy.Three;

public class ProxyFactory2 {
    //绑定目标对象
    private Object target;
    public ProxyFactory2(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        //Enhancer en = new Enhancer();

        return target;
    }
}
