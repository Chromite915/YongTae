package p1223;

// a07에서실행시 방향키 입력하면 라벨이 따라가도록

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class a09특정키입력시 extends JFrame {
	private JLabel [] keyMessage; 
	
	public a09특정키입력시() {
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel [1];
		keyMessage[0] = new JLabel(" getKeyCode() "); 
		/* keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() "); */
		
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]); 
			keyMessage[i].setOpaque(true); 
			keyMessage[i].setBackground(Color.YELLOW);
		}
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);  
		c.requestFocus();
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
			int x = keyMessage[0].getX();
			int y = keyMessage[0].getY();
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a09특정키입력시();

	}

}
