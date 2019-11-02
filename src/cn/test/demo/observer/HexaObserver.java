package cn.test.demo.observer;

/**
 * 观察者
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa message : " + this.subject.getMessage());
    }
}
