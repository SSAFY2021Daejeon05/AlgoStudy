class Solution {
    public int solution(String word) {
        char[] str = {'A','E','I', 'O','U'};
        int[] arr = {781, 156,31,6,1};
        int answer = 0;
        for(int i = 0 ; i < word.length() ; i++){
            for(int j = 0 ; j < 5 ; j++){
                if(word.charAt(i) == 'A'){
                    answer += 1;
                    break;
                }else if(word.charAt(i) == str[j]){
                    answer+= 1+arr[i]*j;
                }
            }
        }
        return answer;
    }
}
