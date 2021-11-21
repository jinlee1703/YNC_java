import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(-1);
		list.add(2, 100);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		it = list.iterator();
		
		//Iterator를 이용하여 모드 정수 더하기
		int sum = 0;
		while(it.hasNext()) {
			int n = it.next();
			sum = sum + n;
		}
		System.out.println("ArrayList에 있는 점수의 합 : " + sum);
	}
}
