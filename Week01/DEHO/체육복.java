import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n+1];
        for(int i = 1 ; i < n+1 ; i++){
            arr[i] = 1;
        }
        for(int index : lost){
            arr[index] -= 1;
        }
        
        for(int index : reserve){
            arr[index] += 1;
        }
        for(int i = 1 ; i < n+1 ; i++){
            if (arr[i] == 2 && 0 < i-1 && arr[i-1] == 0 ){
                arr[i-1] += 1;
                arr[i] -= 1;
            }else if(arr[i] == 2 && i+1< n+1 && arr[i+1] == 0){
                arr[i+1] += 1;
                arr[i] -= 1;
            }
        }
        int cnt = 0;
        for(int num : arr){
            if (num > 0) cnt ++;
        }
        return cnt;
       }
}
