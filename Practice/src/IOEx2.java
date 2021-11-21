import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOEx2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("C:\\Temp\\tokyo.jpg");
		FileOutputStream fout = new FileOutputStream("IOEx2_output.jpg");
		
		byte[] buffer = new byte[1024];										//버퍼 단위 읽기
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int c = fin.read(buffer);
			
			if (c == -1)
				break;
			
			fout.write(buffer, 0, c);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("파일 복사 시간 : " + (end - start));
		fin.close();
		fout.close();
		
		System.out.println();
		
		InputStreamReader in = null;			
		FileInputStream fis = null;
		
		fis = new FileInputStream("C:\\Temp\\hangul.txt");
		in = new InputStreamReader(fis, "MS949");		//바이트 데이터를 문자 데이터로 변환
		
		System.out.println("인코딩 : " + in.getEncoding());
		while(true) {
			int c = in.read();
			
			if (c == -1)
				break;
			System.out.print((char)c);
		}
		fis.close();
		in.close();
	}
}
