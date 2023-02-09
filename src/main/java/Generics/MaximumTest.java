package Generics;

    /*
    有界的类型参数：
        有可能有时候，你会想限制哪些被允许传递到一个类型参数的类型种类范围。例如，一个操作数字的方法可能只希望接受Number或者Number子类的
        实例。这就是有界类型参数的目的。
        要声明一个有界的类型参数，首先列出类型参数的名称，后面extends关键字，最后紧跟他的上界。
     */

//下面这个例子演示了”extends“如何使用在一般意义上的意义“extends”类或者“implements”接口，该例子中的泛型方法返回三个课比较对象的最大值
public class MaximumTest {
    public static<T extends  Comparable<T>>T maximum(T x,T y ,T z){
        T max = x;//假设x是初始最大值
        if(y.compareTo(max)>0){
            max = y;//y更大
        }
        if(z.compareTo(max)>0){
            max=z;//现在z更大
        }
        return max;
    }

    public static <T extends Comparable<T>>T minimum(T x,T y,T z){
        T min = x;//假设x是初始最小值
        if(y.compareTo(min)<0){
            min=y;
        }
        if(z.compareTo(min)<0){
            min=z;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.printf("%d ,%d 和%d 中最大的数为 %d;最小值为 %d\n\n",3,4,5,maximum(3,4,5),minimum(3,4,5));
        System.out.printf("%.1f ,%.1f 和%.1f 中最大的数为 %.1f;最小值为 %.1f\n\n",3.3,5.5,6.6,maximum(3.3,5.5,6.6),minimum(3.3,5.5,6.6));
        System.out.printf("%s ,%s 和%s 中最大的数为 %s;最小值为 %s\n\n","7","8","9",maximum("7","8","9"),minimum("7","8","9"));

    }
}
