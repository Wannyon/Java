package Statics;
class Line { // 직선 클래스
	Point point1, point2;

	Line(int x1, int y1, int x2, int y2) {	// 정적 네스티드 클래스의 생성자 호출
		point1 = new Point(x1, y1);
		point2 = new Point(x2, y2);
	}

	void move(int offsetX, int offsetY) {	// 정적 네스티드 클래스의 필드 사용
		point1.x += offsetX;
		point1.y += offsetY;
		point2.x += offsetX;
		point2.y += offsetY;
	}

	static class Point { // 점 클래스, 정적 네스티드 클래스
		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}