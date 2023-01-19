package p1230스레드ㄱ;
// 여러 패널을 겹치게하여 공간을 공유하도록 지원하는 팬
// ex) 탭1, 탭2, 탭3
/*¨탭팬에 붙은 탭의 개수

¤int getTabCount() - 탭팬에 붙은 탭의 개수 리턴

¨현재 선택된 탭

¤int getSelectedIndex()

¤Component getSelectedComponent()

¨탭 삭제

¤void remove(Component comp)

¤void remove(int index)

¤void removeTabAt(int index) */
import javax.swing.*;
import java.awt.*;

public class a04JTabbedPane extends JFrame {
	public a04JTabbedPane() {
		setTitle("탭팬 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JTabbedPane pane = createTabbedPane();
		c.add(pane, BorderLayout.CENTER); 
		setSize(250,250);
		setVisible(true);
	}
	
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane(); 
		pane.addTab("Tab1", new JLabel(new ImageIcon("images/img1.jpg")));
		pane.addTab("Tab2", new JLabel(new ImageIcon("images/img2.jpg")));
		pane.addTab("Tab3", new MyPanel()); // Tab3인 MyPanel의 내용물은 밑에 MyPanel 클래스에서 정의
		return pane;
	}
	
	class MyPanel extends JPanel {
		public MyPanel() {
			this.setBackground(Color.YELLOW);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillRect(10, 70, 50, 50);
			g.setColor(Color.BLACK);
			g.fillRect(10, 130, 50, 50);
		}
	}

	public static void main(String [] args) {
		new a04JTabbedPane();
	}
}