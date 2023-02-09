package DemoCollection.DS;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack s = new java.util.Stack();
        //创建堆栈对象s
        s.push("中国");
        //将数据压入对象
        s.push("四川");
        while (!s.empty()){
            //测试堆栈是否为空
            System.out.println(s.pop()+" ");
            //将数据从堆栈中弹出
        }

    }
}
