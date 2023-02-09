package Solution;

import java.util.HashMap;
/*
通常情况下，罗马数字中小的数字在大的数字的右边。若输入的字符串满足该情况，那么可以将每个字符视作一个单独的值，累加每个字符对应的数值即可

若存在小的数字在大的数字的左边的情况，根据规则需要减去小的数字。对于这种情况，我们也可以将每个字符视作一个单独的值，若一个数字右侧的数字比它大，则将该数字的符号取反


 */
public class Demo04 {
    //用hashmap存取各罗马字符对应的阿拉伯数字
    HashMap<Character, Integer> symbolValues = new HashMap<Character, Integer>(){
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
    }};

   public int romanToInt(String s){
       int ans = 0;//答案
       int n = s.length();
       for (int i = 0; i < n; i++) {
           Integer value = symbolValues.get(s.charAt(i));
           //罗马数字中右边数字比左边数字大的情况
           if(i<n-1&&value<symbolValues.get(s.charAt(i+1))){
               ans-=value;
           }
           else {
               ans+=value;
           }
       }
       return ans;
   }

    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        String s = "VV";
        int result = demo04.romanToInt(s);
        System.out.println(result);
    }


}

