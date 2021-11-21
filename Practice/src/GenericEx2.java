import java.util.ArrayList;

public class GenericEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hello");		//ArrayList에 요소 삽입(add)
		list.add("Hi");
		list.add("java");
		list.add(2, "Sahni");
		
		String str = list.get(1);	//1번째 요소 리턴
		int len = list.size();		//리스트의 요소의 개수
		
		list.remove(1);		//ArrayList 1번째 요소 제거
		list.clear();		//ArrayList 모든 요소 삭제
	}
}
