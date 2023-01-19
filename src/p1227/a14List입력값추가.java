package p1227;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class a14List입력값추가 extends JFrame {
	private JTextField tf = new JTextField(10);
	private Vector<String> v = new Vector<String>();
	private JList<String> nameList = new JList<String>(v);
	
	public a14List입력값추가() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 입력 후 <Enter> 키"));
		c.add(tf);
		
		v.add("황기태");
		v.add("이재문");
		nameList.setVisibleRowCount(5);;
		nameList.setFixedCellWidth(100);
		c.add(new JScrollPane(nameList));
		
		setSize(300, 300);
		setVisible(true);
		
		// JTextField에 ActionListener 등록 <Enter> 키 처리
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				v.add(t.getText());          // ex) t.getText = 홍길동
				// 먼저 vector에 새로운것을 추가하고
				t.setText("");
				nameList.setListData(v); // 그 다음에 namelist에 vector를 다시 넣는 방식으로 수정
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a14List입력값추가();
	}
}
