package Solution;

import java.util.HashMap;

/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 */
public class Demo01 {
 /*
    //法一：暴力枚举
    public static int[] twoSum(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }return new int[0];
    }*/


/*
    //法二：哈希表
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashtable.containsKey(target-nums[i])){
                return new int[]{hashtable.get(target-nums[i])};
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }*/

    //法三
    public static int[] twoSum(int[]nums,int target){
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(hashtable.containsKey(complement)){
                return new int[]{hashtable.get(complement),i};
            }
            hashtable.put(nums[i],i);
        }throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[]nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums,target);
        System.out.println("Index 1: "+result[0]+" Index 2: "+result[1]);
    }
}




