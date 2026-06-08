import java.util.*;
public class smallerNumbersThanCurrent{
       static class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int i,j,min=0;
         int[] arr = new int[nums.length];

        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                     if(nums[j]<nums[i]){
                        min++;
                        arr[i]=min;
                     }
            }
            min=0;
        }
        return arr;
    }
}
    

public static void main(String[] args){
    Solution sc = new Solution();
    int[] arr = {6,5,4,8};
    int[] ans = sc.smallerNumbersThanCurrent(arr);
    System.out.println(Arrays.toString(ans));

}
}