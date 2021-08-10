class Solution {
    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        int len = scores.length;
        
        for(int j = 0; j < len; j++){
            int sum = 0;
            int avg = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int minIdx = -1;
            int maxIdx = -1;
            
            for(int i = 0; i < len; i++){
                sum += scores[i][j];

                if(scores[i][j] <= min) min = scores[i][j];
                if(scores[i][j] >= max) max = scores[i][j];
            }
            
            for(int i = 0; i < len; i++){
                if(i == j) continue;
                if(scores[i][j] == min) minIdx = i;
                if(scores[i][j] == max) maxIdx = i;
            }
            
            if(minIdx == -1 || maxIdx == -1){
                sum -= scores[j][j];
                avg = sum / (len - 1);
            } else avg = sum / len;
            
            if(avg == 100) answer.append('A');
            else if(avg >= 60 && avg < 100) answer.append((char)(74 - avg / 10));
            else if(avg >= 50) answer.append('D');
            else answer.append('F');
            
        }
    
        return answer.toString();
    }
}
