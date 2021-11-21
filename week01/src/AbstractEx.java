//추상클래스
//객체 생성이 불가능
abstract class AA {
	private int x;
	public abstract void doA();	//추상메소드
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
		//형변환
		BB bbp = (BB)aap;
		bbp.doB();
	}
}
