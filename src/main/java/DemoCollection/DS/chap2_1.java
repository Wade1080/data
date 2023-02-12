package DemoCollection.DS;
/*
有顺序表LA和LB，其元素均按从小到大的升序排列，编写一个算法将它们合并成一个顺序表LC，要求LC的元素也是从小到大升序

思路：依次扫描LA和LB的元素，比较线性表LA和LB当前元素的值，将较小的元素赋值给LC，如此直到一个线性表
     扫描完毕，然后将未完的那个顺序表中余下部分赋给LC即可。
 */
public class chap2_1 {
    public static <T extends  Comparable>void MergeList_Sq(SequenceList<T> LA,SequenceList<T> LB,SequenceList LC){
        /*
        已知顺序线性表LA和LB的元素按值非递减排列，归并LA和LB得到新的顺序
        线性表LC，LC的元素也按值非递减排列
         */
        int i=1,j=1,k=1;
        while (i<=LA.size()&&j<=LB.size()){
            if (LA.value(i).compareTo(LB.value(j))<=0){
                LC.add(LA.value(i),k);
                i++;
            }
            else {
                LC.add(LB.value(j),k);
                j++;
            }
            k++;
        }
        while (i<=LA.size()){
            LC.add(LA.value(i),k);
            i++;
            k++;
        }
        while (i<=LB.size()){
            LB.add(LB.value(j),k);
            j++;
            k++;
        }
    }


    public static void main(String[] args) {
        int i,j,k=0;
        int[] a={12,23,35,49,56};
        int[] b={10,15,20};
        SequenceList<Integer> La = new SequenceList<>();
        SequenceList<Integer> Lb = new SequenceList<>();
        SequenceList<Integer> Lc = new SequenceList<>();
        for(i=0;i<a.length;i++){
           La.add(a[i],i+1);//将数组中各元素插入到顺序表中
        }
        System.out.println("顺序表a中的数据元素为：");
        La.nextOrder();
        for(j=0;j<b.length;j++){
            Lb.add(b[j],j+1);
        }
        System.out.println("顺序表b中的数据元素为：");
        Lb.nextOrder();
        MergeList_Sq(La,Lb,Lc);
        System.out.println("顺序表C中的数据元素为：");
        Lc.nextOrder();




    }
}
