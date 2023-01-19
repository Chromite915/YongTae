package p230102복습;

import javax.swing.*;
import java.awt.*;

public class a05SwingEx3 extends JFrame {
	public a05SwingEx3() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		setResizable(false);
		setSize(350, 250);
		
		Panel1 p1 = new Panel1();
		p1.setSize(this.getWidth(),30);
		p1.setLocation(0,0);
		c.add(p1);
		
		Panel2 p2 = new Panel2();
		p2.setSize(this.getWidth(), 30);
		p2.setLocation(0,30);
		c.add(p2);
		
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), 190);
		panel.setLocation(0,60);
		JButton btn = new JButton("OK");
		panel.add(btn);
		panel.setBackground(Color.CYAN);
		c.add(panel);
		
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
		new a05SwingEx3();
	}
}
