package p1229;
/* 그림 위에 fill원 그리고, 드래그로 원 옮기기 */
//기존의 원이 남는 문제, 처음엔 원이 없는 문제, 드래그하면 도형 이동이 아니라 그리는 문제

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class a02도형옮기기 extends JFrame { // 프레임 클래스
	private MyPanel panel = new MyPanel();            // 패널 생성
	public a02도형옮기기() {
		setTitle("원본크기로 원하는 위치에 이미지 그리기 예제"); // 프레임 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); // 생성한 패널 프레임에 부착?
		setSize(300, 420); // 패널을 포함한 프레임의 크기
		setVisible(true);
	}
	class MyPanel extends JPanel { // 패널 클래스
		public MyPanel() {
			addMouseListener(new MouseAdapter(){          // 패널에 마우스리스너 추가
				public void mousePressed(MouseEvent e) { // 마우스리스너의 내용들
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint();
					vEnd.add(endP);
					repaint();
				}
			});
		}
		private Vector<Point> vStart = new Vector<Point>(); // 벡터1 생성
		private Vector<Point> vEnd = new Vector<Point>(); // 벡터2 생성
		private ImageIcon icon = new ImageIcon("images/back.jpg"); // 사용할 이미지 생성
		private Image img = icon.getImage(); // 생성한 이미지 객체화
		
		public void paintComponent(Graphics g) { // 패널에 페인트컴포 추가
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(),getHeight(), this); 
			g.setColor(Color.BLUE);
			g.fillOval(20, 20, 20, 20);
			for(int i=0; i<vStart.size(); i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				// g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
				// g.fillOval((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a02도형옮기기();
	}
}