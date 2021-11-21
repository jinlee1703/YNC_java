import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("person1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		
		Person p1 = new Person("Kim", 20, "1111-1111");
		Person p2 = new Person("Lee", 21, "2222-2222");
		Person p3 = new Person("Park", 22, "3333-3333");
		Person p4 = new Person("Choi", 20, "4444-4444");
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		//객체의 직렬화
		oos.writeObject(list);
		
		System.out.println(list);
		out.close();
		oos.close();
	}
}
