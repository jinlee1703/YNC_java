//�߻�Ŭ����
//��ü ������ �Ұ���
abstract class AA {
	private int x;
	public abstract void doA();	//�߻�޼ҵ�
}
class BB extends AA {

	@Override
	public void doA() {
		// TODO Auto-generated method stub
		System.out.println("BB doA()");
	}
	
	public void doB() {
		System.out.println("BB doB()");
	}
}
public class AbstractEx {
	public static void main(String[] args) {
		//AA ap = new AA();
		BB bp = new BB();
		bp.doA();
		
		AA aap = new BB();
		aap.doA();
		//aap.doB();
		//����ȯ
		BB bbp = (BB)aap;
		bbp.doB();
	}
}
