package h_useful;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * equals()			: 문자열을 비교하여 같으면 true 다르면 false를 반환한다.
		 * length()			: 문자열의 길이를 반환한다.
		 * substring()  	: 주어진 범위에 해당하는 문자열을 반환한다.
		 * charAt()			: 지정된 위치의 문자를 반환한다.
		 * lastIndexOf()	: 주어진 문자의 마지막 위치를 반환한다.
		 * replace()		: 문자열 내의 주어진 문자(문자열)를 
		 * 					  새로운 문자(문자열)로 바꾼 문자열을 반환한다.
		 * replaceAll()		: 문자열 내의 주어진 정규표현식과 일치하는 문자열을 
		 * 					  새로운 문자열로 바꾼 문자열로 반환한다.
		 * split()			: 문자열을 주어진 정규표현식과 일치하는 문자열로
		 * 					  나누어 문자열 배열로 반환한다.
		 * startWith()		: 주어진 문자열로 시작하는지 여부를 반환한다.
		 * endWith()		: 주어진 문자열로 끝나는지 여부를 반환한다.
		 * toUpperCase()	: 문자열을 대문자로 반환한 문자열로 반환한다.
		 * toLowerCase()    : 문자열을 소문자로 반환한 문자열로 반환한다.
		 * trim()			: 양끝의 공백을 제거한 문자열로 반환한다.	
		*/
		
		String str = "abc abc  abc";
		
		System.out.println(str.indexOf("a"));		// 앞에서부터 "a"를 찾는다.
		System.out.println(str.indexOf("a",1));		// 1번 인덱스 이후부터 "a"를 찾는다.
		System.out.println(str.indexOf("a", str.indexOf("a") + 1 ));	// 
		System.out.println(str.lastIndexOf("a"));   // 마지막에 있는 "a"를 찾는다.
		
		System.out.println(str.replace("a", "0"));  // 모든 "a"문자열을 "0"으로 바꿔준다.
		System.out.println(str.replaceAll("[a-z]","0"));	// "a" ~ "z"까지 "0"으로 바꿔준다.
		
		System.out.println(Arrays.toString(str.split(" ")));	
		System.out.println(Arrays.toString(str.split(" +")));
		
		System.out.println(str.startsWith("a")); // ( )안의 문자로 시작하는지 확인한다. true false
		System.out.println(str.startsWith("b")); // false
		
		System.out.println(str.endsWith("c"));  // ( )안의 문자로 끝나는지 확인한다. true false
		System.out.println(str.endsWith("a")); // false

		System.out.println(str.toUpperCase()); // 문자열을 전부 대문자로 반환한다.
		System.out.println(str.toLowerCase()); // 문자열을 전부 소문자로 반환한다.
		
		String str2 = " abc abc ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		
	}

}
