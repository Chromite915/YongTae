package p230102복습;

import javax.swing.*;
import java.awt.*;

public class a05SwingEx4 extends JFrame {
	public a05SwingEx4() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setResizable(false);
		setSize(350, 250);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		Panel1 p1 = new Panel1();
		Panel2 p2 = new Panel2();
		panel.add(p1);
		panel.add(p2);
		c.add(panel, BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		JButton btn = new JButton("OK");
		panel2.add(btn);
		panel2.setBackground(Color.CYAN);
		c.add(panel2);
		
		setVisible(true);
	}
	
	private class Panel1 extends JPanel {
		Panel1() {
			setBackground(Color.YELLOW);
			add(new JLabel("아이디"));
			add(new JTextField(15));
		}
	}
	
	private class Panel2 extends JPanel {
		Panel2() {
			setBackground(Color.GREEN);
			add(new JLabel("  please Check!!  "));
			add(new JCheckBox("C#"));
			add(new JCheckBox("C++"));			
		}
	}
	
	public static void main(String[] args) {
		new a05SwingEx4();
	}
}
