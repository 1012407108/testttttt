package 创建型设计模式.单例模式;

public class SingletonPattern {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        System.out.println(instance.getNumber());
    }
}
class Singleton{
    private int number = 2023;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private static Singleton instance = new Singleton();

    private Singleton() {
    }
    public static Singleton getInstance(){
        return instance;
    }
}
