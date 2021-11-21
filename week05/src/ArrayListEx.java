import java.util.ArrayList;

//List : 데이터의 중복이 허용되고, 순서가 있다.
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Kim");
		list.add("Lee");
		list.add("Kim");
		list.add("Park");
		list.add("Choi");
		
		System.out.println(list);
	}
}
