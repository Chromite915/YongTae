package p1223;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

// a02를 수정

public class a051MouseListenerEx2 extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public a051MouseListenerEx2() {
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
	class MyMouseListener extends MouseAdapter {   // 마우스리스너를 마우스어뎁터로 바꿨더니 밑의 나머지 조건들 지워도 정상 작동
		public void mousePressed(MouseEvent e) {    
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a051MouseListenerEx2();
	}
}
