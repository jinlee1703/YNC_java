import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//프레임 자체에서 리스너 구현
public class EventListenerEx extends JFrame implements ActionListener {
	private JButton btn = new JButton("Action");
	EventListenerEx() {
		this.setTitle("프레임자체에서 리스너 구현");
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
		btn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new EventListenerEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Action")
			btn.setText("액션");
		else
			btn.setText("Action");
	}
}
