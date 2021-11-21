import java.util.Comparator;

public class YearComparator implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO o1, PlayerVO o2) {
		// TODO Auto-generated method stub
		//return  o1.getRegYear() - o2.getRegYear();
		return  o2.getRegYear() - o1.getRegYear();
	}

}
