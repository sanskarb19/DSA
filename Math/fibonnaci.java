public class fibonnaci{
static class Solution {
    public int fib(int n) {
     int temp=n,count=0,next=0,a=0,b=1,i;

temp=n;

if(temp==0){return 0;}
if(temp==1){return 1;}
if(temp==2){return 1;}

for(i=0;i<temp-1;i++){
   next=a+b;
   a=b;
   b=next;
}
return b;
    }
}

public static void main(String[] args){
      Solution sc = new Solution();
      int result = sc.fib(5);
      System.out.println("Result :"+result);
}
}