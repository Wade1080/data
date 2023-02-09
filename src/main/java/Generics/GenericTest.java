package Generics;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/*
类型通配符一般是使用 ？ 代替具体的类型参数，例如List<?>在逻辑上是List<String>,List<Integer>等所有List<具体类型实参>的父类
 */
public class GenericTest {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Number> number = new ArrayList<>();
        name.add("icon");
        age.add(18);
        number.add(314);


    }
    public static void getData(List<?> data){
        System.out.println("data: "+data.get(0));
    }
    //解析： 因为 getData() 方法的参数是 List<?> 类型的，所以 name，age，number 都可以作为这个方法的实参，这就是通配符的作用。
}
