import java.util.Scanner;

public class DividedByZero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		while(true) {
			try {
				System.out.print("�������� �Է��ϼ���. >> ");
				dividend = scan.nextInt();
				System.out.print("�������� �Է��ϼ���. >> ");
				divisor = scan.nextInt();
				System.out.println(dividend + " �� " + divisor + "������ ���� : "
						+ dividend / divisor + "�Դϴ�.");
				break;
			} catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է��ϼ���");
			}
		}//end while
		scan.close();
	}
}
