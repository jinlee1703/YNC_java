
public class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("�츮�ӵ���");

	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.sendCall();
		phone.printLogo();
		phone.receiveCall();
		phone.flash();
	}
}
