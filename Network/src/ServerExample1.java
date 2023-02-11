
import java.io.*;
import java.net.*;

class ServerExample1 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9000);	// 서버 소켓을 생성합니다.
			socket = serverSocket.accept();	// 연결 요청이 오면 소켓을 생성합니다.
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			byte arr[] = new byte[100];	// 수신된 데이터를 출력합니다.
			in.read(arr);
			System.out.println(new String(arr));
			String str = "Hello, Client";
			out.write(str.getBytes());	// 데이터를 송신합니다.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();		// 소켓을 닫습니다.
			} catch (Exception ignored) {
			}
			try {
				serverSocket.close();
			} catch (Exception ignored) {	// 서버 소켓을 닫습니다.
			}
		}
	}
}