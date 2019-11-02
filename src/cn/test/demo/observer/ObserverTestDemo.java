package cn.test.demo.observer;

public class ObserverTestDemo {

    public static void main(String[] args) {
        // 被观察者
        Subject subject = new Subject();

        // 添加观察者
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        // 发布消息
        System.out.println("==================== First Set Message =================");
        subject.setMessage("message one ...");
        System.out.println("==================== Second Set Message =================");
        subject.setMessage("message two ...");
    }
}
