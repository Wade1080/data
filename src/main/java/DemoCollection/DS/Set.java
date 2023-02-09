package DemoCollection.DS;

public class Set<T> {
    private final int MaxSize=20;
    private T[] elements;
    private int length;

    public Set() {
        length=0;
        elements= (T[]) new Object[MaxSize];
        //不能实例化一个泛型对象，所以先实例化一个object数组，再强制转换类型
    }
    public int Length(){
        return length;
    }
    public boolean Insert(T x){
        //向集合中插入一个新元素
        return true;
    }


    public boolean Delete(int i){
        return true;
    }

}
