import java.util.Vector;

public class GenericEx1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(7);		//Integer만 다루고, 초기 용량이 7인 벡터 생성
		v.add(Integer.valueOf(5));						//5 -> new Integer(5)로 자동 박싱(Wrapper 클래스)
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		for (int i = 0; i < v.size(); i++) {			//벡터의 크기만큼 반복
			Integer obj = v.get(i);						//벡터의 i번째 Integer 객체를 얻어냄
			int val = obj.intValue();					//obj에 있는 정수를 알아냄
			System.out.println(val);
		}
		
		System.out.println("벡터의 용량 : " + v.capacity());	//벡터의 수용할 수 있는 크기(7)
		
		v.remove(1);									//인덱스 1의 위치에 있는 요소 삭제
		v.removeAllElements();							//모든 요소 삭제
	}
}
