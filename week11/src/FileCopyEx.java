import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//한글 bbb.txt파일을 읽어 copy.txt로 복사
public class FileCopyEx {
	public static void main(String[] args) throws IOException {
		//1. 적절한 스트림을 선정한다.
//		InputStream in = null;
//		OutputStream out = null;
//		in = new FileInputStream("C:\\Temp\\bbb.txt");
//		out = new FileOutputStream("copy.txt");
		//문자 데이터를 처리하기 위해서 Reader/Wrtier 스트림을 사용
		
		FileReader in = new FileReader("C:\\Temp\\bbb.txt");
		FileWriter out = new FileWriter("copy.txt");
		
		//2. 읽고 쓰기를 한다.
		while(true) {
			int data = in.read();
			
			if (data == -1)
				break;
			
			out.write(data);
			System.out.print((char)data);	
		}//end while
		
		//3. 닫아준다.
		in.close();
		out.close();
	}
}
