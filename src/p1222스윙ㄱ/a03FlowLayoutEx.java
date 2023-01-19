package p1222스윙ㄱ;
/* 컨테이너의 크기를 조정하면 컴포넌트(버튼)도 자동으로 재배치됨
 * 
 */
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class a03FlowLayoutEx extends JFrame{
	public a03FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료시 완전 종료
		
		Container c = getContentPane(); // 컨테이너 체계 불러와 c랑 연결
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // flow 좌측 정렬(아무것도 안쓰면 중앙), 컴포넌트 간격 30, 40 늘리기
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		// add를 오른쪽부터 체우면서 추가진입한 객체들에게 왼쪽으로 밀려나는 방식
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a03FlowLayoutEx();
		// a01 창도 같이 띄울 수 있으나, 둘중 하나만 꺼도 같이 꺼지네?

	}

}
