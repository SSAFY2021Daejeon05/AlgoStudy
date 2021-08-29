import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int expo = 0;
        while(true){ // 3^n - 1로 자리수를 정해준다
            expo +=1; // 자리수
            int tmp =(int) Math.pow(3 , expo);
            if(n <= (tmp-1)){ // 만약 3^n - 1보다 작다면 자리수 결정
                break;
            }
        }
        int[] arr= new int[expo];
        int cnt = 0; // n이 될때까지 더해주며 자리수를 채워준다
        for(int i = expo -1 ; i >= 0; i-- ){ // 높은 차항부터 차례대로 더해준다
            for(int j = 0 ; j < 2 ; j++){ // 한자리당 2번씩 더하기 가능
                int tmp =(int) Math.pow(3 , i); 
                if( (cnt + tmp) <= n){ 
                    cnt += tmp;
                    arr[ expo -i -1]++;
                }else{
                    break;}
            }
        }
        int[] result = new int[expo];
        for(int i = 0 ; i  < expo; i++ ){ // 수를 반대로 옮겨준다
            result[i] = arr[expo-1-i];
        }
        cnt = 0;
        for(int i = 0 ; i  < expo; i++ ){ //10진법으로 계산
            int tmp =(int) Math.pow(3 , expo -1 -i);
            cnt += (result[i] * tmp );
        }
        
        
        return cnt;
    }
}
// 2진법 0 - 0
// 2진법 1 - 1
// 2진법 4 - 100
//2^n -1 --- n자리 2진법 숫자
// 100 - 4
//27 + 9
// 3^n -1
