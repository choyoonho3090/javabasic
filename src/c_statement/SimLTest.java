package c_statement;

import java.util.Scanner;

public class SimLTest {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String input;
		System.out.println("yes or no");
		System.out.println("나는 금사빠다");
		input = a.nextLine();
			
		if(input.equals("yes")){
			System.out.println("연애 할 때 끌려다니는 타입이다.");
			input = a.nextLine();
		 if(input.equals("yes")){
			System.out.println("감정표현에 솔직한 편이다.");
			input = a.nextLine();
				if(input.equals("yes"))
					System.out.println("이성친구는 존재할 수 없다.");
					input = a.nextLine();
					if(input.equals("yes")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						input = a.nextLine();
					}if(input.equals("yes")){
							System.out.println("D");
							input = a.nextLine();
						}else if(input.equals("no"))
							System.out.println("C");
							input = a.nextLine();
		
		
	}else if(input.equals("no")){
		System.out.println("데이트 코스 미리 짜는게 편하다");
		input = a.nextLine();
		if(input.equals("yes"))
			System.out.println("활동적인 데이트가 좋다.");
			input = a.nextLine();
			if(input.equals("yes"))
				System.out.println("이성친구는 존재할 수 없다.");
				input = a.nextLine();
				if(input.equals("yes"))
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					input = a.nextLine();
					if(input.equals("yes")){
						System.out.println("D");
						input = a.nextLine();
					}if(input.equals("no"))
						System.out.println("C");
						input = a.nextLine();
	
		}
		
	}else if(input.equals("no"))
		System.out.println("감정 기복이 크지 않다.");
		input = a.nextLine();
	 if(input.equals("yes")){
		System.out.println("연락이 없어도 믿고 기다리는 편이다.");
		input = a.nextLine();
			if(input.equals("yes"))
				System.out.println("A");
				input = a.nextLine();
	 		}
	}
}