class Shape {
	public Shape next;
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	//�������̵�
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
	//�޼ҵ� �Ķ������ �������� ���� Shape�� �������� ��� Ŭ������ ��ü�� �Ķ���ͷ� ���� �� �ִ�.
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
