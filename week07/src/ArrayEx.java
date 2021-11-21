
public class ArrayEx {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 0;
		
		try {
			for (int i = 0; i < arr.length; i++) {
				arr[i+1] = i + 1 + arr[i];
				System.out.println("arr[" + i + "] = " + arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어 났습니다.");
		}
	}
}
