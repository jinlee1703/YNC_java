class Shape {
	public Shape next;
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	//오버라이딩
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
public class MethodOverringEx {
	//메소드 파라미터의 다형성에 의해 Shape를 물려받은 모든 클래스의 객체는 파라미터로 들어올 수 있다.
	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		//paint(line);
		MethodOverringEx.paint(line);
		MethodOverringEx mm = new MethodOverringEx();
		mm.paint(line);
		paint(new Rect());
		mm.paint(new Circle());
	}
}
