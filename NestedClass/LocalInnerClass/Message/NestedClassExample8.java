package LocalInnerClass.Message;

class NestedClassExample8 {
	public static void main(String args[]) {
//		class SatelliteSender extends MessageSender {	// 로컬 이너 클래스의 선언
//			void send(String message) {
//				System.out.println("발신: 마이다스");
//				System.out.println("수신: 빌 게이츠");
//				System.out.println("메시지: " + message);
//				System.out.println();
//			}
//		}
//		SatelliteSender obj = new SatelliteSender();	// 로컬 이너 클래스의 객체 생성
//		obj.send("굿 모닝");	// 로컬 이너 클래스의 메소드 호출

		
		
// 익명클래스, 일회성으로 사용할 대상.	
		MessageSender obj = new MessageSender() {	
			void send(String message) {
				System.out.println("발신: 마이다스");
				System.out.println("수신: 빌 게이츠");
				System.out.println("메시지: " + message);
				System.out.println();
			}
		};
		obj.send("굿 모닝");

	}
}