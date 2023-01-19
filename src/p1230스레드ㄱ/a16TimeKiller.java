package p1230스레드ㄱ;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// a13에서 내용 추가

class TimerRunnable1 implements Runnable { 
	private JLabel timerLabel;
	
	public TimerRunnable1(JLabel timerLabel) { 
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); 			// 1초마다 증가
			}
			catch(InterruptedException e) {
				return;							// 예외 발생시 스레드 종료
			}
		}
	}
}
public class a16TimeKiller extends JFrame {
	public a16TimeKiller() {
		setTitle("Thread를 상속받은 타이머 스레드 예쩨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel(); // 라벨 생성
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable1 runnable = new TimerRunnable1(timerLabel);
		Thread th = new Thread(runnable);
		c.add(timerLabel); // 라벨 컨테이너에 부착
		
		// 버튼을 생성하고 Action 리스너 등록
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	// 버튼 누르면
				// TODO Auto-generated method stub
				th.interrupt(); 						// 타이머 스레드 강제종료
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); 					// 버튼 비활성화
			}
		});
		c.add(btn);
		setSize(300, 170);
		setVisible(true);
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a16TimeKiller();

	}

}