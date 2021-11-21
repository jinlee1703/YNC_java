import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Kim");
		set.add("Lee");
		set.add("Kim");
		set.add("Park");
		
		System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
