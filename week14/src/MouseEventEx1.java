import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseEventEx1 extends JFrame {
	private JLabel la = new JLabel("Java");
	private JPanel p = new JPanel();
	
	MouseEventEx1() {
		this.setTitle("MouseAdapter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.formDesign();
		this.eventHandler();
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.setLayout(null);
		la.setBounds(30, 30, 50, 20);
		p.add(la);
	}
	
	public void eventHandler() {
		p.addMouseListener(new MyMouseEx());
	}
	
	public static void main(String[] args) {
		new MouseEventEx1();
	}
	
	//내부클래스로 구현
	class MyMouseEx extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
}