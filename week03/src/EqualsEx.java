class Point20 {
	int x, y;
	public Point20(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//toString()
	public String toString() {
		return x + ":" + y;
	}
	//eqauls() 오버라이딩
//	public boolean equals(Object obj) {
//		Point20 p = (Point20) obj;
//		if (this.x == p.x && this.y == p.y) return true;
//		else return false;
//	}
	
	public boolean equals(Point20 obj) {
		return this.x == obj.x && this.y == obj.y;
	}
}
public class EqualsEx {
	public static void main(String[] args) {
		Point20 p = new Point20(2, 3);
		Point20 p1 = new Point20(2, 3);
		
		System.out.println(p);
		System.out.println(p1);
		
		System.out.println(p.equals(p1));
		
		Point20 p2 = new Point20(4, 5);
		System.out.println("p, p2비교 : " + p.equals(p2));
	}
}
