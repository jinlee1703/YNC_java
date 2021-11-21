import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GenericEx4 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("Apple", "사과");				//"Apple"키와 "사과" 값의 쌍을 map에 삽입(요소 삽입)
		String str = map.get("Apple");		//"Apple"키로 값 검색, str = 검색된 값("사과") (요소 추가)
		map.remove("Apple");				//"Apple"키로 값 삭제 (요소 제거)
		
		Set<String> keys = map.keySet();		//해시맵 map에 있는 모든 키를 Set 컬렉션으로 리턴
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();			//키
			String value = map.get(key);	//값
			System.out.println(key + ":" + value);
		}
	}
}
