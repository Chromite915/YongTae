package p230102복습;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class a08답안 extends JFrame {
	private JLabel la = new JLabel(); // 빈 레이블 컴포넌트 생성
	
	public a08답안() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());     // c에 리스너 부착
		c.add(la);                                 // c에 라벨 부착
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);                      // c에 포커스 부착
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {       // 부착한 리스너에 대해서
		public void keyPressed(KeyEvent e) {       // 리스너의 종류 결정
			Container contentPane = (Container)e.getSource(); // 이벤트에 사용할 Container를 정의하고 KeyEvent의 소스를 가져옴
			
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+"키가 입력되었음");   // 여기 자세히 보기
			// la에 들어갈 text = 키 이벤트 / 키 텍스트 / 키 코드 / get /  + "입력되었음"

			if(e.getKeyChar() == '%') 
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String [] args) {
		new a08답안();
	}
}