package JDBC_sawon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sawon {
	String sabun;
	String deptname;
	String irum;
	String gender;
	String email;

	public Sawon() {

	}

	public void inputData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("usertbl 테이블에 값 추가하기 .....");
		System.out.print("사원번호 입력 : ");
		sabun = br.readLine();
		System.out.print("이름 입력 : ");
		irum = br.readLine();
		System.out.print("부서 입력 : ");
		deptname = br.readLine();
		System.out.print("성별 입력 : ");
		gender = br.readLine();
		System.out.print("이메일 입력 : ");
		email = br.readLine();
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
