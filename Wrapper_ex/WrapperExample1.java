package Wrapper_ex;

public class WrapperExample1 { // 프리미티브 타입의 데이터를 감싸는 역할을 하는 Wrapper 클래스
	public static void main(String args[]) {
		Integer obj1 = 12; // integer 객체를 생성합니다.
		Integer obj2 = 7;
		Integer obj3 = Integer.parseInt("11");

		// integer 객체 안에 있는 int 값을 가져옵니다.
		int sum = obj1.intValue() + obj2.intValue() + obj3.intValue();
		System.out.println(sum);
	}

}
