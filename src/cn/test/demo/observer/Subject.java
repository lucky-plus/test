package cn.test.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察对象
 */
public class Subject {

    /** 观察者集合 */
    private List<Observer> observers;

    /** 消息 */
    private String message;

    public Subject() {
        observers = new ArrayList<Observer>(3);
    }

    public String getMessage() {
        return message;
    }

    /**
     * 发布消息
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
        // 通知所有观察者
        notifyAllObservers();
    }

    /**
     * 注册观察者
     * @param observer
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知所有观察者更新
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
