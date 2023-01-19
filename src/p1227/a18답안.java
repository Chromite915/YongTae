package p1227;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class a18답안 extends JFrame {
	private JComboBox<String> cb = new JComboBox<String>();
	
	public a18답안() {
		setTitle("콤보박스 추가 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField jt = new JTextField(12);
		c.add(jt);
		jt.addActionListener(new MyActionListener());
		c.add(cb);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource();
			cb.addItem(t.getText());
		}
	}
	
	public static void main(String[] args) {
		new a18답안();
	}
}
