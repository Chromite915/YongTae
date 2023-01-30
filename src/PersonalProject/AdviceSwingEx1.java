package PersonalProject;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Base2와 SwingEx1답안 2개의 클래스가 같은 다이얼로그를 참조하는 상태이니 참고할것


public class AdviceSwingEx1 extends JFrame {
	JTextField id = new JTextField(15);
	JPasswordField pwd = new JPasswordField(15);
	
	public AdviceSwingEx1() {
		setTitle("test1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		setResizable(false);
		
		AdviceDialogEx2 dialog = new AdviceDialogEx2(this);		// 만들어놓은 다이얼로그와 연동하기(이제 구현해야)
		
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
				dialog.setVisible(true);					// btn2를 누르면 연동한 다이얼로그를 구현
				
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
				JOptionPane.showMessageDialog(AdviceSwingEx1.this, "로그인 성공", "성공", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(AdviceSwingEx1.this, "로그인 실패", "실패", JOptionPane.WARNING_MESSAGE);
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
		new AdviceSwingEx1();
	}
}
