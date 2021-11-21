
public class CircleEx {
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적 : " +area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "피자도넛";
		double area1 = donut.getArea();
		System.out.println(donut.name + "의 면적 : " + area1);
	}
}
