import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayoutEx1 extends JFrame {
	NullLayoutEx1() {
		this.setTitle("Null Layout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.formDesign();
		this.eventHandler();
		this.setSize(300, 200);
		setVisible(true);
	}
	
	public void formDesign() {
		this.setLayout(null);
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		this.add(la);
		
		for (int i = 1; i < 9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50,  20);
			this.add(b);
		}
	}
	
	public void eventHandler() {
		 
	}
	
	public static void main(String[] args) {
		new NullLayoutEx1();
	}
}
