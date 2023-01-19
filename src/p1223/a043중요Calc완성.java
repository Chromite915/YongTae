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
// 계산기 완성
// 나누기는 double로 하지 않아서 소수점 안나옴

public class a043중요Calc완성 extends JFrame implements ActionListener{
	String[] str= {"CE","계산","+","-","*","/"};
	JTextField text = null;
	JTextField text2 = null;
	String numStr="";
	
	public a043중요Calc완성(){
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
		
		panel1.add(new JLabel("수식입력 : "));    // 입력라벨
		text = new JTextField(10);
		panel1.add(text);
		
		panel2.add(new JLabel("계산결과 : "));    // 출력라벨
		text2 = new JTextField(10);
		panel2.add(text2);
		
		for(int i=0; i<16; i++) {               // 전체패널
			JButton b = new JButton();
			b.addActionListener(this);          // [[[This의 의미는?
			/* b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton jb = (JButton) e.getSource();
					text.setText(jb.getText());
				}
			}); */
			
			panel3.add(b);                      // 숫자패널
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
		new a043중요Calc완성();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton) e.getSource();
		String str = jb.getText();
		
		// 이 부분 폰카, 영상 참조
		if(str.equals("계산")) {
			StringTokenizer st = new StringTokenizer(numStr, "+-*/", true); // 이 밑에서부터 a042랑 a043이랑 다름
			ArrayList<Integer> array = new ArrayList<Integer>();
			ArrayList<String> kindArray = new ArrayList<String>();
			int count = 1;
			while(st.hasMoreTokens()) {
				if(count % 2 == 1) {
					array.add(Integer.parseInt(st.nextToken()));
				} else {
					kindArray.add(st.nextToken());
				}
				count++;
			}
			
			for(int i=0; i<kindArray.size(); i++) {
				if(kindArray.get(i).equals("*") || kindArray.get(i).equals("/")) {
					int temp = 0;
					if(kindArray.get(i).equals("*")) 
						temp = array.get(i) * array.get(i+1);
					else 
						temp = array.get(i) / array.get(i+1);
					
					kindArray.remove(i);
					array.remove(i+1);
					array.remove(i);
					array.add(i, temp);
					i--;
				} 
			}
			System.out.println(array);
			System.out.println(kindArray);
			
			int v = array.get(0);
			for(int i=0; i<kindArray.size(); i++) {
				if(kindArray.get(i).equals("+"))
					v += array.get(i+1);
				else if(kindArray.get(i).equals("-"))
					v -= array.get(i+1);
			}
			System.out.println(v);
			text2.setText(v + "");


		} else if(str.equals("CE")) {
			numStr = "";
			text.setText("");
		} else {
			numStr += str;
			text.setText(numStr);
		}
		
		
	}
	
}