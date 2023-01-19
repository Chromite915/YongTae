package p230103복습;
/* 프레임에 버튼, Label
 * 버튼 누르면 다이얼로그 출력
 * 다이얼로그에 숫자 2개 입력하면 합을 프레임의 라벨에 리턴하는 내용
 * 입력값이 정수가 아니면 경고문 출력 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class a12OptionPane덧셈 extends JFrame {
	private JLabel resultLabel = new JLabel("계산 결과 출력");
	public a12OptionPane덧셈() {
		super("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("calculate");
		btn.addActionListener(new MyActionListener()); // 버튼에 이벤트 넣을 준비
		c.add(btn);
		
		resultLabel.setOpaque(true); // 불투명도
		resultLabel.setBackground(Color.GREEN);		
		c.add(resultLabel);
		setSize(250,200);
		setVisible(true);
	}
	
	class MyActionListener implements  ActionListener {
		private CalcDialog dialog;             // 선언
		public MyActionListener() {
			dialog = new CalcDialog(a12OptionPane덧셈.this);			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dialog.setVisible(true);
			if(dialog.isValid())
				resultLabel.setText(Integer.toString(dialog.getResult()));
		}
	}

	class CalcDialog extends JDialog { // 여기서 다이얼로그의 역할 = 숫자 2개를 받아서 더하고 sum에 전해줌
		private int sum = 0;
		private boolean bValid = false;
		private JTextField a = new JTextField(10);
		private JTextField b = new JTextField(10);
		private JButton addBtn = new JButton("   Add   ");
		
		public CalcDialog(JFrame f) {
			super(f, "Calculation Dialog"); // true = 다이얼로그에 숫자 입력이 끝날때까지 test프레임을 선택할 수 없게 하는것
			setLayout(new FlowLayout());
			add(new JLabel("두 수를 더합니다."));
			add(a);
			add(b);
			add(addBtn);
			
			addBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						int x = Integer.parseInt(a.getText());
						int y = Integer.parseInt(b.getText());
						sum = x + y;
						bValid = true;
					}catch(NumberFormatException e2) {
						JOptionPane.showMessageDialog(CalcDialog.this, "정수가 아닌 키가 있습니다", "오류", JOptionPane.ERROR_MESSAGE);
						return;
					}
					CalcDialog.this.setVisible(false); // 다이얼로그가 꺼지는게 아니라, false 시키는것
				}
			});
			
			setSize(400,200);
		}
		
		public boolean isValid() {
			return bValid;
		}
		public int getResult() {
			if(bValid)
				return sum;
			return 0;
		}
	}
	static public void main(String[] arg) {
		new a12OptionPane덧셈();
	}
}