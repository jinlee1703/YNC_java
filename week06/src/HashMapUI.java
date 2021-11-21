import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapUI {
	public static void main(String[] args) {
		int nMenu = 0;
		boolean bFlag = true;
		String strName;
		int nScore = 0;
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while(bFlag) {
			System.out.println("---------------------");
			System.out.println("1.�����Է�");
			System.out.println("2.��������");
			System.out.println("3.�����˻�");
			System.out.println("4.��ü�˻�");
			System.out.println("5.����(�̸���)");
			System.out.println("6.����(������)");
			System.out.println("0. ����");
			System.out.println("---------------------");
			
			nMenu = Integer.parseInt(scan.nextLine());
			System.out.println("0 ~ 4������ ���ڸ� �Է��ϼ���");
			
			switch (nMenu) {
			case 0:		//����
				System.out.println("����");
				bFlag = false;
				break;
			case 1:		//�Է�
				System.out.print("�̸� �Է� >> ");
				strName = scan.nextLine();
				
				System.out.print("���� �Է� >> ");
				nScore = Integer.parseInt(scan.nextLine());
				//hashMap�� �̸��� ������ �־��ش�.
				map.put(strName, nScore);
				break;
			case 2:		//����
				System.out.println("�̸� : >> ");
				strName = scan.nextLine();
				map.remove(strName);
				break;
			case 3:		//�˻�
				System.out.println("�˻��� �̸� : >>");
				strName = scan.nextLine();
				nScore = map.get(strName);
				System.out.println("�̸� : " + strName + ", ���� : " + nScore);
				break;
			case 4:		//���
				System.out.println("��ü���");
				Set<String> keys = map.keySet();
				Iterator it = keys.iterator();
				while(it.hasNext()) {
					String name = (String)it.next();
					Integer score = map.get(name);
					System.out.println("�̸� : " + name + ", ���� : " + score);
				}
				break;
			case 5:		//�̸������
				System.out.println("�̸��� ���");
				break;
			case 6:		//���������
				System.out.println("������ ���");
				break;
			default:
				System.out.println("0 ~ 4 ������ ���� �Է��ϼ���");
			}
		}//end while
	}
}
