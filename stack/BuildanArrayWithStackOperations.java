import java.util.*;
public class BuildanArrayWithStackOperations{
    static class Solution {
    public List<String> buildArray(int[] target, int n) {

        Stack<String> list = new Stack<>();

    int i,len=target.length,x=1;    
for(i=0;i<target.length;i++){
    
    if(target[i]==x){
        list.push("Push");
    }
    else{
        list.push("Push");
        list.push("Pop");
        i=i-1;
    }
  x++;
}

        return list;

    }
}
public static void main(String[] args) {
    Solution sc = new Solution();
    int[] arr = {1,2,4};
    List<String> result = sc.buildArray(arr,4);
    System.out.println(result); 
}
}