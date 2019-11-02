package cn.test.demo.build;

public class TestDemo {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setmBoard("因特尔主板")
                .setmDisplay("三星显示器")
                .setmOS("windows10")
                .create();
        System.out.println(computer);
    }
}
