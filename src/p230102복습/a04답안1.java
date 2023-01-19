package p230102복습;
// c - p1, p2
// c - btn
// 패널과 버튼의 위치를 직접 조정
import javax.swing.*;
import java.awt.*;

public class a04답안1 extends JFrame {
	public a04답안1() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		// setResizable(false);      // 창 크기조절 불가
		
		Panel1 p1 = new Panel1();
		p1.setSize(150,150);
		p1.setLocation(10,10);
		c.add(p1);                // c - p1
		Panel2 p2 = new Panel2();
		p2.setSize(150,150);
		p2.setLocation(170,10);
		c.add(p2);                // c - p2
		
		JButton btn = new JButton("OK");
		btn.setLocation(130, 170);
		btn.setSize(70, 30);
		c.add(btn);               // c - btn
		
		setSize(350, 250);
		setVisible(true);
	}
	
	private class Panel1 extends JPanel {
		Panel1() {
			setBackground(Color.YELLOW);
			add(new JLabel("아이디"));
			add(new JTextField(12));
			add(new JLabel("비밀번호"));
			add(new JPasswordField(12));						
		}
	}
	
	private class Panel2 extends JPanel {
		Panel2() {
			setBackground(Color.CYAN);
			add(new JLabel("     클릭     "));
			add(new JCheckBox("C# 체크박스"));
			add(new JCheckBox("C++ 체크박스"));			
		}
	}
	
	public static void main(String[] args) {
		new a04답안1();
	}
}
