import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	private JButton btn1 = new JButton("BTN1");
	private JButton btn2 = new JButton("BTN2");
	private JButton btn3 = new JButton("BTN3");
	private JButton btn4 = new JButton("BTN4");
	private JButton btn5 = new JButton("BTN5");
	public BorderLayoutEx() {
		this.setTitle("BorderLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.formDesign();
		this.eventHandler();
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
//		this.setLayout(new BorderLayout());
		
		this.add(btn1, BorderLayout.NORTH);
		this.add(btn2, BorderLayout.SOUTH);
		this.add(btn3, BorderLayout.WEST);
		this.add(btn4, BorderLayout.EAST);
		this.add(btn5, BorderLayout.CENTER);
//		this.add(btn5);
//		this.add(btn1);
	}
	
	public void eventHandler() {
		
		
	}

	

	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
