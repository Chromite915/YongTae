package test230103;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class MyDialog extends JDialog {
	private JLabel laid = new JLabel("아이디 : ");
	private JLabel laps = new JLabel("패스워드 : ");
	private JLabel laad = new JLabel("주소 : ");
	private JLabel lahb = new JLabel("취미 : ");
	private JLabel lagen = new JLabel("성별 : ");
	
	private JTextField tfid = new JTextField(10);
	private JPasswordField tfps = new JPasswordField(10);
	
	private JComboBox<String> cb = new JComboBox<String>();
	
	private JCheckBox ch1 = new JCheckBox();
	private JLabel lach1 = new JLabel("운동");
	private JCheckBox ch2 = new JCheckBox();
	private JLabel lach2 = new JLabel("게임");
	private JCheckBox ch3 = new JCheckBox();
	private JLabel lach3 = new JLabel("영화감상");
	
	private ButtonGroup g = new ButtonGroup();
	private JRadioButton male = new JRadioButton("남자");
	private JRadioButton female = new JRadioButton("여자", true);
	
	private JButton okButton = new JButton("회원가입"); 
	
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		
		g.add(male);
		g.add(female);
		
		add(laid);
		add(laps);
		add(laad);
		add(lahb);
		add(lagen);
		add(ch1);
		add(lach1);
		add(ch2);
		add(lach2);
		add(ch3);
		add(lach3);
		add(male);
		add(female);
		add(cb);
		add(tfid);
		add(tfps);
		add(okButton);
		setSize(200, 100);
	
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);                       // 만드는게 아니라 보였다 숨겼다 하는것이다
			}
		});
	}
}

public class a04 extends JFrame {
	JTextField id = new JTextField(12);
	JPasswordField pass = new JPasswordField(12);
	
	private MyDialog dialog; 
	
	public a04() {
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
		
		dialog = new MyDialog(this, "test");		//This의 의미
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true); 
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
		new a04();
	}
}