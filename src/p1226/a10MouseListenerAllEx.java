package p1226;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class a10MouseListenerAllEx extends JFrame{
private JLabel la = new JLabel("No Mouse Event"); 
	
	public a10MouseListenerAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		MyMouseListener listener = 
				new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener); 

		c.add(la);

		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener, 		
		MouseMotionListener {
		public void mousePressed(MouseEvent e) {
			if(e.getButton() == MouseEvent.BUTTON1){    // 좌클릭, 우클릭 구별 표시
				la.setText("왼쪽버튼 ("+e.getX()+", "+e.getY ()+")");
			} else {
				la.setText("오른쪽 버튼 ("+e.getX()+", "+e.getY ()+")");
			}
		}
		public void mouseReleased(MouseEvent e) {   // 클릭상태, 해제상태
			la.setText("MouseReleased("+e.getX()+", "+e.getY()+")"); 		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
		Component c = (Component)e.getSource(); // getsource(마우스 올라가는 순간)
			c.setBackground(Color.CYAN);   // 마우스가 들어오느냐 나가느냐에 따라 색도 바뀜
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW); // 마우스가 들어오느냐 나가느냐에 따라 색도 바뀜
		}
		
		public void mouseDragged(MouseEvent e) {  // 드래그
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
		}
		public void mouseMoved(MouseEvent e) {    // 커서 이동
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a10MouseListenerAllEx();
	}

}
