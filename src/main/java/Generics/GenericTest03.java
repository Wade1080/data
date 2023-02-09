package Generics;

import java.util.ArrayList;
import java.util.List;

//类型通配符上限通过形如List来定义，如此定义就是通配符泛型值接受Number及其下层子类类型
public class GenericTest03 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        name.add("icon");
        age.add(18);
        number.add(314);
        getData(name);
        getData(age);
        getData(number);

        getUperNumber(age);
        getUperNumber(number);
        getString(name);


    }
    //无限制参数输入
    public static void getData(List<?> data){
        System.out.println("data: "+ data.get(0));
    }
    //限制参数输入为数字
    public static void getUperNumber(List<? extends Number>data){
        System.out.println("data: "+data.get(0));
    }
    //限制参数输入为字符串
    public static void getString(List<? extends String>str){
        System.out.println("str: "+str.get(0));
    }
}
