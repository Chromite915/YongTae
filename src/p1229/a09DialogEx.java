package p1229;
//다이얼로그 : 최상위 컨테이너(다른 컨테이너에 속할 필요가 없이 출력 가능)
// show dialog 누르면 새로운 창 생성

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyDialog extends JDialog {                     // 다이얼로그가 프레임보다 먼저 위치?
	private JTextField tf = new JTextField(10); 
	private JButton okButton = new JButton("OK"); 
	
	public MyDialog(JFrame frame, String title) {
		super(frame,title);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
	
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);                       // 만드는게 아니라 보였다 숨겼다 하는것이다
			}
		});
	}
}

public class a09DialogEx extends JFrame{           // 항상 하던거를 나중에?
	private MyDialog dialog; 

	public a09DialogEx() {
		super("dialogEx 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn  = new JButton("Show Dialog");
		
		dialog = new MyDialog(this, "Test Dialog");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true); 
			}
		});
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new a09DialogEx();
	}
}