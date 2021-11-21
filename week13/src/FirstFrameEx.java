import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrameEx extends JFrame {
	private JButton btn = new JButton("OK");
	
	FirstFrameEx() {
		this.setTitle("첫번째 프레임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
//		this.add(new JButton("OK"));
		this.add(btn);
		
		//이벤트 처리
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand() == "OK")
					btn.setText("버튼클릭");
				else
					btn.setText("OK");
			}
			
		});
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FirstFrameEx();
//		FirstFrameEx pp = new FirstFrameEx();
		
	}
}
