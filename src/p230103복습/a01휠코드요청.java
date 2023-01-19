package p230103복습;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
// 이벤트의 각 경우별로 la 출력문 전부 지정해줘야
public class a01휠코드요청 extends JFrame { 							// 클래스명
private JLabel la = new JLabel("No Mouse Event"); 
	
	public a01휠코드요청() {                                          // 생성자
		setTitle("MouseListener와 MouseMotionListener 예제");	// 기본세팅
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		MyMouseListener listener = new MyMouseListener();	// 리스너생성, 부착
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener); 

		c.add(la);											// 기본세팅

		setSize(300,200);									// 기본세팅
		setVisible(true);
	}
	class MyMouseListener implements MouseListener, MouseMotionListener {	// 리스너 클래스
	public void mousePressed(MouseEvent e) {								// 이벤트1
			if(e.getButton() == MouseEvent.BUTTON1){    				// 좌클릭
				la.setText("왼쪽버튼 ("+e.getX()+", "+e.getY ()+")");
	} else {															// 우클릭
				la.setText("오른쪽 버튼 ("+e.getX()+", "+e.getY ()+")");
			}
		}
		public void mouseReleased(MouseEvent e) {   						// 이벤트2
			la.setText("MouseReleased("+e.getX()+", "+e.getY()+")"); 		}
		public void mouseClicked(MouseEvent e) {}							// 이벤트3
		public void mouseEntered(MouseEvent e) {							// 이벤트4
		Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {								// 이벤트5
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		public void mouseDragged(MouseEvent e) {  							// 이벤트6
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
		}
		public void mouseMoved(MouseEvent e) {    							// 이벤트7
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a01휠코드요청();
	}

}