package p1228;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
// 코드만 짜지 말고, 변수들 조정해도 해보면서 파악하기
public class a02Slider수치표시 extends JFrame {
	public a02Slider수치표시() {
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
		
		JLabel l = new JLabel(Integer.toString(slider.getValue()));
		
		slider.addChangeListener(new ChangeListener() {
			@Override                // 체인지리스너 미완성 상태에서 컨트롤 + 스페이스 + 엔터
			public void stateChanged(ChangeEvent e) {
				l.setText(Integer.toString(slider.getValue()));
			}
		});
		
		c.add(slider);
		c.add(l);
		setSize(300, 100);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a02Slider수치표시();

	}

}
