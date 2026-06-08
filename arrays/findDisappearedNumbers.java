import java.util.*;
public class findDisappearedNumbers{
static class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i,len=nums.length;
    
    Set<Integer> list = new HashSet<>();
     List<Integer> list1 = new ArrayList<>();
        
        for(i=0;i<len;i++){
           list.add(nums[i]);
        }

        for(i=1;i<=len;i++){
            if(!list.contains(i)){
                list1.add(i);
            }
        }
        return list1;
    }
}
public static void main(String[] args){
    Solution sc = new Solution();
    int[] arr = {4,3,2,7,8,2,3,1};
    List<Integer> result = sc.findDisappearedNumbers(arr);
    System.out.println(result);
}
}