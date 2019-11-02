package cn.test.demo.decorate;

/**
 * 定义装饰者
 */
public abstract class Decorator extends Coffee {

    protected Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

}
