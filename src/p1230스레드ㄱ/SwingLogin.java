package p1230스레드ㄱ;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingLogin extends JFrame{
	private JLabel idLabel = new JLabel("아이디 ");
	private JLabel pwLabel = new JLabel("비밀번호 ");
	private JTextField idText = new JTextField();
	private JPasswordField pwText = new JPasswordField();
	private JButton loginBtn = new JButton("로그인");
	private JButton idpwSearchBtn = new JButton("아이디/비밀번호 찾기");
	private JLabel info = new JLabel("로그인 하세요.");
	public SwingLogin() {

		setTitle("로그인 테스트");
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,5));
		JPanel JInfo = new JPanel();

		c.add(BorderLayout.NORTH , JInfo);
		JInfo.add(info);
		JPanel j = new JPanel();
		
		c.add(BorderLayout.CENTER , j);
		j.setLayout(new GridLayout(3,2,5,5));
		j.add(idLabel);
		j.add(pwLabel);
		j.add(idText);
		j.add(pwText);
		j.add(loginBtn);
		j.add(idpwSearchBtn);

		setSize(350,200);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(idText.getText().equals("test") && pwText.getText().equals("test1")) {
					info.setText("로그인 성공!");
				} else {
					info.setText("로그인 실패!");
				}
			}
		});
		
		idpwSearchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				info.setText("id는 'test' pw는 'test1' 입니다.");
			}
		});

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingLogin();
	}

}
