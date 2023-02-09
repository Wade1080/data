package IO;

import java.io.*;
import java.util.Scanner;

/*

一个流被定义为一个数据序列。输入流用于从源读取数据，输出流用于向目标写数据。
 */
public class Stream02 {
    public static void main(String[] args) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("E:\\Code\\java\\Compensate\\data\\src\\main\\java\\IO\\a.txt");
//        int read = fileInputStream.read();
        File f = new File("E:\\Code\\java\\Compensate\\data\\src\\main\\java\\IO\\a.txt");
        FileOutputStream out = new FileOutputStream(f);
        out.write(new Scanner(System.in).nextInt());
        InputStream in = new FileInputStream(f);
        System.out.println(in.toString());


    }
}
