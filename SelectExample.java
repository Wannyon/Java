import java.sql.*;

public class SelectExample {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tabledb";
		String id = "root";
		String pw = "123456";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "Select * from usertbl;";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("userID\t name\t birthYear\t addr\t mobile1\t mobile2\t height\t   mDate");
			System.out.println("-------------------------------------------------------------------------------------------");
			while (rs.next()) {
				String userid = rs.getString("userid");
				String name = rs.getString("name");
				int birthyear = rs.getInt("birthyear");
				String addr = rs.getString("addr");
				String mobile1 = rs.getString("mobile1");
				String mobile2 = rs.getString("mobile2");
				String height = rs.getString("height");
				String mDate = rs.getString("mDate");
				System.out.printf("%3s\t %3s\t %4d\t\t %2s\t %3s\t\t %8s\t %3s\t %12s\t \n", userid, name, birthyear, addr
						, mobile1, mobile2, height, mDate);
			}	
		} 
		
		catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());		
		} 
		
		catch (Exception e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		} 
		
		finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static String toUnicode(String str) {
		try {
			byte[] b = str.getBytes("ISO-8859-1");
			return new String(b);
		} catch (java.io.UnsupportedEncodingException uee) {
			System.out.println(uee.getMessage());
			return null;
		}

	}

}
