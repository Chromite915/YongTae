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
// 다이얼로그의 내용만을 정의하고 다른 클래스와 연결함

class AdviceDialogEx3 extends JDialog {
	private JTextField model = new JTextField(10);
	private JTextField imei = new JTextField(10);
	private JTextField buyerName = new JTextField(10);
	private JTextField buyerPhoneNumber = new JTextField(10);
	private JTextField sellDate = new JTextField(10);
	private String [] adress = {"서울", "인천", "제주도", "기타(해외)"};
	
	public AdviceDialogEx3(JFrame f) {
		super(f, "test", true);
		setLayout(null);
		setResizable(true);
		
		JLabel title = new JLabel("기록 검색");
		title.setLocation(120 , 15);
		title.setSize(150, 30);
		title.setFont(new Font("serif", Font.BOLD, 25));
		add(title);
		
		JLabel idLabel = new JLabel("기종 : ");
		idLabel.setLocation(30 , 60);
		idLabel.setSize(100, 20);
		idLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(idLabel);
		model.setLocation(140, 63);
		model.setSize(100, 20);
		model.addKeyListener(new KeyListener() {
			
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
		add(model);	
		JLabel pwdLabel = new JLabel("IMEI : ");
		pwdLabel.setLocation(30 , 100);
		pwdLabel.setSize(100, 20);
		pwdLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(pwdLabel);
		imei.setLocation(140, 103);
		imei.setSize(100, 20);
		add(imei);
		
		JLabel addrLabel = new JLabel("고객명 : ");
		addrLabel.setLocation(30 , 140);
		addrLabel.setSize(100, 20);
		addrLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(addrLabel);
		buyerName.setLocation(140, 143);
		buyerName.setSize(100, 20);
		add(buyerName);
		
		JLabel hLabel = new JLabel("전화번호 : ");
		hLabel.setLocation(30 , 180);
		hLabel.setSize(100, 20);
		hLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(hLabel);
		buyerPhoneNumber.setLocation(140, 183);
		buyerPhoneNumber.setSize(100, 20);
		add(buyerPhoneNumber);
		
		JLabel sLabel = new JLabel("판매일 : ");
		sLabel.setLocation(30 , 220);
		sLabel.setSize(100, 20);
		sLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(sLabel);
		sellDate.setLocation(140, 223);
		sellDate.setSize(100, 20);
		add(sellDate);
		
		JButton join = new JButton("등록");
		
		join.setLocation(120 , 260);
		join.setSize(100, 20);
		join.setFont(new Font("serif", Font.BOLD, 15));
		/*join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(model.getText().equals("") || imei.getText().equals("") 
						|| (!chk1.isSelected() && !chk2.isSelected() && !chk3.isSelected())
						|| (!rd1.isSelected() && !rd2.isSelected())) {
					JOptionPane.showMessageDialog(null, "회원가입 실패 \n모든정보 입력하세요.", "실패", JOptionPane.WARNING_MESSAGE);
				}
			}
		});*/
		add(join);
		
		setSize(350,400);
//		setVisible(true);
	}
}