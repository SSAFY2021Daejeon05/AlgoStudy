class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7, 7};
        
        for(int n: lottos){
            if(n == 0){
                answer[0] -= 1;
                continue;
            }
            for(int i = 0; i < 6; i++){
                if(win_nums[i] == n) {
                    answer[1] -= 1;
                    break;
                }
            }
        }
        
        answer[0] -= (7 - answer[1]);
        
        if(answer[1] > 6) answer[1] = 6;
        if(answer[0] > 6) answer[0] = 6;
        
        return answer;
    }
}
