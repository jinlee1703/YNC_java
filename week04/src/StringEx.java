
public class StringEx {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		
		if (a.equals(c))
			System.out.println("a�� c�� ���� ��ü�̴�");
		else
			System.out.println("a�� c�� �ٸ� ��ü�̴�");
		
		if (a==c)
			System.out.println("�� ��ü�� ���� �ּҰ�");
		System.out.println("==============");
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
			
		if (e.equals(f))
			System.out.println("e/f�� ���� ��ü");
		else
			System.out.println("e/f�� �ٸ� ��ü");
		
		if (e==f)
			System.out.println("�� ��ü�� ���� �ּҰ�");
		else
			System.out.println("e/f�� �ٸ� �ּҰ�");
	}
}
