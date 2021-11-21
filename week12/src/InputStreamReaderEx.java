import java.io.FileInputStream;
import java.io.InputStreamReader;

//p455
public class InputStreamReaderEx {
	public static void main(String[] args) throws Exception {
		InputStreamReader in = null;
		FileInputStream fin = null; 
		
		fin = new FileInputStream("C:\\Temp\\hangul.txt");
		in = new InputStreamReader(fin, "MS949");
		int c;
		while(true)	{
			c = in.read();
			
			if (c == -1)
				break;
			
			System.out.print((char) c);
		}
		fin.close();
		in.close();
	}
}
