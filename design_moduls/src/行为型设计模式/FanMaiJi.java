package 行为型设计模式;

public class FanMaiJi {
    public static void main(String[] args) {
        Context context = new Context();

        System.out.println(context.getState());

        //购买饮料,初始设置为3
        context.Request();
        context.Request();
        context.Request();

        System.out.println(context.getState());
        context.Request();
        context.Request();
        context.Request();
    }
}

class Context {
    //贩卖机
    private int count;
    private State state;

    @Override
    public String toString() {
        return "Context{" +
                "count=" + count +
                ", state=" + state +
                '}';
    }

    public Context() {
        count = 3;
        state = new StateA();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void Request() {

        //购买一个饮料
        state.Handle(this);
    }

}

interface State {
    public void Handle(Context context);
}

class StateA implements State {

    @Override
    public void Handle(Context context) {

        int count = context.getCount();
        if (count >= 1) {
            System.out.println("购买成功");
            context.setCount(count - 1);

            if (context.getCount() == 0) {
                context.setState(new StateB());
            }

        } else {
            System.out.println("购买失败!");
        }
    }
}

class StateB implements State {

    @Override
    public void Handle(Context context) {

        int count = context.getCount();
        if (count == 0) {
            System.out.println("购买失败,请等待补货");
            context.setCount(5);
            System.out.println("补货成功,请重新购买");
            context.setState(new StateA());
        }

    }
}