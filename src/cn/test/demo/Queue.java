package cn.test.demo;

class QueueNode {
    QueueNode next;
    Object data;
}

public class Queue<T> {

    private QueueNode head;
    private QueueNode end;
    private int size = 0;

    public void push(T data) {
        QueueNode node = new QueueNode();
        node.data = data;
        if (null != end) {
            end.next = node;
        }
        end = node;
        if (null == head) {
            head = node;
        }
        head = node;
        size++;
    }

    public T pop() {
        if (null != head) {
            QueueNode node = head;
            head = head.next;
            if (head == null) {
                end = null;
            }
            return (T)node.data;
        } else {
            return null;
        }
    }

    public T peek() {
        if (null != head) {
            QueueNode node = head;
            return (T)node.data;
        } else {
            return null;
        }
    }

}

//public class Queue<T> {
//
//    private Object[] objs = new Object[10];
//    private int head = 0;
//    private int end = -1;
//    private int size = 0;
//
//    public boolean push(T data) {
//        if (size < objs.length) {
//            if (end == objs.length - 1) {
//                end = -1;
//            }
//            end++;
//            objs[end] = data;
//            size++;
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public T pop() {
//        if (0 != size) {
//            Object obj = objs[head];
//            head++;
//            if (head == objs.length) {
//                head = 0;
//            }
//            return (T)obj;
//        } else {
//            return null;
//        }
//    }
//
//    public T peek() {
//        if (0 != size) {
//            Object obj = objs[head];
//            return (T)obj;
//        } else {
//            return null;
//        }
//    }
//
//}
