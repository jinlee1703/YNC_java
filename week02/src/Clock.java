//�������̽� : ����� �߻�޼ҵ常 ������.
public interface Clock {
	public static final int ONEDAY = 24;	//���
	public abstract int getMinute();	//�߻�޼ҵ�
	public abstract int getHour();
	abstract public int setMinute(int i);
	abstract public int setHour(int i);
}
 