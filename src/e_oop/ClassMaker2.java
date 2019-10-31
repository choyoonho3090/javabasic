package e_oop;

public class ClassMaker2 {
	
	//전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	int var = 10;
	
	//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요.
	{
		var = 10;
	}
	
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(int var){
		this.var = var;
	}
	
	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2(){
		this(50);
	}
	
	//초기화 순서 : 명시적 초기화 -> 초기화 블럭 -> 생성자
	//명시적 초기화 와 초기화 블럭만 위에 있는 것을 초기화, 생성자를 마지막
	
	
	
	
	
	
	
	
	
}