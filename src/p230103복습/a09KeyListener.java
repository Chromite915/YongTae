package p230103복습;
//숫자가 아닌것을 입력하면 경고문

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class a09KeyListener extends JFrame {
	public a09KeyListener() {
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JToolBar tBar = new JToolBar();
		tBar.add(new JLabel("학번 : "));
		JTextField tf = new JTextField(8);
		tf.addKeyListener(new MyKeyListener());
		tBar.add(tf);
		c.add(tBar, BorderLayout.SOUTH); 
		
		setSize(400,300);
		setVisible(true);
	}
	
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent e) {
			if(e.getKeyChar() < '0' || e.getKeyChar() > '9') { // 0~9 사이만 허용
				String k = Character.toString(e.getKeyChar());
				k = k.concat("는 숫자 키가 아닙니다. \r\n숫자를 입력하세요."); // concat = 글자 이어붙이기, k에 이어붙이겠다는 뜻
				JOptionPane.showMessageDialog(null, k, "경고", JOptionPane.ERROR_MESSAGE);
				e.consume(); 
			}
		}
	}

	static public void main(String[] arg) {
		new a09KeyListener();
	}
}