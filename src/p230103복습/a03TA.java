package p230103복습;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class a03TA extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20);
	
	public a03TA() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter> 키를 입력하시오."));
		c.add(tf);
		c.add(new JScrollPane(ta));						// 추가하면서 바로 스크롤판 생성, 스크롤판 속에 TA
		
		tf.addActionListener(new ActionListener() {     // tf, 여기에 뭐 쓰고 [[[엔터 치면]]]
			// TextField : Enter 입력시의 이벤트
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n");          // ta, 입력값이 여기로 들어오고, [[[자동으로 엔터쳐져서]]] Focus가 다음줄로 이동
				// append(이어붙이다)
				t.setText("");
			}
		});
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a03TA();

	}

}
