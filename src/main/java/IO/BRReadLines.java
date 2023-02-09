package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//从标准输入读取一个字符串需要使用BuffReader的readLine()方法
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        //使用System.in 创建BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do{
            str=br.readLine();
            if(str.equals("end")){
                System.out.println("The process is ended,Bye!");
            }else {
                System.out.println(str);}
        }while(!str.equals("end"));

    }

}
