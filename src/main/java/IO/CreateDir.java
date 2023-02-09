package IO;

import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        String dirname="E:\\Code\\java\\Compensate\\data";
        File d = new File(dirname);
        if (d.isDirectory()) {
            System.out.println("目录："+dirname);
            String[] s = d.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i]+" 是一个目录");
                }else {
                    System.out.println(s[i]+" 是一个文件");
                }
            }
        }
        else {
            System.out.println(dirname+" 不是一个目录");
        }
//        System.out.println("绝对路径："+d.getAbsoluteFile());
//        d.mkdirs();

    }
}
