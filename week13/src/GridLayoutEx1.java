import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx1 extends JFrame {
	JLabel label1 = new JLabel(" 이름");
	JLabel label2 = new JLabel(" 학번");
	JLabel label3 = new JLabel(" 학과");
	JLabel label4 = new JLabel(" 제목");
	JTextField text1 = new JTextField("");
	JTextField text2 = new JTextField("");
	JTextField text3 = new JTextField("");
	JTextField text4 = new JTextField("");
	
	public GridLayoutEx1() {
		this.setTitle("GridLayout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.formDesign();
		this.eventHandler();
		this.setSize(300,  200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setLayout(new GridLayout(4, 2, 5, 5));
		this.add(label1);
		this.add(text1);
		this.add(label2);
		this.add(text2);
		this.add(label3);
		this.add(text3);
		this.add(label4);
		this.add(text4);
	}
	
	public void eventHandler() {
		
		
	}
	
	public static void main(String[] args) {
		new GridLayoutEx1();
	}
}
