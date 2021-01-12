package week4;

public class Circle {
	//인스턴스 변수 생성
	public final double PI = 3.14159; //파이값
	private double radius;               //반지름값
	
	//반지름값 설정해주는 메소드
	public void setRadius(double radius) {
		if (radius>0) { //반지름이 0 이상일 때만
			this.radius = radius; //인스턴스의 반지름값으로 설정
		}
	}

	//반지름값 리턴해주는 메소드
	public double getRadius() {
		return radius;
	}
	
	//반지름값을 이용해 넓이 리턴해주는 메소드
	public double area(double radius) {
		return PI*radius*radius; //넓이 계산해서 리턴
	}
	
	//원의 정보 보여주는 메소드
	public void showCircle() {
		System.out.println("반지름: "+radius);
		System.out.println("원의 면적: "+area(radius));
	}
	
	
}
