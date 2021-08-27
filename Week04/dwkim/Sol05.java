class Solution {
   	public int solution(int n) {
		return Integer.parseInt(toReversedTernary(n), 3);
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
