package JDBC_sawon;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Management {
	public static void main(String args[]) throws IOException {
		ArrayList<Sawon> list = new ArrayList<Sawon>();
		int menu;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.print("메뉴 선택 => ");
			menu = scan.nextInt();
			System.out.println();
			
			if (menu == 6) {
				System.out.println("The End...");
				break;
			}
			
			switch (menu)
			{
				case 1:
					input_sawon();
					break;
				case 2:
					output_sawon(list);
					break;
				case 3:
					search_sawon(list);
					break;
				case 4:
					update_sawon(list);
					break;
				case 5:
					delete_sawon(list);
					break;
				default: 
				
			}
		}
		
		
	}
	
	static void printMenu()
	{
		System.out.println("*** 사원관리 ***");
		System.out.println("1. 사원정보 입력");
		System.out.println("2. 사원정보 출력");
		System.out.println("3. 사원정보 조회");
		System.out.println("4. 사원정보 수정");
		System.out.println("5. 사원정보 삭제");
		System.out.println("6. 프로그램 종료");
		System.out.println();
	}
	
	static void input_sawon() throws IOException
	{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tabledb?serverTimezone=UTC";
		String id = "root";
		String pw = "123456";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		Sawon obj = new Sawon();
		String sabun, irum, deptname, gender, email;
		
		obj.inputData();
		String sql = "Insert Into sawon Values (?,?,?,?,?)";
		
		try {
			System.out.println(sql);

			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, obj.sabun);
			pstmt.setString(2, obj.irum);
			pstmt.setString(3, obj.deptname);
			pstmt.setString(4, obj.gender);
			pstmt.setString(5, obj.email);
			pstmt.executeUpdate(sql);
			System.out.println("데이터 삽입 성공!!!");
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패! = " + e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	static void output_sawon(ArrayList<Sawon> list)
	{
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		String sql1 = "select count(*) from sawon";
		String sql2 = "select * from sawon order by sabun";
	}
	
	static void search_sawon(ArrayList<Sawon> list)
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.print("조회할 사원번호 입력 => ");
		String sabun = scan.next();
		
		for (Sawon dat : list) {
			if (sabun.equals(dat.sabun)) {
				System.out.println("\n사원번호       부서명         이름         성별                이메일");
				System.out.println("============================================");
				dat.outputData();
				System.out.println("============================================\n");
				return;
			}	
		}
		System.out.println("\n조회할 사원번호 입력 오류!!\n");
	}
	
	static void update_sawon() {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "update sawon set deptname=?, email=? where sabun = ?";
		
		try {
			Scanner scan = new Scanner(System.in);
			Sawon obj = new Sawon();
			
			System.out.print("수정할 사원번호 입력 => ");
			obj.sabun = scan.next();
			System.out.print("수정할 부서명 입력 => ");
			obj.deptname = scan.next();
			System.out.print("수정할 이메일 입력 => ");
			obj.email = scan.next();
			
			con = connectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, obj.deptname);
			pstmt.setString(2, obj.email);
			pstmt.setString(3, obj.sabun);
			
		}
		catch {
			
		}
	}
	
	static void delete_sawon(ArrayList<Sawon> list)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 사원번호 입력 => ");
		String sabun = scan.next();
		
		for (Sawon dat : list) {
			if (sabun.equals(dat.sabun)) {
				list.remove(dat);
				System.out.println("\n사원정보 삭제 성공!!\n");
				return;
			}	
		}
		System.out.println("\n삭제할 사원번호 입력 오류!!\n");
	}
}
