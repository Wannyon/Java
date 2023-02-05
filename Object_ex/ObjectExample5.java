package Object_ex;

import java.util.GregorianCalendar;

class ObjectExample5 {
	public static void main(String args[]) {
		
		// 동일한 값을 가지는 두 객체 생성
		GregorianCalendar obj1 = new GregorianCalendar(2007, 0, 1);
		GregorianCalendar obj2 = new GregorianCalendar(2007, 0, 1);
		if (obj1.equals(obj2))	// 두 객체의 값을 비교해 결과를 출력
			System.out.println("같음");
		else
			System.out.println("다름");
	}
}