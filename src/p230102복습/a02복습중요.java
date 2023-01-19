package p230102복습;
/*한 클래스에 여러 종류의 레이아웃 사용
 * 컨테이너도, 패널도 다 다른 레이아웃을 설정할 수 있다
 * 패널은 컴포넌트이자 자체적인 배치관리자를 가진 컨테이너가 될 수 있다
 * 컨테이너 - 패널 - 라벨, 버튼
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class a02복습중요 extends JFrame {
	JTextField text = null;
	JTextField text2 = null;
	
	public a02복습중요() {
		setTitle("복습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // 컨테이너 => Border
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		// c.setLayout(new BorderLayout()); JFrame의 디폴트가 Border라서 생략 가능
		
		panel1.setLayout(new FlowLayout(FlowLayout.RIGHT)); // 패널1 => 보더 속의 플로우
		panel1.add(new JLabel("상단"));                      // 플로우의 (우측)
		text = new JTextField(10); // 동일
		panel1.add(text);
		
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));  // 패널2 => 보더 속의 플로우
		panel2.add(new JLabel("하단"));                      // 플로우의 (좌측)
		text2 = new JTextField(10); // 동일
		panel2.add(text2);
		
		
		panel1.setBackground(Color.LIGHT_GRAY);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel3.setLayout(new GridLayout(3,3, 5,5));         // 패널3 => 보더 속의 그리드
		
		c.add(panel1, BorderLayout.NORTH);      // 컨테이너(보더)에 패널1을 NORTH위치로 배치
		c.add(panel2, BorderLayout.SOUTH);      // 동일
		c.add(panel3, BorderLayout.CENTER);     // 동일
		
		JButton[] bArray = new JButton[9];                 // 버튼에 b 부여(이후에 이벤트기능 추가하기 위해 JButton 수준으로 놔두지 않는다)
		for(int i=0; i<9; i++) {
			bArray[i] = new JButton(Integer.toString(i+1));
			bArray[i].addActionListener(new ActionListener() {
				String num = "";
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// System.out.println(e.getActionCommand());
					num = text.getText() + e.getActionCommand();
					text.setText(num);
				}
			});
			panel3.add(bArray[i]);
		}
		setSize(1000,500); // 내 마음대로. 아예 이 줄을 안 쓸 수도 있음.
		setVisible(true);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a02복습중요();

	}

}