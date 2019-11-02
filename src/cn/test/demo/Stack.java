package cn.test.demo;

class StackNode {
    StackNode pre;
    Object data;
}

public class Stack<T> {

    private StackNode top;
    private int size = 0;

    public void push(T data) {
        StackNode node = new StackNode();
        node.data = data;
        node.pre = top;
        top = node;
        size++;
    }

    public T pop() {
        if (null != top) {
            StackNode node = top;
            top = top.pre;
            size--;
            return (T)node;
        } else {
            return null;
        }
    }

    public T peek() {
        if (null != top) {
            StackNode node = top;
            return (T)node;
        } else {
            return null;
        }
    }

}

//public class Stack<T> {
//
//    private Object[] objs = new Object[10];
//    private int size = 0;
//
//    public boolean push(T data) {
//        if (size < objs.length) {
//            objs[size] = data;
//            size++;
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public T pop () {
//        if (size > 0) {
//            Object obj = objs[size];
//            size--;
//            return (T)obj;
//        } else {
//            return null;
//        }
//    }
//
//    public T peek() {
//        if (size > 0) {
//            return (T)objs[size];
//        } else {
//            return null;
//        }
//    }
//
//}
