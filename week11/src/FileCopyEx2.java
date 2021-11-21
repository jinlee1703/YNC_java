import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx2 {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		byte[] buffer = new byte[5];
		try {
			in = new FileInputStream("C:\\Temp\\bbb1.txt");
			out = new FileOutputStream("copy1.txt");
			
			while(true) {
				int count = in.read(buffer);
				
				if (count == -1)
					break;
				
				out.write(buffer, 0, count);
			}
		} catch(FileNotFoundException e) {
			System.out.println("읽을 파일이 없습니다.");
		} catch(IOException e) {
			System.out.println("IO 오류 발생");
		} finally {	//오류 발생과 무관하게 무조건 실행되는 부분
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
