package cn.test.demo.factory;

class ProductA implements ProductI {

    @Override
    public void productName() {
        System.out.println("产品A");
    }
}

class ProductB implements ProductI {

    @Override
    public void productName() {
        System.out.println("产品B");
    }
}

/**
 * 静态工厂
 */
public class Factory{

    public static void main(String[] args) {
        String name = "A";
        ProductI product = create(name);
        product.productName();
    }

    public static ProductI create(String name) {
        switch (name) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }

}


/**
 * 工厂方法
 */
class FactoryA implements FactoryI {

    @Override
    public ProductI create() {
        return new ProductA();
    }
}

class FactoryB implements FactoryI {

    @Override
    public ProductI create() {
        return new ProductB();
    }
}