
public class ExceptionEx {
	public static void main(String[] args) {
		int[] arr = new int[2];
		
		try {
			arr[0] = 1;
			arr[1] = 2;
			//arr[2] = 3;	//예외가 발생
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열오류");
		}
		
		System.out.println("정상종료");
	}
}
