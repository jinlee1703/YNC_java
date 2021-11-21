import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapUI {
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
	
	public static void main(String[] args) throws Exception {
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
			System.out.println("7.저장하기");
			System.out.println("8.불러오기");
			System.out.println("0.종료");
			System.out.println("---------------------");
			
			System.out.print("0 ~ 8사이의 숫자를 입력하세요 : ");
			nMenu = Integer.parseInt(scan.nextLine());
			
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
			case 7:		//저장하기
				OutputStream out = new FileOutputStream("student.txt");			//입력 스트림 선정
				BufferedOutputStream bos = new BufferedOutputStream(out);
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				
				Set<String> keys3 = map.keySet();								//학생 정보가 저장되어 있는 맵에 있는 키를 받아옴
				Iterator it4 = keys3.iterator();
				while(it4.hasNext()) {											//이터레이터를 통해 모든 맵에 있는 모든 데이터를 저장하기 위한 반복
					String name = (String)it4.next();							
					int score = map.get(name);
					Student stu = new Student(name, score);						//Student 객체 생성(파일에 저장하기 위한)
					oos.writeObject(stu);										//파일에 객체 쓰기
				}
				oos.close();													//연결 해제
				bos.close();
				out.close();
				System.out.println("저장이 완료되었습니다.");
				break;
			case 8:		//불러오기
				InputStream in = new FileInputStream("student.txt");			//출력 스트림 선정
				BufferedInputStream bis = new BufferedInputStream(in);
				ObjectInputStream ois = new ObjectInputStream(bis);
				
				while(true) {													//무한반복
					try {
						Student stu = (Student)ois.readObject();				//Student객체 변수 stu에 스트림으로 읽어온 Object객체를 Student객체로 형변환하여 저장
						map.put(stu.getName(), stu.getScore());					//map에 읽어온 객체를 저장
					} catch (EOFException e) {									//readObject메서드는 더이상 읽을 객체가 없을 경우 EOFException을 발생하기 때문에 반복문 종료
						break;
					}
				}
				ois.close();													//연결 해제
				bis.close();
				in.close();
				System.out.println("불러오기가 완료되었습니다.");
			default:
				System.out.println("0 ~ 4 사이의 수를 입력하세요");
			}
		}//end while
	}
}