package f_oop2.ex_abstract;

public abstract class Animal {
	
	void run(){
		System.out.println("달련간다~~");
	}
	
	abstract void bark();
	
	
	
}


class Dog extends Animal {
	
	void bark(){
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	
	void bark(){
		System.out.println("냥냥");
	}
}

class Pig extends Animal {
	
	void bark(){
		System.out.println("꿀꿀");
	}
}









