package 개인프로젝트;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEx1답안 extends JFrame {
	JTextField id = new JTextField(15);
	JPasswordField pwd = new JPasswordField(15);
	public SwingEx1답안() {
		setTitle("test1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		setResizable(false);
		
		DialogEx1답안 dialog = new DialogEx1답안(this);
		
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("Screen");
		JMenuItem openItem = new JMenuItem("Clear");
		
		openItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				id.setText("");
				pwd.setText("");
			}
		});
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
		
		Panel1 p1 = new Panel1();
		p1.setSize(200,150);
		p1.setLocation(100,30);
		c.add(p1);
		
		JButton btn = new JButton("로그인");
		btn.addActionListener(new MyAction());
		pwd.addActionListener(new MyAction());
		
		btn.setLocation(100, 190);
		btn.setSize(100, 30);
		c.add(btn);
		
		JButton btn2 = new JButton("회원가입");
		btn2.setLocation(200, 190);
		btn2.setSize(100, 30);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialog.setVisible(true);
				
			}
		});
		c.add(btn2);
		
		setSize(400, 300);
		setVisible(true);
	}
	
	public class MyAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if("test".equals(id.getText()) && "1234".equals(pwd.getText())) {
				JOptionPane.showMessageDialog(SwingEx1답안.this, "로그인 성공", "성공", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(SwingEx1답안.this, "로그인 실패", "실패", JOptionPane.WARNING_MESSAGE);
			}
		}
		
	}
	
	private class Panel1 extends JPanel {
		Panel1() {
			setBackground(Color.YELLOW);
			add(new JLabel("아이디     "));
			add(id);
			add(new JLabel("비밀번호  "));
			add(pwd);						
		}
	}
	
	public static void main(String[] args) {
		new SwingEx1답안();
	}
}
