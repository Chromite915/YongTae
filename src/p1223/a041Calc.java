package p1223;
/* 
 * [내가 직접 한 클래스]
 * 입력한 값들을 전부 나열시킨 후에 계산
 * 계산기 실제로 작동하게
 * StringTokenizer 
 * */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class a041Calc extends JFrame {
	String numStr="";            // 생성자 안쪽에서 선언하면 안됨. 외부에서도 접근해야 하기때문
	
	public a041Calc() {                   // 기본 생성자
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		panel1.setBackground(Color.LIGHT_GRAY);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel3.setLayout(new GridLayout(4,4, 2,2)); // 4x4배열, 간격 2, 2
		
		c.add(panel1, BorderLayout.NORTH);
		c.add(panel2, BorderLayout.SOUTH);
		c.add(panel3);
		
		panel1.add(new JLabel("수식입력 : "));
		JTextField text = new JTextField(10); // 입력칸의 크기
		panel1.add(text);
		
		panel2.add(new JLabel("계산결과 : "));
		JTextField text2 = new JTextField(10);
		panel2.add(text2);
		
		for(int i=0; i<16; i++) {
			JButton b = new JButton();                 // 버튼 부여
			
			/* 이벤트 내용 : 
			 * 무조건 숫자부터 시작
			 * 일단 입력값 누적되도록(현재 연산자 첫 1개까지만 계산할 수 있는 상태)
			 * 여러 연산자를 동시에 넣을 수 있도록(입력된 값들을 숫자배열과 문자배열로 분리)
			 * 곱하기부터 계산하도록 */
			b.addActionListener(new ActionListener() { // [[이벤트 시작]], 밑은 전부 ActionListener의 내용
				// J버튼 b에 ActionListener 이벤트를 부여

				@Override                                             // 자동 추가
				public void actionPerformed(ActionEvent e) { 
					// TODO Auto-generated method stub
					JButton jb = (JButton) e.getSource();
		            text.setText(jb.getText());                       // 이 줄 무슨 의미?
					String str = jb.getText();                        // 입력중
					if(str.equals("계산")) {                           // 계산 버튼 누르면(str값이 "계산" 이면)
						StringTokenizer st = new StringTokenizer(numStr, "+-*/", true); // 재정의 한 numStr를 "" 안의 기호들 기준으로 분리
						
						int num1 = Integer.parseInt(st.nextToken()); // 1. 숫자
						String kind = st.nextToken();                 // 2. 연산기호
						int num2 = Integer.parseInt(st.nextToken()); // 3. 숫자
						
						// numArray[i], numArray[i+1]
						// kindArray[i], kindArray[i+1]
						
						if(kind.equals("+"))
							text2.setText(num1 + num2 + "");
						else if(kind.equals("-"))
							text2.setText(num1 - num2 + "");
						else if(kind.equals("*"))
							text2.setText(num1 * num2 + "");
						else if(kind.equals("/"))
							text2.setText(num1 / num2 + ""); 
					} else {
						numStr += str;               // numStr 재정의
						text.setText(numStr);
					}
					
				} 
			});                                        // [[이벤트 끝]]
			
			String[] str = {"CE", "계산", "+", "-", "*", "/"};
			panel3.add(b);
			if(i<10) {
				b.setText(i+""); // 버튼에 0 ~ 9까지 숫자 부여
			} else {
				b.setText(str[i-10]); // 9 이후로는 버튼에 str의 문자 부여
			}
		}
		setSize(500,500); // 내 마음대로. 아예 이 줄을 안 쓸 수도 있음.
		setVisible(true);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a041Calc();

	}

}