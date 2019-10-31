package d_array;

import java.util.Arrays;

public class MulitiDimensionalArray {

	public static void main(String[] args) {
			
		/*
		 * << 다차원 배열 >>
		 * - 배열안에 배열이 저장되어 있는 형태이다.
		 * 
		*/
		
		int[][] numbers = new int[2][3]; //2칸짜리 배열 안에 각 칸마다 배열이 생성된다.
		int number2[][] = new int[][]{{1,2,3},{4,5,6}}; //값의 계수로 배열의 길이가 정해진다.
		int number3[][] = { {1, 2, 3}  // [3][3]
						   ,{4, 5, 6}
					       ,{7, 8, 9} }; //선언과 초기화를 동시에 해야한다.
		int[][] number4 = new int[3][]; //가변 배열
		number4[0] = new int[3];
		number4[1] = new int[4];
		number4[2] = new int[10]; //길이를 다르게 저장할 수 있다.
		
//		numbers[0] = 10; //1차원에 값을 저장할 수 없다.
		numbers[0] = new int[5]; //1차원에 배열을 저장할 수 있다.
		numbers[0][0] = 0; //2차원에 값을 저장할 수 있다.
		numbers[0][1] = 10;
		numbers[0][2] = 20;
		numbers[0][3] = 30;
		numbers[0][4] = 40;
		numbers[1][0] = 0;
		numbers[1][1] = 10;
		numbers[1][2] = 20;
		
		System.out.println(numbers.length); //1차원 배열의 길이
		System.out.println(numbers[0].length); //2차원 배열의 길이
		System.out.println("====================");
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers[i].length; j++){
				System.out.println(numbers[i][j]);
			}
		}
//		System.out.println(Arrays.toString(numbers)); //주소가 출력된다.
		System.out.println("====================");
		
		for(int i = 0; i <numbers.length; i++){
			System.out.println(Arrays.toString(numbers[i]));
		}
		System.out.println("====================");
		for(int [] numberArr : numbers){
			for(int number : numberArr){
				System.out.println(number);
			}
		}
		System.out.println("====================");
		
		int[][] scores = new int[3][5]; //int[학생수][과목수]
		int[] sum = new int[scores.length]; //합계
		double[] avg = new double[scores.length]; //평균
		
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j <scores[i].length; j++){
				scores[i][j] = (int)(Math.random()*100)+ 1;
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		for(int i = 0; i < scores.length; i++){
			for(int j=0; j< scores[i].length; j++){
				sum[i] += scores[i][j];
			}
			avg[i] = (double)sum[i] / scores[i].length;
			System.out.println("합계 : "+ sum[i] + "/ 평균 : " + avg[i]);
		}
		
//		double total0 = 0, total1 =0, total2 = 0;
//		for(int i = 0; i < scores.length; i++){
//			total0 += scores[0][i];
//			total1 += scores[1][i];
//			total2 += scores[2][i];
//		}
//			
//		System.out.println("학생0의 합계 : "+ total0);
//		System.out.println("학생1의 합계 : "+ total1);
//		System.out.println("학생2의 합계 : "+ total2);
//		
//		
//		double a = total0/scores.length;
//		double b = total1/scores.length;
//		double c = total2/scores.length;
//		System.out.println("학생 0의 평균 : "+ a);
//		System.out.println("학생 1의 평균 : "+ b);
//		System.out.println("학생 2의 평균 : "+ c);
		
	
	
	
		}
	}