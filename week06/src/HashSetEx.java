import java.util.HashSet;
import java.util.TreeSet;
//정렬기능을 가질려면 Comparable인터페이스를 구현해야한다.
class Player implements Comparable<Player> {
	private String name;
	private String nation;
	public Player(String name, String nation) {
		this.name = name;
		this.nation = nation;
	}
	
	public String toString() {
		return name+":"+nation;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Player) {
			Player p = (Player)obj;
			return this.name.equals(p.name) && this.nation.equals(p.nation);
		}
		return false;
	}
	//hashCode()
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
//Set: 중복이 허용안되고, 순서가 없다.
//HashXXX : equlas(), hashCode() 메소드를 오버라이딩해주어야 정상적으로 동작한다.
public class HashSetEx {
	public static void main(String[] args) {
		HashSet<Player> set = new HashSet<Player>();
		Player p1 = new Player("Kim", "Korean");
		Player p2 = new Player("Kim", "Korean");
		Player p3 = new Player("Lee", "Korean");
		Player p4 = new Player("Ahn", "Korean");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println(set);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		//정렬		
		System.out.println("정렬 --------------");
		TreeSet<Player> tset = new TreeSet<Player>();
		tset.add(p1);
		tset.add(p2);
		tset.add(p3);
		tset.add(p4);
		System.out.println(tset);
	}
}
