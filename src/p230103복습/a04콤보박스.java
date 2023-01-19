package p230103복습;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class a04콤보박스 extends JFrame {
	private String [] fruits = {"apple", "banana", "kiwi", "mango", "pear",
			"peach", "berry", "strawberry", "blackberry"};
	private String [] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
	
	public a04콤보박스() {
		setTitle("콤보박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<String>();
		for(int i=0; i<names.length; i++)
			nameCombo.addItem(names[i]);
		c.add(nameCombo);
		
		setVisible(true);
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a04콤보박스();

	}

}
