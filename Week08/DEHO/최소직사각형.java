import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int W = Integer.MIN_VALUE, H = Integer.MIN_VALUE;
        for(int i = 0 ; i < sizes.length ; i++){
            W = Math.max(W , Math.max( sizes[i][0], sizes[i][1] ) );
            H = Math.max(H , Math.min( sizes[i][0], sizes[i][1] ) );
        }
        return W * H;
    }
}
