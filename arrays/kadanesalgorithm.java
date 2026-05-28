public class kadanesalgorithm{
    static class Solution {
    public int maxSubArray(int[] nums) {
        int i,max=nums[0],sum=0;

        for(i=0;i<nums.length;i++){        
                   sum=sum+nums[i];
                        if(sum>max){
                            max=sum;
                        }
            if(sum<0){
            sum=0;
            }
        }
        return max;
    }
}
    public static void main(String[] args){
         Solution s = new Solution();
        int[] testArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        int ans = s.maxSubArray(testArray);
     System.out.println("Answer is :"+ans);

    }
}