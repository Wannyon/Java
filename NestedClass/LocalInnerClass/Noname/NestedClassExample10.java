package LocalInnerClass.Noname;

class NestedClassExample10 {
	public static void main(String args[]) {
		Player obj = new Player() {	// Player 인터페이스를 구현하는 익명 이너 클래스
			public void play(String source) {
				System.out.println("플레이 시작: " + source);
			}

			public void stop() {
				System.out.println("플레이 종료");
			}
		};
		obj.play("LetItBe.mp3");	// 익명 이너 클래스의 메소드 호출
		obj.stop();
	}
}
