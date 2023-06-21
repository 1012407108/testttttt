package 行为型设计模式;

import java.util.ArrayList;
import java.util.List;

public class GuanChaZhe {
    public static void main(String[] args) {

        Subject subjectA = new ConcreateSubject();
        Observer observerB = new ConcreteObserver("zhangsan", subjectA);
        Observer observerC = new ConcreteObserver("lisi", subjectA);
        Observer observerD = new ConcreteObserver("wangwu", subjectA);
        subjectA.Notify();

    }
}


interface Subject {//目标

    public void Attach(Observer observer);//添加观察者

    public void Detach(Observer observer);//删除观察者

    public void Notify();//状态改变后,通知所有观察者

    public void setState(String state);

    public String getSate();
}

class ConcreateSubject implements Subject {
    private String state;
    private List<Observer> observerList;

    public ConcreateSubject() {
        state = "未更新";
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void Attach(Observer observer) {

        observerList.add(observer);
    }

    @Override
    public void Detach(Observer observer) {

        observerList.remove(observer);
    }

    @Override
    public void Notify() {
        for (Observer o : observerList) {
            o.update();
        }

    }

    @Override
    public void setState(String state) {
        this.state = state;
        notify();
    }

    @Override
    public String getSate() {
        return state;
    }
}


interface Observer {//观察者接口

    public void update();//收到通知,更新观察状态

}

class ConcreteObserver implements Observer {

    private String name;
    private Subject subject;
    private String state;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.Attach(this);
        state = subject.getSate();
    }

    @Override
    public void update() {
        System.out.println(name + "收到通知");
        state = subject.getSate();
    }
}
