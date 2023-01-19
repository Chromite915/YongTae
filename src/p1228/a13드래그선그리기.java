package p1228;
// 드래그로 그림 선 그리기
// repaint : 새로운 선을 그릴때마다, 기존 상태에 새로 그린 선만 추가하는게 아니라, 새로 그린 선까지 포함한 전체 내용을 다시 그리는 방식이다.
// vector를 쓴 이유 : 
// 코드 이해하기
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

import p1228.a13드래그선그리기.MyPanel;

public class a13드래그선그리기 extends JFrame {
	private MyPanel panel = new MyPanel();
	public a13드래그선그리기() {
		setTitle("원본크기로 원하는 위치에 이미지 그리기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 420);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();
		public MyPanel() {
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
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
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.BLUE);
				for(int i=0; i<vStart.size(); i++) {
					Point s = vStart.elementAt(i);
					Point e = vEnd.elementAt(i);
					g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
				}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a13드래그선그리기();
	}
}