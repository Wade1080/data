package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/*
Java Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法，可用于迭代 ArrayList 和 HashSet 等集合。

Iterator 是 Java 迭代器最简单的实现，ListIterator 是 Collection API 中的接口， 它扩展了 Iterator 接口。
 */
public class IteratorTest {
    public static void main(String[] args) {
        //集合想获取一个迭代器可以使用Iterator的方法
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        //获取迭代器
        Iterator<String> it = sites.iterator();
        //输出集合中第一个元素

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==========");

        //删除元素
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it2 = numbers.iterator();
        while (it2.hasNext()){
            Integer i = it2.next();
            if(i<10){
                it2.remove();//删除小于10的元素
            }
        }
        System.out.println("删除小于10的元素"+numbers);


    }

}
