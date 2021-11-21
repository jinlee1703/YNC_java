import java.io.FileOutputStream;

//p462
public class FileOutputStreamEx {
	public static void main(String[] args) throws Exception {
		byte b[] = {7,51,3,4,-1,24};
		
		FileOutputStream fout = new FileOutputStream("C:\\Temp\\test.out");
		for (int i = 0; i < b.length; i++)
			fout.write(b[i]);	//배열 b의 바이너리를 그대로 기록
		fout.close();
		System.out.println("C:\\Temp\\test.out을 저장하였습니다.");
	}
}
