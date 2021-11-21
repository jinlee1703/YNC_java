
public class InterfaceEx2 {
	public static void main(String[] args) {
		SamsungPhone1 sp = new SamsungPhone1();
		
		//SamsungPhone1이 가질 수 있는 타입은 무엇인가?
		//다형성의 특징을 이용하여
		PDA pp = new SamsungPhone1();
		PhoneInterface pi = new SamsungPhone1();
		MP3Interface mp3 = new SamsungPhone1();
		MobilePhoneInterface mpi = new SamsungPhone1();
		
		Object oob = new SamsungPhone1();
	}
}
