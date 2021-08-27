class Solution {
    public int solution(int n) {
	int answer = 0;
		
		String reversed = toReversedTernary(n);
		int len = reversed.length() - 1;
		
        // 10진수로 만들기
		for(int i = len; i >= 0; i--) {
			answer += Math.pow(3, len - i) * (reversed.charAt(i) - '0');
		}
		
		return answer;
	}
	
    // 거꾸로된 3진수 만들기
	static String toReversedTernary(int n) {
		StringBuilder t = new StringBuilder();
		
		while(n > 0) {
			t.append(n % 3);
			n = n / 3;
		}
		
		return t.toString();
	}
}
