package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static <E> void main(String[] args) {
		
		/*
		 * add()	: 마지막 위치에 객체를 추가
		 * get()	: 지정된 위치의 객체를 반환
		 * set()	: 지정된 위치에 주어진 객체를 저장(수정)
		 * remove() : 지정된 위치의 객체를 제거
		 * size()	: 지정된 객체의 수 반환
		*/
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456"); // 1번 인덱스의 값("123")의 값을 "456"으로 수정	
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
		}
		
		System.out.println("===================================");
		
		list2.remove(0);  // 0번 인덱스의 값 삭제
		//리스트에 지정된 값을 삭제하면 그 뒤의 인덱스의 값이 한칸씩 앞으로 이동
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));

		System.out.println("===================================");
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>();	//2차원 배열
		
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		
		list4.add(10);
		
		list3.add(list4);
		
		list4 = new ArrayList<Integer>();
		list4.add(20);
		
		list3.add(list4);			//int[][] list3 = {{10},{20}};
		
		System.out.println(list3);
		
		
		System.out.println("===================================");
		
		
		//정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
		/*ArrayList<Integer> list5 = new ArrayList<Integer>();
		
		for(int i = 1; i <= 5; i++){
			list5.add(i);
			
		}System.out.println(list5);*/
		
		
		//위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력해주세요.
		/*ArrayList<Integer> list5 = new ArrayList<Integer>();
		
		int sum = 0;
		double avg = 0;
		for(int i = 0; i <= 4; i++){
			list5.add(i); 		  //add(값)	
			sum += list5.get(i);  //get(index)
			
		} avg = (double) sum / list5.size();
		System.out.println("합 :" + sum + "평균" + avg);*/
		
		
		//위에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 출력해주세요.
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		list5.add(10);
		list5.add(20);
		list5.add(30);
		list5.add(40);
		list5.add(50);
		int max = list5.get(0);
		int min = list5.get(0);
		for(int i = 0; i <= 4; i++){
			for(int j = 0; j < i; j++){
				if(list5.get(i) > list5.get(j)){
					max = list5.get(i);
				}
				if(list5.get(i) < list5.get(j)){
					min = list5.get(i);
				}
			}	
		}System.out.println("최대값 : " + max + " 최소값 : " + min); 
		
		
		
		
	
		
		
		
	}
}
