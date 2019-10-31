package i_collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * put()	: 지정된 키와 값을 저장(타입 상관없음)
		 * get()	: 지정된 키와 값을 반환(없으면 null)
		 * remove() : 지정된 키로 저장된 값을 제거
		 * keySet()	: 지정된 모든 키를 set으로 반환
		*/
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("title", "제목입니다.");   //키 : title  값 : 제목입니다.
		map.put("content", "내용입니다");
		map.put("user", "조윤호");
		map.put("date", "2019-10-16 09:30");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		System.out.println("================================================");
		
		map.put("user", "호윤조");
		System.out.println(map.get("user")); //1개의 키에 여러개의 값을 저장할 수 없다.
		map.put("user", "이순신");
		System.out.println(map.get("user"));
		
		map.remove("user");  //user의 키와 값을 삭제하는 것
		System.out.println(map.get("user"));
		
		
		System.out.println("================================================");
	
		
		//map에 저장된 모든 내용 출력
		Set<String> keys = map.keySet();
		for(String key : keys){
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
	}

}
