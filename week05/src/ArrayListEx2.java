import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(-1);
		list.add(2, 100);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		it = list.iterator();
		
		//Iterator�� �̿��Ͽ� ��� ���� ���ϱ�
		int sum = 0;
		while(it.hasNext()) {
			int n = it.next();
			sum = sum + n;
		}
		System.out.println("ArrayList�� �ִ� ������ �� : " + sum);
	}
}
