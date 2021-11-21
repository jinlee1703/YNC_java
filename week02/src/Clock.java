//인터페이스 : 상수와 추상메소드만 가진다.
public interface Clock {
	public static final int ONEDAY = 24;	//상수
	public abstract int getMinute();	//추상메소드
	public abstract int getHour();
	abstract public int setMinute(int i);
	abstract public int setHour(int i);
}
 