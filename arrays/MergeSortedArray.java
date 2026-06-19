import java.util.*;
public class MergeSortedArray{
   static class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1;
        int right=n-1;
        int t=m+n-1;
           
           while(right>=0){
            if(left>=0 && nums1[left]>nums2[right]){
                nums1[t]=nums1[left];
                left--;
            }
            else{
                nums1[t]=nums2[right];
                right--;
            }
t--;
           }

    }
}

public static void main(String[] args){
    Solution sc = new Solution();
    int[] arr1 = {1,2,3,0,0,0};
    int[] arr2 = {2,5,6};
        sc.merge(arr1,3,arr2,3);
System.out.println(Arrays.toString(arr1));
}
}