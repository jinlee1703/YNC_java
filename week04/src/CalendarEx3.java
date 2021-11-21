import java.util.Calendar;

public class CalendarEx3 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		long today = cal.getTimeInMillis();	//1970.1.1 ~ ������� �ð� 1000ms
		
		//2019�� 12�� 25�Ϸ� ��¥ ����
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		
		long xmas = cal.getTimeInMillis();
		
		long gap = xmas - today;
		
		System.out.println(1000*60*60*24);	//�Ϸ翡 �ش��ϴ� long�ð�
		System.out.println(gap/(1000*60*60*24));
	}
}
