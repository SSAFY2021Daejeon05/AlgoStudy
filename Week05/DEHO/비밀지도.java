lass Solution {
      public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n]; 
        for(int i = 0 ; i < n ; i ++){
            String curr = Integer.toBinaryString(arr1[i] | arr2[i]);
            while(curr.length() < n){  //자리수 맞추기
                curr = "0" + curr;
            }
            answer[i]= "";
            for(int j = 0 ; j < n ; j ++){
                answer[i] += (curr.charAt(j) == '1' )? "#": " ";
            }            
        }
        return answer;
    }
}
