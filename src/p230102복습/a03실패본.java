package p230102복습;
/* a02를 익명클래스로*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class a03실패본 extends JFrame {
	JTextField text = null;
	JTextField text2 = null;
	
	public a03실패본() {
		setTitle("복습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); 
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		// c.setLayout(new BorderLayout()); JFrame의 디폴트가 Border라서 생략 가능
		
		panel1.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel1.add(new JLabel("상단")); 
		text = new JTextField(10);
		panel1.add(text);
		
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT)); 
		panel2.add(new JLabel("하단"));
		text2 = new JTextField(10);
		panel2.add(text2);
		
		
		panel1.setBackground(Color.LIGHT_GRAY);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel3.setLayout(new GridLayout(3,3, 5,5));
		
		c.add(panel1, BorderLayout.NORTH);
		c.add(panel2, BorderLayout.SOUTH);
		c.add(panel3, BorderLayout.CENTER);
		
		JButton[] bArray = new JButton[9];
		for(int i=0; i<9; i++) {
			bArray[i] = new JButton(Integer.toString(i+1));
			bArray[i].addActionListener(new ActionListener() {
				String num = "";
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// System.out.println(e.getActionCommand());
					num = text.getText() + e.getActionCommand();
					text.setText(num);
				}
			});
			panel3.add(bArray[i]);
		}
		setSize(1000,500);
		setVisible(true);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a03실패본();

	}

}