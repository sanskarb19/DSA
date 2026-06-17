import java.util.*;
public class threeSum{
    static class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list1 = new ArrayList<>();
        Set<List<Integer>> result = new HashSet<>();
        int i,len=nums.length,sum=0;
         
          for(i=0;i<len-2;i++){
               int left=i+1;
               int right=len-1;
                 while(left<right){
                 
                    sum=nums[i]+nums[left]+nums[right];
                    if(sum==0){
                        
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    }
                  if(sum>0){
                          right--;
                  }
                  else if(sum<0){
                          left++;
                  }
                  else{
left++;
            right--;
                  }
                  
            }
          
          }
          
    return new ArrayList<>(result);
       
    }
}
public static void main(String[] args){
  Solution sc = new Solution();
  int[] arr = {-4, -1, -1, 0, 1, 2};
  List<List<Integer>> result = sc.threeSum(arr);
  System.out.println(result);
}
}