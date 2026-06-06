public class maxconsecutiveONE{
static class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i,count=0,max=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==1){
                 count++;
                if(max<=count){
               max=count;
                }
            }
            else{
                count=0;
            }
        }
        return max;
    }
}
    public static void main(String[] args){
        Solution sc = new Solution();
        int[] arr = {1,0,1,1,0,1};
        int result = sc.findMaxConsecutiveOnes(arr);
        System.out.println(result);
    }
}
