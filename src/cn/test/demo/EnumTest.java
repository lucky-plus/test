package cn.test.demo;

enum TestEnum {

    ONE("test1", 1),
    TWO("test2", 2);

    private String name;
    private int value;

    TestEnum(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "TestEnum{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(TestEnum.TWO.ordinal());
    }
}