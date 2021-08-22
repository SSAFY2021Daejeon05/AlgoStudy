import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for(int i = 0 ; i < moves.length ;i++){ // move 배열에 담긴 순서대로 열을 골라준다
            int col = moves[i]-1;
            for(int j = 0 ; j < board.length ; j++){
                if(board[j][col] > 0){ //위에서 아래로 0이 아닌 숫자가 나올때까지 행을 움직여 준다
                    basket.add(board[j][col]); //가장 위에있는걸 바구니에 넣어주고 값을 0으로 해준다.
                    board[j][col] = 0;
                    if(basket.size() >= 2){ // 바구니에 2개 이상 들어가 있다면 위의 2개를 비교해서 제거
                         if(basket.get(basket.size()-1) == basket.get(basket.size()-2) ){
                            basket.pop();basket.pop();
                            answer += 2;
                        }
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
