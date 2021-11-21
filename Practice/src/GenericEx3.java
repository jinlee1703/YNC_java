import java.util.Iterator;
import java.util.Vector;

public class GenericEx3 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		//Iterator 사용
		Iterator<Integer> it = v.iterator();	//벡터 v의 요소를 순차 검색할 Iterator 객체 리턴
		while(it.hasNext()) {					//it로 벡터의 끝까지 반복
			int n = it.next();					//it가 가리키는 요소 리턴
			System.out.println(n);
		}
	}
}
