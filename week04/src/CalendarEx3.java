import java.util.Calendar;

public class CalendarEx3 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		long today = cal.getTimeInMillis();	//1970.1.1 ~ 현재까지 시간 1000ms
		
		//2019년 12월 25일로 날짜 세팅
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		
		long xmas = cal.getTimeInMillis();
		
		long gap = xmas - today;
		
		System.out.println(1000*60*60*24);	//하루에 해당하는 long시간
		System.out.println(gap/(1000*60*60*24));
	}
}
