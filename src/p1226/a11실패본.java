package p1226;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 라벨에 마우스 커서 위이동시 up 출력, 아래로 이동시 down 출력

public class a11실패본 extends JFrame{
	
	public a11실패본() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JLabel label = new JLabel("UpDown"); 
		label.addMouseListener(new MyMouseAdapter());
		label.setSize(200, 50);
		c.add(label);
		setSize(400,200);
		setVisible(true);
		c.setFocusable(true);  
		c.requestFocus();
	}
	class MyMouseAdapter extends MouseAdapter{ 	 // 마우스
		
		public void mouseEntered(MouseEvent e) { // 커서
			JLabel l = (JLabel)e.getSource();
			l.setText("Up");
			}
		public void mouseExited(MouseEvent e) {  // 커서
			JLabel l = (JLabel)e.getSource();
			l.setText("Down");
			}
		}
	class MyKeyListener extends KeyAdapter {  // 키보드 입력
		public void keyPressed(KeyEvent e) {
			JLabel l = (JLabel)e.getSource();
			if(KeyEvent.VK_ENTER == e.getKeyCode()) { // 엔터 미완
				l.setText("Enter");
			} else if(KeyEvent.VK_LEFT == e.getKeyCode()) { // 왼쪽 미완
				// subString
			} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) { // 오른쪽 미완
				// SubString
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a11실패본();
	}

}
