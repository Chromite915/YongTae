package p1222스윙ㄱ;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// 폰카에 문제 있음

public class a11랜덤위치색입히기 extends JFrame {
	public a11랜덤위치색입히기() { 
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // Container = 도화지
		c.setLayout(null);             // null
		
		for(int i=1; i<=20; i++) {
			JLabel la = new JLabel((int)(Math.random() * 100) + ""); // (숫자 + ""), ""가 필요한 이유 = JLabel 생성자가 String을 받기 때문
			// 숫자와 문자열을 더하면 문자열이 된다
			int x = (int)(Math.random() * 200) + 50;
			int y = (int)(Math.random() * 200) + 50;
			la.setLocation(x, y);
			la.setSize(20, 20);
			// la.setBounds() // 로케이션과 사이즈를 합친것
			la.setOpaque(true); // 라벨에 색 입히려면 이 내용이 필수
			la.setBackground(Color.red);
			c.add(la); // Container에 위의 정보들을 가진 점 la를 add 하고 for로 복귀
		}
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a11랜덤위치색입히기();
	}
}
