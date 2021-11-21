import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//정렬 기능을 가지는 Comparable 구현
class PlayerVO implements Comparable<PlayerVO> {
	private String name;
	private String position;
	private int regYear;
	
	public PlayerVO(String name, String position, int regYear) {
		this.name = name;
		this.position = position;
		this.regYear = regYear;
	}
	public String toString() { 
		return name+":"+position+":"+regYear;
	}
	@Override
	public int compareTo(PlayerVO p) {
		System.out.println("정렬 시도....");
		return this.name.compareTo(p.name);
	}
	public int getRegYear() {
		return regYear;
	}
}
public class PlayerVOSortEx {
	public static void main(String[] args) {
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		list.add(new PlayerVO("홍길동", "투수", 1999));
		list.add(new PlayerVO("임꺽정", "포수", 2005));
		list.add(new PlayerVO("강감찬", "1루수", 2003));
		list.add(new PlayerVO("을지문덕", "2루수", 2010));
		System.out.println(list);
		System.out.println("정렬-----------------");
		Collections.sort(list);
		System.out.println(list);
		//입단 연도별 정렬
		System.out.println("년도별 정렬");
		Comparator comparator = new YearComparator();
		Collections.sort(list, comparator);
		System.out.println(list);
	}
}
