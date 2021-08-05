import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5}; 
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int s1 = 0,s2 = 0,s3 = 0, ptr1 = 0,ptr2 = 0,ptr3 = 0; // 카운터 , 포인터
        
        for(int i = 0 ; i < answers.length ; i++ ){ // 카운팅
            s1 += ((answers[i] == p1[ptr1++])? 1: 0);
            s2 += ((answers[i] == p2[ptr2++])? 1: 0);
            s3 += ((answers[i] == p3[ptr3++])? 1: 0);
            ptr1 = ((ptr1 % p1.length == 0)? 0 : ptr1);
            ptr2 = ((ptr2 % p2.length == 0)? 0 : ptr2);
            ptr3 = ((ptr3 % p3.length == 0)? 0 : ptr3);
        }
        
         int maxV = Math.max(s1,s2); 
         maxV = Math.max(maxV,s3);  // 최대값 구하기
        int[] arr = {s1,s2,s3}; int cnt = 0;
        for(int i = 0 ; i < 3 ; i++){ // 결과 사이즈 구하기
            if (maxV==arr[i] ) {cnt+= 1;}
        }
        int[] result = new int[cnt]; int j = 0;
        for( int i = 0 ; i < 3; i ++){ // 넣어주기
            if(arr[i] == maxV){
                result[j++] = i+1;
            }
        }
        return result;
           }
}
