
public class NestedClassExample1 {
	public static void main(String args[]) {
		Cart cart = new Cart(); // 장바구니 생성
		cart.addItem("쵸콜렛", 3, 1000); // 3개의 상품 항복 추가.
		cart.addItem("케이크", 1, 25000);
		cart.addItem("샴페인", 1, 7000);
		Cart.Item item = cart.new Item("꽃다발", 1, 50000);
		cart.list.add(item);
		printCart(cart);
	}

	static void printCart(Cart cart) {
		int num = cart.getItemNum();
		System.out.println(" 상품명 수량 단가 금액");
		System.out.println("----------------------------------");
		for (int cnt = 0; cnt < num; cnt++) { // 장바구니에 있는 상품 항목을 순서대로 가져와서 출력.
			Cart.Item item = cart.getItem(cnt);
			System.out.printf("%3d %5s %5d %7d %7d %n", cnt + 1, item.name, item.num, item.unitPrice, item.getPrice());
		}
		System.out.println("----------------------------------");
		System.out.printf(" 총계 %10d %n", cart.getTotalPrice());
	}

}
