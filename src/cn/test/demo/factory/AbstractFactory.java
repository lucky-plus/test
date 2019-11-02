package cn.test.demo.factory;

interface ProductAI {
    public void productName();
}
interface ProductBI {
    public void productName();
}
class ProductAOne implements ProductAI {
    @Override
    public void productName() { System.out.println("产品A-1");}
}
class ProductATwo implements ProductAI {
    @Override
    public void productName() { System.out.println("产品A-2");}
}
class ProductBOne implements ProductBI {
    @Override
    public void productName() { System.out.println("产品B-1");}
}
class ProductBTwo implements ProductBI {
    @Override
    public void productName() { System.out.println("产品B-2");}
}

/**
 * 抽象工厂
 */
interface AbstractFactoryI {
    public ProductAI createProductA();
    public ProductBI createProductB();
}
class FactoryOne implements AbstractFactoryI {
    @Override
    public ProductAI createProductA() { return new ProductAOne(); }
    @Override
    public ProductBI createProductB() { return new ProductBOne(); }
}
class FactoryTwo implements AbstractFactoryI {
    @Override
    public ProductAI createProductA() { return new ProductATwo(); }
    @Override
    public ProductBI createProductB() { return new ProductBTwo(); }
}

public class AbstractFactory{
    public static void main(String[] args) {
        AbstractFactoryI factoryOne = new FactoryOne();
        ProductBI product = factoryOne.createProductB();
        product.productName();
    }
}
