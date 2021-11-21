import java.io.FileInputStream;
import java.io.InputStreamReader;
//바이트 데이터를 문자 데이터 변환 : InputStreamReader
public class InputStreamReaderEx {
	public static void main(String[] args) throws Exception {
		InputStreamReader in = null;
		FileInputStream fis = null;
		
		fis = new FileInputStream("C:\\Temp\\hangul.txt");
		in = new InputStreamReader(fis, "MS949");
		
		System.out.println("인코딩 : " + in.getEncoding());
		while(true) {
			int c = in.read();
			
			if (c == -1)
				break;
			System.out.print((char)c);
		}
		in.close();
		fis.close();
	}
}
