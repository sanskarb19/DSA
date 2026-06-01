public class reverse_tc{
static class Solution {
    public int reverse(int x) {
        int i,j,count=0;
        int rev=0;
        int temp=x;

         while(temp!=0){
          count++;
          temp=temp/10;
        }
          temp=x;
        for(i=0;i<count;i++){
          int digit=temp%10;
          if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && digit>7){
            return 0;
          }
          if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE/10 && digit<-8){
            return 0;
          }

            rev=digit+rev*10;
              temp=temp/10;
        }
        return rev;
    }
}
public static void main(String[] args){
  Solution sc = new Solution();
   int result = sc.reverse(1534236469);

   System.out.println("Ans :"+result);
}
}
