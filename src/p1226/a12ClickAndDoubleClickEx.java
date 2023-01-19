package p1226;
// 더블클릭시 컨테이너의 백그라운드색이 랜덤으로 바뀜

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class a12ClickAndDoubleClickEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");
	
	public a12ClickAndDoubleClickEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		setSize(300, 200);
		setVisible(true);
		
	}
	
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				Component c = (Component)e.getSource();
				c.setBackground(new Color(r, b, g));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a12ClickAndDoubleClickEx();

	}

}
