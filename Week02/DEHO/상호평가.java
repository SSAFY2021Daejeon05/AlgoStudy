import java.util.*;

class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        for(int i = 0 ; i < scores.length ; i ++ ){
                int curr = scores[i][i]; // 자기자신 점수
                int maxV = -1, minV = 101 ; 
                Hashtable<Integer, Integer> my_dict = new Hashtable<Integer, Integer>();
                for(int k = 0 ; k < scores.length ; k++){ // check min and max
                    maxV = Math.max(scores[k][i] , maxV );
                    minV = Math.min(scores[k][i] , minV );
                    if(my_dict.containsKey(scores[k][i])){
                      my_dict.put(  scores[k][i] , my_dict.get(scores[k][i]) + 1);
                    }else{
                        my_dict.put( scores[k][i] , 1 );
                    }
                }
                if( curr == maxV && my_dict.get(curr) == 1){
                    scores[i][i] = -1;
                }else if(curr == minV && my_dict.get(curr) == 1){
                    scores[i][i] = -1;
                }
    }
        for(int i = 0 ; i < scores.length ; i ++ ){
            int div = scores.length , total = 0;
            for(int j = 0 ; j < scores.length ; j++ ){
                if (scores[j][i]  == -1){
                     div -= 1;
                }else{
                    total += scores[j][i];
                }   
            }
            double result = total / div;
            if (result >= 90.0){answer += "A"; }
            else if (result >= 80.0){answer += "B"; }
            else if (result >= 70.0){answer += "C"; }
            else if (result >= 50.0){answer += "D"; }
            else{answer += "F" ;}
        }

                return answer;

}
}

