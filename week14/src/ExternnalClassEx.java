import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//외부클래스
class MyActionEx implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
//		if (e.getActionCommand() == "Action")
//			b.setText("액션");
//		else
//			b.setText("Action");
	}
}

public class ExternnalClassEx extends JFrame {
	private JButton btn = new JButton("Action");
	
	ExternnalClassEx() {
		this.setTitle("외부클래스로 리스너 구현");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.formDesign();
		this.eventHandler();
		setSize(350, 150);
		setVisible(true);
	}
	
	 public void formDesign() {
		 this.setLayout(new FlowLayout());
		 this.add(btn);
	 };
	 
	 public void eventHandler() {
		 //1)소스  2)귀를 달아준다  3)객체생성 - 리스너 구현 - 1)외부클래스로 구현
		 btn.addActionListener(new MyActionEx());
	 };
	
	public static void main(String[] args) {
		new ExternnalClassEx();
	}
}
