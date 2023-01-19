package p1222스윙ㄱ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class a12패널3개 extends JFrame {
	
	// 카페에 있음
	
	public a12패널3개() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		panel1.setBackground(Color.LIGHT_GRAY);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel3.setLayout(new GridLayout(4,4, 2,2));
		
		c.add(panel1, BorderLayout.NORTH);
		c.add(panel2, BorderLayout.SOUTH);
		c.add(panel3);
		
		panel1.add(new JLabel("수식입력 : "));
		JTextField text = new JTextField(10); // 입력칸의 크기
		panel1.add(text);
		
		panel2.add(new JLabel("계산결과 : "));
		panel2.add(new JTextField(10));
		
		for(int i=0; i<16; i++) {
			JButton b = new JButton();                 // 버튼 부여
			b.addActionListener(new ActionListener() { // [버튼 누르면 panel1에 버튼 이름이 입력되도록 하는 이벤트
				// J버튼 b에 ActionListener 이벤트를 부여

				@Override                              // 자동 추가
				public void actionPerformed(ActionEvent e) { 
					// TODO Auto-generated method stub
					JButton jb = (JButton) e.getSource();
					text.setText(jb.getText());
				} 
			});                                        // 버튼 누르면 panel1에 버튼 이름이 입력되도록 하는 이벤트]
			
			String[] str = {"CE", "계산", "+", "-", "x", "%"};
			panel3.add(b);
			if(i<10) {
				b.setText(i+"");
			} else {
				b.setText(str[i-10]);
			}
		}
		setSize(1000,500); // 내 마음대로. 아예 이 줄을 안 쓸 수도 있음.
		setVisible(true);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a12패널3개();

	}

}