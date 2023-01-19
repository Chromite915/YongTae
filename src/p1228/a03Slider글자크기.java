package p1228;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
                                // 카페 참조해서 비교하기

public class a03Slider글자크기 extends JFrame {
	public a03Slider글자크기() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		JLabel l = new JLabel("이 크기를 바꾸시오");
		
		l.setFont(new Font("serif", Font.BOLD, slider.getValue()));
		l.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(l, BorderLayout.CENTER);
		
		slider.addChangeListener(new ChangeListener() {
			@Override                // 체인지리스너 미완성 상태에서 컨트롤 + 스페이스 + 엔터
			public void stateChanged(ChangeEvent e) {
				JSlider s = (JSlider) e.getSource();
				l.setFont(new Font("serif", Font.BOLD, s.getValue()));
			}
		});
		
		c.add(slider);
		c.add(l);
		setSize(1000, 500);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a03Slider글자크기();

	}

}
