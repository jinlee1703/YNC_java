import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapUI2 {
	//map객체를 받아와 Arraylist로 return 해주는 함수
	public static ArrayList ScoreSorted(final HashMap map) {
		ArrayList list = new ArrayList();
		list.addAll(map.keySet());
		
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				String s1 = map.get(o1).toString();
				String s2 = map.get(o2).toString();
				return s2.compareTo(s1);
			}
		});
		return list;
	}
	
	public static void main(String[] args) {
		int nMenu = 0;
		boolean bFlag = true;
		String strName;
		int nScore = 0;
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while(bFlag) {
			System.out.println("---------------------");
			System.out.println("1.성적입력");
			System.out.println("2.성적삭제");
			System.out.println("3.성적검색");
			System.out.println("4.전체검색");
			System.out.println("5.정렬(이름순)");
			System.out.println("6.정렬(성적순)");
			System.out.println("0. 종료");
			System.out.println("---------------------");
			
			nMenu = Integer.parseInt(scan.nextLine());
			System.out.println("0 ~ 4사이의 숫자를 입력하세요");
			
			switch (nMenu) {
			case 0:		//종료
				System.out.println("종료");
				bFlag = false;
				break;
			case 1:		//입력
				System.out.print("이름 입력 >> ");
				strName = scan.nextLine();
				
				System.out.print("성적 입력 >> ");
				nScore = Integer.parseInt(scan.nextLine());
				//hashMap에 이름과 성적을 넣어준다.
				map.put(strName, nScore);
				break;
			case 2:		//삭제
				System.out.println("이름 : >> ");
				strName = scan.nextLine();
				map.remove(strName);
				break;
			case 3:		//검색
				System.out.println("검색할 이름 : >>");
				strName = scan.nextLine();
				nScore = map.get(strName);
				System.out.println("이름 : " + strName + ", 점수 : " + nScore);
				break;
			case 4:		//출력
				System.out.println("전체출력");
				Set<String> keys = map.keySet();
				Iterator it = keys.iterator();
				while(it.hasNext()) {
					String name = (String)it.next();
					Integer score = map.get(name);
					System.out.println("이름 : " + name + ", 성적 : " + score);
				}
				break;
			case 5:		//이름순출력
				System.out.println("이름순 출력");
				TreeMap<String, Integer> tmap = new TreeMap<String, Integer>(map);
				Set<String> keys2 = tmap.keySet();
				Iterator it2 = keys2.iterator();
				while(it2.hasNext()) {
					String name = (String)it2.next();
					Integer score = map.get(name);
					System.out.println("이름 : " + name + ", 성적 : " + score);
				}
				break;
			case 6:		//성적순출력
				System.out.println("성적순 출력");
				ArrayList list = ScoreSorted(map);
				Iterator it3 = list.iterator();
				while(it3.hasNext()) {
					String name = (String)it3.next();
					Integer score = map.get(name);
					System.out.println("이름 : " + name + ", 성적 : " + score);
				}
				break;
			default:
				System.out.println("0 ~ 4 사이의 수를 입력하세요");
			}
		}//end while
	}
}