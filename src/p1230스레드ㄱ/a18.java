package p1230스레드ㄱ;
// 실행 후 클릭시 동그라미가 랜덤한 위치로 계속 이동

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class a18 extends JFrame {
	public a18() {
		super("클릭시 원을 0.5초 간격으로 랜덤한 위치로 이동시키는 스레드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new CirclePanel());
		setSize(250,250);
		setVisible(true);
	}
	
	class CirclePanel extends JPanel implements Runnable {
		private int x = 100; 
		private int y = 100;
		
		public CirclePanel() {
			this.addMouseListener(new MouseAdapter() {
				private Thread th = null;
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(th == null) { // 스레드가 아직 만들어지지 않았을 때만 스레드 생성
						th = new Thread(CirclePanel.this);
						th.start();
					}
				}
			});
			
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			g.drawOval(x, y, 50, 50); // (x, y)에서 50x50 크기 원
		}
		
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) { return; }
				
				x = (int)(Math.random()*this.getWidth()); 
				y = (int)(Math.random()*this.getHeight());
				repaint();
			}
		}		
	}
	
	public static void main(String[] args) {
		new a18();
	}
}