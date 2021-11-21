//정렬기능을 가질려면 Comparable 인터페이스를 구현해야 한다.
public class PlayerVO implements Comparable<PlayerVO> {
	private String name;
	private String position;
	private int regYear;
	
	public PlayerVO(String name, String position, int regYear) {
		this.name = name;
		this.position = position;
		this.regYear = regYear;
	}
	
	public String toString() {
		return name + ":" + position + ":" + regYear;
	}

	public int getRegYear() {
		return regYear;
	}
	
	@Override
	public int compareTo(PlayerVO p) {
		// TODO Auto-generated method stub
		System.out.println("정렬.....");
		return this.name.compareTo(p.name);
	}
}
