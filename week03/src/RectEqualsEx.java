class Rect1 {
	int width;
	int height;
	public Rect1(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public String toString() {
		return width + ":" + height;
	}
	//equals() 메소드 오버라이딩
	public boolean equals(Rect1 r) {
		return this.width == r.width && this.height == r.height;
	}
}
public class RectEqualsEx {
	public static void main(String[] args) {
		Rect1 r1 = new Rect1(2, 3);
		Rect1 r2 = new Rect1(2, 3);
		
		if(r1.equals(r2)) System.out.println("r1 is equal to r2");
		else System.out.println("r1 is not equal to r2");
	}
}
