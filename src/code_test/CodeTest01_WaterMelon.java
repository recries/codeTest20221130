package code_test;

public class CodeTest01_WaterMelon {

	public static void main(String[] args) {
			int n =3;
			String answer = "";
			String subak = "수박";
			String su = "수";
			if(n%2 ==0) {
				for(int i = 0; i<n/2;i++) {
					answer += subak; 
				}
				}
			else if(n%2 ==1) {
				for(int i =0; i<n/2;i++) {
					answer += subak; 
			}
				answer +=su;
		}
			else answer = "수";
	}
}	