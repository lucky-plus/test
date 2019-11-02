package cn.test.demo.io;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            File filel = new File("E:\\[IDEA]\\Test\\text\\test1.txt");
            inputStream = new FileInputStream(filel);
            int size =  inputStream.available() ;
            byte[] array = new byte[size];
            inputStream.read(array);

            //1.输出文本内容
            String result = new String(array);
            System.out.println(result);

            //2.输出到文件
            File file2 = new File("E:\\[IDEA]\\Test\\text\\test2.txt");
            outputStream = new FileOutputStream(file2);
            outputStream.write(array);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
