package List.HashSet;

import java.util.HashSet;

/*
HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。

HashSet 允许有 null 值。

HashSet 是无序的，即不会记录插入的顺序。

HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。

HashSet 实现了 Set 接口。
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Zhihu");//重复的元素不会添加
        System.out.println(sites);
        System.out.println("==========");

        //判断元素是否存在
        System.out.println("执行sites.contains(\"Taobao\"): "+sites.contains("Taobao"));
        System.out.println("==========");

        //删除元素
        sites.remove("Taobao");//删除元素，返回值是布尔值
        System.out.println("执行sites.remove(\"Taobao\"): "+sites.remove("Taobao"));
        System.out.println("==========");


        //计算大小————size
        System.out.println("执行sites.size()："+sites.size());
        sites.clear();
        System.out.println(sites);

    }
}
