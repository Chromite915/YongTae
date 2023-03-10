package PersonalProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdviseQuery {

	public static void main (String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // MySQL 드라이버 로드
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root","6534"); // JDBC 연결
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement(); // SQL문 처리용 Statement 객체 생성
			stmt.executeUpdate("insert into student (name, id, dept) values('아무개', '0893012', '컴퓨터공학')");
			printTable(stmt, "-- insert 쿼리 --");
			stmt.executeUpdate( "update student set id = '0189011' where name = '아무개'");
			printTable(stmt, "-- insert 쿼리 --");
			stmt.executeUpdate("delete from student where name = '아무개'");
			printTable(stmt, "-- insert 쿼리 --");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("SQL 실행오류");
		} 
	}
	// 레코드의 각 열의 값 화면에 출력
	// srs, type, next 질문
	private static void printTable(Statement stmt, String type) throws SQLException {
		ResultSet srs = stmt.executeQuery("select * from student");
		System.out.println(type);
		while (srs.next()) {
			System.out.print(srs.getString("name"));
			System.out.print("\t|\t" + srs.getString("id"));
			System.out.println("\t|\t" + srs.getString("dept"));
		}
	}
}