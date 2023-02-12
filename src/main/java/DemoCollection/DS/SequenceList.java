package DemoCollection.DS;

import java.lang.Object;

public class SequenceList <T>{
    final int maxSize=10;
    private T[] listArray;
    private int length;
    public SequenceList(){
        length=0;
        listArray= (T[]) new Object[maxSize];
    };

    public SequenceList(int n){
        if(n<=0){
            System.out.println("error");
            System.exit(1);
        }
        length=0;//线性表初始位空
        listArray = (T[]) new Object[n];
    };

    public boolean add(T obj,int pos){
        if (pos<1||pos>length+1){
            System.out.println("pos值不合法");
            return false;
        }
        //表空间存满，重新分配2倍的存储空间，并进行原有数据的复制
        if (length==listArray.length){
            T[] p = (T [])new Object[length*2];
            for (int i = 0; i < length; i++) {
                p[i]=listArray[i];
            }
            listArray=p;
        }


        for (int i = length; i>=pos ; i--) {
            listArray[i]=listArray[i-1];
        }
        listArray[pos-1]=obj;
        length++;

        return true;
    };
    public T remove(int pos){
        if(isEmpty()){
            System.out.println("顺序表为空，无法执行删除操作");
            return null;
        }
        else {
            if(pos<1||pos>length){
                System.out.println("pos值不合法");
            }
            T x = listArray[pos-1];
            for (int i = pos; i < length; i++) {
                listArray[i-1]=listArray[i];
                length--;
            }
            return x;
        }
    };
    public int find(T obj){
        if(isEmpty()){
            System.out.println("顺序表为空，无法执行查询操作");
            return -1;
        }
        else {
            for (int i = 0; i < length; i++) {
                if(listArray[i].equals(obj)){
                    return i+1;
                }
            }
            return -1;
        }
    };
    public T value(int pos){
        if(isEmpty()){
            System.out.println("顺序表为空");
            return null;
        }
        else {
            if(pos<1||pos>length){
                System.out.println("pos值不合法");
                return null;
            }
            return listArray[pos-1];
        }
    };
    public boolean modify(T obj,int pos){
        if(isEmpty()){
            System.out.println("顺序表为空");
            return false;
        }
        else{
            if (pos<1||pos>length){
                System.out.println("pos值不合法");
                return false;
            }
            listArray[pos-1]=obj;
            return true;
        }
    };
    public boolean isEmpty(){
        return length==0;
    };
    public int size(){
        return length;
    };

    /*
    正序输出
     */
    public void nextOrder(){
        for (int i = 0; i < length; i++) {
            System.out.println(listArray[i]);
        }
    }//依次访问栈中每个元素并输出
    public void clear(){
        length=0;
    }//销毁一个已经存在的线性表

    public static void main(String[] args) {
        SequenceList<Integer> L = new SequenceList<>();
        int status,e,i;
        int []a={23,56,12,49,35};
        for (i = 0; i < a.length ; i++) {
            L.add(a[i],i+1);
        }
        System.out.println("顺序表中的元素为：");
        L.nextOrder();
        L.add(30,4);
        System.out.println("执行插入操作后顺序表中的数据元素为：");
        L.nextOrder();
        e = L.remove(5);
        System.out.println("执行删除操作后顺序表中的数据元素为：");
        L.nextOrder();
        i = L.find(12);
        System.out.println("元素12在线性表中的位序为："+i);
    }





}
