
public class NumberFormatEx {
	public static void main(String[] args) {
		String[] str = {"23", "12", "3.12259", "998"};
		int i = 0;
		
		try {
			for (i = 0; i < str.length; i++) {
				int j = Integer.parseInt(str[i]);
				System.out.println("������ ��ȯ�� �� : " + j);
			}
		} catch(NumberFormatException e) {
			System.out.println(str[i] + "�� ������ ��ȯ�� �� ����");
		}
	}
}
