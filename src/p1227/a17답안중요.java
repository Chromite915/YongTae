package p1227;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class a17답안중요 extends JFrame {
	private JButton testButton = new JButton("test button");
	JCheckBox enabledButton = new JCheckBox("버튼 비활성화");
	JCheckBox invisibleButton = new JCheckBox("버튼 감추기");
	public a17답안중요() {
		setTitle("체크박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(enabledButton);
		c.add(invisibleButton);
		c.add(testButton);
		
		enabledButton.addItemListener(new MyItemListener());
		invisibleButton.addItemListener(new MyItemListener());
		// [[[이것들을 추가해줘야 밑에서 이벤트를 발생시킬 수 있다]]]
		
		setSize(300,150);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			JCheckBox cb = (JCheckBox)e.getSource();
			if(cb.isSelected()==true) {
				if(e.getItem() == enabledButton) {
					testButton.setEnabled(false);
				} else if(e.getItem() == invisibleButton){
					testButton.setVisible(false);
				}
			} else {
				if(e.getItem() == enabledButton) {
					testButton.setEnabled(true);
				} else if(e.getItem() == invisibleButton){
					testButton.setVisible(true);
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		new a17답안중요();
	}
}

