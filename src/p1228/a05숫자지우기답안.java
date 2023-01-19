package p1228;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class a05숫자지우기답안 extends JFrame {
	private int nextNumber = 0;
	private JLabel[] numbers = new JLabel[10];
	private double beforeTime = 0;
	double afterTime = 0; 
	JLabel time = new JLabel("기록 : ");
	
	JPanel p_north = new JPanel();
	JPanel p_center = new JPanel();
	
	public a05숫자지우기답안() {
		setTitle("숫자 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		p_north.setLayout(new FlowLayout());
		time.setFont(new Font("serif", Font.BOLD, 20));
		p_north.add(time);                    // 기록 라벨을 위패널에 부착
		c.add(p_north, BorderLayout.NORTH);   // 위패널을 c에 NORTH로 부착
		
		p_center.setLayout(null);
		c.add(p_center,BorderLayout.CENTER);
		
		setSize(500, 500);
		setVisible(true);
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new JLabel(Integer.toString(i));
			numbers[i].setForeground(Color.BLACK);
			numbers[i].setOpaque(true);
			numbers[i].setBackground(Color.CYAN);
			numbers[i].setFont(new Font("serif",Font.BOLD, 25));
			p_center.add(numbers[i]);
			numbers[i].addMouseListener(new MyMouseListener());
		}
		gameSetting();

	}

	public void gameSetting() {
		for (int i = 0; i < numbers.length; i++) {
			int x = (int) (Math.random() * 250);
			int y = (int) (Math.random() * 250);
			numbers[i].setLocation(x, y);
			numbers[i].setSize(20, 20);
		}
	}

	class MyMouseListener extends MouseAdapter {
		public void mouseReleased(MouseEvent e) {
			JLabel nowLabel = (JLabel) e.getSource();
			int nowNum = Integer.valueOf(nowLabel.getText());
			if (nowNum == nextNumber) {
				if(nowNum == 0) {
					beforeTime = System.currentTimeMillis(); // 시간측정 시작
				}
				nowLabel.setVisible(false);
				nextNumber++;
			}
			
			if (nextNumber == 10) {
				afterTime = System.currentTimeMillis();      // 시간측정 종료
				double secDiffTime = (afterTime - beforeTime)/1000.0; 
				time.setText("기록 : " + secDiffTime);
				
				gameSetting();
				for(int i=0;i<numbers.length;i++)
					numbers[i].setVisible(true);
				nextNumber = 0;
			}
		}
	}

	public static void main(String[] args) {
		new a05숫자지우기답안();
	}
}
