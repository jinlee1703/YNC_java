//NullPointException : ��ü ��ü�� ���µ� ������ ��� �߻�
public class NullEx {
	public static void main(String[] args) {
		String str1 = "AAAAA";
		String str2 = null; //������ ����Ű�� ��ü�� ����.
		
		System.out.println(str1);
		System.out.println(str2);
		
		//��ü�� ���۽�Ų��.
		System.out.println(str1.charAt(0));
		System.out.println(str2.charAt(0));
	}
}
