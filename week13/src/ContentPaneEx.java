import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContentPaneEx extends JFrame {
	private JButton btn_ok = new JButton("OK");
	private JButton btn_cancel = new JButton("Cancel");
	private JButton btn_ignore = new JButton("Ignore");
	
	private JPanel p = new JPanel();
	ContentPaneEx() {
		this.setTitle("ContentPane과 JFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.setLayout(new FlowLayout());
		p.add(btn_ok);
		p.add(btn_cancel);
		p.add(btn_ignore);
		p.setBackground(Color.yellow);
//		this.setLayout(new FlowLayout());
//		this.add(btn_ok);
//		this.add(btn_cancel);
//		this.add(btn_ignore);
//		
//		this.getContentPane().setBackground(Color.ORANGE);
		
	}
	
	public void eventHandler() {
		
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
