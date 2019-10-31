package z_exam;

import java.util.Arrays;

public class 과제190923 {

	public static void main(String[] args) {
		//1 ~ 10 사이의 난수(랜덤수)를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] counts = new int[10];
		
		for(int i= 0; i < 500; i++){
			int random = (int)(Math.random()*10)+1;
			
			counts[random - 1]++;
			
		}
		
		for(int i=0; i < counts.length; i++){
			System.out.println(i + 1 + " : " + counts[i]);
		}
		
		
		
//		int[] array = new int[500];
//		int[] count = new int[10];
//		for(int i = 0; i < array.length; i++){
//			array[i] = (int)(Math.random()*9)+1;
//			System.out.print(array[i]);
//			
//		}
//		for(int i= 0; i < array.length; i++){
//			count[array[i]]++;
//		}
//		for(int i= 0; i < array.length; i++){
//			System.out.println(i + "의 개수 : " + count[i]);
//		}
	}
}