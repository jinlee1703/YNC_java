import java.util.Comparator;

public class YearComparator implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO p1, PlayerVO p2) {
		//오름차순 정렬
		//내림차순 정렬
		return p1.getRegYear() - p2.getRegYear();
	}

}
