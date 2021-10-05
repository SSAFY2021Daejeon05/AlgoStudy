class Solution {
    static int N, answer = 0, tar;
    static int[] arr;
    public int solution(int[] numbers, int target) {
        N = numbers.length;
        tar = target; 
        arr = numbers;
        func(0 ,0);
        return answer;
    }

    public void func(int index, int total){
        if(index == N ){
            if(total == tar){
                answer++;    
            }
            return;
        }
        func(index + 1 , total + arr[index]);
        func(index + 1 , total - arr[index]);
    }
}

