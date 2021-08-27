class Solution {
    public int solution(int left, int right) {
        int answer = 0;

		for (int i = left; i <= right; i++) {
			if (isSqr(i)) answer -= i; // i가 제곱수면 약수가 홀수개
			else answer += i;
		}

		return answer;
	}
  
	static boolean isSqr(int n) {
		return Math.sqrt(n) == (int) Math.sqrt(n);
	}
}
