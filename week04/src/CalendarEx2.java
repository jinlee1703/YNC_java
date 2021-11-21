import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		
		//���� ��¥ : 2020/9/30
		System.out.println("���� ��¥ : " + year + ":" + month + ":" + day);
		
		//2019�� 12�� 25���� ���� ����?
		//DAY_OF_WEEK : 1:��, 2:��, 3:ȭ.... 7:��
		cal.set(Calendar.YEAR, 2019);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("���� : " + dayOfWeek);
	}
}
