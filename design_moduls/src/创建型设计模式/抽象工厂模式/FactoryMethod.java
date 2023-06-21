package 创建型设计模式.抽象工厂模式;

public class FactoryMethod {

    public static void main(String[] args) {
        Factory factory1 = new Factory1();
        ProductA productA = factory1.createProductA();
        productA.info();
        ProductB productB = factory1.createProductB();
        productB.info();
    }
}
interface Factory{
    ProductA createProductA();
    ProductB createProductB();
}

class Factory1 implements Factory{

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}class Factory2 implements Factory{

    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}


interface ProductA{
    void info();
}
class ProductA1 implements ProductA{

    @Override
    public void info() {
        System.out.println("产品A1");
    }
}

class ProductA2 implements ProductA{

    @Override
    public void info() {
        System.out.println("实现产品A2");
    }
}
interface ProductB{
    void info();
}

class ProductB1 implements ProductB{

    @Override
    public void info() {
        System.out.println("产品B1");
    }
}

class ProductB2 implements ProductB{

    @Override
    public void info() {
        System.out.println("实现产品B2");
    }
}