import java.util.Calendar;

//자기 생일까지 몇일 남았고, 생일이 무슨요일인지?
//3/17
public class CalendarEx4 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		long today = cal.getTimeInMillis();
		
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 2);
		cal.set(Calendar.DATE, 17);
		
		long birthday = cal.getTimeInMillis();
		long gap = birthday - today;
		
		System.out.println("남은 날짜 : " + gap/(1000*60*60*24));
		
		int youl = cal.get(Calendar.DAY_OF_WEEK);	//1:일, 2:월 ... 7: 토
		switch (youl) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
		}
	}
}
