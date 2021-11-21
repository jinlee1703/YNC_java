import java.util.InputMismatchException;
import java.util.Scanner;
//InputMismatchException : 사용자가 정수가 아닌 문자열이 입력되었을때 처리하는 예외
public class InputMismatchEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요");
		
		int sum = 0, n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">> ");
			
			try {
				n = scan.nextInt();	//3
			} catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 정수를 입력하세요.");
				scan.next(); //현재 입력스트림에 남아있는 토큰(리턴값)을 지운다
				i--; //인덱스가 증가하지 않도록 미리 감소
				continue;
			}
			sum = sum + n;
		}
		
		System.out.println("합은 : " + sum);
		scan.close();
	}
}
