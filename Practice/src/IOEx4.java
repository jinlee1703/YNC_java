import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Person implements Serializable {		//Serializable : 직렬화가 가능한 클래스로 구현
	private String name;
	private int age;
	private transient String tel;		//transient : 직렬화 작업에서 제외
	
	Person(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	
	public String toString() {
		return name + ":" + age + ":" + tel;
	}
}

public class IOEx4 {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("person.txt");
		BufferedOutputStream bos = new BufferedOutputStream(out);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		//객체 직렬화
		oos.writeObject(new Person("김김김", 10, "1111-1111"));
		oos.writeObject(new Person("이이이", 20, "2222-2222"));
		oos.writeObject(new Person("박박박", 30, "3333-3333"));
		oos.writeObject(new Person("최최최", 40, "4444-4444"));
		
		oos.close();
		bos.close();
		out.close();
		
		InputStream in = new FileInputStream("person.txt");
		BufferedInputStream bis = new BufferedInputStream(in);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		while(true) {
			try {
				//객체 역직렬화
				Person p = (Person)ois.readObject();
				System.out.println(p);
			} catch(EOFException e) {
				break;
			}
		}
		
		ois.close();
		bis.close();
		in.close();
	}
}
