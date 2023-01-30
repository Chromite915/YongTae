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
				
				// ------------------------------------------------------------------------ //
				/*
							// 검색 항목이 하나 이상 선택되었을 때에만 SQL query 작성.
				if (count == 1) {				// count가 1이면
					me.remove(panel);			// me = Container, 컨테이너에서 panel을 제거한다
					revalidate();				// repaint와 비슷한 기능
				}
							// 이후 다시 table을 생성할 때는 .remove()를 통해서 container 내용을 초기화를 먼저 해줘야 함.
				
				

				if (e.getSource() == Search_Button) {						// 검색항목들 옆 "검색" 버튼
					if (c1.isSelected() || c2.isSelected() || c3.isSelected() || c4.isSelected() || c5.isSelected()
							|| c6.isSelected() || c7.isSelected() || c8.isSelected()) {		// 8개 다 체크되어있으면
						// Head = 벡터(테이블 열 이름)
						Head.clear();					//검색 항목이 하나 이상 선택되었을 때에만 SQL query 작성.
						Head.add("선택");
						
						// 두번째 checkbox (c2)부터는 이전의 checkbox select 여부에 따라 경우를 나눠서 SQL SELECT문을 완성해야 함.
						*/
						String stmt = "select";				// 최좌측 '선택' 체크박스
						/*
						if (c1.isSelected()) {
							stmt += " phone.name";
							Head.add("모델명");					// 선택 체크박스 옆에 NAME칸 추가
						}
						if (c2.isSelected()) {
							if (!c1.isSelected() && !c2.isSelected())
								stmt += " phone.os";
							else
								stmt += ", phone.os";	// 이 부분도 수정해야하나?
							Head.add("OS");
						}
						if (c3.isSelected()) {
							if (!c1.isSelected() && !c2.isSelected() && !c3.isSelected())
								stmt += " phone.size";
							else
								stmt += ", phone.size";
							Head.add("디스플레이 크기");
						}
						if (c4.isSelected()) {
							if (!c1.isSelected() && !c2.isSelected() && !c3.isSelected() && !c4.isSelected())
								stmt += " phone.chipset";
							else
								stmt += ", phone.chipset";
							Head.add("칩셋");
						}
						if (c5.isSelected()) {
							if (!c1.isSelected() && !c2.isSelected() && !c3.isSelected() && !c4.isSelected()
									&& !c5.isSelected())
								stmt += " phone.memory";
							else
								stmt += ", phone.memory";
							Head.add("저장용량");
						}
						if (c6.isSelected()) {
							if (!c1.isSelected() && !c2.isSelected() && !c3.isSelected() && !c4.isSelected() && !c5.isSelected()
									&& !c6.isSelected())
								stmt += " phone.ram";
							else
								stmt += ", phone.ram";
							Head.add("RAM");
							// [[[ssn을 매칭하여 supervisor를 표시함]]]
						}
						if (c7.isSelected()) {
							if (!c1.isSelected() && !c2.isSelected() && !c3.isSelected() && !c4.isSelected() && !c5.isSelected()
									&& !c6.isSelected() && !c7.isSelected())
								stmt += " phone.battery";
							else
								stmt += ", phone.battery";
							Head.add("배터리");
							// [[[부서번호를 매칭하여 부서이름을 표시함]]]
						}
						if (c8.isSelected()) {
							if (!c1.isSelected())				// c2가 체크상태이면서, c1도 체크상태이면
								stmt += " phone.count";
							else								// stmt에 계속 누적
								stmt += ", phone.count";		// 이 부분도 수정해야하나?
							Head.add("재고량");			// head에 계속 누적
						}*/
						stmt += " from phone left outer join stock on phone.name=stock.model";
						/*
						if (OsCategory.getSelectedItem().toString() == "OS") {		// 콤보박스가 전체가 아니라 부서별이면
							if (Oscb.getSelectedItem().toString() == "Android")		// 우측 콤보박스 1
								stmt += " and phone.os = \"Android\";";
							else if (Oscb.getSelectedItem().toString() == "IOS")	// 2
								stmt += " and phone.os = \"IOS\";";
						}
						
						
						// model = JTable의 디폴트 형태
						// DefaultTableModel (1열 checkbox 제외 table cell 직접 수정 불가) 및 JTable 생성. (Salary 수정 및 선택된 직원 이름 출력을 위해 해당 열 저장)
						// JTable은 이후 행의 1열의 Boolean 값을 ‘선택’ 열에서 체크박스로 나타내기 위해 Boolean.class 반환.
						// 1열 = 결과테이블의 첫번째 체크박스 세로영역
						model = new DefaultTableModel(Head, 0) {	// 결과테이블의 첫번째 가로영역(0 = 첫번째)
							@Override
							public boolean isCellEditable(int row, int column) {
								if (column > 0) {
									return false;
								} else {
									return true;
								}
							}
						};
						for (int i = 0; i < Head.size(); i++) {
							if (Head.get(i) == "NAME") {
								NAME_COLUMN = i;
							} else if (Head.get(i) == "SALARY") {
								SALARY_COLUMN = i;
							}
						}
						table = new JTable(model) {
							@Override
							public Class getColumnClass(int column) {
								if (column == 0) {
									return Boolean.class;
								} else
									return String.class;
							}
						};

						ShowSelectedEmp.setText(" ");

						try {
							count = 1;
							s = conn.createStatement();
							r = s.executeQuery(stmt);
							// 1. 수행결과로 ResultSet r 객체의 값을 반환합니다.
							// 2. SELECT 구문을 수행할 때 사용되는 함수입니다.
							
							ResultSetMetaData rsmd = r.getMetaData();
							int columnCnt = rsmd.getColumnCount();
							int rowCnt = table.getRowCount();
							
							
							// vector<Object>를 이용하여 체크박스로 선택된 열의 값을 테이블에 넣고 int rowCnt 변수를 통해 인원수를 더함. (정상 실행됐다면 count = 1)
							while (r.next()) {											// 다음값이 존재하는 경우?
								Vector<Object> tuple = new Vector<Object>();
								tuple.add(false);
								for (int i = 1; i < columnCnt + 1; i++) {
									tuple.add(r.getString(rsmd.getColumnName(i)));		// 컬럼의 이름
								}
								model.addRow(tuple);
								rowCnt++;
							}
							totalCount.setText(String.valueOf(rowCnt));

						} catch (SQLException ee) {
							System.out.println("actionPerformed err : " + ee);
							ee.printStackTrace();

						}
						panel = new JPanel();
						ScPane = new JScrollPane(table);
						//table.getModel().addTableModelListener(new CheckBoxModelListener());
						ScPane.setPreferredSize(new Dimension(1100, 400));
						panel.add(ScPane);
						add(panel, BorderLayout.CENTER);
						revalidate();
									// 이를 JScrollPane에 넣어 갱신된 화면을 revalidate()를 통해 출력.

					} else {
						JOptionPane.showMessageDialog(null, "검색 항목을 한개 이상 선택하세요.");		// 검색항목 아무것도 선택 안하면 뜨는 창
					}
				}

			}
		});*/
		// UPDATEㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				// 이걸 재고량 수정으로 바꿀거야
				if (e.getSource() == join) {
					//Vector<String> update_market = new Vector<String>();
					try {
						// String columnName = model.getColumnName(6);	// Stock Count 체크박스가 위치한 번호로 수정하기
						if (statusTf.getText() == "here") {														// here이면 재고량 +1, imei를 포함한 신규 레코드 insert
							
							/*for (int i = 0; i < update_ssn.size(); i++) {
								String updateStmt = "UPDATE EMPLOYEE SET Salary=? WHERE Ssn=?";
								PreparedStatement p = conn.prepareStatement(updateStmt);
								p.clearParameters();
								String updateSalary = setSalary.getText();
								p.setString(1, updateSalary);
								p.setString(2, String.valueOf(update_ssn.get(i)));
								p.executeUpdate();*/
							s = conn.createStatement();
							s.executeUpdate( "insert into stock (model, imei, status, movedate) values (\'modelTf.getText()\', \'imeiTf.getText()\', \'statusTf.getText()\', \'movedateTf.getText()\');");
							s.executeUpdate( "update phone set count +1 where model = (select model from (select model from stock where model = \'modelTf.getText()\'));");
							} else if(statusTf.getText() == "not here") {
								s.executeUpdate( "update phone set count -1 where model = (select model from (select model from stock where imei = \'modelTf.getText()\'));");
								s.executeUpdate( "update stock set status = 'not here' where imei = \'imeiTf.getText()\';");
							}
						// TextField에 입력한 값을 MySQL 테이블에 insert 하고싶은데
							
							/*for (int i = 0; i < update_ssn.size(); i++) {
								String updateStmt = "UPDATE EMPLOYEE SET Salary=? WHERE Ssn=?";
								PreparedStatement p = conn.prepareStatement(updateStmt);
								p.clearParameters();
								String updateSalary = setSalary.getText();
								p.setString(1, updateSalary);
								p.setString(2, String.valueOf(update_ssn.get(i)));
								p.executeUpdate();*/
						// for, if문을 통해 각 ‘선택’ 체크박스가 체크된 행의 ssn를 vector에 더함.
						// setValueAt() 함수를 통해 salary열을 찾아 수정된 salary 값을 삽입하고 vector에 저장된 ssn을 이용하여 update set SQL문을 실행.
						// 만약 체크박스 제외 6번째 열의 column name이 SALARY가 아니라면 검색 항목을 모두 체크하도록 알림창을 띄우고, salary update는 하지 않음.

					} catch (SQLException e1) {
						System.out.println("actionPerformed err : " + e1);
						e1.printStackTrace();
					}
					/*panel = new JPanel();
					ScPane = new JScrollPane(table);
					ScPane.setPreferredSize(new Dimension(1100, 400));
					panel.add(ScPane);
					add(panel, BorderLayout.CENTER);
					revalidate();*/

				} // UPDATE 끝
			}
		});
		add(join);
		setSize(350,400);
//		setVisible(true);
	}
}

			