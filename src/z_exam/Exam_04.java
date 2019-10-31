package z_exam;

public class Exam_04 {

	public static void main(String[] args) {

//		[4-1] 다음의 문장들을 조건식으로 표현하라.
//		1. int 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//			10 < x && x < 20
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식 
//			!(ch == ' ' || ch =='\t') ch!=' ' && ch !='\t'
//		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
//			ch == 'x' || ch == 'X'
//		4. char형 변수 ch가 형 변수 가 숫자(‘0’~‘9’)일 때 인 조건식 true
//			'0' <= ch && ch <='9'
//		5. char ch ( ) true 형 변수 가 영문자 대문자 또는 소문자 일 때 인 조건식
//			('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')
//		6. int year 400 4 100 형 변수 가 으로 나눠떨어지거나 또는 로 나눠떨어지고 으로 나눠떨어지지
//		않을 때 인 조건식 true
//			year%400==0 || year%4==0 && year%100!=0
//		7. boolean powerOn false true 형 변수 가 일 때 인 조건식
//			!powerOn powerOn==false
//		8. str “yes” true 문자열 참조변수 이 일 때 인 조건식
//			str.equals("yes") "yes".equals(str)
		
		
//		[4-2] 1부터 20까지의 점수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
//		int sum = 0;
//		for(int i= 1; i <= 20; i++){
//			if(i%2 != 0 && i%3 != 0){
//				sum += i;
//			}
//			System.out.println(sum);
//		}
//		[정답] 73
		
		
//		[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
//		int sum = 0;
//		int sum2 = 0;
//		for(int i=1; i <=10; i++) {
//		sum += i;
//		sum2 += sum;
//		}
//		System.out.println("sum2="+sum2);
//		[정답] 220
		
		
//		[4-4] 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
//		100이상이 되는지 구하시오.
//		int sum = 0; // 총합을 저장할 변수
//		int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
//		int num = 0;
//		// true . 조건식의 값이 이므로 무한반복문이 된다
//		for(int i=1;true; i++, s=-s) { // s 1, -1, 1, -1... 매 반복마다 의 값은
//		num = s * i; // i (s) . 와 부호 를 곱해서 더할 값을 구한다
//		sum += num;
//		if(sum >=100) // 100 . 총합이 보다 같거나 크면 반복문을 빠져 나간다
//		break;
//		}
//		System.out.println("num="+num);
//		System.out.println("sum="+sum);
//		[정답]199
		
		
//		[4-5] 다음의 for문을 while문으로 변경하시오.
//		[연습문제]/ch4/Exercise4_5.java
//			for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
//			System.out.print("*");
//			System.out.println();
//			}
//		[정답]
//			int i=0;
//			while( i<=10) {
//			int j=0;
//			while(j<=i) {
//				System.out.println("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//			}

		
//		[4-6]두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
//			for(int i=1;i<=6;i++)
//				for(int j=1;j<=6;j++)
//					if(i+j==6)
//						System.out.println(i+"+"+j+"="+(i+j));
//			[출력결과]
//			    1+5=6
//				2+4=6
//				3+3=6
//				4+2=6
//				5+1=6					
		
		
//		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는코드를 
//			   완성하라. (1)에 알맞은 코드를 넣으시오. 
//			   [연습문제]/ch4/Exercise4_7.java
//				int value = ( 1 );
//			   	System.out.println("value:"+value);
//			   [정답]
//			    (int)(Math.random()*6)+1	   
			   

//		[4-8] 방정식  2x+4y=10의 모든 해를 구하시오. 단 x와 y는 정수이고 각각의 범위는
//				0<=x<=10, 0<=y<=10 이다. 
//				[실행결과] 
//				x=1, y=2
//				x=3, y=1
//				x=5, y=0
//				[정답]
//					for(int x=0; x <=10;x++) {
//						for(int y=0; y <=10;y++) {
//						if(2*x+4*y==10) {
//						System.out.println("x="+x+", y="+y);
//							}
//						}
//					}

		
//		[4-10] int타입의  변수num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
//				만일 변수 의 값이 12345라면 . ‘1+2+3+4+5’ 15 의 결과인 를 출력하라. 
//				(1)에 알맞은 코드를 넣으시오.
//				[연습문제]/ch4/Exercise4_10.java
//				int num = 12345;
//				int sum = 0;
//				while(num > 0) {
//				sum += num%10;
//				num /= 10;
//				}
//				System.out.println("sum="+sum);
//				[정답]
//				15
		
		
//		[4-11] 피보나치 수열 은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다 예를 들어 
//				앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 . 1 1 2
//				1 2 3 1,1,2,3,5,8,13,21,... . 1 1 과 를 더해서 이 되어서 과 같은 식으로 진행된다. 
//				1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.			
//				[연습문제]/ch4/Exercise4_11.java
//				int num1 = 1;
//				int num2 = 1;
//				int num3 = 0; // 세번째 값
//				System.out.print(num1+","+num2);
//				for (int i = 0 ; i < 8 ; i++ ) {
//				num3 = num1 + num2; // . 세번째 값은 첫번째와 두번째 값을 더해서 얻는다
//				System.out.print(","+num3); // 세 번째 수열 출력
//				num1 = num2; // . 두 번째 수열을 첫 번째 값으로 한다
//				num2 = num3; // . 세 번째 수열을 두 번째 값으로 한다
//				}
//				[정답]
//				1,1,2,3,5,8,13,21,34,55
		
		
//		[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다 (1)에 
//				알맞은 코드를 넣어서 프로그램을 완성하시오.
//				[연습문제]/ch4/Exercise4_13.java
//				String value = "12o34";
//				char ch = ' ';
//				boolean isNumber = true;
//				
//				for(int i=0; i < value.length() ;i++) {
//					ch = value.charAt(i);
//					if(!('0'<=ch && ch<='9')) {
//						isNumber = false;
//						break;
//					}
//				}
//				if (isNumber) {
//					System.out.println(value+"는 숫자가 아닙니다."); 
//				} else {
//					System.out.println(value+"는 숫자가 아닙니다."); 
//				}
//				[실행결과]
//				12o34는 숫자가 아닙니다.
			
		
//		[4-14] 다음은 숫자맞추기 게임을 작성한 것이다 과 사이의 값을 반복적으로 입력 . 1 100
//		해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다 사용자가 값을 입력하면 컴퓨터는 자 . ,
//		신이 생각한 값과 비교해서 결과를 알려준다 사용자가 컴퓨터가 생각한 숫자를 맞추면 .
//		게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다 에 알맞은 코드를 넣어 프 . (1)~(2)
//		로그램을 완성하시오.
//		
//		[연습문제]/ch4/Exercise4_14.java
//		int answer = (int)(Math.random() * 100) + 1;
//		int input = 0; // 사용자입력을 저장할 공간
//		int count = 0; // 시도횟수를 세기위한 변수
//		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
//		java.util.Scanner s = new java.util.Scanner(System.in);
//		do {
//		count++;
//		System.out.print("1과 100사이의 값을 입력하세요 :");
//		input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다
//		if(answer > input) {
//		System.out.println("  더 큰 수를 입력하세요."); 
//		} else if(answer < input) {
//		System.out.println("더 작은 수를 입력하세요."); 
//		} else {
//		System.out.println("맞췄습니다."); 
//		System.out.println("시도횟수는 "+count+"번입니다."); 
//		break; // do-while문을 벗어난다
//		}
//		} while(true);
	
			
//		[4-15] 다음은 회문수를 구하는 프로그램이다 회문수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과 
//				같은 수를 말한다. 예를 들면 ‘12321’이나‘13531’ 같은 수를 말한다. 
//				(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오. 
//				[연습문제]/ch4/Exercise4_15.java
//				int number = 12321;
//				int tmp = number;
//				int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
//				while(tmp !=0) {
//					result = result*10 + tmp % 10; // 10 . 기존 결과에 을 곱해서 더한다
//					tmp /= 10;
//				}
//				if(number == result)
//					System.out.println( number + "는 회문수 입니다 ."); 
//					else
//						System.out.println( number + " .");
//				[실행결과]
//				12321는 회문수 입니다.
				
	}
}