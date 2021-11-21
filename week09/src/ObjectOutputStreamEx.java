import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamEx {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("person.txt");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		
		Person p1 = new Person("김길동", 20, "1111-1111");
		Person p2 = new Person("이길동", 22, "2222-2222");
		Person p3 = new Person("홍길동", 33, "3333-3333");
		//객체를 저장하려면 - 비트폼으로 바꾸어서 저장해야한다.
		//객체직렬화를 해주어야 한다. - Serializable 인터페이스를 구현
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		
		oos.close();
		out.close();
	}
}
