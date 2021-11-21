//강제로 오버라이딩
//추상클래스 : 단독으로 객체를 생성하지 못한다.
//타입으로 사용한다. - 다형성
public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++)
			sum = sum + a[i];
		return sum / a.length;
	}
	
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.substract(2, 3));
		System.out.println(c.average(new int[] {2, 3, 4}));
	}
}
