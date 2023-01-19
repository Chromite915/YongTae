package p1223;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// p1222 a08의 응용의 응용
// 안쪽으로 옮겼음

public class a01InnerClass extends JFrame {
	public a01InnerClass() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout());             // Flow
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new MyActionListener()); // 밑에서 정의한 MyActionListener 객체를 실행하겠다
		
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
		
	}
	private class MyActionListener implements ActionListener { // ActionListener를 상속받음, implements 가 뭐냐?
		public void actionPerformed(ActionEvent e) { // 클릭하는 순간 클릭에 대한 이벤트 객체가 e로 들어온다, 스페이스바 눌러도 작동하는 이유? JButton이라
			JButton b = (JButton)e.getSource(); //그 중 얻고싶은 정보가 버튼이라면
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			// InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
			a01InnerClass.this.setTitle(b.getText()); // [[[innerclass]]]   프레임 타이틀에 버튼 문자열 출력
			// Main 아래의 내용을 여기로 올리고, 막줄 추가함
			// 밖에서는 setTitle로의 접근이 어려웠는데, 이렇게 안쪽으로 옮기면 접근 가능.
			// 어떤 setTitle에 접근할지 명확히 해주는것
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a01InnerClass();
	}
}
