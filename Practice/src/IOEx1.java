import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOEx1 {
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("C:\\Temp\\IOEx1_input.txt");		//InputStream은 바이트로 읽어오기 때문에 문자(char)를 읽을 때는 적절하지 않음
		OutputStream out = new FileOutputStream("IOEx1_output.txt");
		
		while (true) {
			int data = in.read();
			
			if (data == -1)
				break;
			out.write(data);
			System.out.print((char) data);
		}
		System.out.println();
		in.close();
		out.close();
		System.out.println("---------------------------");
		
		Reader fr = new FileReader("C:\\Temp\\IOEx1_input.txt");				//Reader은 문자(char)로 읽어오기 때문에 한글을 읽어올 수 있음.
		Writer fw = new FileWriter("IOEx1_output.txt");
		
		while(true) {
			int data = fr.read();
			
			if (data == -1)
				break;
			fw.write(data);
			System.out.print((char)data);
		}
		
		fr.close();
		fw.close();
	}
}
