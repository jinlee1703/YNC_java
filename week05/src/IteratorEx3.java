import java.util.Iterator;
import java.util.TreeSet;
//���� ����� ���� �ڷᱸ��
public class IteratorEx3 {
	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("aaaa");
		tset.add("kkkk");
		tset.add("zzzz");
		tset.add("cccc");
		
		//Iterator �������̽��� �����ϸ� �ڷᱸ���� �����ϰ� �ϰ��� �������
		//�����͸� ���� �� �ְ� �Ѵ�.
		Iterator it = tset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
