//이 프로그램의 실행 결과는 무엇인가?
//기본형 변수? a
//참조형 변수? arr1, arr2
public class Test {
	public static void main(String[] args) {
		int a = 10;
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		
		arr2[2] = 100;
		
		System.out.println("a : " + a);
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr1[2] : " + arr1[2]);
	}
}
