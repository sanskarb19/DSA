public class detect_capital{

   static class Solution {
    public boolean detectCapitalUse(String word) {
        int i;
         int cap=0;
        
        for(i=0;i<word.length();i++){

            if((int)word.charAt(i)>=65 && (int)word.charAt(i)<=90){
           
            cap++;
            }
          
        }

          if(cap==word.length() || cap==0){
                return true;
            }
            else if(((int)word.charAt(0)>=65 && (int)word.charAt(0)<=90) && cap==1){
                return true;
            }
            else{
                return false;
            }
    }
}
public static void main(String[] args){
    Solution sc = new Solution();
    String word = "FlaG";
    boolean result = sc.detectCapitalUse(word);
    System.out.println(result);
}
}