package p230109;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Ex1 {
	public static void main (String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // MySQL 드라이버 로드
			Connection conn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/sample", "root","6534"); // JDBC 연결
			System.out.println("DB 연결 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}