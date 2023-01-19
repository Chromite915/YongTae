package p1230스레드ㄱ;
// 컨테이너도 없이 라벨을 어떻게 띄웠을까?
// 라벨은 메인메소드의 컨테이너로 만들었고, TimerThread클래스의 라벨은 그것을 계승했을 뿐이라네
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread { 			// Thread는 run메소드 오버라이딩 해야
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) { // 같은 레퍼런스를 바라보고있는 timerLabel(위치는 여기지만 메인에 속해있다)
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
public class a12ThreadTimerEx extends JFrame {
	public a12ThreadTimerEx() {
		setTitle("Thread를 상속받은 타이머 스레드 예쩨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel(); // 라벨 생성
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); // 라벨 컨테이너에 부착
		
		TimerThread th = new TimerThread(timerLabel); // 타이머스레드로 객체 생성하면서 timerLabel의 레퍼런스를 보내주고있다
		
		setSize(300, 170);
		setVisible(true);
		
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a12ThreadTimerEx();

	}

}
