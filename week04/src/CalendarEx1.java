import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) {
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("���� ��¥ : " + year + "-" + month + "-" + day);
		System.out.println("���� �ð� : " + hour + ":" + minute + ":" + second);
	}
}
