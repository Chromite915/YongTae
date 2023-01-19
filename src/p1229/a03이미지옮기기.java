package p1229;

import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class a03이미지옮기기 extends JFrame {
	
	public a03이미지옮기기(){
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		// 이미지 생성
		ImageIcon icon = new ImageIcon("images/apple.jpg");
		// 라벨 생성
		JLabel imageLabel = new JLabel(icon); 
		
		// 라벨 선언
		imageLabel.setSize(icon.getIconHeight(), icon.getIconWidth()); 
		// 라벨 크기 = 이미지 크기
		imageLabel.setLocation(100,100);
		
		//리스너 선언
		MyMouseListener ml = new MyMouseListener();
		imageLabel.addMouseListener(ml);
		imageLabel.addMouseMotionListener(ml);

		c.add(imageLabel); 
		setSize(300,300);
		setVisible(true);
	}
	
	// 이벤트단계
	class MyMouseListener extends MouseAdapter {
		private Point startP = null; 
		
		@Override
		public void mousePressed(MouseEvent e) {
			startP = e.getPoint();
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Point endP = e.getPoint();
			JLabel la = (JLabel)(e.getSource());
			Point p = la.getLocation();
			// la.setLocation(endP.x , endP.y);
			// 안좋은 예시
			la.setLocation(p.x + endP.x - startP.x, p.y + endP.y - startP.y);
			//             현재 + (릴리즈위치 - 클릭위치) = 이동 후 위치
			// 어디를 클릭해도 자연스럽게 이동 가능
			repaint(); 
		}	
	}
	
	static public void main(String[] args) {
		new a03이미지옮기기();
	}
}