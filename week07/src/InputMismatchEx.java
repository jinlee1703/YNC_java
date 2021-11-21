import java.util.InputMismatchException;
import java.util.Scanner;
//InputMismatchException : ����ڰ� ������ �ƴ� ���ڿ��� �ԷµǾ����� ó���ϴ� ����
public class InputMismatchEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("3���� ������ �Է��ϼ���");
		
		int sum = 0, n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">> ");
			
			try {
				n = scan.nextInt();	//3
			} catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. ������ �Է��ϼ���.");
				scan.next(); //���� �Է½�Ʈ���� �����ִ� ��ū(���ϰ�)�� �����
				i--; //�ε����� �������� �ʵ��� �̸� ����
				continue;
			}
			sum = sum + n;
		}
		
		System.out.println("���� : " + sum);
		scan.close();
	}
}
