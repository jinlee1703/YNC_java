import java.util.Collections;
import java.util.LinkedList;

public class GenericEx5 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("트랜스포머");
		list.add("스타워즈");
		list.add("매트릭스");
		list.add(0, "터미네이터");
		list.add(2, "아바타");
		
		Collections.sort(list);			//컬렉션에 포함된 요소들의 정렬
		System.out.println(list);
		
		Collections.reverse(list);		//요소를 반대순으로 정렬
		System.out.println(list);
	}
}
