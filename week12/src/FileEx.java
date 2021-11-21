import java.io.File;

//p472
public class FileEx {
	public static void main(String[] args) {
		File f = new File("FileEx.java");
		
		System.out.println("파일 이름 : " + f.getName());
		System.out.println("파일 경로 : " + f.getAbsolutePath());
		System.out.println("수정 날짜 : " + f.lastModified());
		System.out.println("부모 : " + f.getParent());
		
		File f1 = new File("C:\\Temp");
		
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		File[] subfiles = f1.listFiles();
		for (int i = 0; i < subfiles.length; i++) {
			System.out.print(subfiles[i].getName());
			System.out.println("\t파일 크기 : " + subfiles[i].length());
		}
	}
}
