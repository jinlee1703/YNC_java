//this :ü �ڱ��ڽ��� ��Ī
//this �޼ҵ� : �����ڿ��� �� �ٸ� �����ڸ� ȣ��
public class Book1 {
	private String title;	//�ʵ�
	private String author;
	
	public Book1(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book1() {
		this("", "");
	}
	
	public Book1(String title) {
		this(title, "���ڹ̻�");
	}
	
	public String toString() {
		return title + ":" + author;
	}
	
	public static void main(String[] args) {
		Book1 littlePrince = new Book1("�����", "�������丮");
		Book1 loveStory = new Book1("������");
		
		System.out.println(littlePrince);
		System.out.println(loveStory);
	}
}
