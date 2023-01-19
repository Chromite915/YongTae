package p1222스윙ㄱ;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//배치관리자가 없는 컨테이너(위치 마음대로)

public class a06NullContainerEx extends JFrame {
	public a06NullContainerEx() { 
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); 
		c.setLayout(null);             // null
		
		JLabel la = new JLabel("Hello, Press Buttons!"); // 라벨
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));  // 버튼, 인티저
			b.setLocation(i*15, i*15); // 버튼을 계단형식으로 9개 배열
			b.setSize(50, 20); // 버튼의 크기
			c.add(b); // 버튼을 컨텐트팬에 부착
		}
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a06NullContainerEx();
		

	}

}
