package PersonalProject;

import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class BaseProject extends JFrame implements ActionListener {

	public Connection conn;
	public Statement s;
	public ResultSet r;

	private JComboBox Category;
	private JComboBox Dept;

	private JCheckBox c1 = new JCheckBox("Name", true);
	private JCheckBox c2 = new JCheckBox("Ssn", true);
	private JCheckBox c3 = new JCheckBox("Bdate", true);
	private JCheckBox c4 = new JCheckBox("Address", true);
	private JCheckBox c5 = new JCheckBox("Sex", true);
	private JCheckBox c6 = new JCheckBox("Salary", true);
	private JCheckBox c7 = new JCheckBox("Supervisor", true);
	private JCheckBox c8 = new JCheckBox("Department", true);
	private Vector<String> Head = new Vector<String>();

	private JTable table;							// JTable = 데이터를 행렬 방식으로 표시. Scrollable 인터페이스가 구현되어있어 JScrollPane에 붙여 스크롤할 수 있다.
	private DefaultTableModel model;
	private static final int BOOLEAN_COLUMN = 0;
	private int NAME_COLUMN = 0;
	private int SALARY_COLUMN = 0;
	private String dShow;

	private JButton Search_Button = new JButton("검색");
	Container me = this;

	private JLabel totalEmp = new JLabel("인원수 : ");
	final JLabel totalCount = new JLabel();
	JPanel panel;
	JScrollPane ScPane;
	private JLabel Emplabel = new JLabel("선택한 직원: ");
	private JLabel ShowSelectedEmp = new JLabel();
	private JLabel Setlabel = new JLabel("새로운 Salary: ");
	private JTextField setSalary = new JTextField(10);
	private JButton Update_Button = new JButton("UPDATE");
	private JButton Delete_Button = new JButton("선택한 데이터 삭제");
	int count = 0;

	public BaseProject() {

		JPanel ComboBoxPanel = new JPanel();
		String[] category = { "전체", "부서별" };
		String[] dept = { "Research", "Administration", "Headquarters" };
		Category = new JComboBox(category);									// 배열을 다이렉트로 콤보박스로 변환
		Dept = new JComboBox(dept);
		ComboBoxPanel.setLayout(new FlowLayout(FlowLayout.LEFT));			// Top
		ComboBoxPanel.add(new JLabel("검색 범위 "));
		ComboBoxPanel.add(Category);
		ComboBoxPanel.add(Dept);

		JPanel CheckBoxPanel = new JPanel();
		CheckBoxPanel.setLayout(new FlowLayout(FlowLayout.LEFT));			// Top
		CheckBoxPanel.add(new JLabel("검색 항목 "));
		CheckBoxPanel.add(c1);
		CheckBoxPanel.add(c2);
		CheckBoxPanel.add(c3);
		CheckBoxPanel.add(c4);
		CheckBoxPanel.add(c5);
		CheckBoxPanel.add(c6);
		CheckBoxPanel.add(c7);
		CheckBoxPanel.add(c8);
		CheckBoxPanel.add(Search_Button);

		JPanel ShowSelectedPanel = new JPanel();							// HalfWay
		ShowSelectedPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		Emplabel.setFont(new Font("Dialog", Font.BOLD, 16));
		ShowSelectedEmp.setFont(new Font("Dialog", Font.BOLD, 16));
		dShow = "";
		ShowSelectedPanel.add(Emplabel);
		ShowSelectedPanel.add(ShowSelectedEmp);

		JPanel TotalPanel = new JPanel();									// Bottom
		TotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		TotalPanel.add(totalEmp);
		TotalPanel.add(totalCount);

		JPanel UpdatePanel = new JPanel();									// Bottom
		UpdatePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		UpdatePanel.add(Setlabel);
		UpdatePanel.add(setSalary);
		UpdatePanel.add(Update_Button);

		JPanel DeletePanel = new JPanel();									// Bottom
		DeletePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		DeletePanel.add(Delete_Button);

		JPanel Top = new JPanel();											// 컨텐트판
		Top.setLayout(new BoxLayout(Top, BoxLayout.Y_AXIS));
		Top.add(ComboBoxPanel);
		Top.add(CheckBoxPanel);

		JPanel Halfway = new JPanel();										// Vertical
		Halfway.setLayout(new BoxLayout(Halfway, BoxLayout.X_AXIS));
		Halfway.add(ShowSelectedPanel);

		JPanel Bottom = new JPanel();										// 컨텐트판
		Bottom.setLayout(new BoxLayout(Bottom, BoxLayout.X_AXIS));
		Bottom.add(TotalPanel);
		Bottom.add(UpdatePanel);
		Bottom.add(DeletePanel);

		JPanel ShowVertical = new JPanel();									// 컨텐트판
		ShowVertical.setLayout(new BoxLayout(ShowVertical, BoxLayout.Y_AXIS));
		ShowVertical.add(Halfway);
		ShowVertical.add(Bottom);

		add(Top, BorderLayout.NORTH);									// 컨텐트판 -> top     -> combo        + check
		add(ShowVertical, BorderLayout.SOUTH);							// 컨텐트판 -> verical -> half(select) + bottom(total, update, delete)

		Search_Button.addActionListener(this);					// 액션리스너
		Delete_Button.addActionListener(this);
		Update_Button.addActionListener(this);

		setTitle("Information Retrival System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1300, 600);
		setLocationRelativeTo(null);							// 화면 중앙에 창 위치
		setVisible(true);
		
		AdviceDialogEx2 dialog = new AdviceDialogEx2(this);
	}
	
	
	
	

	public void actionPerformed(ActionEvent e) {				// DB연결도 Action에 들어가나?

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 드라이버 연결

			String user = "root";
			String pwd = "6534"; 				// 비밀번호 입력
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
				String stmt = "select";			// 최좌측 '선택' 체크박스
				if (c1.isSelected()) {
					stmt += " concat(e.fname,' ', e.minit,' ', e.lname,' ') as Name";
					Head.add("NAME");					// 선택 체크박스 옆에 NAME칸 추가
				}
				if (c2.isSelected()) {
					if (!c1.isSelected())		// c2가 체크상태이면서, c1도 체크상태이면
						stmt += " e.ssn";
					else						// stmt에 계속 누적
						stmt += ", e.ssn";
					Head.add("SSN");			// head에 계속 누적
				}
				if (c3.isSelected()) {
					if (!c1.isSelected() && !c2.isSelected())
						stmt += " e.bdate";
					else
						stmt += ", e.bdate";
					Head.add("BDATE");
				}
				if (c4.isSelected()) {
					if (!c1.isSelected() && !c2.isSelected() && !c3.isSelected())
						stmt += " e.address";
					else
						stmt += ", e.address";
					Head.add("ADDRESS");
				}
				if (c5.isSelected()) {
					if (!c1.isSelected() && !c2.isSelected() && !c3.isSelected() && !c4.isSelected())
						stmt += " e.sex";
					else
						stmt += ", e.sex";
					Head.add("SEX");
				}
				if (c6.isSelected()) {
					if (!c1.isSelected() && !c2.isSelected() && !c3.isSelected() && !c4.isSelected()
							&& !c5.isSelected())
						stmt += " e.salary";
					else
						stmt += ", e.salary";
					Head.add("SALARY");
				}
				if (c7.isSelected()) {
					if (!c1.isSelected() && !c2.isSelected() && !c3.isSelected() && !c4.isSelected() && !c5.isSelected()
							&& !c6.isSelected())
						stmt += " concat(s.fname, ' ', s.minit, ' ',s.lname,' ') as Supervisor ";
					else
						stmt += ", concat(s.fname, ' ', s.minit, ' ',s.lname,' ') as Supervisor ";
					Head.add("SUPERVISOR");
				}
				if (c8.isSelected()) {
					if (!c1.isSelected() && !c2.isSelected() && !c3.isSelected() && !c4.isSelected() && !c5.isSelected()
							&& !c6.isSelected() && !c7.isSelected())
						stmt += " dname";
					else
						stmt += ", dname";
					Head.add("DEPARTMENT");
				}
				stmt += " from employee e left outer join supervisor s on e.super_ssn=s.ssn, department where e.dno = dnumber";	// supervisor가 employee로 되어있어서 수정함
				// Left outer join을 하는 이유는 Supervisor가 없는 경우(NULL)도 표시하기 위함.
				
				// JComboBox Dept에서 선택된 부서의 직원만을 출력하도록 조건 추가.
				if (Category.getSelectedItem().toString() == "부서별") {		// 콤보박스가 전체가 아니라 부서별이면
					if (Dept.getSelectedItem().toString() == "Research")	// 우측 콤보박스 1
						stmt += " and dname = \"Research\";";
					else if (Dept.getSelectedItem().toString() == "Administration")	// 2
						stmt += " and dname = \"Administration\";";
					else if (Dept.getSelectedItem().toString() == "Headquarters")	// 3
						stmt += " and dname = \"Headquarters\";";
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
				table.getModel().addTableModelListener(new CheckBoxModelListener());
				ScPane.setPreferredSize(new Dimension(1100, 400));
				panel.add(ScPane);
				add(panel, BorderLayout.CENTER);
				revalidate();
				// 이를 JScrollPane에 넣어 갱신된 화면을 revalidate()를 통해 출력.

			} else {
				JOptionPane.showMessageDialog(null, "검색 항목을 한개 이상 선택하세요.");		// 검색항목 아무것도 선택 안하면 뜨는 창
			}

		}

		// DELETE
		if (e.getSource() == Delete_Button) {				// Delete_Button의 기능은 위에서 다이얼로그로 대체되었음
			Vector<String> delete_ssn = new Vector<String>();

			try {

				String columnName = model.getColumnName(2);
				if (columnName == "SSN") {
					for (int i = 0; i < table.getRowCount(); i++) {
						if (table.getValueAt(i, 0) == Boolean.TRUE) {
							delete_ssn.add((String) table.getValueAt(i, 2));
						}
					}
					// for, if문을 통해 각 ‘선택’ 체크박스가 체크된 행의 ssn를 vector에 더함.
					
					
					
					for (int i = 0; i < delete_ssn.size(); i++) {
						for (int k = 0; k < model.getRowCount(); k++) {
							if (table.getValueAt(k, 0) == Boolean.TRUE) {
								model.removeRow(k);
								totalCount.setText(String.valueOf(table.getRowCount()));
							}
						}
					}
					for (int i = 0; i < delete_ssn.size(); i++) {
						String deleteStmt = "DELETE FROM EMPLOYEE WHERE Ssn=?";				// 테이블명 employee
						PreparedStatement p = conn.prepareStatement(deleteStmt);
						p.clearParameters();
						p.setString(1, String.valueOf(delete_ssn.get(i)));
						p.executeUpdate();

					}
				} else {
					JOptionPane.showMessageDialog(null, "삭제 작업을 진행하시려면 NAME, SSN 항목을 모두 체크해주세요.");
				}
				// .removeRow() 함수를 통해 해당 행 삭제 및 vector에 저장된 ssn을 이용하여 delete SQL문을 실행.
				// 체크박스 제외 2번째 열의 column name이 SSN이 아니라면 검색 항목 중 NAME, SSN을 체크하도록 알림창을 띄우고, delete문은 실행하지 않음.

				
				
				
				ShowSelectedEmp.setText(" ");

			} catch (SQLException e1) {
				System.out.println("actionPerformed err : " + e1);
				e1.printStackTrace();
			}
			panel = new JPanel();
			ScPane = new JScrollPane(table);					// Table를 기반으로 한 스크롤판
			ScPane.setPreferredSize(new Dimension(1100, 400));
			panel.add(ScPane);									// Panel -> ScPane
			add(panel, BorderLayout.CENTER);
			revalidate();

		} 								// DELETE 끝

		// UPDATEㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 이걸 재고량 수정으로 바꿀거야
		if (e.getSource() == Update_Button) {
			Vector<String> update_ssn = new Vector<String>();
			try {
				String columnName = model.getColumnName(6);	// Stock Count 체크박스가 위치한 번호로 수정하기
				if (columnName == "SALARY") {				// Stock Count로 수정하기
					for (int i = 0; i < table.getRowCount(); i++) {
						if (table.getValueAt(i, 0) == Boolean.TRUE) {
							update_ssn.add((String) table.getValueAt(i, 2));
							String updateSalary = setSalary.getText();	// 현재 월급TF 참조상태이지만, 판매/이동 버튼 누르면 나오는 TF를 참조하도록 수정하기
							table.setValueAt(Double.parseDouble(updateSalary), i, SALARY_COLUMN);
						}
					}
					for (int i = 0; i < update_ssn.size(); i++) {
						String updateStmt = "UPDATE EMPLOYEE SET Salary=? WHERE Ssn=?";
						PreparedStatement p = conn.prepareStatement(updateStmt);
						p.clearParameters();
						String updateSalary = setSalary.getText();
						p.setString(1, updateSalary);
						p.setString(2, String.valueOf(update_ssn.get(i)));
						p.executeUpdate();

					}
				} else {
					JOptionPane.showMessageDialog(null, "수정 작업을 진행하시려면 검색 항목을 모두 체크해주세요.");
				}
				// for, if문을 통해 각 ‘선택’ 체크박스가 체크된 행의 ssn를 vector에 더함.
				// setValueAt() 함수를 통해 salary열을 찾아 수정된 salary 값을 삽입하고 vector에 저장된 ssn을 이용하여 update set SQL문을 실행.
				// 만약 체크박스 제외 6번째 열의 column name이 SALARY가 아니라면 검색 항목을 모두 체크하도록 알림창을 띄우고, salary update는 하지 않음.

				ShowSelectedEmp.setText(" ");

			} catch (SQLException e1) {
				System.out.println("actionPerformed err : " + e1);
				e1.printStackTrace();
			}
			panel = new JPanel();
			ScPane = new JScrollPane(table);
			ScPane.setPreferredSize(new Dimension(1100, 400));
			panel.add(ScPane);
			add(panel, BorderLayout.CENTER);
			revalidate();

		} // UPDATE 끝
	}
	
	
	
	
									// 선택한 직원 출력
	public class CheckBoxModelListener implements TableModelListener {
		public void tableChanged(TableModelEvent e) {
			int row = e.getFirstRow();
			int column = e.getColumn();
			if (column == BOOLEAN_COLUMN) {
				TableModel model = (TableModel) e.getSource();
				String columnName = model.getColumnName(1);
				Boolean checked = (Boolean) model.getValueAt(row, column);
				if (columnName == "NAME") {
					if (checked) {
						dShow = "";
						for (int i = 0; i < table.getRowCount(); i++) {
							if (table.getValueAt(i, 0) == Boolean.TRUE) {
								dShow += (String) table.getValueAt(i, NAME_COLUMN) + "    ";

							}
						}
						ShowSelectedEmp.setText(dShow);
					} else {
						dShow = "";
						for (int i = 0; i < table.getRowCount(); i++) {
							if (table.getValueAt(i, 0) == Boolean.TRUE) {
								dShow += (String) table.getValueAt(i, 1) + "    ";

							}
						}
						ShowSelectedEmp.setText(dShow);
						// JTable에서 테이블의 특정 값이 바뀌었을 때 실행.
						// boolean(체크박스)값이 있는 열이 0번열이므로 상수로 위에서 지정,
						// if (column==BOOLEAN_COLUMN)의 값이 체크되었을 때, 체크 해제되었을 때 전체 열 중에 체크 되어있는 열의 NAME을 읽어서 출력.
						// 만약 체크박스 바로 다음 열의 column name이 NAME이 아니라면 NAME 출력하지 않음.
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		new BaseProject();
	}
}