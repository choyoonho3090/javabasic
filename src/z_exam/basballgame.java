package z_exam;

import java.util.Scanner;

public class basballgame {

	public static void main(String[] args) {
	
		/*
		  * 136 0S 1B 2O
		  * 217 1S 1B 1O
		  * 123 0S 1B 2O
		  * 318 1S 0B 2O
		  * 517 1S 2B 0O
		  * 715 3S 0B 0O
		  */		 
		 
		 int a1, a2, a3;
		 
		 a1 = (int)(Math.random() * 9 )+ 1;
//		 
//		 do{ 
//			 a2 = (int)(Math.random() * 9 )+ 1;
//		 }while(a1 == a2);
//		 
//		 do{
//			 a3 = (int)(Math.random() * 9 )+ 1;
//		 }while(a3 == a1 || a3 == a2);
		 
		 a2 = 1;
		 a3 = 1;
		 while(a1 == a2){
			 a2 = (int)(Math.random() * 9 )+ 1;
		 }while (a3 == a1 || a3 == a2){
			 a3 = (int)(Math.random() * 9 )+ 1;
		 }
		 
		 Scanner s = new Scanner(System.in);
		 int count = 0;
		 while(true){
			 System.out.println("3자리 숫자를 입력해주세요.");
			 int input = Integer.parseInt(s.nextLine());
			 int i3 = input%10;
			 input /= 10;
			 int i2 = input%10;
			 input /= 10;
			 int i1 = input%10;
			 
			 int strike = 0;
			 int ball = 0;
			 int out = 0;
			 
			 if(a1 == i1) strike++;
			 if(a2 == i2) strike++;
			 if(a3 == i3) strike++;
			 
			 if(a1 == i2 || a1 == i3) ball++;
			 if(a2 == i1 || a2 == i3) ball++;
			 if(a3 == i1 || a3 == i2) ball++;
			 
			 
			 out = 3 - strike - ball;
		
			 System.out.println(count++ + "차 시도" + strike + "s " + ball + "B " + out + "O");
			 System.out.println("------------------------");
			 if(strike ==3){
				 System.out.println("정답입니다.");
				 break;
			 }
		 }
		 
	}

}
