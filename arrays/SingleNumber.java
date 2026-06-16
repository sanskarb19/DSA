import java.util.*;
public class SingleNumber{
    static class Solution {
    public int singleNumber(int[] nums) {
        int i,count=0,len=nums.length;
        Arrays.sort(nums);
        HashSet<Integer> list = new HashSet<>();
             
        for(i=0;i<len-1;i++){
            if(nums[i+1]==nums[i])
            list.add(nums[i]);
        }
        
        for(i=0;i<len;i++){
            if(!list.contains(nums[i])){
                                count=nums[i];                       
            }
        }
return count;
    }
}
public static void main(String[] args){
    Solution sc = new Solution();
    int[] arr = {4,1,2,1,2};
    int result = sc.singleNumber(arr);
    System.out.println(result);
}
}