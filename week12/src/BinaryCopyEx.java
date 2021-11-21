import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//p476
public class BinaryCopyEx {
	public static void main(String[] args) throws Exception {
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");	//원본 파일 경로명
		File dest = new File("c:\\Temp\\copyimg.jpg");							//복사 파일 경로명ㄴ
		
		int c;
		
		FileInputStream fi = new FileInputStream(src);			//파일 입력 바이트 스트림 생성
		FileOutputStream fo = new FileOutputStream(dest);		//파일 출력 바이트 스트림 생성
		
		long start = System.currentTimeMillis();
		while((c = fi.read()) != -1) {
			fo.write((byte)c);
		}
		long end = System.currentTimeMillis();
		
		fi.close();
		fo.close();
		System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		System.out.println("복사 시간 : " + (end - start));
	}
}
