class Solution {
	int ln;
	int rn;
	String hand;
	    
	public String solution(int[] numbers, String hand) {
		String answer = "";
	        ln = 10;
		rn = 12;
		this.hand = hand.equals("left") ? "L" : "R";
	        
		for(int n : numbers){
	            if(n == 0) n = 11;
	            
		    if(getHandDir(n).equals("R")){
	                answer += "R";
			rn = n;
	            } else {
	                answer += "L";
			ln = n;
	            }
		}
	        
	        return answer;
	    }
	    
	    private String getHandDir(int n){  	
		  if(n == 1 || n == 4 || n == 7) return "L";
		  else if(n == 3 || n == 6 || n == 9) return "R";
		
		  else {
		      int dl = Math.abs(ln - n) / 3 + Math.abs(ln - n) % 3;
		      int dr = Math.abs(rn - n) / 3 + Math.abs(rn - n) % 3;
		            	
		      if (dl > dr) return "R";
	              else if(dr > dl) return "L";
		 }
	        
	        return this.hand;
	}
}
