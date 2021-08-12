import java.util.*;
class Solution {
    
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> goal = new HashSet<>(); // set
        for(int i = 0 ; i < win_nums.length ; i++){ 
            goal.add(win_nums[i]);
        }
        int cnt = 0, zero = 0;
        for(int i = 0 ; i < lottos.length ; i++){
            if(goal.contains(lottos[i])){
                cnt += 1;
            }
            if(lottos[i] == 0){
                zero += 1;
            }
        }
        int[] score = {6,6,5,4,3,2,1}; // 점수판
        return new int[]{score[ cnt + zero ],score[ cnt ]};
    }
}
