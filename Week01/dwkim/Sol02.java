class Sol02 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] status = new int[n + 1];
        int answer = n;
        
        for(int l: lost){
            status[l] -= 1;
        }
        for(int r: reserve){
            status[r] += 1;
        }
        
        for(int i = 1; i < n + 1; i ++){
            if(status[i] == -1){
                if(status[i - 1] == 1){
                    status[i - 1] = 0;
                } else if(i + 1 <= n && status[i + 1] == 1){
                    status[i + 1] = 0;
                } else {
                    answer -= 1;
                }
            } 
        }
        
        return answer;
    }
}
