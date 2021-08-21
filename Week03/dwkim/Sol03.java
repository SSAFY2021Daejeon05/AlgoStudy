import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
		
		for(int m : moves) {
			int x = 0;
			while(x < board.length && board[x][m - 1] == 0) {
				x += 1;
			}
			
			if(x == board.length) continue; // column 전체에 인형이 없는 경우
            
            // stack에 있는 것과 동일한 인형이면 지우기
			if(!stack.isEmpty() && stack.peek() == board[x][m - 1]) {
				stack.pop();
				answer += 2;
			} else stack.push(board[x][m - 1]);

			board[x][m - 1] = 0;
		}
		
		return answer;
    }
}
