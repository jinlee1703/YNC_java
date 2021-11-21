import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		
		list.add(new PlayerVO("홍길동", "1루수", 1999));
		list.add(new PlayerVO("임꺽정", "2루수", 2001));
		list.add(new PlayerVO("강감찬", "포수", 2010));
		list.add(new PlayerVO("을지문덕", "투수", 2005));
		
		System.out.println(list);
		System.out.println("----------정렬---------");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("년도별 정렬 ---------");
//		Comparator comp = new YearComparator();
//		Collections.sort(list, comp);
		Collections.sort(list, new Comparator<PlayerVO>() {		//익명중첩 클래스 : 객체를 한번만 생성하고 인터페이스를 구현
			@Override
			public int compare(PlayerVO o1, PlayerVO o2) {
				// TODO Auto-generated method stub
				return o1.getRegYear() - o2.getRegYear();
			}
		});
		System.out.println(list);
	}
}
 