import java.util.Comparator;

public class YearComparator implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO p1, PlayerVO p2) {
		//�������� ����
		//�������� ����
		return p1.getRegYear() - p2.getRegYear();
	}

}
