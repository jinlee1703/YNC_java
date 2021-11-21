import java.io.FileWriter;
import java.util.Scanner;

//p458
public class FileWriterEx {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:\\Temp\\test.txt");
		int c;	//안씀
		
		while(true) {
			String line = scan.nextLine();
			if (line.length() == 0)
				break;
			fw.write(line, 0, line.length());
			fw.write("\r\n", 0, 2);		//한줄 줄 띄워 쓰기 위해 \r\n을 파일에 저장
		}
		scan.close();
		fw.close();
	}
}
