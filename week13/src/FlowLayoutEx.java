import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
	private JButton btn1 = new JButton("BTN1");
	private JButton btn2 = new JButton("BTN2");
	private JButton btn3 = new JButton("BTN3");
	private JButton btn4 = new JButton("BTN4");
	private JButton btn5 = new JButton("BTN5");
	FlowLayoutEx() {
		this.setTitle("FLowLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.formDesign();
		this.eventHandler();
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
	}
	
	public void eventHandler() {
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
