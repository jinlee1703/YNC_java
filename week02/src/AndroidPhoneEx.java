//AndroidPhone이 가질 수 있는 타입의 종류 몇개인가?
//6개의 타입을 가질 수 있다.
//+ Object => 7개의 타입을 가질 수 있다.
public class AndroidPhoneEx {
	public static void main(String[] args) {
		AndroidPhone ap = new AndroidPhone();
		//다형성
		ISmartPhone ip = new AndroidPhone();
		MP3 mp = new AndroidPhone();
		Camera cp = new AndroidPhone();
		Phone pp = new AndroidPhone();
		Internet iip = new AndroidPhone();
	}
}
