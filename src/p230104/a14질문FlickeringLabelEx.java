package p230104;
// 디버깅으로 반드시 확인할것
// 총 3개 스레드 사용중(깜빡 2개, 메인 1개)
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable { // extends와 runnable의 차이점은?
	private long delay;
	public FlickeringLabel(String text, long Delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);			// this의 의미
		th.start();
	}
	@Override
	public void run() {
		int n=0;
		while(true){
			if(n == 0)
				setBackground(Color.YELLOW);	// 0이면 노랑
			else
				setBackground(Color.GREEN);		// 0이 아니면 초록
			if(n == 0) {						// 0이면 1로 바꾼다
				n = 1;
			}
			else n = 0;							// 1이면 0으로 바꾼다
			try {
				Thread.sleep(delay);			// delay만큼 기다린다
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class a14질문FlickeringLabelEx extends JFrame{
	public a14질문FlickeringLabelEx() {
		setTitle("예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 깜빡이는 레이블 생성
		FlickeringLabel fLabel = new FlickeringLabel("깜빡", 500); // 0.5초마다
		
		// 안깜빡
		JLabel label = new JLabel("안깜빡"); // 맨 위에 super(text)가 이 부분을 의미
		
		// 깜빡
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜빡", 300); // 0.3초마다
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a14질문FlickeringLabelEx();

	}

}
