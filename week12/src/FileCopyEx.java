import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\영남이공대 사이버강의(2)\\자바프로그래밍(2)\\12주차\\italy.jpg");
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
		fis.close();
		fos.close();
	}
}
