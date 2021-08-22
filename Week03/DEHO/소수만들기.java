import java.util.*;
class Solution {
    public static int[] arr;
    public static int answer = 0;
    public static void func( int depth , int curr, int r){
        if(r == 3){
            boolean flag = true;
            for( int j = 2 ; j <= Math.sqrt(curr) ; j++){
                if(curr % j == 0){
                    flag = false;
                    break;
                }
            }
            answer += flag? 1 : 0;
            return;
        }
        if(depth == arr.length){return;}
        
        func(depth + 1 , curr + arr[depth] , r+1 );
        func(depth + 1 , curr , r );
    }
    
    public int solution(int[] nums) {
        arr= nums;
        func(0,0,0);
        return answer;
    }
}
