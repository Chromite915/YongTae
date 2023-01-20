package PersonalProject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


class DialogEx1답안 extends JDialog {
	private JTextField id = new JTextField(10);
	private JPasswordField pwd = new JPasswordField(10);
	private JTextField phone = new JTextField(10);
	private String [] adress = {"서울", "인천", "제주도", "기타(해외)"};
	
	public DialogEx1답안(JFrame f) {
		super(f, "test", true);
		setLayout(null);
		setResizable(false);
		
		JLabel title = new JLabel("회원가입");
		title.setLocation(120 , 15);
		title.setSize(150, 30);
		title.setFont(new Font("serif", Font.BOLD, 25));
		add(title);
		
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setLocation(30 , 60);
		idLabel.setSize(100, 20);
		idLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(idLabel);
		id.setLocation(140, 63);
		id.setSize(100, 20);
		id.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
					String k = Character.toString(e.getKeyChar());
					k = k.concat("숫자는 입력 불가능 합니다.");
					JOptionPane.showMessageDialog(null, k, "경고", JOptionPane.ERROR_MESSAGE);
					e.consume(); 
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			}
		});
		add(id);	
		JLabel pwdLabel = new JLabel("패스워드 : ");
		pwdLabel.setLocation(30 , 100);
		pwdLabel.setSize(100, 20);
		pwdLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(pwdLabel);
		pwd.setLocation(140, 103);
		pwd.setSize(100, 20);
		add(pwd);
		
		JLabel addrLabel = new JLabel("주소 : ");
		addrLabel.setLocation(30 , 140);
		addrLabel.setSize(100, 20);
		addrLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(addrLabel);
		JComboBox<String> strCombo = new JComboBox<String>(adress);
		strCombo.setLocation(140, 143);
		strCombo.setSize(100, 20);
		add(strCombo);
		
		JLabel hLabel = new JLabel("취미 : ");
		hLabel.setLocation(30 , 180);
		hLabel.setSize(100, 20);
		hLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(hLabel);
		JCheckBox chk1 = new JCheckBox("운동");
		JCheckBox chk2 = new JCheckBox("게임");
		JCheckBox chk3 = new JCheckBox("영화감상");
		chk1.setLocation(140, 183);
		chk1.setSize(50, 20);
		add(chk1);
		chk2.setLocation(190, 183);
		chk2.setSize(50, 20);
		add(chk2);
		chk3.setLocation(240, 183);
		chk3.setSize(80, 20);
		add(chk3);
		
		JLabel sLabel = new JLabel("성별 : ");
		sLabel.setLocation(30 , 220);
		sLabel.setSize(100, 20);
		sLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(sLabel);
		ButtonGroup group = new ButtonGroup();
		JRadioButton rd1 = new JRadioButton("남자");
		JRadioButton rd2 = new JRadioButton("여자");
		group.add(rd1);
		group.add(rd2);
		rd1.setLocation(140, 223);
		rd1.setSize(50, 20);
		rd2.setLocation(190, 223);
		rd2.setSize(50, 20);
		add(rd1);
		add(rd2);
		
		JButton join = new JButton("회원가입");
		
		join.setLocation(120 , 260);
		join.setSize(100, 20);
		join.setFont(new Font("serif", Font.BOLD, 15));
		join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(id.getText().equals("") || pwd.getText().equals("") 
						|| (!chk1.isSelected() && !chk2.isSelected() && !chk3.isSelected())
						|| (!rd1.isSelected() && !rd2.isSelected())) {
					JOptionPane.showMessageDialog(null, "회원가입 실패 \n모든정보 입력하세요.", "실패", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		add(join);
		
		setSize(350,400);
//		setVisible(true);
	}
}