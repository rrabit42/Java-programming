package week8;

import java.util.Scanner;

public class week8_2_�輭�� {
	public static void main(String[] args) {
		//Ű���� �Է��� ���� ���� ���� �� ��ü
		Scanner kbd = new Scanner(System.in);
		
		//���� ������ �Է� �ޱ�
		System.out.println("Input radius for a circle");
		  //�� ��ü �����ؼ� �����ڿ� ���ڷ� ������ �ֱ�
		Circle c = new Circle(kbd.nextDouble());
		
		//���簢���� �� ���� �Է� �ޱ�
		System.out.println("Input length for a square");
		  //���簢�� ��ü �����ؼ� �����ڿ� ���ڷ� �� ���� �ֱ�
		Square s = new Square(kbd.nextDouble());
		
		//�ﰢ���� �� ���� �Է� �ޱ�
		  //ù��° �� ����
		System.out.println("Input a for a triangle");
		double s1 = kbd.nextDouble();
		  //�ι�° �� ����
		System.out.println("Input b for a triangle");
		double s2 = kbd.nextDouble();
		  //����° �� ����
		System.out.println("Input c for a triangle");
		double s3 = kbd.nextDouble();
		  //�ﰢ�� ��ü �����ؼ� �����ڿ� ���ڷ� ���� �ֱ�
		Triangle t = new Triangle(s1,s2,s3);
		
		//��� ���
		 //���� ���� ���
		System.out.println("<Circle>");
		System.out.printf("Area:%.3f\n", c.area());               //����
		System.out.printf("Circumference:%.4f\n", c.perimeter()); //�ѷ� ����
		 //�簢�� ���� ���
		System.out.println("<Square>");
		System.out.printf("Area:%.1f\n", s.area());               //����
		System.out.printf("Circumference:%.1f\n", s.perimeter()); //�ѷ� ����
		 //�ﰢ�� ���� ���		
		System.out.println("<Triangle>");
		System.out.printf("Area:%.1f\n", t.area());               //����
		System.out.printf("Circumference:%.1f\n", t.perimeter()); //�ѷ� ����
	}
}

//Geometry�� ������ Circle class
class Circle implements Geometry{
	//�ν��Ͻ� ���� - ������ ����
	double radius;
	
	//������
	Circle(){};           //�⺻ ������
	Circle(double radius){//������ ���̸� ���ڷ� �޴� ������
		this.radius = radius; //���� ���̸� �ν��Ͻ� ������ ����
	}
	
	//���� method overwritting
	public double area() {
		return radius*radius*PI; //���� ���� ��ȯ
	}
	
	//�ѷ� method overwritting
	public double perimeter() {
		return 2*radius*PI;      //���� �ѷ� ��ȯ
	}
}

//Geometry�� ������ Square class
class Square implements Geometry{
	//�ν��Ͻ� ���� - ���� ����
	double side;
	
	//������
	Square(){};          //�⺻ ������
	Square(double side){ //���� ���̸� ���ڷ� �޴� ������
		this.side = side;  //���� ���̸� �ν��Ͻ� ������ ����
	}
	
	//���� method overwritting
	public double area() {
		return side*side;  //���簢���� ���� ��ȯ
	}
	
	//�ѷ� method overwritting
	public double perimeter() {
		return 4*side;    //���簢���� �ѷ� ��ȯ
	}
}

//Geometry�� ������ Triangle class
class Triangle implements Geometry{
	//�ν��Ͻ� ���� - ���� ���̵�
	double s1, s2, s3;
	
	//������
	Triangle(){};                           //�⺻������
	Triangle(double a, double b, double c){ //���ڷ� �� ���̵��� �޴� ������
		//���� ���� ���� ���� �ν��Ͻ� ������ ����
		s1 = a;
		s2 = b;
		s3 = c;
	}
	
	//���� method overwritting
	public double area() {
		double s = (s1+s2+s3)/2;
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)); //�ﰢ�� ���� ��ȯ
	}
	
	//�ѷ� method overwritting
	public double perimeter() {
		return s1+s2+s3;   //�ﰢ�� �ѷ� ��ȯ
	}
}