package p230102복습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class a04실패본 extends JFrame {
	
	public a04실패본() {
		JPanel panel = new JPanel();
		JPanel inP1 = new JPanel();
		JPanel inP2 = new JPanel();
		JButton b = new JButton("OK");
		// c.setLayout(new BorderLayout()); JFrame의 디폴트가 Border라서 생략 가능
		
		setTitle("예시 구현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // 컨테이너 => Border
		c.setLayout(new BorderLayout());
		
		inP1.setLayout(new GridLayout(4,1));
		inP1.setBackground(Color.YELLOW);
		inP1.add(new JLabel("아이디"));
		inP1.add(new JTextField(10));
		inP1.add(new JLabel("비밀번호"));
		inP1.add(new JPasswordField(10));
		
		inP2.setLayout(new GridLayout(3,1));
		inP2.setBackground(Color.CYAN);
		inP2.add(new JLabel("클릭"));
		inP2.add(new JCheckBox("C# 체크박스"));
		inP2.add(new JCheckBox("C++ 체크박스"));
		
		panel.add(inP1);
		panel.add(inP2);
		panel.add(b, BorderLayout.SOUTH);
		
		c.add(panel);
		
		setSize(500,400);
		setVisible(true);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a04실패본();

	}

}