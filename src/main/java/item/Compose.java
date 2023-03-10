package item;
/*
对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
00000
00001
00010
00011
00100
请按从小到大的顺序输出这32种01串。
输入格式
	本试题没有输入。
输出格式
	输出32行，按从小到大的顺序每行一个长度为5的01串。
样例输出
	00000
	00001
	00010
	00011
	&lt;以下部分省略&gt;
 */
public class Compose {
    public static void main(String[] args) {

        /*
        //法一
        for (int i = 0; i < 32; i++) {
            System.out.println(String.format("%05d", Integer.parseInt(Integer.toBinaryString(i))));
            */
        //法二
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <=1; j++) {
                for (int k = 0; k <=1; k++) {
                    for (int l = 0; l <=1; l++) {
                        for (int m = 0; m <=1; m++) {
                            System.out.printf("%d%d%d%d%d\n",i,j,k,l,m);
                        }

                    }

                }

            }

        }
        }
    }

