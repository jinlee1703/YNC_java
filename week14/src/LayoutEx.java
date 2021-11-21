import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LayoutEx extends JFrame {
	private JButton btn1 = new JButton("OK");
	private JButton btn2 = new JButton("Cancel");
	private JButton btn3 = new JButton("ComplexPanel");
	
	private JPanel p = new JPanel();
	
	private JLabel la1 = new JLabel("Test");
	private JLabel la2 = new JLabel("Test1");
	private JPanel p1 = new JPanel();
	
	private JLabel la3 = new JLabel("Test2");
	private JPanel p2 = new JPanel();
	
	private JButton c_btn1 = new JButton("BTN1");
	private JButton c_btn2 = new JButton("BTN2");
	private JButton c_btn3 = new JButton("BTN3");
	private JPanel p3 = new JPanel();
	
	LayoutEx() {
		this.setTitle("Layout예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.formDesign();
		this.eventHandler();
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
//		this.setLayout(new BorderLayout());
		this.add(p, BorderLayout.NORTH);
//		p.setLayout(new FlowLayout());
		p.add(btn1);
		p.add(btn2);

//		this.add(p1, BorderLayout.CENTER);
		
		this.add(p3, BorderLayout.CENTER);
		p3.setLayout(new GridLayout(2, 2));
		p3.add(c_btn1);
		p3.add(c_btn2);
		p3.add(c_btn3);
		
		this.add(p1, BorderLayout.SOUTH);
		p1.setLayout(new GridLayout(1, 2));
		p1.add(la1);
		//p1.add(la2);
		p1.add(p2);
		p2.setLayout(new GridLayout(2, 1));
		p2.add(la2);
		p2.add(la3);
		
		la2.setOpaque(true);
		la2.setBackground(Color.yellow);
	}
	
	
	public void eventHandler() {
		
	}
	
	public static void main(String[] args) {
		new LayoutEx();
	}
}
