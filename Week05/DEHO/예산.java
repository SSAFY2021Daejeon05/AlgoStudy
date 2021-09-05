import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int dep : d){
            if(budget - dep >= 0){ // 0보다 크면 예안범위안
                budget -= dep; // 필요한 예산 뺴주고
                answer += 1; // 부서 수 하나 추가
            }
        }
        return answer;
    }
}
