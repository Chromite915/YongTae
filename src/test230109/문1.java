package test230109;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

// a12를 implements와 Runnable로 수정함

class TimerRunnable implements Runnable { 		// 2번, runnable을 상속받음
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) { 	// 3번, runnable을 상속받은 TimerRunnable
		this.timerLabel = timerLabel;			// this
	}
	
	@Override
	public void run() {							// 4번, [[[implements니까 부모의 run을 오버라이딩]]]
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			timerLabel.setForeground(new Color(r, b, g));
			n++;
			try {
				Thread.sleep(1000); // 1초마다 증가
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class 문1 extends JFrame {
	
	public 문1() {
		setTitle("Thread를 상속받은 타이머 스레드 예쩨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel frontLabel = new JLabel("실행 후 ");
		frontLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		JLabel backLabel = new JLabel(" 초 경과");
		backLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		JLabel timerLabel = new JLabel(); // 라벨 생성
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		c.add(frontLabel);
		c.add(timerLabel); // 라벨 컨테이너에 부착
		c.add(backLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);		// 1번
		Thread th = new Thread(runnable);							// 러너블을 임플리먼트 한 객체를 스레드 만들때 넣어줌
		
		setSize(700, 200);
		setVisible(true);
		
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문1();

	}

}
