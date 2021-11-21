

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		//Ű�� 
		Set<String> key = dic.keySet(); 
		Iterator it = key.iterator();
		while(it.hasNext()) {
			String eng = (String)it.next();
			String kor = dic.get(eng);
			System.out.println(eng + ":" + kor);
		}
		
		//����ڷκ��� ����ܾ �Է¹ް� �ѱ۴ܾ� �˻�, "exit" ����
		Scanner scan = new Scanner(System.in);
		while(true)	{
			System.out.print("ã�� ���� �ܾ��?");
			String eng = scan.next();
			if (eng.equals("exit")) {
				System.out.println("�����մϴ�....");;
				break;
			}
			
			//HashMap���� key�� ������ ���� �˻�
			String kor = dic.get(eng);
			
			if (kor == null) 
				System.out.println(eng+"�� ���� �ܾ��Դϴ�.");
			else
				System.out.println(kor);
			
		}
		scan.close();
	}
}
