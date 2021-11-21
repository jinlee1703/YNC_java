import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
//Map : 키와 값으로 구성
//키는 중복이 허용안되고 순서가 없다.
public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Kim");
		map.put(2, "Lee");
		map.put(2, "Park");
		map.put(3, "Kim");
		map.put(5, "Choi");
		
		System.out.println(map);
		
		Set<Integer> keySet = map.keySet();
		Iterator it = keySet.iterator();
		while(it.hasNext()) {
			Integer num = (Integer) it.next();
			System.out.println(num + ":" + map.get(num));
		}
	}
}
