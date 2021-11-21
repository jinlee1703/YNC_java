import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//실무에서 IO프로그램은 예외처리를 무조건 해주어야 한다. 
public class FileCopy_OrgEx {
	public static void main(String[] args) {
		//InputStream in = null;
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\Temp\\aaa.txt");
			out = new FileOutputStream("copy.txt");
			
			while(true) {
				int data = in.read();
				
				if (data == -1)
					break;
				
				out.write(data);
				System.out.print((char)data);
			}
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch(IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
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
