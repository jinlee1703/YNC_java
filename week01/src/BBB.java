//클래스가 추상메소드를 가지면 추상클래스가 되어야 한다.
abstract class AAA {
	{
		System.out.println("AAA");
	}
	int x = 10;
	public void doA() {
		System.out.println("AAA doA()");
	}
	public abstract void doB();	//추상메소드 
}
public class BBB extends AAA {
	{
		System.out.println("BBB");
	}
	int x = 100;
	int y = 200;
	//부모 클래스의 추상메소드는 작식클래스에서 무조건 오버라이딩
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
		//AAA ap = new AAA();	//추상클래스는 단독으로 객체를 생성할 수 없다.
		bp.doB();
		
		AAA aap = new BBB();	//다형성
		//aap.doC();	//접근 불가
		BBB bbp = (BBB)aap;
		bbp.doC();
		//bp객체가 접근할 수 있는 멤버의 수?
		//참고로 Object 클래스는 9개 + 4개 + 1개(AAA) = 14개
		//BBB : 4개, AAA : 3개

	}
	
}
