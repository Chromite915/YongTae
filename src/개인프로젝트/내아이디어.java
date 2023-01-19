package 개인프로젝트;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 내아이디어 extends JFrame {

	public 내아이디어() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); 
		c.setLayout(new BorderLayout(30, 20)); // border, 컴포넌트 간격 30, 20 늘리기
		
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // MySQL 드라이버 로드
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root","6534"); // JDBC 연결
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement(); // SQL문 처리용 Statement 객체 생성
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("SQL 실행오류");
		} 
		
		JPanel p2 = new JPanel();
		
		JLabel lachip = new JLabel("칩셋");
		JLabel lachip1 = new JLabel("스냅드래곤 888");
		JCheckBox chchip1 = new JCheckBox();
		JLabel lachip2 = new JLabel("스냅드래곤 8Gen1");
		JCheckBox chchip2 = new JCheckBox();
		JLabel lachip3 = new JLabel("엑시노스 2100");
		JCheckBox chchip3 = new JCheckBox();
		
		JLabel laos = new JLabel("운영체제");
		JLabel laos1 = new JLabel("안드로이드");
		JCheckBox chos1 = new JCheckBox();
		JLabel laos2 = new JLabel("IOS");
		JCheckBox chos2 = new JCheckBox();
		
		c.add(new JButton("Calculate"), BorderLayout.NORTH); // 버튼, 위치 = 보더레이아웃의 특징 형식
		c.add(p2, BorderLayout.CENTER);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		// 위치변수 Border는 5개, Flow는 3개
		
		p2.add(lachip);
		p2.add(lachip1);
		p2.add(chchip1);
		p2.add(lachip2);
		p2.add(chchip2);
		p2.add(lachip3);
		p2.add(chchip3);
		p2.add(laos);
		p2.add(laos1);
		p2.add(chos1);
		p2.add(laos2);
		p2.add(chos2);
		
		
		setSize(800, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 내아이디어();

	}

}
