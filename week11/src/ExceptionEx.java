//Exception : 프로그램 실행중에 예기치 않은 상황이 발생할 때 프로그램이 정상종료되도록 한다.
public class ExceptionEx {
	public static void main(String[] args) {
		int[] arr = new int[3];
		
		try {		//예외가 발생할 가능성이 있는 곳에 try {}
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 100;
			//catch() {} : 예외가 발생하면 처리ㅐ주는 블락
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 오류");
		}
		
		System.out.println("정상종료");
	}
}
