package test230103;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class a01 extends JFrame {
	public a01() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.gray);
		// setResizable(false);         // 창 크기조절 불가
		
		Panel1 p1 = new Panel1();
		p1.setLayout(new GridLayout(4,1));
		
		c.add(p1);   // c - p - p1
		
		JButton btn1 = new JButton("로그인");
		JButton btn2 = new JButton("회원가입");
		JPanel pSouth = new JPanel();
		pSouth.add(btn1);                   // 버튼을 새로운 패널에 부착
		pSouth.add(btn2);
		c.add(pSouth, BorderLayout.SOUTH);  // c - pSouth - btn
		
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
	
	public static void main(String[] args) {
		new a01();
	}
}