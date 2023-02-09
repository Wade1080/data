import java.util.Arrays;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] username = new String[7];
        String[] password = new String[7];
        String name = new String();
        String aa = new String();
        int pan=-1;
        int a = 0;

        username[0]="sam";
        password[0]="123";
        while (true){
            System.out.println("功能选择："+"\n"+"1.注册"+"\n"+"2.登录"+"\n"+"3.查看用户和密码"+"\n");
            a=input.nextInt();
            while(a==1){
                System.out.println("请输入用户名: ");
                name=input.next();
                System.out.println("请输入密码: ");
                aa=input.next();
                for (int i = 0; i < username.length; i++) {
                    if(username[i].equals(name)){
                        pan=i;
                        break;
                    }
                }
                if (pan==-1){
                    for (int i = 0; i < username.length; i++) {
                        if(username[i].equals(null)){
                            username[i]=name;
                            password[i]=aa;
                            break;
                        }
                    }
                    System.out.println("用户注册成功");
                    break;
                }else {
                    System.out.println("用户名已存在，注册失败");
                    break;
                }
            }

            while(a==3){
                System.out.println("用户名：" +
                        Arrays.toString(username)+"\n" +
                        " 密码：" + Arrays.toString(password) +
                        "\n");
                break;
            }
        }
    }
}
