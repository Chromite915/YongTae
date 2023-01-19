package p230103복습;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class a02미완체크박스 extends JFrame {
	public a02미완체크박스() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		int sum = 0;
		
		JPanel p1 = new JPanel();				// 레이아웃 설정 안했으면 디폴트는 보더
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		JLabel sumLa = new JLabel("가격의 총합 = " + sum);
		
		JCheckBox c1 = new JCheckBox();
		JCheckBox c2 = new JCheckBox();
		JCheckBox c3 = new JCheckBox();
		
		JLabel la1 = new JLabel("사과");
		JLabel la2 = new JLabel("바나나");
		JLabel la3 = new JLabel("딸기");
		
		c.add(p1, BorderLayout.NORTH);
		c.add(p2, BorderLayout.CENTER);
		p1.add(sumLa);
		p2.add(la1);
		p2.add(c1);
		p2.add(la2);
		p2.add(c2);
		p2.add(la3);
		p2.add(c3);
		
		setVisible(true);
		setSize(300, 300);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a02미완체크박스();

	}

}
