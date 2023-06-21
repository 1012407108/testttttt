package 创建型设计模式.生成器模式;

import java.util.ArrayList;
import java.util.List;

public class BuilderTest {

    public static void main(String[] args) {

        Director director = new Director();
        Builder builder1 = new Builder1();
        director.Construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

    }
}
class Director{
    public void Construct(Builder builder){
        builder.BuildPart();
    }
}

abstract class Builder{
    public abstract void BuildPart();
    public abstract Product getResult();

}

class Builder1 extends Builder{

    Product product = new Product();
    @Override
    public void BuildPart() {

        product.Add("A");
        product.Add("B");
        product.Add("C");
        product.Add("D");
        product.Add("E");
        product.Add("F");
    }

    @Override
    public Product getResult() {
        return product;
    }
}



//产品
class Product{
    List<String> parts = new ArrayList<String>();
    public void Add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("产品的组成:");
        for (String s:parts) {
            System.out.println(s+"   ");
            System.out.println("\n");
        }
    }
}
