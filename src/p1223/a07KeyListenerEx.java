package p1223;

// 실행시 키 입력하면 입력한 키에대한 정보로 변경출력
// 익명클래스 형식으로 바꿀줄도 알아야

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class a07KeyListenerEx extends JFrame {
	private JLabel [] keyMessage; // JLabel로 만들어진 객체들을 담는 배열
	
	public a07KeyListenerEx() {
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel [3];
		keyMessage[0] = new JLabel(" getKeyCode() "); // ()가 있다고 메소드가 아니다. [라벨의 제목] 이다
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]); // 만든 라벨을 컨테이너에 부착
			keyMessage[i].setOpaque(true); // 컴포넌트의 바탕색이 보이려면, 컴포넌트가 불투명하도록 지정되어야함
			keyMessage[i].setBackground(Color.YELLOW);
		}
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);                                 // [[[[[키보드로 입력을 하기위해 컨테이너c에 포커스를 맞춘것]]]]]
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) { // 입력한 키의 정보가 e에 들어감
			int keyCode = e.getKeyCode();    // java가 관리하는 키보드의 키 코드
			char keyChar = e.getKeyChar();   // 세계 공용유니코드
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode));
			
			// [추가한 부분
			if(KeyEvent.VK_A == e.getKeyCode()) {
				keyMessage[0].setBackground(Color.RED); 
			// 추가 안했을때와 다 같으나, A키 입렵시에만 0번째 칸이 붉은색으로 변하도록
			// 추가한 부분]
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a07KeyListenerEx();

	}

}
