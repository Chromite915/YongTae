package p230104;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class a10답안 extends JFrame {
	public a10답안() {
		super("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImagePanel p = new ImagePanel();
		setContentPane(p);
		
		setSize(400, 400);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus(); 
	}
	
	class ImagePanel extends JPanel {
		private Image img =null; 
		private int clipX=0, clipY=0; 
		
		public ImagePanel() {
			img = new ImageIcon("images/image.jpg").getImage(); 
			this.addKeyListener(new MyKeyListener()); 
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(clipX, clipY, 100, 100); 
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this); 
		}
		
		class MyKeyListener extends KeyAdapter {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					clipY -=10;
					if(clipY < 0) 
						clipY = 0;
				} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					if(!(clipY > getHeight()-100))				// 화면밖으로 벗어나지 않게
						clipY += 10; 
				} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					clipX -=10;
					if(clipX < 0) 
						clipX = 0;
				} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					
					if(!(clipX> getWidth()-100)) 
						clipX += 10;
				}
				
				repaint(); 
			}
		}
	}
	public static void main(String[] args) {
		new a10답안();
	}
}