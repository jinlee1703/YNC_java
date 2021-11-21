//인터페이스는 다중구현이 가능하다.
//인터페이스 다중구현을 통해서 다중상속의 효과를 낼 수 있다.
public class MouseDriver1 implements USBMouseInterface, RollMouseInterface {

	@Override
	public void roll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClick() {
		// TODO Auto-generated method stub

	}

}
