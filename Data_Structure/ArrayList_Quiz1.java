package Data_Structure;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_Quiz1 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Sawon> list = new ArrayList<Sawon>();
		Sawon data;
		int menu;

		do {
			print_menu();
			System.out.printf("\n메뉴 선택 => ");
			menu = in.nextInt();

			if (menu == 6) {
				System.out.printf("\n...프로그램 종료.\n");
				break;
			}

			switch (menu) {
			case 1:
				System.out.println();
				data = new Sawon();
				System.out.print("사원번호 입력 => ");
				data.setNum(in.nextInt());
				System.out.print("부서명 입력 => ");
				data.setName(in.next());
				System.out.print("이름 입력 => ");
				data.setName(in.next());
				System.out.print("성별 입력 => ");
				data.setName(in.next());
				System.out.print("이메일 입력 => ");
				data.setEmail(in.next());
				list.add(data);
				break;
			case 2:
				printList();
				break;
			case 3:
				System.out.println();
				data = new Sungjuk();
				System.out.print("검색할 번호 입력 => ");
				data.setNum(in.nextInt());
				arr.searchNode(data);
				break;
			case 4:
				System.out.println();
				data = new Sungjuk();
				System.out.print("삭제할 번호 입력 => ");
				data.setNum(in.nextInt());
				arr.deleteNode(data);
				break;
			case 5:
				break;
			default:
				System.out.printf("\n메뉴를 다시 입력하세요!!!\n");
				break;
			}
		} while (true);

	}

	static void print_menu() {
		System.out.printf("\n*** 사원관리 ***\n");
		System.out.printf("1. 사원정보 입력\n");
		System.out.printf("2. 사원정보 출력\n");
		System.out.printf("3. 사원정보 조회\n");
		System.out.printf("4. 사원정보 수정\n");
		System.out.printf("5. 사원정보 삭제\n");
		System.out.printf("6. 프로그램 종료\n");
	}

	static void outputData(Sawon[] list) {
		System.out.println("\t\t***사원정보***");
		System.out.println("=====================================");
		System.out.println("사원번호	부서명	이름	성별	이메일");
		System.out.println("=====================================");
		for (int i=0; i<this.cnt; i++) {
			System.out.printf("%3d	%3s	%4d	\n", 
				list[i].getNum(), this.arr[i].getName(), this.arr[i].getScore());
		}		
		System.out.println("=====================================");
		}
		// 구현 Sungjuk[] 배열을 출력, 데이터가 없으면 없다고 출력
	}
}

//class ArrayList {
//	static int MAX = 10;
//	static int cnt = 0;
//	Sungjuk[] arr;
//
//	ArrayList() {
//		this.arr = new Sungjuk[MAX];
//	}
//
//	public void insertLastNode(Sungjuk data) {
//		if (this.cnt == MAX) {
//			System.out.println("\n메모리 풀(full)!!!\n");
//			return;
//		}
//
//		this.arr[this.cnt++] = data;
//		System.out.println("\n삽입 성공!!!\n");
//		// 구현 cnt -> MAX까지 입력
//	}
//
//	public void printList() {
//		Sungjuk data = null;
//		if (this.arr.length == 0) {
//			System.out.println("\n출력할 데이터가 없음!!!\n");
//			return;
//		}
//		System.out.println();
//		System.out.println("번호	이름	점수");
//		System.out.println("======================");
//		for (int i = 0; i < this.cnt; i++) {
//			System.out.printf("%3d	%3s	%4d	\n", this.arr[i].getNum(), this.arr[i].getName(), this.arr[i].getScore());
//		}
//		// 구현 Sungjuk[] 배열을 출력, 데이터가 없으면 없다고 출력
//
//	}
//
//	public void searchNode(Sungjuk data) {
//		for (int i = 0; i < this.cnt; i++) {
//			if (data.getNum() == this.arr[i].getNum()) {
//				System.out.println();
//				System.out.println("번호	이름	점수");
//				System.out.println("=====================");
//				System.out.printf("%3d	%3s	%4d	\n", this.arr[i].getNum(), this.arr[i].getName(),
//						this.arr[i].getScore());
//				return;
//			}
//		}
//		// 구현
//		System.out.println("\n검색할 데이터가 없음!!!\n");
//	}
//
//	public void deleteNode(Sungjuk data) {
//		for (int i = 0; i < this.cnt; i++) {
//			if (data.getNum() == this.arr[i].getNum()) {
//				for (int k = i; k < this.cnt - 1; k++) {
//					this.arr[k] = this.arr[k + 1];
//				}
//				this.cnt--;
//				System.out.printf("\n삭제 성공!!!\n");
//				return;
//			}
//		}
//		System.out.printf("\n삭제할 데이터가 없음!!!\n");
//		// 구현 cnt 값을 1감소.
//	}
//
//}

class Sawon {
	private int num;	// 사원번호
	private String deptname;	// 부서명
	private String name;	// 이름
	private String gender;	// 성별
	private String email;	// 이메일
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
