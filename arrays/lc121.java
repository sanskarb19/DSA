public class lc121{
static class Solution {
    public int maxProfit(int[] prices) {
        int i, minprice=prices[0],maxprofit=0;

        for(i=0;i<prices.length;i++){

        if(minprice>prices[i]){
               minprice=prices[i];
            }
          else if(prices[i]-minprice > maxprofit){
            maxprofit=prices[i]-minprice;
          }
        }
    return maxprofit;
    }
}
public static void main(String[] args){
    int[] arr = {7,1,5,3,6,4};
    Solution sc = new Solution();
    int result = sc.maxProfit(arr);
    System.out.println("ANS :"+result);
}
}