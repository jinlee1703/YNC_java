//Ŭ������ �߻�޼ҵ带 ������ �߻�Ŭ������ �Ǿ�� �Ѵ�.
abstract class AAA {
	{
		System.out.println("AAA");
	}
	int x = 10;
	public void doA() {
		System.out.println("AAA doA()");
	}
	public abstract void doB();	//�߻�޼ҵ� 
}
public class BBB extends AAA {
	{
		System.out.println("BBB");
	}
	int x = 100;
	int y = 200;
	//�θ� Ŭ������ �߻�޼ҵ�� �۽�Ŭ�������� ������ �������̵�
	@Override
	public void doB() {
		System.out.println("x1 : " + super.x);
		System.out.println("x2 : " + this.x);
		System.out.println("x3 : " + x);
	}
	public void doC() {
		System.out.println("CCC");
	}
	
	public static void main(String[] args) {
		BBB bp = new BBB();
		//AAA ap = new AAA();	//�߻�Ŭ������ �ܵ����� ��ü�� ������ �� ����.
		bp.doB();
		
		AAA aap = new BBB();	//������
		//aap.doC();	//���� �Ұ�
		BBB bbp = (BBB)aap;
		bbp.doC();
		//bp��ü�� ������ �� �ִ� ����� ��?
		//����� Object Ŭ������ 9�� + 4�� + 1��(AAA) = 14��
		//BBB : 4��, AAA : 3��

	}
	
}
