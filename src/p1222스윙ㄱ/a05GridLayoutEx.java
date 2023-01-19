package p1222스윙ㄱ;
/* 그리드 = 행렬
 * 창 크기 조절하면 내용물들의 크기 변경됨(배치는 안변함)
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class a05GridLayoutEx extends JFrame {
	public a05GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 2); // 세로4, 가로2
		grid.setVgap(5); // 간격 5
		
		Container c = getContentPane(); 
		c.setLayout(grid);              // grid
		// = c.setLayout(new GridLayout(4, 2));
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a05GridLayoutEx();

	}

}
