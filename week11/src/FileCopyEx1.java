import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx1 {
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("C:\\Temp\\bbb1.txt");
		OutputStream out = new FileOutputStream("copy1.txt");
		
		byte[] buffer = new byte[5];
		
		while(true)	{
			int count = in.read(buffer);
			
			if (count == -1)
				break;
			
			//out.write(buffer);
			out.write(buffer, 0, count);
		}
		
		in.close();
		out.close();
	}
}
