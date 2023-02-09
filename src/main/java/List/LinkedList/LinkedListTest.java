package List.LinkedList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

/*
链表（Linked list）是一种常见的基础数据结构，是一种线性表，但是并不会按线性的顺序存储数据，
而是在每一个节点里存到下一个节点的地址。
链表可分为单向链表和双向链表。
一个单向链表包含两个值: 当前节点的值和一个指向下一个节点的链接。*/
public class LinkedListTest {
    public static void main(String[] args) {
        //链表的创建
        LinkedList<String> sites = new LinkedList<>();
        //添加元素
        sites.add("Google");
        sites.add("Weibo");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Jingdong");
        System.out.println(sites);
        sites.add("Wiki");
        System.out.println("执行sites.add(Wike): " + sites);
        System.out.println("==========");

        //引入LinkedList类
        sites.removeFirst();//移除头部元素
        System.out.println("执行sites.removeFirst()："+sites);
        System.out.println("==========");

        //获取头部、尾部元素
        System.out.println("执行sites.getFirst()："+sites.getFirst());
        System.out.println("执行sites.getLast()："+sites.getLast());
        System.out.println("==========");

        //迭代元素
        System.out.println("遍历输出链表元素————for i");
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }
        System.out.println("遍历输出链表元素————for each");
        for (String site : sites) {
            System.out.println(site);
        }



    }

}
