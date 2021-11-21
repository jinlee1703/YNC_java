import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//C:\\Temp\\aaa.txt파일을 현재 위치에 cpoy.txt
//바이트/문자
//여기서는 예외를 처리하지 않고 전가
//Exception - IOException - FileNotFoundException
public class FileCopyEx {
	public static void main(String[] args) throws Exception {
		//1. 적절한 장치를 연결한다. 스트림 선정한다.
		InputStream in = null;
		OutputStream out = null;
		
		in = new FileInputStream("C:\\Temp\\aaa.txt");
		out = new FileOutputStream("copy.txt");
		
		//2. 읽고/쓰기
		while(true) {
			int data = in.read();
			
			if(data == -1)
				break;
			out.write(data);
			System.out.print((char)data);
		}
		
		//3. 닫기
		in.close();
		out.close();
	}
}
