package p1230스레드ㄱ;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

// a12를 implements와 Runnable로 수정함

class TimerRunnable implements Runnable { 
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) { 
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
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
public class a13 extends JFrame {
	public a13() {
		setTitle("Thread를 상속받은 타이머 스레드 예쩨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel(); // 라벨 생성
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); // 라벨 컨테이너에 부착
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		
		setSize(300, 170);
		setVisible(true);
		
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a13();

	}

}
