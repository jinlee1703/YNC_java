import java.util.Iterator;
import java.util.TreeSet;
//정렬 기능을 갖는 자료구조
public class IteratorEx3 {
	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("aaaa");
		tset.add("kkkk");
		tset.add("zzzz");
		tset.add("cccc");
		
		//Iterator 인터페이스만 구현하면 자료구조에 무관하게 일관된 방법으로
		//데이터를 읽을 수 있게 한다.
		Iterator it = tset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
