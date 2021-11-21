import java.io.File;

//p473
public class FileEx1 {
	public static void listDirectory(File dir) {	//디렉토리에 포함된 파일과 서브 디렉토리의 이름, 크기, 수정 시간을 출력하는 메소드
		System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----");
		
		File[] subFiles = dir.listFiles();	//디렉토리에 포함된 파일과 디렉토리 이름의 리스트 얻기
		
		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();	//마지막으로 수정된 시간
			System.out.print(f.getName());
			if (f.isFile())
				System.out.print("\t파일");
			else if (f.isDirectory())
				System.out.print("\t디렉터리");
			System.out.print("\t파일크기: " + f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);	//포맷 출력
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		
		String res = "";
		if (f1.isFile())
			res = "파일";
		else if (f1.isDirectory())
			res = "디렉토리";
		System.out.println(f1.getPath() + "은 " + res + "입니다.");
		
		File f2 = new File("c:\\Temp\\java_sample");
		if (!f2.exists())	//f2 디렉터리가 존재하는지 검사
			f2.mkdir();		//존재하지 않으면 디렉토리 생성
		
		listDirectory(new File("c:\\Temp"));			//c:\Temp에 있는 파일 리스트 출력
		f2.renameTo(new File("c:\\Temp\\javasample"));	//java_sample -> javasample로 이름 변경
		
		listDirectory(new File("c:\\Temp"));			//이름 변경 후 리스트 출력
	} 
}
