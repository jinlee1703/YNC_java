import java.util.HashSet;

//Set : �������� �ߺ��� ��� �ȵǰ�, ������ ����.
//Geneic : Ư�� Ÿ���� �����͸� ����
public class HashSetEx {
	public static void main(String[] args) {
//		HashSet set = new HashSet();
//		
//		set.add("Kim");
//		set.add("Lee");
//		set.add("Kim");
//		set.add("park");
//		set.add("Choi");
//		
//		set.add(Integer.valueOf(10));
//		set.add(123);
//		set.add(12.5);
//		set.add(10);
//		
//		System.out.println(set);
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(Integer.valueOf(10));
		set.add(123);
		set.add(222);
		
//		set.add("Kim");
		
		System.out.println(set);
	}
}
