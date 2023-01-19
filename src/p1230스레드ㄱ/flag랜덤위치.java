package p1230스레드ㄱ;

import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 스레드가 작동하면 프레임 안에서 글자가 랜덤한 위치에 계속 누적됨.
// 마우스 클릭시 스레드가 종료되고, 클릭한 위치에 "finish 문자를 출력하라.
// 1230 - a18과 비교해보기

class RandomThread extends Thread {
	private Container contentPane;
	private Point p;
	private boolean flag = false;		// 스레드의 종료 명령을 표시하는 플래그. true = 종료 지시
	
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	public void finish(Point p) {			// 스레드 종료 명령을 flag에 표시
		flag = true;
		this.p = p;
	}
	
	@Override
	public void run() {
		while(true) {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("Java");
			label.setSize(80, 30);
			label.setLocation(x, y);
			contentPane.add(label);				// 라벨을 부착
			contentPane.repaint();				// 팬을 다시 그려 추가된 라벨이 보이게 함
			try {
				Thread.sleep(300);		// 0.3초동안 잠을 잔다
				if(flag == true) {		// 클릭을 할때 flag가 true가 된다
					contentPane.removeAll();	// 판의 모든 라벨 제거
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(this.p.x, this.p.y);
					label.setForeground(Color.RED);
					contentPane.add(label);			// finish라벨 부착
					contentPane.repaint();			// 다시 그려서 추가된 라벨이 보이게함
					return;					// 스레드 종료
				}
			}
			catch(InterruptedException e) {return; }
			
		}
	}
	
}

public class flag랜덤위치 extends JFrame {
	private RandomThread th;				// 스레드 레퍼런스
	
	public flag랜덤위치() {
		super("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				th.finish(e.getPoint());
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);		// 스레드 생성
		th.start();						// 스레드 동작시킴
	}
	
	public static void main(String[] args) {
		new flag랜덤위치();
	}
}