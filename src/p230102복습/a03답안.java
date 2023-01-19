package p230102복습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class a03답안 extends JFrame{
	JTextField text;
	
	public a03답안(){
		setTitle("계산기 프레임");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		panel1.setBackground(Color.LIGHT_GRAY);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel3.setBackground(Color.CYAN);
		c.add(panel1, BorderLayout.NORTH);
		c.add(panel2, BorderLayout.SOUTH);
		c.add(panel3, BorderLayout.CENTER);
		
		panel1.add(new JLabel("입력 : "));
		text = new JTextField(10);
		panel1.add(text);
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel2.add(new JLabel("하단 Panel"));
		
		panel3.setLayout(new GridLayout(3,3,5,5));
		
		JButton[] btnArray = new JButton[9];
		
		for(int i=0; i<9; i++) {
			btnArray[i] = new JButton(Integer.toString(i+1));
			btnArray[i].addActionListener(new MyActionListener());
			panel3.add(btnArray[i]);
		}
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {
		String num = "";
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			num = text.getText() + e.getActionCommand();
			text.setText(num);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a03답안();
	}
}
