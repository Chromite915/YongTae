package p1222스윙ㄱ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class a13응용 extends JFrame implements ActionListener{
	// 좋은 방법 X
	// a12에서 입력값이 밑칸으로 가도록
	// 1. 상속 뒤에 implements 까지
	// 2. 내부클래스(inner class) 작성
	static JTextField text2 = null;
	public a13응용(){
		setTitle("계산기 프레임");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
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
		JTextField text = new JTextField(10);
		panel1.add(text);
		
		panel2.add(new JLabel("계산결과 : "));
		text2 = new JTextField(10);
		panel2.add(text2);
		
		for(int i=0; i<16; i++) {
			JButton b = new JButton();
			b.addActionListener(new MyActionListener2());
			/* b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton jb = (JButton) e.getSource();
					text.setText(jb.getText());
				}
			}); */
			String[] str= {"CE","계산","+","-","x","%"};
			panel3.add(b);
			if(i<10) {
				b.setText(i+"");
			}else { 
				b.setText(str[i-10]);
			}
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a13응용();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class MyActionListener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton) e.getSource();
		a13응용.text2.setText(jb.getText());
	}
	
}