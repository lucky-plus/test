package cn.test.demo.io;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        Reader reader = null;
        Writer writer = null;
        try {
            File filel = new File("E:\\[IDEA]\\Test\\text\\test1.txt");
            reader = new FileReader(filel);
            File file3 = new File("E:\\[IDEA]\\Test\\text\\test3.txt");
            writer = new FileWriter(file3);
            char[] array = new char[1024];
            int num = 0;
            while (-1 != (num = reader.read(array))) {
                //1.输出内容到控制台
                System.out.println(new String(array, 0, num ));
                //2.输出到文件
                writer.write(new String(array, 0, num));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
