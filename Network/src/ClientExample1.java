import java.io.*;
import java.net.*;

class ClientExample1 {
public static void main(String[] args) {
Socket socket = null;
try {
socket = new Socket( "192.168.0.102" , 9000);	// 소켓을 생성합니다.
InputStream in = socket.getInputStream();
OutputStream out = socket.getOutputStream();
String str = "Hello, Server";
out.write(str.getBytes());	// 데이터를 송신합니다.
byte arr[] = new byte[100];
in.read(arr);	// 데이터를 수신합니다.
System.out.println(new String(arr));
}
catch (Exception e) {
System.out.println(e.getMessage());
}
finally {
try {
socket.close();	// 소켓을 닫습니다.
}
catch (Exception e) {
}
}
}
}
