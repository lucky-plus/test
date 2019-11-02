package cn.test.demo;

public class Node {

    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public void add(int value) {
        if (value > this.value) {
            if (null != right) {
                right.add(value);
            } else {
                Node node = new Node(value);
                right = node;
            }
        } else {
            if (null != left) {
                left.add(value);
            } else {
                Node node = new Node(value);
                left = node;
            }
        }
    }

    public void display() {
        System.out.println(this.value);
        if(null != left) left.display();
        if(null != right) right.display();
    }

    public boolean find(int value) {
        if (value == this.value) {
            return true;
        } else if(value > this.value) {
            if (null == right) {
                return false;
            } else {
                return right.find(value);
            }
        } else {
            if (null == left) {
                return false;
            } else {
                return left.find(value);
            }
        }
    }

}
