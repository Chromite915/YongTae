package p230102복습;
// 위 2개를 1개로 묶고, 전체를 2,1로 한다
// 패널들을 각각 클래스 따로 분리하여 만든 케이스
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class a05응용실습1미완성 extends JFrame {
	public a05응용실습1미완성() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.gray);
		c.setLayout(new GridLayout(3,1));
		
		Panel1 p1 = new Panel1();
		Panel2 p2 = new Panel2();
		Panel3 p3 = new Panel3();
		
		c.add(p1);   // c - p - p1
		c.add(p2);   // c - p - p2
		c.add(p3);
		
		JButton btn = new JButton("OK");
		
		setSize(500, 400);
		setVisible(true);
	}
	
	private class Panel1 extends JPanel {
		Panel1() {
			setBackground(Color.YELLOW);
			add(new JLabel("ID"));
			add(new JTextField(12));
		}
	}
	
	private class Panel2 extends JPanel {
		Panel2() {
			setBackground(Color.GREEN);
			add(new JLabel("Please Check"));
			add(new JCheckBox("C#"));
			add(new JCheckBox("C++"));			
		}
	}
	private class Panel3 extends JPanel {
		Panel3() {
			setBackground(Color.CYAN);
			add(new JButton("OK"));
		}
	}
	
	public static void main(String[] args) {
		new a05응용실습1미완성();
	}
}
