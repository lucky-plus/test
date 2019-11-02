package cn.test.demo;

import java.lang.reflect.Field;

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class ClazzTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = Student.class;
        Field f = clazz.getDeclaredField("name");
        Student student = new Student("test", 20);
        f.set(student, "hhh");
        System.out.println(f.get(student));
    }
}
