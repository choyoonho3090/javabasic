package f_oop2;

public class AccessModifier {
	
	public String publicvar = "public : 접근 제한이 없음";
	protected String protectedvar = "protected : 같은 패키지 + " + " 상속받은 클래스에서 접근 가능";
	String defaultvar = "dafault : 같은 패키지에서만 접근 가능";
	private String privatevar = "private : 클래스 내에서만 접근 가능";
	
	
	public void publicMethod(){
		System.out.println(publicvar);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedvar);
	}
	
	void defaultMethod(){
		System.out.println(defaultvar);
	}
	
	private void privateMethod(){
		System.out.println(privatevar);
	}
	
	
	
	
	
}
