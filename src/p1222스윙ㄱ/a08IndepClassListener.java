package p1222스윙ㄱ;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

// 버튼 클릭하면 이름 변경

public class a08IndepClassListener extends JFrame {
	public a08IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout());             // Flow
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new MyActionListener()); // 밑에서 정의한 myactionlistener 객체를 실행하겠다
		
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a08IndepClassListener();
			}
		}
class MyActionListener implements ActionListener { // ActionListener를 상속받음, implements 가 뭐냐?
	public void actionPerformed(ActionEvent e) { // 클릭하는 순간 클릭에 대한 이벤트 객체가 e로 들어온다, 스페이스바 눌러도 작동하는 이유? JButton이라
		JButton b = (JButton)e.getSource(); //그 중 얻고싶은 정보가 버튼이라면
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}
// 컴포넌트 = 액션 버튼
// 이벤트소스 = ActionEvent
// ActionEvent가 가진 이벤트객체 중 하나 = JButton
// JButton 이벤트 발동 조건 = 클릭 or 스페이스바
