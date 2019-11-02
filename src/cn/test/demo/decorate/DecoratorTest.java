package cn.test.demo.decorate;

public class DecoratorTest {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee.setPrice(50);
        coffee = new SugarDecorator(coffee); //加糖
        coffee = new MilkDecorator(coffee); //加牛奶
        System.out.println(coffee.getPrice());
    }

}
