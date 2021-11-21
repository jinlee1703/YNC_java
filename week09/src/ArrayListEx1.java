import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("person1.txt");
		ObjectInputStream ois = new ObjectInputStream(in);
		
		//객체의 역직렬화
		ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
		System.out.println(list);
		
		ois.close();
		in.close();
	}
}
