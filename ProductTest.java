
public class ProductTest {
	static int max = 100; 

	public static void main(String[] args) {
		Product obj[] = new Product[100];
		int cnt = input_product(obj);
		output_product(obj, cnt);
		
	}
	
	static int input_product(Product obj[]) {
		int cnt = 0;
		for (int i=0; i<max; i++) {
			obj[i] = new Product();
			if (obj[i].inputgoods()) {
				break;
			}
			cnt ++;
			System.out.println();
		}
		return cnt;
	}
	
	static void output_product(Product obj[], int cnt) {
		System.out.println("상품번호 \t   상품명 \t 가격 \t\t연도 \t\t 제조사");
		System.out.println("-------------------------------------------------------------------------");
		for (int i=0; i<cnt; i++) {
			obj[i].outputgoods();
		}	
	}

}
