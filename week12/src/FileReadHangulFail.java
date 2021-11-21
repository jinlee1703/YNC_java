import java.io.FileInputStream;
import java.io.InputStreamReader;

//p456
public class FileReadHangulFail {
	public static void main(String[] args) throws Exception {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		fin = new FileInputStream("C:\\Temp\\hangul.txt");
		in = new InputStreamReader(fin, "US-ASCII");	//문자 집합 지정이 잘못된 예를 보이기 위해 일부러 틀린 문자 집합 지정
		
		int c;
		
		System.out.println("인코딩 문자 집합은 " + in.getEncoding());
		while ((c = in.read()) != -1) {
			System.out.print((char) c);
		}
		
		in.close();
		fin.close();
	}
}
