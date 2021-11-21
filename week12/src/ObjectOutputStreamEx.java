import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//Person클래스로 객체를 3개 생성하여 person.txt파일에 저장
public class ObjectOutputStreamEx {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("person.txt");
		BufferedOutputStream bos = new BufferedOutputStream(out);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		Person p1 = new Person("Kim", 20, "1111-1111");
		Person p2 = new Person("Lee", 22, "2222-2222");
		Person p3 = new Person("Park", 23, "3333-3333");
		
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		
		oos.close();
		bos.close();
		out.close();
	}
}
