import java.util.*;
public class MaximumIceCreamBars{
    static class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum=0,i=0,calc=0,store=0;
Arrays.sort(costs);
        while(i<costs.length && sum+costs[i]<=coins){
                 sum=sum+costs[i];
            if(sum<=coins){
                calc++;
                store=sum;
            }
            else{
                sum=store;
            }

            i++;
        }
        return calc;
    }
}
public static void main(String[] args){
     Solution sc = new Solution();
     int[] arr = {10,6,8,7,7,8};
    int result = sc.maxIceCream(arr,5);

    System.out.println(result);
}
}