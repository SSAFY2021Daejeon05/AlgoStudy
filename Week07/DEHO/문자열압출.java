class Solution {
    public int solution(String s) {
        int minV = Integer.MAX_VALUE;
        if(s.length() == 1){
            return 1;
        }
        for(int i = 1 ; i < (s.length() / 2) +1 ; i++){
            String pre = s.substring(0, i);
            int curr = i , cnt = 1;
            String result = "", next = "";
            while(curr + i <= s.length() ){
                next = s.substring( curr, curr + i);
                if(next.equals(pre)){
                    cnt += 1;
                }else{ // 다른경우
                    result += cnt > 1 ? "" + cnt + pre : pre;
                    cnt = 1;
                }
                pre = next;
                curr += i;
            }
            result += cnt > 1 ? "" + cnt + pre : pre;            
            if(curr + i > s.length() ){
                result += s.substring(curr, s.length());            
            }
            
            minV = Math.min(minV , result.length());
        }
        return minV;
    }
}
