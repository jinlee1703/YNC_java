//this :체 자기자신을 지칭
//this 메소드 : 생성자에서 또 다른 생성자를 호출
public class Book1 {
	private String title;	//필드
	private String author;
	
	public Book1(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book1() {
		this("", "");
	}
	
	public Book1(String title) {
		this(title, "작자미상");
	}
	
	public String toString() {
		return title + ":" + author;
	}
	
	public static void main(String[] args) {
		Book1 littlePrince = new Book1("어린왕자", "생텍지페리");
		Book1 loveStory = new Book1("춘향전");
		
		System.out.println(littlePrince);
		System.out.println(loveStory);
	}
}
