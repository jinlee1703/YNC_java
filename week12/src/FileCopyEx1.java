import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\영남이공대 사이버강의(2)\\자바프로그래밍(2)\\12주차\\italy.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		byte[] buffer = new byte[1024];
		
		long start = System.currentTimeMillis();
		while(true) {
			int count = fis.read(buffer);
			
			if (count == -1)
				break;
			
			fos.write(buffer, 0, count);
		}
		long end = System.currentTimeMillis();
		System.out.println("복사 시간 : " + (end - start));
		fis.close();
		fos.close();
	}
}
