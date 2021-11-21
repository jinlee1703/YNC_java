import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BlockBinaryCopyEx {
	public static void main(String[] args) throws Exception {
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");		//원본 파일 경로명
		File dest = new File("c:\\Temp\\desert.jpg");								//복사 파일 경로명
		
		FileInputStream fi = new FileInputStream(src);			//파일 입력 바이트 스트림
		FileOutputStream fo = new FileOutputStream(dest);		//파일 출력 바이트 스트림
		
		byte[] buf = new byte[1024*10];		//10KB 버퍼
		
		long start = System.currentTimeMillis();
		while(true) {
			int n = fi.read(buf);		//버퍼 크기만큼 읽기. n은 실제 읽은 바이트
			fo.write(buf, 0, n);		//buf[0]부터 n바이트 쓰기
			if (n < buf.length)
				break;		//버퍼 크기보다 작게 읽었기 대문에 파일 끝에 도달. 복사 종료
		}
		long end = System.currentTimeMillis();
		
		fi.close();
		fo.close();
		System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		System.out.println("복사 시간 : " + (end - start));
	}
}
