import java.util.*;
class Solution {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[] middleX = {3,0,0,0,0,1,0,0,2};
    
    static int leftX = 3,leftY = 0,rightX = 3,rightY = 2;
    static String han = null;
    
    public static String manhattan(int num ){ // 오른손과 왼쪽손 거리 비교 
        int left = Math.abs(leftX - middleX[num]) + Math.abs(leftY - 1);
        int right = Math.abs(rightX - middleX[num]) + Math.abs(rightY - 1);
        if (left ==right) return han;
        return ((left< right)? "L" : "R");
    }

    public String solution(int[] numbers , String hand) {
        String answer = "";
        han = (hand.equals("right")? "R":"L"); // 스테틱 핸드 변수 초기화
        for(int curr : numbers){
            if("147".contains("" + curr) ){ // 1,4,7중에 있다면 왼손쓰기
                int index = "147".indexOf("" +curr);
                if(index == 0) leftX = 0;leftY = 0;
                if(index == 1) leftX = 1;leftY = 0;
                if(index == 2) leftX = 2;leftY = 0;
                answer += "L";
            }else if("369".contains("" + curr)) { // 3,6,9중에 있다면 오른손쓰기
                int index = "369".indexOf("" +curr);
                if(index == 0) rightX = 0; rightY = 2;
                if(index == 1) rightX = 1; rightY = 2;
                if(index == 2) rightX = 2; rightY = 2;
                answer += "R";
            }else{ //2,5,8,0중에 있다면 가까운손 쓰기
                String tmp = manhattan(curr); // 거리 비교 하고 쓸손 정하기
                if (tmp.equals("L")){ 
                    answer+= "L";
                    leftX = middleX[curr]; leftY = 1;
                }else if (tmp.equals("R")){ 
                    answer+= "R";
                    rightX = middleX[curr]; rightY = 1;
                }   
            }
        } // end of for-loop\
        return answer;
    }
}
