package p230104;
/* 방향키에 따라 이미지의 클리핑 부분이 이동
 * 클리핑의 좌표부분을 변수로 지정하고
 * 방향키 입력시의 이벤트 내용을 좌표변수 변경으로 지정한다
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class a10Clipping2 extends JFrame {
	private MyPanel panel = new MyPanel();
	private JLabel [] keyMessage;
	int x = keyMessage[0].getX();
	int y = keyMessage[0].getY();
	
	public a10Clipping2() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 420);
		setVisible(true);
		
		panel.addKeyListener(new MyKeyListener());
		panel.setFocusable(true);  
		panel.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			
			keyMessage[0].setText(Integer.toString(keyCode));
			/* keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode)); */
			
			    // [추가한 부분
			                                  // [[[[[[창의 좌측상단 꼭지가 0,0이다]]]]]]
			if(KeyEvent.VK_RIGHT == e.getKeyCode()) {
				keyMessage[0].setLocation(x + 15, y);
			} else if(KeyEvent.VK_LEFT == e.getKeyCode()) {
				keyMessage[0].setLocation(x - 15, y);
			} else if(KeyEvent.VK_UP == e.getKeyCode()) {
				keyMessage[0].setLocation(x, y - 15);      // y축은 좌표값이 +일수록 위치가 하강한다
			} else if(KeyEvent.VK_DOWN == e.getKeyCode()) {
				keyMessage[0].setLocation(x, y + 15);
			}   // 방향키 누를때마다 설정한 x,y 수치만큼 이동
			    // 추가한 부분]
		}
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image.jpg");
		private Image img = icon.getImage(); // 이미지 객체
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(x, y, 150, 150);			// 좌표, 좌표, 크기, 크기
			// g.clipRect(80, 20, 140, 130);
			// setClip줄이 있고, clipRect줄도 있으면, 둘의 [[[교집합]]] 부분만 출력됨
			
			g.drawImage(img,  0,  0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a10Clipping2();
	}
}