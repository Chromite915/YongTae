package p230102복습;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class a07MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello"); 

	public a07MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());

		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(250, 250);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			
			/* int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y); */
			// 이거보단 밑의 Point를 더 많이 씀
			
			Point p = e.getPoint();
			la.setLocation(p);
		}

		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		// 마우스리스너의 추상메소드가 5개라 예네를 안쓰더라도 나머지 4개가 다 있어야함
	}

	public static void main(String [] args) {
		new a07MouseListenerEx();
	}
} 
