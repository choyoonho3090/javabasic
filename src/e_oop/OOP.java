package e_oop;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		
		/*
		 *  << 객체지향 프로그램 >>
		 *  - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체 간의 상호작용으로 보는 것.
		 *  - 코드의 재사용성이 높고 유지보수가 용이하다.
		 *  
		 *  << 객체 생성(인스턴스화) >>
		 *  - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것.
		 *  - new 클래스명(); -> 객체가 저장된 메모리 주소 변환.
		 *  - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 *  - 객체는 생성될 때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		*/
		
		SampleClass sc = new SampleClass();
		
		sc.method1();
		
		sc.method2(10);
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		sc.test1();
		
		System.out.println("---------------------------------------------------");
		
		ClassMaker cm = new ClassMaker();
		
		cm.method1();
		
		System.out.println(cm.method2());
		
		cm.method3("조윤호");
		
		System.out.println(cm.method4(70, 80));
		
		System.out.println("---------------------------------------------------");
		
		Calculator cc = new Calculator();
		
//		double a = cc.plus(123456, 654321);
//		System.out.println(a);
//		
//		double b = cc.multiple(a, 123456);
//		System.out.println(b);
//		
//		double c = cc.divide(b, 123456);
//		System.out.println(c);
//		
//		double d = cc.minus(c, 654321);
//		System.out.println(d);
//
//		double e = cc.rest(d, 123456);
//		System.out.println(e);
		
		double result = cc.plus(123456, 654321);
		result = cc.multiple(result, 123456);
		result = cc.divide(result, 123456);
		result = cc.minus(result, 654321);
		result = cc.rest(result, 123456);
		System.out.println(result);
		
		System.out.println("---------------------------------------------------");
		
		SimLiTest slt = new SimLiTest();
		
		
		slt.a();
		
		
		
	}
}
