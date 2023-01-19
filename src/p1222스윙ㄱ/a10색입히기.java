package p1222스윙ㄱ;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class a10색입히기 extends JFrame {
	public a10색입히기() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1, 10); // 1x10 배열로
		// grid.setVgap(5); // 간격 5
		
		Container c = getContentPane(); 
		c.setLayout(grid);              // grid
		// = c.setLayout(new GridLayout(4, 2));
		
		Color[] color = {Color.red, Color.blue, Color.yellow, Color.gray, 
						 Color.green, Color.pink, Color.red, 
						 Color.darkGray, Color.cyan, Color.red}; // [[[방법3]]] 일일히 색 지정. 방법 3일때만 이 줄이 있음.
		for(int i=0; i<=9; i++) {
			// c.add(new JButton(Integer.toString(i))); 이 방법으로도 가능
			JButton btn = new JButton(Integer.toString(i));
			// btn.setBackground(new Color(255, 0, 0)); // R, G, B / 0~255 / [[[방법1]]] 전부 똑같은 색
			/* btn.setBackground(new Color((int) (Math.random()*256)
					                  , (int)(Math.random()*256)
				                  	  , (int)(Math.random()*256))); */ // [[[방법2]]] 전부 랜덤색
			btn.setBackground(color[i]); // [[[방법3]]]
				c.add(btn);
		}
		setSize(1000,500); // 내 마음대로. 아예 이 줄을 안 쓸 수도 있음.
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a10색입히기();

	}

}
