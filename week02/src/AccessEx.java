//Ŭ������ �����ڰ� �ϳ��� ������ �⺻ �����ڴ� JVM�� �ڵ����� �־��ش�.
class Sample {
	//�Ϲ������� �ʵ�� private
	//�޼ҵ�� public
//	public int a;
	private int a;
	private int b;
	//int c;		//default ���� �����ڴ� ���� ��Ű���� ������ ������ ����
	private int c;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
}
public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		
		//aClass.a = 10;
		//aClass.b = 20;
		//aClass.c = 30;
		aClass.setA(10);
		aClass.setB(20);
		aClass.setC(30);
		
		System.out.println(aClass.getA());
		System.out.println(aClass.getB());
		System.out.println(aClass.getC());
	}
}
