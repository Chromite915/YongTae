package p230102복습;
/* c - p - p1, p2
 * c - pSouth - btn
 * 전체는 보더, ok버튼이 SOUTH
 */
import javax.swing.*;
import java.awt.*;

public class a04답안2 extends JFrame {
	public a04답안2() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.gray);
		// setResizable(false);         // 창 크기조절 불가
		
		Panel1 p1 = new Panel1();
		Panel2 p2 = new Panel2();
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,2, 10, 10)); // 1,2 그리드
		p.add(p1);   // c - p - p1
		p.add(p2);   // c - p - p2
		c.add(p);
		
		JButton btn = new JButton("OK");
		JPanel pSouth = new JPanel();
		pSouth.add(btn);                   // 버튼을 새로운 패널에 부착
		c.add(pSouth, BorderLayout.SOUTH);  // c - pSouth - btn
		
		setSize(350, 250);
		setVisible(true);
	}
	
	private class Panel1 extends JPanel {
		Panel1() {
			setBackground(Color.YELLOW);
			add(new JLabel("아이디"));
			add(new JTextField(12));
			add(new JLabel("비밀번호"));
			add(new JPasswordField(12));						
		}
	}
	
	private class Panel2 extends JPanel {
		Panel2() {
			setBackground(Color.CYAN);
			add(new JLabel("       클릭       "));
			add(new JCheckBox("C# 체크박스"));
			add(new JCheckBox("C++ 체크박스"));			
		}
	}
	
	public static void main(String[] args) {
		new a04답안2();
	}
}
