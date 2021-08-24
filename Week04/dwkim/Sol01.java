class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
         String answer = ""; // 점수가 가장 높은 직업군
	    	 int max = Integer.MIN_VALUE; // 가장 높은 점수
	       
         
	    	 for(String job : table) {
	    		 String[] infos = job.split(" ");
	    		 int scores = 0; 
           
           // 1. table을 돌면서 languages에 있는 언어만 점수에 더한다. 
	    		 for(int i = 1; i <= 5; i++) {
	    			for(int j = 0; j < languages.length; j++) {
	    				if(!infos[i].equals(languages[j])) continue;
	    				scores += preference[j] * (6 - i);
	    			}
	    		 }
	    		 
          // 2-1. max 값보다 점수가 높으면 max값과 answer를 현재 직업 정보들로 교체한다.  
	    		if(scores > max) {
	    			answer = infos[0];
	    			max = scores;
            // 2-2. max 값이랑 동일하고, answer보다 사전순으로 먼저면 answer 값을 수정해준다.
	    		} else if(scores == max && infos[0].compareTo(answer) < 0) answer = infos[0];
	    	 }  	 
	   
	         return answer;
    }
}
