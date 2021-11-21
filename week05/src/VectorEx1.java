import java.util.HashSet;
import java.util.Vector;

class Point extends Object {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
//	//equals()
//	public boolean equals(Object obj) {
//		Point p = (Point) obj;
//		return this.x == p.x && this.y == p.y;
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
public class VectorEx1 {
	public static void main(String[] args) {
		//Set계열 : 중복 X, 순서 O
		HashSet<Point> set = new HashSet<Point>();
		set.add(new Point(2, 3));
		set.add(new Point(10, 20));
		set.add(new Point(2, 3));
		set.add(new Point(-1, 3));
		
		for (int i = 0; i < set.size(); i++) {
			Object[] obj = set.toArray();
			System.out.println(obj[i]);
		}
		
		Point p = new Point(2, 3);
		Point p1 = new Point(2, 3);
		System.out.println(p.equals(p1));
		
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		
		//		Vector<Point> v = new Vector<Point>();
//		
//		v.add(new Point(2, 3));
//		v.add(new Point(-5, 20));
//		v.add(new Point(30, -8));
//		
//		v.remove(1);
//		
//		for (int i = 0; i < v.size(); i++) {
//			Point p = v.get(i);
//			System.out.println(p);
//		}
	}
}
