package Generics;
//泛型类的声明和非泛型类的声明类似，除了在类名后面添加了类型参数声明部分。
/*
和泛型方法一样，泛型类的类型参数声明部分也包含一个或多个类型参数，参数见用逗号隔开。一个泛型参数，也被称为一个类型变量，
是用于指定一个泛型类型名称的标识符。因为它们接受一个或多个参数，这些类被称为参数化的类或者参数化的类型
 */
public class Box <T>{
    private T t;
    public void add(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        integerBox.add(new Integer(19));
        stringBox.add(new String("菜鸟"));
        System.out.printf("整形符：%d\n\n",integerBox.get());
        System.out.printf("字符串：%s\n\n",stringBox.get());
    }
}
