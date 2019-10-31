package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		
		
//		 우리반 모두의 Java, Oracle, HTML, JQuery, JSP 점수를 50~ 100까지 랜덤으로 생성시켜 주시고,
//		 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
//		 석차	이름		Java	Oracle	HTML	JQuery	JSP	 총점	평균
//		 1		오동규	100
//		 1		오동규	100
//		 1		오동규
//		 1		오동규
//		 1		오동규
//		 1		오동규
//		 1        오동규
		String[] students = {"오동규", "박재욱", "오제민", "전보영"};
		String[] subjects = {"Java", "Oracle", "HTML", "JQuery", "JSP"};
		int[][] scores = new int[students.length][subjects.length];
		int[] rank = new int[scores.length];
		int[] sum = new int[scores.length]; 
		int[] avg = new int[scores.length]; 
		
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j <scores[i].length; j++){
				scores[i][j] = (int)(Math.random()*100)+ 1;
			}
		}
		
		System.out.println("석차 이름 Java Oracle HTML JQuery JSP 총점 평균");

		for(int i=0; i < scores.length; i++){
			for(int j= 0; j < scores[i].length; j++){
			sum[i] += scores[i][j];
			}
			avg[i] = (int)sum[i] / (int)scores[i].length;
			System.out.println(rank[i] +"  "+ students[i] + " " + Arrays.toString(scores[i]) +" "+ sum[i] +" "+ avg[i]  );
		}
		
		
		
	}
}