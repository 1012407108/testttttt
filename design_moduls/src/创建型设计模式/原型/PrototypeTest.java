package 创建型设计模式.原型;

public class PrototypeTest {

    public static void main(String[] args) {
        Product product1=  new Product(2022,5.28);
        System.out.println(product1.getId()+"------"+product1.getPrice());


        //克隆的表现形式
        Product product2 = (Product) product1.Clone();
        System.out.println(product2.getId()+"------"+product2.getPrice());
    }
}

interface Prototype{
    public Object Clone();
}
class Product implements Prototype{

    private  int id;
    private  double price;
    public Product(){}

    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Object Clone() {
        Product object = new Product();
        object.id = this.id;
        object.price = this.price;
        return object;
    }
}
