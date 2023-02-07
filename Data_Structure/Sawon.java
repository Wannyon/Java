package Data_Structure;

import java.util.Scanner;

public class Sawon {
	private String sabun, deptname, irum, gender, email;

	public Sawon() {

	}

	public void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.print("사원번호 입력 =>");
		sabun = scan.next();
		System.out.print("부서명 입력 =>");
		deptname = scan.next();
		System.out.print("이름 입력 =>");
		irum = scan.next();
		System.out.print("성별 입력 =>");
		gender = scan.next();
		System.out.print("이메일 입력 =>");
		email = scan.next();
	}

	public void outputData() {
		System.out.printf("%5s %6s %9s %20s\n", sabun, deptname, irum, gender, email);
	}

	public String getSabun() {
		return sabun;
	}

	public void setSabun(String sabun) {
		this.sabun = sabun;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getIrum() {
		return irum;
	}

	public void setIrum(String irum) {
		this.irum = irum;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
