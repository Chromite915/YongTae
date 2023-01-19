package p1230스레드ㄱ;

import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.event.*;
import java.awt.*;
// 경로 직접입력이 아닌, 직접 경로 조종
public class a02경로활용 extends JFrame {
	private JLabel imageLabel = new JLabel();
	
	public a02경로활용() {
		setTitle("Menu와 JFileChooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(imageLabel);
		createMenu();
		setSize(350,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		
		openItem.addActionListener(new OpenActionListener());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	
	
	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;
		
		public OpenActionListener() {
			chooser = new JFileChooser(); 
		}
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter(   // jpg, gif만 불러오도록 하는 필터
					"JPG & GIF Images", 
					"jpg", "gif");

			chooser.setFileFilter(filter); 
			int ret = chooser.showOpenDialog(null);  // ()는 부모컴포넌트를 받는 자리이나, 여기선 받지 않기띠ㅐ문에 null
			if(ret != JFileChooser.APPROVE_OPTION) { // 파일을 선택하지 않았을때
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", 
									"경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String filePath = chooser.getSelectedFile().getPath(); // path를 선택할 수 있다
			imageLabel.setIcon(new ImageIcon(filePath)); 
			pack(); 
		}
	}
	public static void main(String [] args) {
		new a02경로활용();
	}
}