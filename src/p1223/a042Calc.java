package p1223;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class a042Calc extends JFrame implements ActionListener{
	String[] str= {"CE","계산","+","-","*","/"};
	JTextField text = null;
	JTextField text2 = null;
	String numStr="";
	public a042Calc(){
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
		text = new JTextField(10);
		panel1.add(text);
		
		panel2.add(new JLabel("계산결과 : "));
		text2 = new JTextField(10);
		panel2.add(text2);
		
		for(int i=0; i<16; i++) {
			JButton b = new JButton();
			b.addActionListener(this);
			/* b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton jb = (JButton) e.getSource();
					text.setText(jb.getText());
				}
			}); */
			
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
		new a042Calc();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton) e.getSource();
		String str = jb.getText();
		
		if(str.equals("계산")) {
			StringTokenizer st = new StringTokenizer(numStr, "+-*/", true); // 이 밑에서부터 a042랑 a043이랑 다름
			int num1 = Integer.parseInt(st.nextToken());
			String kind = st.nextToken();
			int num2 = Integer.parseInt(st.nextToken());
			
			if(kind.equals("+"))
				text2.setText(num1 + num2 + "");
			else if(kind.equals("-"))
				text2.setText(num1 - num2 + "");
			else if(kind.equals("*"))
				text2.setText(num1 * num2 + "");
			else if(kind.equals("/"))
				text2.setText(num1 / num2 + "");
			
			numStr = "";
			text.setText("");
		} else if(str.equals("CE")) {
			numStr = "";
			text.setText("");
		} else {
			numStr += str;
			text.setText(numStr);
		}
		
		
	}
	
}

