package Wrapper_ex;

public class WrapperExample2 {
	public static void main(String args[]) {
		int total = 0;
		
		System.out.println(args[1]);
		for (int cnt = 0; cnt < args.length; cnt++) {
			Integer obj1 = Integer.parseInt(args[cnt]);	// argument [10 20 30 40]
			total += obj1.intValue();
		}
		System.out.println(total);
	}
}
