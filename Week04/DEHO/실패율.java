import java.util.*;
class Node{
    int stage;
    double rate;
    public Node(int stage, double rate){
        this.stage = stage;
        this.rate = rate;
    }
    @Override
    public String toString(){
        return "this.stage " +  this.stage + " this.rate " +   this.rate ;
    }
}

class Solution {
    
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N+2];// counter 각 레벨에 몇명이 있나 세어준다;
        ArrayList<Node> nodeList = new ArrayList<>();
        for(int i = 0 ; i < stages.length ; i++){ // stages배열을 돌며 증가시켜준다.
            count[stages[i]]++;
        }
        int len = stages.length;
        for(int level = 1 ; level <= N; level ++){
            if(count[level] != 0){//스테이지에 사람이 있다면 실패율을 계산해주고
                                    //스테이지에 있는 사람만큼 뺴준다.
                nodeList.add(new Node(level , count[level] / (double) len));
                len -= count[level];
            }else{
                System.out.println( 0/(double) len);
                nodeList.add(new Node(level,0));
            }
        }
        Collections.sort(nodeList, new Comparator<Node>(){
            @Override 
            public int compare(Node o1,Node o2){
                if(o1.rate ==  o2.rate){
                    return Integer.compare(o1.stage ,o2.stage );
                }
                return (int) - Double.compare(o1.rate , o2.rate );
            }
        });
        int index = 0;
        for(Node tmp : nodeList){
            answer[index++] = tmp.stage;
        }
        
        return answer;
    }
}
