package p1227;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class a11JComponentEx extends JFrame {
	public a11JComponentEx() {
		super("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("    Disabled Button    ");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW); // 배경색 설정
		b1.setForeground(Color.MAGENTA); // 글자색 설정
		b1.setFont(new Font("Arial", Font.ITALIC, 20)); // Arial, 20픽셀 폰트 설정
		b2.setEnabled(false); // 버튼 비활성화
		// b2.setVisible(false); 버튼을 아예 없애버림
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // ActionPerformed를 오버라이딩
				JButton b = (JButton)e.getSource();
				a11JComponentEx frame = (a11JComponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY()); // 타이틀에 버튼 좌표 출력
			}
		});
		
		JTextField jt = new JTextField("test", 10); // test를 넣고서도 10자리가 더 큰 공간이라는 뜻
		JTextField jt2 = new JPasswordField("test", 10);
		jt.setEditable(false); // 입력 불가능하도록
		c.add(jt);
		c.add(jt2);
		c.add(b1); 
		c.add(b2); 
		c.add(b3); // 컨텐트팬에 버튼 부착
		
		setSize(260,200); 
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new a11JComponentEx();
	}
}