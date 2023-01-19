package test230103;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class a03미완성 extends JFrame {
	JTextField id = new JTextField(12);
	JPasswordField pass = new JPasswordField(12);
	
	public a03미완성() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.gray);
		// setResizable(false);         // 창 크기조절 불가
		
		createMenu();
		
		Panel1 p1 = new Panel1();
		p1.setLayout(new GridLayout(4,1));
		
		c.add(p1);   // c - p - p1
		
		JButton btn1 = new JButton("로그인");
		JButton btn2 = new JButton("회원가입");
		JPanel pSouth = new JPanel();
		pSouth.add(btn1);                   // 버튼을 새로운 패널에 부착
		pSouth.add(btn2);
		c.add(pSouth, BorderLayout.SOUTH);  // c - pSouth - btn
		
		String text1 = id.getText();
		String text2 = pass.getText();
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text1.equals("test") && text2.equals("1234")) {
					JOptionPane.showMessageDialog(null, "로그인 성공", "Message", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패", "Message", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		setSize(350, 250);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		screenMenu.add(new JMenuItem("Clear"));
		
		mb.add(screenMenu);
		setJMenuBar(mb);
	}
	
	private class Panel1 extends JPanel {
		Panel1() {
			setBackground(Color.YELLOW);
			add(new JLabel("아이디"));
			add(id);
			add(new JLabel("비밀번호"));
			add(pass);						
		}
	}
	
	public static void main(String[] args) {
		new a03미완성();
	}
}