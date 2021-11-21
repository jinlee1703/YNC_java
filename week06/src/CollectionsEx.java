import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class CollectionsEx {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0, "�͹̳�����");
		myList.add(2, "�ƹ�Ÿ");
		
		System.out.println(myList);
		//�����͸� �ϰ��� ������� ������ - Iterator �������̽�
		Iterator it = myList.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("�������� �����ϱ�---------- ");
		Collections.sort(myList);
		System.out.println(myList);
		System.out.println("�������� �����ϱ�---------- ");
		Collections.reverse(myList);
		System.out.println(myList);
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ");
		System.out.println("�ƹ�Ÿ�� " + (index + 1) + "��° �Դϴ�");
	}
}
