import java.util.HashSet;

//Set : 데이터의 중복이 허용 안되고, 순서가 없다.
//Geneic : 특정 타입의 데이터를 저장
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
