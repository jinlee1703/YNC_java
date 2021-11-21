import java.util.TreeSet;
//TreeSet : 정렬기능을 가진 클래스
public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<PlayerVO> tset = new TreeSet<PlayerVO>();
		
		tset.add(new PlayerVO("홍길동", "1루수", 1999));
		tset.add(new PlayerVO("임꺽정", "2루수", 2001));
		tset.add(new PlayerVO("강감찬", "포수", 2010));
		tset.add(new PlayerVO("을지문덕", "투수", 2005));
		
		System.out.println(tset);
	}
}
