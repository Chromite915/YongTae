package p1222스윙ㄱ;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class a02ContentPaneEx extends JFrame {
	public a02ContentPaneEx() {
		setTitle("ContentPaneEx과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // [[[중요]]]
		// 이 줄이 없으면 창을 끄더라도 백그라운드에서 실행중임(setVisible이 false상태)
		
		Container contentPane = getContentPane(); // Container의 정보를 알아와야, 그림그릴 요소의 위치를 알아야 시작할 수 있다
		contentPane.setBackground(Color.ORANGE); // 색
		contentPane.setLayout(new FlowLayout()); // 배치, 이 줄이 없으면 버튼들이 겹쳐서 나옴
		// setLayout을 SlowLayout 방식으로 했다는 뜻
		
		// contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		// 좌로 정렬, 컴포넌트 간격 30씩 늘리기
		
		// 버튼만 있고, 기능은 없는 상태
		// JButton b = new JButton("OK");
		// contentPane.add(new JButton("OK"));는 contentPane.add(b); 랑 똑같음
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a02ContentPaneEx();

	}

}

// 폰카 응용프로그램 종료
// main 종료 후에도 프레임은 살아있다
