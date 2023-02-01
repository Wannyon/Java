import java.io.*;

class ReaderExample1 {
	public static void main(String args[]) {
		FileReader reader = null;
		try {
			reader = new FileReader("4주차-3(JAVA).txt");
			while (true) {
				int data = reader.read();	// java에서는 int보다 작은 데이터형은 int로 받는다.
				if (data == -1)
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		} 
		
		catch (FileNotFoundException fnfe) {		// 부모
			System.out.println("파일이 존재하지 않습니다.");
		} 
		
		catch (IOException ioe) {					// 자식
			System.out.println("파일을 읽을 수 없습니다.");
		} 
		
		finally {
			try {
				reader.close();
			} 
			
			catch (Exception e) {
			}
		}
	}
}