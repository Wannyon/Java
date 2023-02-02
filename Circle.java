package Object_ex;

class Circle {
	int radius; // 반지름

	Circle(int radius) {
		this.radius = radius;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Circle))	// instanceof : 캐스트 연산의 가능 유무에 따라 true/false 반환.
			return false;
		Circle circle = (Circle) obj;
		if (radius == circle.radius)
			return true;
		else
			return false;
	}
}
