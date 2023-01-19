package p1227;
// 액션리스너가 어떤식으로 작동하는지에 집중할것
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class a16ComboBox이미지매칭 extends JFrame {
	private String [] fruits = {"apple", "banna", "kiwi", "mango"};
	private ImageIcon [] images = {new ImageIcon("images/apple.jpg")
			, new ImageIcon("images/banana.jpg")
			, new ImageIcon("images/kiwi.jpg")
			, new ImageIcon("images/mango.jpg")};
	private JLabel imgLabel = new JLabel(images[0]);
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
	
	public a16ComboBox이미지매칭() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		strCombo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a16ComboBox이미지매칭();

	}

}
