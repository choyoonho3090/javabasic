package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
 		/*
 		 * << if문 >>
 		 * - if      : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
 		 * - else if : 다수의 조건이 필요할 때 if 뒤에 추가한다.
 		 * - else    : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */	
		
		int a = 10;
		
		if(a < 100){
			System.out.println("조건식의 결과가 true이면 수행된다.");
		}
		
		if(a < 10){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		int regno = 1;
		String gender = null;
		
		if(regno == 1){
			gender = "남자";
		}else if(regno == 2){
			gender = "여자";
		}else if(regno == 3){
			gender = "남자";
		}else if(regno == 4){ //if블럭 뒤에 else if(){}로 조건을 추가할 수 있다.
			gender = "여자";
		}else {
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다.
		if(regno ==1 || regno ==3){
			gender = "남자";
		}else if(regno ==2 || regno == 4)
			gender = "여자";
		else //수행할 내용이 한문장일 경우 블럭을 생략할 수 있다.
			gender ="확인불가";
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//성적에 등급을 부여하는 프로그램을 만들어보자.
		int score = 99;
		String grade = null;
		
		if(score >= 90){
			grade = "A";
		}else if(score >= 80){
			grade = "B";
		}else if(score >= 70){
			grade = "C";
		}else if(score >= 60){
			grade = "D";
		}else 
			grade = "F";
		System.out.println(score +"점수는 "+ grade + "입니다.");
		
		//등급 안에서 +와 -를 나누어보자.
		score = 95;
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade = "A+";
			}else if(93 >= score){
				grade = "A-";
			}
		}else if(80 <= score){
			grade ="B";
			if(87 <= score){
				grade = "B+";
			}else if(83 >= score){
			grade ="B-";
			}
		}else if(70 <= score){
			grade ="C";
			if(77 <= score){
				grade = "C+";
			}else if(73 >= score){
			grade ="C-";
			}
		}else if(60 <= score){
			grade ="D";
			if(67 <= score){
				grade = "D+";
			}else if(63 >= score){
			grade ="D-";
			}
			else {
				grade = "F";
			}
		}
		System.out.println(grade);
		
		/*
		 * << switch 문>>
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 * - 조건식의 결과는 정수와 문자열만(JDk1.7부터 문자열 허용) 허용한다.
		 */		
		regno = 2;
		gender = null;
		switch(regno){  //조건식의 연산결과는 정수와 문자열만 허용된다.
		case 1 : 
		case 3 : //조건식과 일치하는 case문 이후의 문장을 수행한다.
			gender = "남자";
			break; //break를 만나면 switch문을 빠져나간다.
		case 2 : 
		case 4 :	
			gender = "여자";
			break;
		default : //if문의 else와 같은 역할을 한다.
			gender = "확인불가";
		}
		
		
		score = 75;
		grade = null;
		switch(score / 10){
		case 10 :
		case 9 :
			grade = "A";
			break;
		case 8 :	
			grade = "B";
			break;
		case 7 :
			grade = "C";
			break;
		case 6 :
			grade = "D";
			break;
		default :
			grade = "F";
		}
		System.out.println(grade);
		
		
		//문제1. 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
//		Scanner s = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요");
//		int input2 = Integer.parseInt(s.nextLine());
//		String num = null;
//		if(input2 == 0){
//			num = "0입니다.";
//		}else if(input2 != 0){
//			num = "0이 아닙니다.";
//		}
//		System.out.println(num);
//		
//		switch(input2) {
//		case 0 :
//			System.out.println("0입니다.");
//		default :
//			System.out.println("0이 아닙니다.");
//		}
			
		//문제2. 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int input1 = Integer.parseInt(s.nextLine());
		int input2 = Integer.parseInt(s.nextLine());
		int input3 = Integer.parseInt(s.nextLine());
//		if(input%2 == 0){
//			System.out.println("짝수입니다.");
//		}else if(input%3 == 0){
//			System.out.println("홀수입니다.");
//		}
//		
//		switch(input % 2){
//		case 1 : System.out.println("홀수입니다."); break;
//		default : System.out.println("짝수 입니다.");
//		}
		
		//문제3. 점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		int 총점 = input1 + input2 + input3;
		System.out.println("총점 : " +총점);
		int 평균 = 총점/3;
		System.out.println("평균 : " +평균);
		if(평균 <= 90){
			System.out.println("등급 : A");
		}else if(평균 <= 80 && 평균 < 90){
			System.out.println("등급 : B");
		}else if(평균 <= 70){
			System.out.println("등급 : C");
		}else if(평균 <= 60){
			System.out.println("등급 : D");
		}else 
			System.out.println("등급 : F");
		
		
	}
	
}
