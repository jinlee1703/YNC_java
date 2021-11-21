import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;
		FileWriter fout = null;
		try {
			fin = new FileReader("C:\\windows\\system.ini");	//문자 입력 스트림 생성
			fout = new FileWriter("copy2.txt");
			int c;
			while ((c = fin.read()) != -1) {	//한 문자씩 파일 끝까지 읽기(파일의 끝을 만나면 read()는 -1을 리턴)
				System.out.print((char)c);
				fout.write(c);
			}
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
