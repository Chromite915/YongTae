package p1222스윙ㄱ;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

// 무명 클래스

public class a09AnonymousClassListener extends JFrame {
	public a09AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout());             // Flow
		JButton btn = new JButton("Action"); // btn이 밑의 이벤트를 갖는다
		c.add(btn);
		
		btn.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) { // [[[a08 클래스의 main부분 내용과 같으나, 여기서는 사용처와 목표가 btn 단 하나뿐이라 클래스명 없이 위쪽으로 포함시켰다]]]
				JButton b = (JButton)e.getSource(); 
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				setTitle(b.getText()); // 버튼뿐 아니라 Title도 바뀜
			}
		}); // [[[a08 클래스의 main부분 내용과 같으나, 여기서는 사용처와 목표가 btn 단 하나뿐이라 클래스명 없이 위쪽으로 포함시켰다]]]
		setSize(30, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a09AnonymousClassListener();

	}

}
