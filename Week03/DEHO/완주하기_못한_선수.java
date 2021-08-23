import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion); // 두 어레이를 소트해서 이름별로 차례대로 정렬한다
        for(int i = 0 ; i < completion.length ; i++){
            if(!completion[i].equals(participant[i])){ 
                // 0~ completion의 길이 내에서 이름이 불일치 한다면 participant에 있는 이름은 완주 못함
                return participant[i];
            }
        }
        return participant[participant.length -1]; // completion을 모두 돌고도 못찾았으면, participant마지막 요소가 정답ㅁ
    }
}


