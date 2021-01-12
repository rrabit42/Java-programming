package week4;

import java.util.Scanner;

public class week4_2_김서영 {
	public static void main(String[] args) {
		//원 객체 생성
		Circle circle = new Circle();
		
		//키보드 입력받을 참조변수 생성
		Scanner keyboard = new Scanner(System.in);

		//반지름 입력받아
		System.out.print("반지름 입력:");
		double rad= keyboard.nextDouble();
		//객체의 반지름으로 설정
		circle.setRadius(rad);
		//원의 반지름과 넓이 출력
		circle.showCircle();
		
	}

}
