import java.io.File;

class ObjectExample1 {
	public static void main(String args[]) {
		File file = new File("C:\\뻐꾸기");
		String str = file.toString();
		System.out.println(str);
	}
}