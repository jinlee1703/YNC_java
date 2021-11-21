import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventListenerEx1 extends JFrame {
	private JButton btn = new JButton("Action");
	EventListenerEx1() {
		this.setTitle("익명중첩클래스로 리스너 구현");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.formDesign();
		this.eventHandler();
		this.setSize(350, 150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setLayout(new FlowLayout());
		this.add(btn);
	}
	
	public void eventHandler() {
		//1)소스, 2)귀를 달아준다, 3)객체생성, 4)리스너 구현 - 익명중첩클래스
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand() == "Action")
					btn.setText("액션");
				else
					btn.setText("Action");
			}
		});
	}
	
	public static void main(String[] args) {
		new EventListenerEx1();
	}
}
