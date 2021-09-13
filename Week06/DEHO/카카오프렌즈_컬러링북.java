import java.util.*;
class Solution {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static class Pair{
        int x, y;
        public Pair(int x , int y){
            this.x = x;
            this.y = y;
        }
    }
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = Integer.MIN_VALUE;
        int[][] visit = new int[picture.length][picture[0].length];

        for(int i = 0 ; i < picture.length ; i++){
            for(int j = 0 ; j < picture[0].length ; j++){
                if(picture[i][j] == 0 || visit[i][j] != 0) continue;
                numberOfArea++;
                Queue<Pair> Q = new LinkedList<Pair>();
                Q.offer(new Pair(i , j));
                visit[i][j] = 1;
                int minCnt = 0;
                while(!Q.isEmpty()){
                    Pair tmp = Q.remove();
                    minCnt++;
                    for(int dir = 0 ; dir < 4 ; dir++){
                        int nx = tmp.x + dx[dir];
                        int ny = tmp.y + dy[dir];
                        if( 0 > nx || nx >=  picture.length || ny < 0 || ny >= picture[0].length ) continue;
                        if (visit[nx][ny] == 0 && picture[i][j] == picture[nx][ny] ){
                        Q.offer(new Pair(nx , ny));
                        visit[nx][ny] = 1;
                        }
                    }
                    
                }
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea,minCnt );
                
            }
        }
        System.out.println(numberOfArea+ "  " +maxSizeOfOneArea );
        return new int[]{numberOfArea,maxSizeOfOneArea };
    }
}
