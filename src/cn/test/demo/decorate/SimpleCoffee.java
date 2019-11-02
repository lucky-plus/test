package cn.test.demo.decorate;

/**
 * 定义被装饰者
 */
public class SimpleCoffee extends Coffee {

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
