import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		v.remove(0);
		
		System.out.println("���ͳ��� ��� ��ü �� : " + v.size());
		System.out.println("���� ������ �뷮 : " + v.capacity());		//10
		
		//���
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum = sum + n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
	}
}
