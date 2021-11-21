import java.util.ArrayList;
import java.util.Iterator;
//List : 중복이 허용, 순서가 있다.
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kim");
		list.add("Lee");
		list.add("Kim");
		list.add("Park");
		
		System.out.println(list);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
