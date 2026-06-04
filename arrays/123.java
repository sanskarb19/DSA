class Solution {
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