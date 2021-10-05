import java.util.*;
class Solution {
    static int[] dx = { 1, 0, -1, 0}; // 하 우 상 좌
    static int[] dy = { 0, 1, 0, -1};
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] arr = new int[rows][columns];
        int num = 1, index = 0;// num배열 채워주기 위해,index 정답 채우기 위해
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = num++;
            }
        }
        for(int i = 0 ; i < queries.length ; i++){
            int minX = queries[i][0] -1, minY = queries[i][1] -1,
                maxX = queries[i][2] -1, maxY = queries[i][3] -1;
            int x = minX , y = minY, tmp = arr[minX][minY],
                minV = Math.min( Integer.MAX_VALUE , arr[minX][minY] ) ;
            for(int dir = 0 ; dir < 4 ; dir++){
                while(true){
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];
                    if(nx < minX || nx > maxX ||  ny < minY || ny > maxY) break;
                    minV = Math.min( minV ,  arr[nx][ny] );
                    arr[x][y] = arr[nx][ny];
                    x = nx;
                    y = ny;
                }
            }
            arr[ minX ][ minY + 1 ] = tmp;
            answer[index++] = minV;

        }
        
        return answer;
    }
}
