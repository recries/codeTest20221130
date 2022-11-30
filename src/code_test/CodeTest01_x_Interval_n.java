package code_test;

public class CodeTest01_x_Interval_n {
	class Solution {
	    public long[] solution(int x, int n) {
	        Long y = Long.valueOf(x);
			long[] answer =new long[n];
			
			for(int i=1; i<=n; i++) {
				answer[i-1] = (y*i);
			}
		

	        return answer;
	    }
	}

}
