//main : ctrl + sp + enter
//�⺻�� ���� : ���� ���� ����.
//������ ���� : ���� ���� �ִ� ���� ����Ű�� �ּҰ��� ����.
//          (�迭, Ŭ����, �������̽�)

public class VarEx {
	public static void main(String[] args) {
		int a = 10;					//�⺻�� ����
		
		int[] arr = {1, 2, 3};		//������ ����
		
		System.out.println("a : " + a);
		System.out.println("arr : " + arr);
		System.out.println("arr[0] : " + arr[0]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+ i +"] : " + arr[i]);
		}
	}
}
