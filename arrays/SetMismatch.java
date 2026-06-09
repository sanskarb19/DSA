import java.util.*;

public class SetMismatch{
    static class Solution {
    public int[] findErrorNums(int[] nums) {
        int i,len=nums.length;
        Set<Integer> list = new HashSet<>();
         int[] arr = new int[2];
         Arrays.sort(nums);
        for(i=0;i<len-1;i++){
            if(nums[i]==nums[i+1]){
                  arr[0]=nums[i];
            }
        }

        for(i=0;i<len;i++){
            list.add(nums[i]);
        }
         for(i=1;i<=len;i++){
            if(!list.contains(i)){
              arr[1]=i;
            }
         }
  return arr;
    }
}
public static void main(String[] args){
    Solution sc = new Solution();
    int[] arr = {1,2,2,4};
    int[] result = sc.findErrorNums(arr);
    System.out.println(Arrays.toString(result));
}
}
