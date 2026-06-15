import java.util.*;
public class FrequencyoftheMostFrequentElement{
    static class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long totalSum = 0; // Use long to prevent integer overflow
        int maxFreq = 0;
        
        for (int right = 0; right < nums.length; right++) {
            totalSum += nums[right];
            
            // Check if the current window is valid
            while ((long) nums[right] * (right - left + 1) > totalSum + k) {
                totalSum -= nums[left];
                left++;
            }
            
            maxFreq = Math.max(maxFreq, right - left + 1);
        }
        
        return maxFreq;
    }
}
public static void main(String[] args){
    Solution sc = new Solution();
    int[] arr = {1,4,8,13};
    int result = sc.maxFrequency(arr,5);
    System.out.println(result);
}
}