public class sortedandrotated {
    static class solution{
    public boolean check(int[] nums) {
        int i,len=nums.length;
        int drop=0;

       for(i=0;i<len-1;i++){
        if(nums[i]>nums[i+1]){
              drop=drop+1;
        }
       }
       if(nums[len-1]>nums[0]){
        drop=drop+1;
       }
     if(drop>1){
        return false;
     }
     else{
        return true;
     }
    }
}
public static void main(String[] args){
    int arr[] = {2,1,3,4};

    solution sol = new solution();

    boolean result = sol.check(arr);

    System.out.println("Ans :"+result);
}
}