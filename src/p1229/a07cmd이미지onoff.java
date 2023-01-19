package p1229;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
// load시 이미지 출력, hide시 숨김, reshow시 다시 출력(load로는 더이상 출력할 수 없음), exit시 종료

public class a07cmd이미지onoff extends JFrame {
	private JLabel imgLabel = new JLabel(); // 빈 이미지를 가진 레이블
	public a07cmd이미지onoff() {
		setTitle("Menu");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER); 
		setSize(250,220); 
		setVisible(true);
	}
	
	private void createMenu() { 
		JMenuBar mb = new JMenuBar(); 
		JMenuItem [] menuItem = new JMenuItem [4];
		String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		JMenu screenMenu = new JMenu("Screen");
		
		MenuActionListener listener = new MenuActionListener(); // 리스너는 각각 따로따로
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]); 
			menuItem[i].addActionListener(listener); 
			screenMenu.add(menuItem[i]); 
		}
		mb.add(screenMenu); 
		setJMenuBar(mb); 
	}
	
	class MenuActionListener implements ActionListener { 
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();           // ????
			switch(cmd) { 
			case "Load" : 
				if(imgLabel.getIcon() != null) // 이미지가 로드된 상태라면 또 할 필요가 없어서
					return; 
				imgLabel.setIcon(new ImageIcon("images/img.jpg")); 
				break;
			case "Hide" :		
				imgLabel.setVisible(false); 
				break;
			case "ReShow" : 
				imgLabel.setVisible(true); 
				break;
			case "Exit" : 
				System.exit(0); 
				break;
			}
		}
	}
	public static void main(String [] args) {
		new a07cmd이미지onoff();
	}
}