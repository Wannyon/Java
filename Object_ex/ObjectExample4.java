package Object_ex;

class ObjectExample4 {
	public static void main(String args[]) {
		Sungjuk obj1 = new Sungjuk();
		
		obj1.input();
		obj1.process();
		Sungjuk obj2 = (Sungjuk) obj1.clone();
		
		if (obj1.equals(obj2))
			System.out.println("같음");
		else
			System.out.println("다름");
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
