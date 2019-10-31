package e_oop;

import java.util.Scanner;

public class SimLiTest {
		
	//9개의 질문을 9개의 메서드로 만들어주세요.
	Scanner sc = new Scanner(System.in);
	
	
	void a(){
		System.out.println("나는 금사빠다");
		String input = sc.nextLine();
		if(input.equals("y")){
			b();
		}else if(input.equals("n")){
			d();
		}else {
			a();
		}
	}
	
	void b(){
		System.out.println("연애 할 때 끌려다니는 타입이다");
		String input = sc.nextLine();
		if(input.equals("y")){
			e();
		}else if(input.equals("n")){
			c();
		}else {
			b();
		}
	}
	
	void c(){
		System.out.println("데이트 코스는 미리 짜는게 편하다");
		String input = sc.nextLine();
		if(input.equals("y")){
			f();
		}else if(input.equals("n")){
			e();
		}else {
			c();
		}
	}
	
	void d(){
		System.out.println("감정기복이 크지 않다");
		String input = sc.nextLine();
		if(input.equals("y")){
			g();
		}else if(input.equals("n")){
			e();
		}else {
			d();
		}
	}
	
	void e(){
		System.out.println("감정 표현에 솔직한 편이다");
		String input = sc.nextLine();
		if(input.equals("y")){
			h();
		}else if(input.equals("n")){
			f();
		}else {
			e();
		}
	}
	
	void f(){
		System.out.println("활동적인 데이트가 좋다");
		String input = sc.nextLine();
		if(input.equals("y")){
			h();
		}else if(input.equals("n")){
			i();
		}else {
			f();
		}
	}
	
	void g(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다");
		String input = sc.nextLine();
		if(input.equals("y")){
			System.out.println("A");
		}else if(input.equals("n")){
			h();
		}else {
			g();
		}
	}
	
	void h(){
		System.out.println("이성친구는 존재할 수 없다.");
		String input = sc.nextLine();
		if(input.equals("y")){
			i();
		}else if(input.equals("n")){
			System.out.println("B");
		}else {
			h();
		}
	}
	
	void i(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
		String input = sc.nextLine();
		if(input.equals("y")){
			System.out.println("D");
		}else if(input.equals("n")){
			System.out.println("C");
		}else {
			i();
		}
	}
	
	
	
}
