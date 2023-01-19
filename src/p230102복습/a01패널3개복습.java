package p230102복습;
/* 패널3개
 * 패널속에 또 라벨을 추가
 */
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

public class a01패널3개복습 extends JFrame {
	
	public a01패널3개복습() {
		setTitle("복습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		// JFrame의 디폴트가 Border이므로 셋레이아웃(뉴 보더레이아웃()) 생략 가능
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		panel1.setBackground(Color.LIGHT_GRAY);
		panel2.setBackground(Color.CYAN);
		panel3.setBackground(Color.LIGHT_GRAY);
		
		c.add(panel1, BorderLayout.NORTH);
		c.add(panel2, BorderLayout.CENTER);
		c.add(panel3, BorderLayout.SOUTH);
		
		panel1.add(new JLabel("상단 Panel"));
		panel2.add(new JLabel("중단 Panel"));
		panel3.add(new JLabel("하단 Panel"));
		
		setSize(1000,500); // 내 마음대로. 아예 이 줄을 안 쓸 수도 있음.
		setVisible(true);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a01패널3개복습();

	}

}