import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOEx3 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("IOEx3.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		FileInputStream fis = new FileInputStream("IOEx3.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		dos.writeInt(123);
		dos.writeDouble(12.34);
		dos.writeBytes("ABCDEF!!");
		
		dos.close();
		fos.close();
		
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		
		byte[] b = new byte[10];
		dis.read(b);
		System.out.println(new String(b));
		
		dis.close();
		fis.close();
	}
}
