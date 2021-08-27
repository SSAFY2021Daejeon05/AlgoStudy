import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
       	      int[] answer = new int[N];
			double[][] failure = new double[N][2]; // {레벨,실패율}
			int[] num = new int[N]; // {레벨별 실패자 수}

			for (int i = 0; i < N; i++) {
				for (int s : stages) {
					if (s >= i + 1) {
						if (s == i + 1) num[i] += 1;
						failure[i][1] += 1;
					}
                    failure[i][0] = i + 1;
				}

				failure[i][1] = failure[i][1] == 0 ? 0 : num[i] / failure[i][1];
			}

			// 실패율 낮고 레벨 낮은 순서로 정렬
			Arrays.sort(failure, (a, b) -> {
				if(a[1] == b[1]) {
					if(a[0] < b[0]) return -1;
					return 1;
				}
				
				return b[1] > a[1] ? 1 : -1;
			});
			
			// answer 채우기
			int i = 0;
			for(double[] f: failure) {
				answer[i++] = (int) f[0];
			}
			
			return answer;
		}
}
