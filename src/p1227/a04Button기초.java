package p1227;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
// 마우스 노멀, 롤오버, 프레스드 시 각각 다른 이미지가 출력됨
public class a04Button기초 extends JFrame {
	public a04Button기초() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		// c.setLayout(new FlowLayout());
		// Flow일땐 수직수평정렬이 안먹혀서 주석해놓음
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		btn.setHorizontalAlignment(SwingConstants.LEFT); // 수평 정렬
		btn.setVerticalAlignment(SwingConstants.TOP);    // 수직 정렬
		c.add(btn);
		
		setSize(250, 150);
		setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a04Button기초();
	}
}
