package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataClass {
	
	public static void main(String[] args) {
		Date today = new Date();	//현재 날짜
		System.out.println(today);
		
		
		//날짜 -> 포멧 -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");   //y = 연도 M = 달 d = 일 분
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss"); //H = 시간 m = 분 ss = 초 sss = 밀러세컨드
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd hh:mm:ss a"); // a = 오전오후
		
		String format = sdf1.format(today);
		System.out.println(format);
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		//문자열 -> 포맷 -> 날짜
		String str  = "2019년 10월 16일";
		SimpleDateFormat sdfs = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date datestr = sdfs.parse(str);
			System.out.println(datestr);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		
		//날짜 셋팅
		cal.setTime(new Date());
		cal.set(2019, 9, 16);	// 2019/10/16(월이 0부터 시작)
		System.out.println(sdf3.format(cal.getTime()));
		
		//날짜 계산
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MONTH, 2);
		cal.add(Calendar.DAY_OF_MONTH, -3);
		cal.add(Calendar.HOUR, 2);
		cal.add(Calendar.MINUTE, 5);
		cal.add(Calendar.SECOND, -10);
		System.out.println(sdf3.format(cal.getTime()));
		
		
		
		
		
	}
}
