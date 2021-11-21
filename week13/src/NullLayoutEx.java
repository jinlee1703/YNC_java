import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutEx extends JFrame {
	private JButton btn = new JButton("OK");
	NullLayoutEx() {
		this.setTitle("배치관리자 없는 컨테이너");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.formDesign();
		this.eventHandler();
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setLayout(null);
		
//		btn.setBounds(100, 100, 100, 50);
		btn.setLocation(100, 100);
		btn.setSize(100, 50);
		this.add(btn);
		
		btn.setOpaque(true);
		btn.setBackground(Color.yellow);
		btn.setForeground(Color.red);
	}

	public void eventHandler() {}

	public static void main(String[] args) {
		new NullLayoutEx();
	}
}
