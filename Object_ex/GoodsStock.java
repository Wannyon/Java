package Object_ex;

class GoodsStock {
	String goodsCode; // 상품코드
	int stockNum; // 재고수량

	GoodsStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	public String toString() { 		// 오버라이드
		 String str = "상품코드:" + goodsCode + " 재고수량:" + stockNum; 
		 return str; 
		 }
}