import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx1 extends JFrame {
	private JButton btn1 = new JButton("Calculate");
	private JButton btn2 = new JButton("add");
	private JButton btn3 = new JButton("sub");
	private JButton btn4 = new JButton("mul");
	private JButton btn5 = new JButton("div");
	
	public BorderLayoutEx1() {
		this.setTitle("BorderLayout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		setSize(300, 200);
		setVisible(true);
	}
	
	//JFrame의 Default 레이아웃 : BorderLayout
	//JPanel의 Default 레이아웃 : FlowLayout
	public void formDesign() {
		this.setLayout(new BorderLayout(30, 20));
		
		this.add(btn1, BorderLayout.CENTER);
		this.add(btn2, BorderLayout.NORTH);
		this.add(btn3, BorderLayout.SOUTH);
		this.add(btn4, BorderLayout.EAST);
		this.add(btn5, BorderLayout.WEST);
	}
	
	public void eventHandler() {
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx1();
	}
}
