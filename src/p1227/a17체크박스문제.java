package p1227;
//버튼 만들고, 비활성화 체크, 감추기 체크
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import p1227.a17답안중요.MyItemListener;

public class a17체크박스문제 extends JFrame {
	JCheckBox c1 = new JCheckBox("btn Disable");
	JCheckBox c2 = new JCheckBox("btn InVisible");
	JButton btn = new JButton("Test Button");
	
	public a17체크박스문제() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(c1);
		c.add(c2);
		c.add(btn);
		
		c1.addItemListener(new MyItemListener());
		c2.addItemListener(new MyItemListener());
		// [[[이것들을 추가해줘야 밑에서 이벤트를 발생시킬 수 있다]]]
		
		setSize(250, 200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == c1)
					btn.setEnabled(false);
				if(e.getItem() == c2)
					btn.setVisible(false);
			} else {
				if(e.getItem() == c1) {
					btn.setEnabled(true);
				} else if(e.getItem() == c2){
					btn.setVisible(true);
				}
			}	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a17체크박스문제();

	}

}
