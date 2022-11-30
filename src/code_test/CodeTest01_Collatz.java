package code_test;

public class CodeTest01_Collatz {

	public static void main(String[] args) {
		int num = 626331;
		int answer = 0;
		Long numL= Long.valueOf(num);
		while (numL != 1) {
			if (numL % 2 == 0) {
				numL /= 2;
				answer++;

				if (numL == 1) {
					break;
				}
			}
			if (numL % 2 != 0) {
				numL = numL * 3 + 1;
				answer++;
				if (numL == 1) {
					break;
				}
			}
			if (answer > 500 && numL != 1) {
				answer = -1;
				break;
			}
		}
		System.out.println(answer);

	}

	class Solution {
		public int solution(int num) {
			int answer = 0;
			return answer;
		}
	}
}
