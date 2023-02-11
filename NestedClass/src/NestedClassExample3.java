class NestedClassExample3 {
	public static void main(String args[]) {
		PiggyBank bank1 = new PiggyBank();	// 세 개의 돼지 저금통 객체를 생성합니다.
		PiggyBank bank2 = new PiggyBank();
		PiggyBank bank3 = new PiggyBank();
		bank2.slot.put(100);		// 두번째 돼지 저금통에 100원을 넣습니다.
		System.out.println("첫번째 돼지 저금통: " + bank1.total);	// 액수 출력
		System.out.println("두번째 돼지 저금통: " + bank2.total);
		System.out.println("세번째 돼지 저금통: " + bank3.total);
	}
}
