class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase()
                                .replaceAll("[^\\w\\-\\_\\.]", "")
                                .replaceAll("\\.{2,}", ".")
                                .replaceAll("^\\.|\\.$", "");
        
        if(answer.length() == 0) return "aaa";
        else if(answer.length() >= 16) return answer.substring(0, 15).replaceAll("\\.$", "");
        else if(answer.length() <= 2) return String.format("%-3s", answer).replaceAll(" ", answer.substring(answer.length() - 1));
        
        return answer;
    }
}
