package p1230스레드ㄱ;
// 다이얼로그로 팔레트 호출하여 직접 색 결정
// 이거랑 그리기 챕터를 결합하면 그림판도 제작 가능

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class a03Color다이얼로그 extends JFrame {
	private JLabel label = new JLabel("Hello");

	public a03Color다이얼로그() {
		setTitle("JColorChooser 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250,200);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem colorMenuItem = new JMenuItem("Color");
		JMenu fileMenu = new JMenu("Text");
		
		colorMenuItem.addActionListener(new MenuActionListener());
		fileMenu.add(colorMenuItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("Color")) {
				Color selectedColor = JColorChooser.showDialog(null, "Color", Color.YELLOW); // 최초값
				if(selectedColor != null) // 색을 선택했다면
					label.setForeground(selectedColor); // 글씨 색을 선택한 색으로 변경(포그라운드 = 글자)
			}
		}
	}

	public static void main(String [] args) {
		new a03Color다이얼로그();
	}
}