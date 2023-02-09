package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



//Arraylist的三种遍历

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("hahahha");
    /*    //第一种遍历方法使用for-each，也可以写成for (int i = 0; i < ; i++) {}

        for (String str : list) {
            System.out.println(str);
        }*/
 /*
        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {//这里也可以改写为  for(String str:strArray) 这种形式
            System.out.println(strArray[i]);
        }
    }*/

        //第三种遍历 使用迭代器进行相关遍历 不用担心在遍历过程中超出集合的长度
        Iterator<String> ite = list.iterator();
        while (ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }

    }
}
