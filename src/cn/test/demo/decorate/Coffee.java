package cn.test.demo.decorate;

/**
 * 被装饰者接口
 */
public abstract class Coffee {

    protected int price;

    public abstract void setPrice(int price);

    public abstract int getPrice();

}
