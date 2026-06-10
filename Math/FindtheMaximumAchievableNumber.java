public class FindtheMaximumAchievableNumber{
   static class Solution {
    public int theMaximumAchievableX(int num, int t) {
           return 2*t+num;
        }
    }
   public static void main(String[] args){
    Solution sc = new Solution();
       int result = sc.theMaximumAchievableX(4,3);
       System.out.println(result);
   }
}