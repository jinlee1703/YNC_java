import java.io.FileReader;

public class FileReaderEx {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Temp\\test.txt");
		
		int c;
		while(true) {
			c = fr.read();
			if (c == -1)
				break;
			System.out.print((char) c);
		}
		fr.close();
	}
}
