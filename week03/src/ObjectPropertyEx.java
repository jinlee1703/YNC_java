class Point10 {
	int x, y;
	public Point10(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class ObjectPropertyEx {
	//메소드 파라미터의 다형성에 의해 모든 객체를 받아들일 수 있다.
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Point10 p = new Point10(2, 3);
		//print(p);
		ObjectPropertyEx.print(p);
		
		ObjectPropertyEx pp = new ObjectPropertyEx();
		pp.print(p);
	}
}
