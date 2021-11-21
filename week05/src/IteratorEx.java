import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Kim");
		set.add("Lee");
		set.add("Kim");
		set.add("Park");
		
		//�ڷᱸ���� �����ϰ� �ϰ��� ������� �����͸� ������ �ϴ� �������̽� -> Iterator
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		for (int i = 0; i < set.size(); i++) {
//			Object[] str = set.toArray();
//			System.out.println(str[i]);
//		}
		
		
		System.out.println("-------------------");
		Vector<String> v = new Vector<String>();
		
		v.add("Kim");
		v.add("Lee");
		v.add("Kim");
		v.add("Park");
		
		Iterator it1 = v.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
//		for (int i = 0; i < v.size(); i++) {
//			Object obj = v.elementAt(i);
//			System.out.println(obj);
//		}
	}
}
