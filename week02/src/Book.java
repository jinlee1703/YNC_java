
public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author = "���ڹ̻�";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public String toString() {
		return title + ":" + author;
	}
	
	public static void main(String[] args) {
		Book littlePrice = new Book("�����", "�������丮");
		Book loveStory = new Book("������");
		
		//System.out.println(littlePrice.title + littlePrice.author);
		//System.out.println(loveStory.title + loveStory.author);
		
		System.out.println(littlePrice);
		System.out.println(loveStory);
	}
}
