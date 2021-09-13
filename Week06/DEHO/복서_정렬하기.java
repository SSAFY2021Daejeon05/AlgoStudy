import java.util.*;
import java.util.Collections;
class Solution {
    static class Pair implements Comparable<Pair>{
        int index  , weightWin , myWeight;
        double rate;
        
        public Pair( int index ,double rate , int weightWin , int myWeight){
            this.index = index;
            this.rate = rate;
            this.weightWin = weightWin;
            this.myWeight = myWeight;
        }
  
        @Override 
        public int compareTo( Pair o2){
            if(this.rate != o2.rate){
                return -Double.compare(this.rate , o2.rate);
            }else if(this.weightWin != o2.weightWin){
                return -Integer.compare(this.weightWin,o2.weightWin );
            }else if(this.myWeight != o2.myWeight){
                  return -Integer.compare( this.myWeight,  o2.myWeight );
            }
            return Integer.compare(this.index , o2.index);
        }
        
        @Override 
        public String toString(){
            return "index :" + index + " rate :" + rate + " weightWin :" + weightWin + " myWeight :" + myWeight;
        }
    }
    public int[] solution(int[] weights, String[] head2head) {
        ArrayList<Pair> arr= new ArrayList<Pair>();
        for(int i = 0 ; i < weights.length ; i++ ){
            int currWeight = weights[i];
            String currHead = head2head[i];
            float win = 0;
            int overWeight = 0, None =0;
            for(int j = 0 ; j < weights.length ; j++ ){
                if(currHead.charAt(j) == 'W'){
                    win++;
                    if (currWeight < weights[j] ){
                        overWeight ++;
                    }
                }else if(currHead.charAt(j) == 'N'){
                    None++;
                }
            }
            if(weights.length -None <= 0){
                arr.add( new Pair( i , 0 ,  overWeight , currWeight) );
            }else{
                arr.add( new Pair( i , win / (weights.length -None) ,  overWeight , currWeight) );    
            }
            
        }
        
        Collections.sort( arr );
        int[] answer = new int[weights.length];
        int index = 0;
         for(Pair tmp : arr){
             // System.out.println(tmp.toString());
            answer[index] = tmp.index+1;
             index++;
        }
        return answer;
    }
}
