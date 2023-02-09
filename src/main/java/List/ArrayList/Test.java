package List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//ArrayList 类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制，我们可以添加或删除元素。
public class Test {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<>();
        //添加元素
        sites.add("1. Google");
        sites.add("2. Baidu");
        sites.add("3. Taobao");
        sites.add("4. Jingdong");
        sites.add("5. Tianmao");
        System.out.println(sites);
        System.out.println("============");

        //访问元素
        System.out.println("执行sites.get(1): "+sites.get(1));//访问第二个元素
        System.out.println("执行sites.get(3): "+sites.get(3));//访问第四个元素
        System.out.println("============");

        //删除元素
        System.out.println("执行sites.remove(3): "+sites.remove(3));//删除第四个元素
        System.out.println("剩余数组为："+sites);
        System.out.println("============");


        //计算大小
        System.out.println("执行sites.size(): "+sites.size());
        System.out.println("=============");


        //迭代数组列表
        System.out.println("遍历数组元素————for i");
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }
        System.out.println("===========");

        //使用for-each 来迭代元素
        System.out.println("遍历数组元素————for-each");
        for (String site : sites) {
            System.out.println(site);
        }
        System.out.println("===========");


        //使用ArrayList存储数字
        System.out.println("使用ArrayList存储数字");
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        myNumbers.add(40);
        myNumbers.add(50);
        for (Integer myNumber : myNumbers) {
            System.out.println(myNumber);
        }


        //使用Collection类中的sort方法对列表进行排序
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(1);
        integers.add(4);
        integers.add(8);
        integers.add(7);
        System.out.println("原始数组: "+integers);
        Collections.sort(integers);
        System.out.println("使用Collection类中的sort方法对列表进行排序: "+integers);


    }
}
