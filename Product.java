import java.util.Scanner;

public class Product {
	String prdNo;
	String prdName;
	String prdMaker;
	int prdPrice;
	int prdYear;
	
	Product () {	// 디폴트 생성자
	}
	
	boolean inputgoods() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("상품번호 입력 => ");
		this.prdNo = scan.next();
		if (this.prdNo.equals("exit")) {
			System.out.println();
			System.out.println("상품 정보를 출력합니다.");
			return true;
		}
		
		System.out.print("상품명 입력 => ");
		this.prdName = scan.next();
		
		System.out.print("가격 입력 => ");
		this.prdPrice = scan.nextInt();
		
		System.out.print("연도 입력 => ");
		this.prdYear = scan.nextInt();
		
		System.out.print("제조사 입력 => ");
		this.prdMaker = scan.next();
		
		return false;
	}
	
	
	void outputgoods() {
		System.out.printf("%4s	%6s		%6d		%4d		%5s", prdNo, prdName, prdPrice, prdYear, prdMaker);
		System.out.println();
	}

}