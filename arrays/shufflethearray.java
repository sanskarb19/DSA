import java.util.*;
public class shufflethearray{
static class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i,j=0,k=0;
        int[] arr = new int[2*n];

    for(i=0;i<nums.length;i++){
        
        if(i%2==0){
              arr[i]=nums[k];
              k++;
        }
        else{
            arr[i]=nums[n+j];
            j++;
        }
    }
    return arr;
    }
}
public static void main(String[] args){
    Solution sc = new Solution();
    int[] arr = {2,5,1,3,4,7};
    int[] result = sc.shuffle(arr,3);

    System.out.println(Arrays.toString(result));
}
}