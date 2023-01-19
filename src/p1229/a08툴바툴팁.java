package p1229;
//배운것들을 툴바 안에 차곡차곡 넣는다
// 그래그로 수엄ㄹ물들 배열방식 변경 가능
import javax.swing.*;
import java.awt.*;

public class a08툴바툴팁 extends JFrame {
	private Container contentPane;
	
	public a08툴바툴팁() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setEnabled(true);
		m.setInitialDelay(1000);
		m.setDismissDelay(1000);
		setSize(400,200);
		setVisible(true);
	}
	
	private void createToolBar() {
		JToolBar toolBar = new JToolBar("Kitae Menu"); 
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		toolBar.setToolTipText("툴바 툴팁 테스트"); // LIGHT GRAY 부분에 대면 나온다
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("images/open.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/save.jpg")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.setToolTipText("콤보 툴팁 테스트"); // 콤보 부분에 대면 나온다
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
	
		contentPane.add(toolBar, BorderLayout.NORTH);
	}
	
	public static void main(String [] args) {
		new a08툴바툴팁();
	}
}