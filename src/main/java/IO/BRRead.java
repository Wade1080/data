package IO;

import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//从控制台读取多字符输入
public class BRRead {
    public static void read() throws IOException{
        char c;
        //使用System.in创建BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'退出");
        //读取字符
        do{
            c = (char)br.read();
            System.out.println(c);
            if(c=='q'){
                System.out.println("输入结束，白白");
            }
        }while(c!='q');
    }

    public static void main(String[] args)  {
        try {
            read();
        }catch (IOException e){
            System.out.println("过程出错");
        }
    }


}
