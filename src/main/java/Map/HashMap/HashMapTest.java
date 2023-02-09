package Map.HashMap;

import java.util.HashMap;

/*
HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。

HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。

HashMap 是无序的，即不会记录插入的顺序。

HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。
 */
public class HashMapTest {
    //引入HashMap类
    public static void main(String[] args) {
        //创建HashMap 对象 Sites
        HashMap<String, String> Sites = new HashMap<>();
        //键值都是整数 ————HashMap<Integer, String> site_1 = new HashMap<>();
        //添加键值对
        Sites.put("one","Google");
        Sites.put("two","Runoob");
        Sites.put("three","Taobao");
        Sites.put("four","Zhihu");
        System.out.println(Sites);

        HashMap<Integer, String> sites = new HashMap<>();
        sites.put(1,"Google");
        sites.put(2,"Runoob");
        sites.put(3,"Taobao");
        sites.put(4,"Zhihu");
        //访问元素
        System.out.println("执行Sites.get(\"one\"): "+Sites.get("one"));
        System.out.println("执行Sites.size(): "+Sites.size());
        System.out.println("==========");

        //遍历：for i 和 for each
        for (Integer i : sites.keySet()) {
            System.out.println("key: "+i+" value: "+sites.get(i));
        }
        for (String value : sites.values()) {
            System.out.print(value+", ");
        }
        System.out.println();
        System.out.println("==========");


        //containskey方法调用
        if(sites.containsKey(1)){
            System.out.println("key 为 1 存在于 sites 中");
        }else {
            System.out.println("key 为 1 不存在sites 中");
        }
    }


}
