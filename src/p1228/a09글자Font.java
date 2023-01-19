package p1228;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import p1228.a08draw글자.MyPanel;

public class a09글자Font extends JFrame {
	private MyPanel panel = new MyPanel();
	public a09글자Font() {
		setTitle("JPanle의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(600, 600);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("Java if Fun", 30, 30); // 30, 30의 위치에 String을 Draw
			g.setColor(new Color(255, 0, 0));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("So Fun", 30, 60);
			g.setColor(new Color(0x00ff00ff));
			for(int i=1; i<=5; i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("Priest... Live!!", 30, 60+i*60);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a09글자Font();

	}

}
