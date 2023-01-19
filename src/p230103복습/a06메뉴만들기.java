package p230103복습;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

// 폰카 반드시 참조(순서 외우기)

	public class a06메뉴만들기 extends JFrame {
		public a06메뉴만들기() {
			setTitle("test");
			createMenu();
			setSize(250, 200);
			setVisible(true);
		}
		private void createMenu(){
			JMenuBar mb = new JMenuBar();
			JMenu screenMenu = new JMenu("Screen");
			
			screenMenu.add(new JMenuItem("Load"));
			screenMenu.add(new JMenuItem("Hide"));
			screenMenu.add(new JMenuItem("ReShow"));
			screenMenu.addSeparator();
			screenMenu.add(new JMenuItem("Exit"));
			
			mb.add(screenMenu);
			mb.add(new JMenu("Edit"));
			mb.add(new JMenu("Source"));
			mb.add(new JMenu("Project"));
			mb.add(new JMenu("Run"));
			
			setJMenuBar(mb);
			
			
			
		}
		static public void main(String[] args) {
			new a06메뉴만들기();
		}
	}