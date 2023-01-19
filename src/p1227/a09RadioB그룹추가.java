package p1227;
// p1과 p2 사이에 공간이 안만들어진다
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class a09RadioB그룹추가 extends JFrame {
	public a09RadioB그룹추가() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true); // 배 선택이 초기값
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		cherry.setBorderPainted(true);                   // 경계선 강조 기능(필수 아님)
		cherry.setSelectedIcon(selectedCherryIcon);
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		p1.add(apple);
		p1.add(pear);
		p1.add(cherry);
		
		JPanel p2 = new JPanel();
		ButtonGroup g2 = new ButtonGroup();
		JRadioButton S23U = new JRadioButton("S23U");
		JRadioButton ZFold4 = new JRadioButton("ZFold4", true);
		JRadioButton ZFlip4 = new JRadioButton("ZFlip4");
		g2.add(S23U);
		g2.add(ZFold4);
		g2.add(ZFlip4);
		p2.add(S23U);
		p2.add(ZFold4);
		p2.add(ZFlip4);
		
		JPanel p3 = new JPanel(); // 패널3은 여백을 위해서 추가했다
		c.add(BorderLayout.NORTH, p1);
		c.add(BorderLayout.SOUTH, p2);
		c.add(p3);
		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a09RadioB그룹추가();
	}
}
