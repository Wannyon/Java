package Object_ex;

class ObjectExample6 {
	public static void main(String args[]) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		// Circle 클래스에서 오버라이딩을 하지 않았을 때, 주소 값을 참조하여 다름이 나옴.
		// 오버라이딩을 했을 때 같음이 출력.
		if (obj1.equals(obj2))		
			System.out.println("같음");
		else
			System.out.println("다름");
	}
}
