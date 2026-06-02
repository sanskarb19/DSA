public class pallindrome{
static class Solution {
    public boolean isPalindrome(int x) {
        int i;
        int temp=x;
        int count=0,rev=0;
        if(temp<0){
            return false;
        }
        while(temp!=0){
            temp=temp/10;
            count++;
        }
temp=x;
        for(i=0;i<count;i++){
            
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        temp=x;
        if(rev==temp){
            return true;
        }
        else{
            return false;
        }
    }
}
public static void main(String[] args){
    Solution sc = new Solution();
    boolean result = sc.isPalindrome(-121);
    System.out.println("Ans :"+result);
}
}