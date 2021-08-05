import java.util.ArrayList;

class Sol03 {
    private static int[] s1 = {1, 2, 3, 4, 5};
    private static int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
    private static int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int len = answers.length;
        
        for(int i = 0; i < len; i ++){
            if(answers[i] == s1[i % s1.length]) sum1 += 1;
            if(answers[i] == s2[i % s2.length]) sum2 += 1;
            if(answers[i] == s3[i % s3.length]) sum3 += 1;
        }
            
        int max = Math.max(sum1, sum2);
        max = Math.max(sum3, max);
        
        if(sum1 == max) answer.add(1);
        if(sum2 == max) answer.add(2);
        if(sum3 == max) answer.add(3);

        return answer;
    }
}
