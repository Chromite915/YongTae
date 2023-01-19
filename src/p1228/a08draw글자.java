package p1228;
// 폰카 설명 참조
// 레이아웃 없음, 패널이 전체를 차지하고있다
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class a08draw글자 extends JFrame {
	private MyPanel panel = new MyPanel();
	public a08draw글자() {
		setTitle("JPanle의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 220);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("Java if Fun", 30, 30); // 30, 30의 위치에 String을 Draw
			g.setColor(Color.RED);
			g.drawString("So Fun", 60, 60);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a08draw글자();

	}

}
