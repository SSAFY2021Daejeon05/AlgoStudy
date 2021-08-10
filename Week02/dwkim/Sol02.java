class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int min = 7;
        int max = 7;
        
        for(int n: lottos){
            if(n == 0){
                min -= 1;
                continue;
            }
            for(int i = 0; i < 6; i++){
                if(win_nums[i] == n) {
                    max -= 1;
                    break;
                }
            }
        }
        
        min -= (7 - max);
        
        if(max > 6) max = 6;
        if(min > 6) min = 6;
        
        return new int[]{min, max};
    }
}
