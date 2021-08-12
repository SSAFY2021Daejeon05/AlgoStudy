import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; int index = 0;
        for(int cmd = 0 ; cmd <  commands.length ; cmd++){
            int start = commands[cmd][0], end = commands[cmd][1], th= commands[cmd][2];
            int[] tmp = Arrays.copyOfRange(array , start-1 , end );
            Arrays.sort(tmp);
            answer[index ++ ] = tmp[th-1];
        }
        return answer;
    }
}
