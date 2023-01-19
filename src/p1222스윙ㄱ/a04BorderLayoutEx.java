package p1222스윙ㄱ;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class a04BorderLayoutEx extends JFrame {

	public a04BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); 
		c.setLayout(new BorderLayout(30, 20)); // border, 컴포넌트 간격 30, 20 늘리기
		c.add(new JButton("Calculate"), BorderLayout.CENTER); // 버튼, 위치 = 보더레이아웃의 특징 형식
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		// 위치변수 Border는 5개, Flow는 3개
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a04BorderLayoutEx();

	}

}
