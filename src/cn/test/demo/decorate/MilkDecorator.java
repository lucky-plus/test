package cn.test.demo.decorate;

/**
 * 加牛奶
 */
public class MilkDecorator extends Decorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void setPrice(int price) {
        coffee.setPrice(price);
    }

    //加牛奶加10块
    @Override
    public int getPrice() {
        return coffee.getPrice() + 10;
    }
}
