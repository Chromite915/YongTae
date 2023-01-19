package p1229;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class a04이미지확대축소 extends JFrame {
	public a04이미지확대축소(){
		super("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel()); // 컨텐츠판을 MyPanel로 지정
		setSize(300,300);
		setVisible(true);
		
		// 포커스
		getContentPane().setFocusable(true);
		getContentPane().requestFocus();
	}
	
	// 패널 생성
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/apple.jpg");		
		private Image img = icon.getImage();
		private int width, height;
		
		public MyPanel() {
			width = img.getWidth(this);
			height = img.getHeight(this);
			
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') { // 키캐릭터(유니코드)
						width = (int)(width*1.1);
						height = (int)(height*1.1);	
						repaint(); 
					}
					else if(e.getKeyChar() == '-') {
						width = (int)(width*0.9);
						height = (int)(height*0.9);
						repaint(); 				
					}
				}
			});
		}
		
		@Override
		public void paintComponent(Graphics g) { // 메소드임
			super.paintComponent(g);
			g.drawImage(img, 10, 10, width, height, this); // 원본크기로 출력
		}		
	}
	static public void main(String[] args) {
		new a04이미지확대축소();
	}
}
