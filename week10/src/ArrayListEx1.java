import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("Kim", 20));
		list.add(new Person("Lee", 21));
		list.add(new Person("Kim", 20));
		list.add(new Person("Park", 20));
		
		System.out.println(list);
	}
}
