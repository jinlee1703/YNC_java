import java.util.Iterator;
import java.util.TreeSet;
//String 클래스는 이미 정렬기능을 갖도록 Comparable 인터페이스가 구현되어 있다.
//하지만 내가 만든 클래스와 생성한 객체가 정렬 기능을 가지려면?
//Comparable 인터페이스를 구현해줘야아 한다.
public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("BBB");
		tree.add("KKK");
		tree.add("AAA");
		tree.add("ZZZ");
		tree.add("PPP");
		
		System.out.println(tree);
		
		Iterator it = tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
