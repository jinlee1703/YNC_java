import java.util.Calendar;

//�ڱ� ���ϱ��� ���� ���Ұ�, ������ ������������?
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
		
		System.out.println("���� ��¥ : " + gap/(1000*60*60*24));
		
		int youl = cal.get(Calendar.DAY_OF_WEEK);	//1:��, 2:�� ... 7: ��
		switch (youl) {
		case 1:
			System.out.println("�Ͽ���");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("ȭ����");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("�����");
			break;
		case 6:
			System.out.println("�ݿ���");
			break;
		case 7:
			System.out.println("�����");
			break;
		}
	}
}
