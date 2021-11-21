import java.io.FileInputStream;
import java.io.FileOutputStream;

//byte : InputStream - FileInputStream, OutputStream - FileOutputStream
public class FileCopyEx {
	public static void main(String[] args) throws Exception {
		//적절한 스트림 선정
		FileInputStream fis = new FileInputStream("C:\\Temp\\tokyo.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		long start = System.currentTimeMillis();
		while(true) {
			int data = fis.read();
			
			if (data == -1)
				break;
			
			fos.write(data);
		}
		long end = System.currentTimeMillis();
		System.out.println("복사 시간 : " + (end - start));
	}
}
