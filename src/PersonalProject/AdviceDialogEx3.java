package PersonalProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
// 다이얼로그의 내용만을 정의하고 다른 클래스와 연결함
import javax.swing.table.DefaultTableModel;

class AdviceDialogEx3 extends JDialog {
	private JTextField modelTf = new JTextField(10);
	private JTextField imeiTf = new JTextField(10);
	private JTextField statusTf = new JTextField("here / not here", 10);
	private JTextField movedateTf = new JTextField("YY.MM.DD", 10);
	
	private Vector<String> Head = new Vector<String>();
	public Connection conn;
	public Statement s;
	public ResultSet r;
	
	public AdviceDialogEx3(JFrame f) {
		super(f, "test", true);
		setLayout(null);
		setResizable(true);
		
		JLabel title = new JLabel("재고 이동");
		title.setLocation(120 , 15);
		title.setSize(150, 30);
		title.setFont(new Font("serif", Font.BOLD, 25));
		add(title);
		
		JLabel modelLabel = new JLabel("기종 : ");
		modelLabel.setLocation(30 , 60);
		modelLabel.setSize(100, 20);
		modelLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(modelLabel);
		modelTf.setLocation(140, 63);
		modelTf.setSize(100, 20);
		add(modelTf);	
		
		JLabel imeiLabel = new JLabel("IMEI : ");
		imeiLabel.setLocation(30 , 100);
		imeiLabel.setSize(100, 20);
		imeiLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(imeiLabel);
		imeiTf.setLocation(140, 103);
		imeiTf.setSize(100, 20);
		add(imeiTf);
		
		JLabel marketLabel = new JLabel("목적지 : ");
		marketLabel.setLocation(30 , 140);
		marketLabel.setSize(100, 20);
		marketLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(marketLabel);
		statusTf.setLocation(140, 143);
		statusTf.setSize(100, 20);
		add(statusTf);
		
		JLabel movedateLabel = new JLabel("이동일 : ");
		movedateLabel.setLocation(30 , 180);
		movedateLabel.setSize(100, 20);
		movedateLabel.setFont(new Font("serif", Font.BOLD, 20));
		add(movedateLabel);
		movedateTf.setLocation(140, 183);
		movedateTf.setSize(100, 20);
		add(movedateTf);
		
		JButton join = new JButton("등록");
		
		join.setLocation(120 , 260);
		join.setSize(100, 20);
		join.setFont(new Font("serif", Font.BOLD, 15));
		join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				// DB연결도 Action에 들어가나?

				try {
					Class.forName("com.mysql.cj.jdbc.Driver"); 

					String user = "root";
					String pwd = "6534"; 				
					String dbname = "sample";
					String url = "jdbc:mysql://localhost:3306/" + dbname + "?serverTimezone=UTC";

					conn = DriverManager.getConnection(url, user, pwd);
					System.out.println("정상적으로 연결되었습니다.");

				} catch (SQLException e1) {						// e1이 뭔지?
					System.err.println("연결할 수 없습니다.");
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {			// e1이 뭔지?
					System.err.println("드라이버를 로드할 수 없습니다.");
					e1.printStackTrace();						// e.printStackTrace() : 에러의 발생근원지까지 다 찾아서 단계별로 에러를 출력합니다.
				}
				
						String stmt = "select";				// 최좌측 '선택' 체크박스
						
						stmt += " from phone left outer join stock on phone.name=stock.model";
						
						
					
				
						
						
		/*
		 * // UPDATEㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				// 이걸 재고량 수정으로 바꿀거야
				if (e.getSource() == join) {
					try {
						//if (statusTf.getText() == "here") {														// here이면 재고량 +1, imei를 포함한 신규 레코드 insert
						
							s = conn.createStatement();
							
							String sql = "insert into stock (model, imei, status, movedate) values (?, ?, ?, ?)";
							PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, modelTf.getText());
							pstmt.setString(2, imeiTf.getText());
							pstmt.setString(3, statusTf.getText());
							pstmt.setString(4, movedateTf.getText());
							
							//s.executeUpdate( "insert into stock (model, imei, status, movedate)" + "values ('" + modelTf.getText() + "','" + imeiTf.getText() + "','" + statusTf.getText() + "','" + movedateTf.getText() + "')");
							//s.executeUpdate( "update phone set count +1 where model = (select model from (select model from stock where model = \'modelTf.getText()\'));");
							
							//} else if(statusTf.getText() == "not here") {
								//s.executeUpdate( "update phone set count -1 where model = (select model from (select model from stock where imei = \'modelTf.getText()\'));");
								//s.executeUpdate( "update stock set status = 'not here' where imei = \'imeiTf.getText()\';");
							//}
						// TextField에 입력한 값을 MySQL 테이블에 insert 하고싶은데
							

					} catch (SQLException e1) {
						System.out.println("actionPerformed err : " + e1);
						e1.printStackTrace();
					}
					/*panel = new JPanel();
					ScPane = new JScrollPane(table);
					ScPane.setPreferredSize(new Dimension(1100, 400));
					panel.add(ScPane);
					add(panel, BorderLayout.CENTER);
					revalidate();

				} // UPDATE 끝 
				*/
				
						
				// UPDATEㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				// 이걸 재고량 수정으로 바꿀거야
				if (e.getSource() == join) {
					
					
					
					Vector<String> update_ssn = new Vector<String>();
					try {
						/*String columnName = model.getColumnName(6);				// Stock Count 체크박스가 위치한 번호로 수정하기
						if (columnName == "SALARY") {							// Stock Count로 수정하기
							for (int i = 0; i < table.getRowCount(); i++) {		// row = 행
								if (table.getValueAt(i, 0) == Boolean.TRUE) {	// 어떤 행을 선택(체크)했을 경우
									update_ssn.add((String) table.getValueAt(i, 2));	// i번째 행의 2번째 열(ssn)을 update_ssn 한다
									String updateSalary = setSalary.getText();			// updateSalary = setSalary TextField에 입력된 값
									table.setValueAt(Double.parseDouble(updateSalary), i, SALARY_COLUMN);	// double, SALARY_COLUMN의 기본값은 0
								}
							}
							for (int i = 0; i < update_ssn.size(); i++) { */
							
					
					
								//String updateStmt = "UPDATE EMPLOYEE SET Salary=? WHERE Ssn=?";
								
								
								String sql = "insert into stock (bname, bpnum, model, imei, status, movedate, selldate) values (null, null, ?, ?, ?, ?, null)";
								PreparedStatement pstmt = conn.prepareStatement(sql);
								pstmt.setString(3, modelTf.getText());
								pstmt.setString(4, imeiTf.getText());
								pstmt.setString(5, statusTf.getText());
								pstmt.setString(6, movedateTf.getText());
								
								
								// PreparedStatement p = conn.prepareStatement(updateStmt);
								PreparedStatement p = conn.prepareStatement(sql);
								
								/*p.clearParameters();
								String updateSalary = setSalary.getText();
								p.setString(1, updateSalary);
								p.setString(2, String.valueOf(update_ssn.get(i)));
								p.executeUpdate();
								*/

							// }
						//} else {
							//JOptionPane.showMessageDialog(null, "수정 작업을 진행하시려면 검색 항목을 모두 체크해주세요.");
						//}
						// for, if문을 통해 각 ‘선택’ 체크박스가 체크된 행의 ssn를 vector에 더함.
						// setValueAt() 함수를 통해 salary열을 찾아 수정된 salary 값을 삽입하고 vector에 저장된 ssn을 이용하여 update set SQL문을 실행.
						// 만약 체크박스 제외 6번째 열의 column name이 SALARY가 아니라면 검색 항목을 모두 체크하도록 알림창을 띄우고, salary update는 하지 않음.

						// ShowSelectedEmp.setText(" ");

						
					 
					} catch (SQLException e1) {
						System.out.println("actionPerformed err : " + e1);
						e1.printStackTrace();
					}
						
					
				/*
					panel = new JPanel();
					ScPane = new JScrollPane(table);
					ScPane.setPreferredSize(new Dimension(1100, 400));
					panel.add(ScPane);
					add(panel, BorderLayout.CENTER);
					revalidate();

				} // UPDATE 끝
				*/
					}
				}
				
			
		});
		
		add(join);
		setSize(350,400);
//		setVisible(true);
	}
}

			