package p230103복습;

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
	private JLabel imgLabel = new JLabel(); 		//빈 이미지를 가진 라벨
	
	public a07cmd이미지onoff() {						//생성자
		setTitle("Menu");
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		
		createMenu();								//메소드
		
		setSize(250,220); 
		setVisible(true);
	}
	
	private void createMenu() { 									//메소드 호출
		JMenuBar mb = new JMenuBar(); 								//1 메뉴바 선언
		JMenu screenMenu = new JMenu("Screen");						//2 메뉴 선언
		JMenuItem [] menuItem = new JMenuItem [4];					//3 매뉴 아이템 선언
		String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};	//4 매뉴 아이템용 이름 선언
		
		MenuActionListener listener = new MenuActionListener(); 	//리스너1
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]); 				//메뉴 아이템에 이름 합체
			menuItem[i].addActionListener(listener); 				//리스너 선언
			screenMenu.add(menuItem[i]); 							//출력
		}
		mb.add(screenMenu); 										//출력
		setJMenuBar(mb); 											//출력
	}
	
	class MenuActionListener implements ActionListener { 			//리스너2
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();           // ????
			switch(cmd) { 
			case "Load" : 
				if(imgLabel.getIcon() != null) // 이미지가 로드된 상태라면 또 할 필요가 없어서
					return; 
				imgLabel.setIcon(new ImageIcon("images/apple.jpg")); 
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