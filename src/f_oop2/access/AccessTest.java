package f_oop2.access;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicvar);
		am.publicMethod();
		
//		System.out.println(am.protectedvar);  //상속을 받더라도 메인 메서드 안에서는 사용불가
//		am.protectedMethod();
		
	}
	void protededTest(){
		System.out.println(protectedvar);
		protectedMethod();
		
//		System.out.println(defaultvar);
//		defaultMetohod();
		
//		System.out.println(privatevar);
//		privateMethod();
		
	}
}
