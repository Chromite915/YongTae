package p1223;

import java.awt.Container;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

// Hello 라벨이 마우스 클릭 위치로 이동함

public class a02MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public a02MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); 
		c.addMouseListener(new MyMouseListener()); // 이번에는 컨테이너에 마우스리스터를 add
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30); // la의 최초 위치
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener { // 위에서 만든 마우스리스너와 연계, 리스너 종류 공부하기
		public void mousePressed(MouseEvent e) {    // 1
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y); // la의 위치를 해당 좌표로 바꾸겠다
		}
		public void mouseReleased(MouseEvent e) {}  // 2
		public void mouseClicked(MouseEvent e) {}   // 3
		public void mouseEntered(MouseEvent e) {}   // 4
		public void mouseExited(MouseEvent e) {}    // 5개 전부 필요
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a02MouseListenerEx();
	}
}
