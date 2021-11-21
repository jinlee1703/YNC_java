import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		//1) 적절한 스트림을 선정
		//byte - InputStream - FileInputStream
		FileReader fin = null;
		FileWriter fw = new FileWriter("copy.txt");
		//FileInputStream fin = new FileInputStream("C:\\Temp\\test.txt");
		fin = new FileReader("C:\\Temp\\test.txt");
		//2) 읽기/쓰기
		while(true) {
			int data = fin.read();
			
			if (data == -1)
				break;
			
			System.out.print((char)data);
			fw.write(data);
		}

		//3) 닫기
		fin.close();
		fw.close();
	}
}
