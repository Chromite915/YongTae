package p1226;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex1 extends JFrame{
	Ex1(){
		setTitle("마우스 올리기"); // 제목 지정
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("내려갔다~~");
		label.addMouseListener(new MyMouseAdapter());
		label.setSize(200,50);
		
		label.addKeyListener(new MyKeyListener());
		add(label);
		label.setFocusable(true);
		setSize(400,200);
		setVisible(true);
		
	}
	class MyMouseAdapter extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {
			JLabel l = (JLabel)e.getSource();
			l.setText("올라왔다~~");
		}
		public void mouseExited(MouseEvent e) {
			JLabel l = (JLabel)e.getSource();
			l.setText("내려갔다~~");
		}
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			JLabel l = (JLabel)e.getSource();
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				l.setText("엔터 눌렀다~~");
			}
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex1();
	}

}
