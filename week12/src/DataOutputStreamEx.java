import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

//DataInputStream/DataOutputStream : 기본데이터를 처리하는 스트림
public class DataOutputStreamEx {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("data.txt");
		BufferedOutputStream bos = new BufferedOutputStream(out);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeInt(23);
		dos.writeDouble(12.34);
		dos.writeBytes("ABCDEFG!!");
		
		dos.close();
		bos.close();
		out.close();
	}
}
