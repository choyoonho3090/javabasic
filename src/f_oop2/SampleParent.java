package f_oop2;

public class SampleParent extends Object {          //Object 클래스는 모든 클래스의 조상

		
		String var;
		
		{
			var = "초기화";
		}
		
		
		SampleParent(){
			var = "생성자도 물려주지 않는다";
		}
		
		
		int method(int a, int b){
			return a + b;
		}
		
		
		
		
		
		
		
		
		
		
}
