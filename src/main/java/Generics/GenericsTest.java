package Generics;
/*
Java 泛型（generics）是 JDK 5 中引入的一个新特性, 泛型提供了编译时类型安全检测机制，该机制允许程序员在编译时检测到非法的类型。

泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。

假定我们有这样一个需求：写一个排序方法，能够对整型数组、字符串数组甚至其他任何类型的数组进行排序，该如何实现？

答案是可以使用 Java 泛型。

使用 Java 泛型的概念，我们可以写一个泛型方法来对一个对象数组排序。然后，调用该泛型方法来对整型数组、浮点数数组、字符串数组等进行排序。
 */
public class GenericsTest {
    /*
        java 中泛型标记符：
            E - Element (在集合中使用，因为集合中存放的是元素)
            T - Type（Java 类）
            K - Key（键）
            V - Value（值）
            N - Number（数值类型）
            ？ - 表示不确定的 java 类型
    */
    //使用泛型方法打印不同类型的数组元素
    public static <E> void printArray(E[] inputArray){
        //输出数组元素
        for (E element : inputArray) {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        //创建不同类型数组：Integer,Double和Character
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray={1.1,2.2,3.3,4.4};
        Character[] charArray = {'H','E','L','L','O'};
        System.out.println("整型数组元素为: ");
        printArray(intArray);//传递一个整型数组

        System.out.println("\n双精度数组元素为: ");
        printArray(doubleArray);

        System.out.println("\n字符型数组元素为: ");
        printArray(charArray);//传递一个字符型数组




    }

}
