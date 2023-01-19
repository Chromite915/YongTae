package p230102복습;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// 좌표형식으로
public class a05응용실습2 extends JFrame {
	JButton btn = new JButton("OK");
	
	public a05응용실습2() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		// setResizable(false);      // 창 크기조절 불가
		
		Panel1 p1 = new Panel1();
		p1.setSize(450,30);
		p1.setLocation(0,0);
		c.add(p1);    
		// c - p1
		Panel2 p2 = new Panel2();
		p2.setSize(450, 35);
		p2.setLocation(0,30);
		c.add(p2);                // c - p2
		
		Panel3 p3 = new Panel3();
		p3.setSize(450, 335);
		p3.setLocation(0,65);
		c.add(p3);                // c - p2
		
		setSize(500, 400);
		setVisible(true);
	}
	
	private class Panel1 extends JPanel {
		Panel1() {
			setBackground(Color.YELLOW);
			add(new JLabel("아이디"));
			add(new JTextField(12));
		}
	}
	
	private class Panel2 extends JPanel {
		Panel2() {
			setBackground(Color.CYAN);
			add(new JLabel("     클릭     "));
			add(new JCheckBox("C#"));
			add(new JCheckBox("C++"));			
		}
	}
	private class Panel3 extends JPanel {
		Panel3() {
			setBackground(Color.GREEN);
			add(new JButton("OK"));
		}
	}
	
	public static void main(String[] args) {
		new a05응용실습2();
	}
}
