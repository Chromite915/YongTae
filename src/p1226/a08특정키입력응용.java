package p1226;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

// F1키 누르면 "F1키가 입력되었음"
// 5키 누르면 "5키가 입력되었음"(색 유지)
// %키를 누르면 배경 노란색으로 변경. 출력 문자는 그대로 유지


public class a08특정키입력응용 extends JFrame {
	private JLabel la = new JLabel(); 
	
	public a08특정키입력응용() {
		setTitle("key Code 예제 : F1키:초록색, %키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);  
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			
			if(e.getKeyChar() == '%')
				getContentPane().setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				getContentPane().setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a08특정키입력응용();

	}

}
