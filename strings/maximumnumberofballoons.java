public class maximumnumberofballoons{
       static class Solution {
    public int maxNumberOfBalloons(String text) {
int store=0;
        int b=0,a=0,l=0,o=0,n=0;

        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b'){
                b++;
            }
            if(text.charAt(i)=='a'){
                 a++;
            }
            if(text.charAt(i)=='l'){
               l++;
            }
            if(text.charAt(i)=='o'){
                o++;
            }
            if(text.charAt(i)=='n'){
               n++;
            }
        }
        
        while(b>=1 && a>=1 && l>=2 && o>=2 && n>=1 ){
                store++;
                b--;
                a--;
                l--;
                l--;
                o--;
                o--;
                n--;
        }

            return store;
        
    }
}
    public static void main(String[] args){
        Solution sc = new Solution();
         String text = "loonbalxballpoon";
         int result = sc.maxNumberOfBalloons(text);
         System.out.println(result);
    }
}