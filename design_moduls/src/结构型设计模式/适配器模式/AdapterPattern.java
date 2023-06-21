package 结构型设计模式.适配器模式;

public class AdapterPattern {
    public static void main(String[] args) {

        USB sub = new Adapter();
        sub.Request();
    }
}

class USB {
    public void Request() {
        System.out.println("USB数据线");
    }
}

class Adapter extends USB {
    private Typec typec = new Typec();

    @Override
    public void Request() {
        typec.specialRequest();
    }
}

class Typec {
    public void specialRequest() {
        System.out.println("Type-C数据线");
    }
}
