import java.util.*;

class Solution {
    public int solution(String dartResult) {
        double answer = 0;
        int index = -1;
        double[] arr = new double[3];
        ArrayList<Integer> startArr = new ArrayList<Integer>();
        ArrayList<Integer> poundArr = new ArrayList<Integer>();
        for(int i = 0 ; i < dartResult.length() ; i++){
            char tmp = dartResult.charAt(i);
            int currNum = -1;
            if(tmp - '0' >= 0 && tmp - '0' <= 10){
                currNum = tmp- '0';
                if ( currNum == 1 && i + 1 < dartResult.length() && dartResult.charAt(i+1) == '0'){
                    currNum = 10;
                    i++;
                }
                index++;
                arr[index ] = (double)currNum;
            }else if(tmp == '*'){
                startArr.add(index);
            }else if(tmp == '#' ){
                poundArr.add(index);
            }else if(tmp == 'D'){
                arr[index] = Math.pow(arr[index], 2);
            }else if(tmp == 'T'){
                arr[index] = Math.pow(arr[index], 3);
            }
        }
        for(Integer star : startArr){
            int onlyTwo = 2;
            while(star >= 0 && onlyTwo-- > 0){
                arr[star] = arr[star]*2;
                star--;
            }
        }
        for(Integer pound : poundArr){
            arr[pound] = -arr[pound];
        }
        for(double tmp : arr){
            answer += tmp;
        }
        return (int)answer;
    }
}



