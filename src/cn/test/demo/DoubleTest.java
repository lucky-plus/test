package cn.test.demo;

public class DoubleTest {

    public static void main(String[] args) {
        double num1 = 5.200;
        double num2 = 4.930;
        double num3 = 0.120;
        System.out.println(num1 - num2);
        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println("num1 - num2 = " + ArithUtil.sub(num1, num2));
        System.out.println("num1 + num2 = " + ArithUtil.add(num1, num2));
        System.out.println("num1 * num2 = " + ArithUtil.mul(num1, num2, 2));
        System.out.println("==============================================");
        System.out.println(num1 - num2 + num3);
        System.out.println(num1 + num2 + num3);
        System.out.println(num1 * num2 * num3);
        System.out.println(ArithUtil.add(ArithUtil.sub(num1, num2), num3));
        System.out.println(ArithUtil.add(ArithUtil.add(num1, num2), num3));
        System.out.println(ArithUtil.mul(ArithUtil.mul(num1, num2), num3, 2));
        System.out.println("==============================================");
        double num4 = 0.12000;
        System.out.println(num3 == num4);
    }
}
