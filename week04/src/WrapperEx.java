
public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2= 'F';
		if (Character.isDigit(c1))
			System.out.println(c1 + "�� ����");
		if (Character.isAlphabetic(c2))
			System.out.println(c2 + "�� ������");
		
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.toHexString(28));	//16���� ���ڿ�
		System.out.println(Integer.toBinaryString(28));
		System.out.println("������ �ִ밪 : " + Integer.MAX_VALUE);	//2^31 -1
		System.out.println("������ �ּҰ� : " + Integer.MIN_VALUE);	//-2^31
		
		Double d = Double.valueOf(03.14);
		System.out.println(d.toString());	//double -> ��ü Double Ÿ������ ��ȯ
		System.out.println(Double.parseDouble("3.14"));	//���ڿ�(��ü -> double
		
		boolean b = 4 > 3;
		System.out.println(Boolean.toString(b));	//true -> ���ڿ�(��ü) "true"�� ��ȯ
		System.out.println(Boolean.parseBoolean("false"));
	}
}
