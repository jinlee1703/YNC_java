import java.util.HashMap;
//Map : Ű�� ������ ����, Ű�� �ߺ��� ���ȵ�, ���� �ߺ��� ���
public class HashMapEx {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("1", "apple");
		map.put("2", "banana");
		map.put("1", "graph");
		map.put("3", "banana");
		map.put("4", "apple");
		map.put("5", "Mango");
		
		System.out.println(map);
	}
}
