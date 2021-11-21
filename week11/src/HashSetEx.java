import java.util.HashSet;
import java.util.TreeSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("KKK");
		set.add("BBB");
		set.add("AAA");
		set.add("KKK");
		set.add("CCC");
		
		System.out.println(set);
		
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("KKK");
		tset.add("BBB");
		tset.add("AAA");
		tset.add("KKK");
		tset.add("CCC");
		
		System.out.println(tset);
	}
}
