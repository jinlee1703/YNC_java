
public class MultiExceptionEx {
	public static void main(String[] args) {
		int num = 30;
		try {
			int num1 = Integer.parseInt(args[0]);
			System.out.println(num1);
			int n = num / 0;
			System.out.println("----------");
		} catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�Է��� ������ ����");
		} catch(ArithmeticException e) {
			System.out.println("0�� �ƴ� ���� ��������");
		} catch(Exception e) {
			System.out.println("�� �ٸ� ����");
		} finally {
			System.out.println("���α׷� ����");
		}
	}
}
