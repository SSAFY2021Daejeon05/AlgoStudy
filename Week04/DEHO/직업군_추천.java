import java.util.*;
import java.io.*;
class Solution {
    public static class Node{
        String dep;
        int score;
        public Node(String dep , int score){
            this.dep = dep;
            this.score = score;
        }
    }
    public String solution(String[] table, String[] languages, int[] preference) {
        ArrayList<Node> arr = new ArrayList<>();
        Set<String> set = new HashSet<String>(Arrays.asList(languages));
        for(int i = 0 ; i < table.length ; i++){
            
            StringTokenizer str = new StringTokenizer(table[i]); 
            String dep = str.nextToken(); int cnt = 0; // get com name
            
            for(int j = 5 ; j >= 1; j-- ){ // 5부터 하나씩 줄여나가며 점수계산    
              
                String lang = str.nextToken();
                if(set.contains(lang)){ // 글짜 있으면 찾고 계산하기
                    for(int k = 0 ; k < languages.length ; k++){ 
                        if(languages[k].equals(lang)){
                            cnt += ( j * preference[k] ); //점수 * 선호도
                            break;
                        }
                    }
                }
            }
            arr.add(new Node(dep, cnt)); // 추가
        }
        
        Collections.sort(arr , new Comparator<Node>(){
           @Override
            public int compare(Node o1, Node o2 ){
                if(o1.score == o2.score){ //점수가 같다면 회사로 오름차순
                    return o1.dep.compareTo(o2.dep);
                }
                return -Integer.compare(o1.score , o2.score);
            }
        });
        
        return arr.get(0).dep;
    }
}
