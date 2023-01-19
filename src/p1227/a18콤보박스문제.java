package p1227;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//ComboBox - 엔터치면 내용 옆에 누적되도록 하기
public class a18콤보박스문제 extends JFrame {
	private JTextField tf = new JTextField(10);
	private JComboBox<String> strCombo = new JComboBox<String>();
	
	public a18콤보박스문제() {
		setTitle("입력값 ComboBox에 넣기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(tf);
		c.add(strCombo);
		
		setSize(300, 250);
		setVisible(true);
		
		tf.addActionListener(new MyActionListener());
	}
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource();
			strCombo.addItem(t.getText());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a18콤보박스문제();

	}

}