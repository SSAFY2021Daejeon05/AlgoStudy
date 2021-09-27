class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr= new int[10];
        for(int tmp : numbers){
            arr[tmp] ++;
        }
        for(int i = 1 ; i  < 10 ; i++ ){
            answer += arr[i] ==0? i : 0;
        }
        return answer;
    }
}
