package IO;

import java.io.*;

public class fileStreamTest2 {
    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");
        System.out.println("绝对路径："+f.getAbsoluteFile());
        FileOutputStream fop = new FileOutputStream(f);
        //构建FileOutputStream对象，文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        //构建OutputStreamWriter对象，参数可以指定编码，默认为操作系统默认编码，windows上是gbk
        writer.append("中文输入");
        //写入到缓冲区
        writer.append("\n");

        writer.append("English");
        //刷新缓存冲，写入到文件，如果下面已经没有写入的内容了，直接close也会写入

        writer.close();

        fop.close();

        FileInputStream fip = new FileInputStream(f);
        //构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            sb.append((char)reader.read());
            //转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();

    }
}
