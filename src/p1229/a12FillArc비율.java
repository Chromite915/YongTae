package p1229;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class a12FillArc비율 extends JFrame {
	private int [] data = {0,0,0,0};
	private int [] arcAngle = new int [4];
	private Color [] color = {Color.RED, Color.BLUE, Color.MAGENTA, Color.ORANGE};
	private String [] itemName = {"apple", "cherry", "strawberry", "prune"};
	private JTextField [] tf = new JTextField [4];
	private ChartPanel chartPanel = new ChartPanel();
	
	public a12FillArc비율() {
		setTitle("파이 차트 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new InputPanel(), BorderLayout.NORTH);
		c.add(chartPanel, BorderLayout.CENTER);
		
		setSize(800,650);
		setVisible(true);
		drawChart();
	}
	
	private void drawChart() {
		int sum=0;                      // 전체 갯수합산값
		for(int i=0; i<data.length; i++) {
			data[i] = Integer.parseInt(tf[i].getText());
			sum+=data[i];			
		}

		if(sum == 0) return;  // 과일 전체 합해서 0개면 리턴

		for(int i=0; i<data.length; i++) 
			arcAngle[i]=(int)Math.round((double)data[i]/(double)sum*360);
		//                               입력한 과일 갯수  /      전체갯수*360
		
		chartPanel.repaint();
	}

	private class InputPanel extends JPanel {
		public InputPanel() {
			this.setBackground(Color.LIGHT_GRAY);
			for(int i=0; i<tf.length; i++) {
				tf[i] = new JTextField("0", 5);
				tf[i].addActionListener(new MyActionListener());
				add(new JLabel(itemName[i]));
				add(tf[i]);
			}
		}
		
		private class MyActionListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) { 
				drawChart();
				/* 내가 가정한 해결법
				 * (과일전체갯수/100)*과일당 입력값 4가지 = 과일당 비율 4가지
				 * 과일1의 시작 각도 = 0, 종료 각도 = 과일1의 비율수치
				 * 과일2의 시작 각도 = 과일1의 종료 각도, 과일2의 종료 각도 = 과일2의 비율수치
				 */
			}
		}
	}
	
	private class ChartPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int startAngle = 0;
			for(int i=0; i<data.length; i++) {
				g.setColor(color[i]);
				g.drawString(itemName[i] + " " + Math.round(arcAngle[i]*100/360) + "%", 50+i*100, 20);
			}
			for(int i=0; i<data.length; i++) {
				g.setColor(color[i]);
				g.fillArc(150,  50,  200,  200,  startAngle, arcAngle[i]);
				startAngle = startAngle + arcAngle[i];
			}
			/* g.setColor(Color.BLUE);
			g.fillArc(150, 150, 200, 200, 0, arcAngle[0]);
			g.setColor(Color.RED);
			g.fillArc(150, 150, 200, 200, arcAngle[0], arcAngle[1]);
			g.setColor(Color.YELLOW);
			g.fillArc(150, 150, 200, 200, arcAngle[1], arcAngle[2]);
			g.setColor(Color.GREEN);
			g.fillArc(150, 150, 200, 200, arcAngle[2], arcAngle[3]); */
		}
	}
	
	public static void main(String [] args) {
		new a12FillArc비율();
	}
} 