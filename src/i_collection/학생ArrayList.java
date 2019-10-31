package i_collection;

import java.util.ArrayList;

public class 학생ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> subject = new ArrayList<String>();
		
		String[] subjects = {"Java", "Oracle", "HTML", "JQuery", "JSP"};
		for(int i = 0; i < subjects.length; i++){
			subject.add(subjects[i]);
		}System.out.println(subject);
		
		
		ArrayList<String> student = new ArrayList<String>();
		
		String[] studentss = {
				"오동규", "박재욱", "오제민", "전보영", "유지상",
				"박신규", "진주호", "지원희", "한승희", "안정현",
				"이이슬", "이정은", "이선욱", "조건희", "최효은",
				"김혜정", "김명성", "신유진", "조윤호", "조아라",
				"백운영", "최도혁", "김영호", "박희제", "현솔비"};
		for(int i = 0; i < studentss.length; i++){
			student.add(studentss[i]);
		}System.out.println(student);
		
		
		ArrayList<ArrayList<Integer>> students = new ArrayList<ArrayList<Integer>>();
		//점수 생성
		int sc = 0;
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < student.size(); i++){
			ArrayList<Integer> score = new ArrayList<Integer>();
			for(int j =0; j  < subject.size(); j++){
				sc = (int)(Math.random()*100+1);	
				score.add(sc);
				sum += sc;
				avg = (int) sum / subject.size();				
			}
			score.add(sum);
			score.add(avg);
			avg = 0;
			sum = 0;
			
			students.add(score);
			
		}	System.out.println(students);
		
		
		for(int i = 0; i < students.size(); i++){
		
		}
		
		
		
		
	}

}
