import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteExam {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tabledb?serverTimezone=UTC";
		String id = "root";
		String pw = "123456";
		Connection con = null;
		Statement stmt = null;

		String user_id, user_name, user_birthYear, user_addr, user_mobile1, user_mobile2, user_height, user_mDate;
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("usertbl 테이블에 값 삭제하기 .....");
			System.out.print("삭제할 아이디 입력 : ");
			user_id = br.readLine();
			
			String sql = "Delete from usertbl where userID = '" + user_id + "'";
			System.out.println(sql);

			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("데이터 수정 성공!!!");
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패! = " + e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
