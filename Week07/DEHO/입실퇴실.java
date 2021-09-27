class Solution { .
    public int[] solution(int[] enter, int[] leave) {
        int len = enter.length;
        int[] answer = new int[len], idx = new int[len + 1];
        for(int i = 0; i < len; i++) idx[enter[i]] = i;
        for(int i = 0; i < len; i++) {
            for(int j = 0, late = idx[enter[i]]; j < len; j++) {
                int e = enter[i], l = leave[j];
                if(e == l) break;
                if(idx[l] > late || (late > idx[e] && idx[l] < late)) {
                    answer[l-1]++;
                    answer[e-1]++;
                    late = Math.max(idx[l], late);
                }
            }
        }
        return answer;
    }
}

