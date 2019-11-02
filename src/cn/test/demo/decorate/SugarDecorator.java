package cn.test.demo.decorate;

/**
 * 加糖
 */
public class SugarDecorator extends Decorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void setPrice(int price) {
        coffee.setPrice(price);
    }

    //加糖加5块
    @Override
    public int getPrice() {
        return coffee.getPrice() + 5;
    }
}
