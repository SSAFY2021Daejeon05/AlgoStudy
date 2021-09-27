import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String , String> map = new HashMap<>();
        int cnt = 0;
        for(String tmp : record){
            StringTokenizer str = new StringTokenizer(tmp);
            String order = str.nextToken();
            if(order.equals("Enter")){
                map.put(str.nextToken(),str.nextToken() );
            }else if(order.equals("Change")){
               map.replace( str.nextToken(), str.nextToken() );
            }
            cnt += (order.equals("Enter") || order.equals("Leave") )? 1 : 0;
        }
        int index = 0;
        String[] answer = new String[cnt];
        for(String tmp : record){
            StringTokenizer str = new StringTokenizer(tmp);
            String order = str.nextToken();
            if(order.equals("Enter")){
                answer[index++] = "" + map.get(str.nextToken()) + "님이 들어왔습니다.";
            }else if(order.equals("Leave")){
                answer[index++] = "" + map.get(str.nextToken()) + "님이 나갔습니다.";
            }
        }       

        return answer;
    }
}

