package week8;

import java.util.Scanner;

public class week8_2_김서영 {
	public static void main(String[] args) {
		//키보드 입력을 받을 참조 변수 및 객체
		Scanner kbd = new Scanner(System.in);
		
		//원의 반지름 입력 받기
		System.out.println("Input radius for a circle");
		  //원 객체 생성해서 생성자에 인자로 반지름 주기
		Circle c = new Circle(kbd.nextDouble());
		
		//정사각형의 변 길이 입력 받기
		System.out.println("Input length for a square");
		  //정사각형 객체 생성해서 생성자에 인자로 변 길이 주기
		Square s = new Square(kbd.nextDouble());
		
		//삼각형의 변 길이 입력 받기
		  //첫번째 변 길이
		System.out.println("Input a for a triangle");
		double s1 = kbd.nextDouble();
		  //두번째 변 길이
		System.out.println("Input b for a triangle");
		double s2 = kbd.nextDouble();
		  //세번째 변 길이
		System.out.println("Input c for a triangle");
		double s3 = kbd.nextDouble();
		  //삼각형 객체 생성해서 생성자에 인자로 변들 주기
		Triangle t = new Triangle(s1,s2,s3);
		
		//결과 출력
		 //원의 정보 출력
		System.out.println("<Circle>");
		System.out.printf("Area:%.3f\n", c.area());               //넓이
		System.out.printf("Circumference:%.4f\n", c.perimeter()); //둘레 길이
		 //사각형 정보 출력
		System.out.println("<Square>");
		System.out.printf("Area:%.1f\n", s.area());               //넓이
		System.out.printf("Circumference:%.1f\n", s.perimeter()); //둘레 길이
		 //삼각형 정보 출력		
		System.out.println("<Triangle>");
		System.out.printf("Area:%.1f\n", t.area());               //넓이
		System.out.printf("Circumference:%.1f\n", t.perimeter()); //둘레 길이
	}
}

//Geometry로 구현한 Circle class
class Circle implements Geometry{
	//인스턴스 변수 - 반지름 길이
	double radius;
	
	//생성자
	Circle(){};           //기본 생성자
	Circle(double radius){//반지름 길이를 인자로 받는 생성자
		this.radius = radius; //받은 길이를 인스턴스 변수에 대입
	}
	
	//넓이 method overwritting
	public double area() {
		return radius*radius*PI; //원의 넓이 반환
	}
	
	//둘레 method overwritting
	public double perimeter() {
		return 2*radius*PI;      //원의 둘레 반환
	}
}

//Geometry로 구현한 Square class
class Square implements Geometry{
	//인스턴스 변수 - 변의 길이
	double side;
	
	//생성자
	Square(){};          //기본 생성자
	Square(double side){ //변의 길이를 인자로 받는 생성자
		this.side = side;  //받은 길이를 인스턴스 변수에 대입
	}
	
	//넓이 method overwritting
	public double area() {
		return side*side;  //정사각형의 넓이 반환
	}
	
	//둘레 method overwritting
	public double perimeter() {
		return 4*side;    //정사각형의 둘레 반환
	}
}

//Geometry로 구현한 Triangle class
class Triangle implements Geometry{
	//인스턴스 변수 - 변의 길이들
	double s1, s2, s3;
	
	//생성자
	Triangle(){};                           //기본생성자
	Triangle(double a, double b, double c){ //인자로 변 길이들을 받는 생성자
		//받은 변의 길이 각각 인스턴스 변수에 대입
		s1 = a;
		s2 = b;
		s3 = c;
	}
	
	//넓이 method overwritting
	public double area() {
		double s = (s1+s2+s3)/2;
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)); //삼각형 넓이 반환
	}
	
	//둘레 method overwritting
	public double perimeter() {
		return s1+s2+s3;   //삼각형 둘레 반환
	}
}