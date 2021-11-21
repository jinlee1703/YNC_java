import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("person.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Person pp1 = (Person) ois.readObject();
		Person pp2 = (Person) ois.readObject();
		Person pp3 = (Person) ois.readObject();
		
		System.out.println("pp1 : " + pp1);
		System.out.println("pp2 : " + pp2);
		System.out.println("pp3 : " + pp3);
		
		ois.close();
		bis.close();
		fis.close();
	}
}
