
public class CircleEx {
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ���� : " +area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "���ڵ���";
		double area1 = donut.getArea();
		System.out.println(donut.name + "�� ���� : " + area1);
	}
}
