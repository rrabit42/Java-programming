package week4;

public class Circle {
	//�ν��Ͻ� ���� ����
	public final double PI = 3.14159; //���̰�
	private double radius;               //��������
	
	//�������� �������ִ� �޼ҵ�
	public void setRadius(double radius) {
		if (radius>0) { //�������� 0 �̻��� ����
			this.radius = radius; //�ν��Ͻ��� ������������ ����
		}
	}

	//�������� �������ִ� �޼ҵ�
	public double getRadius() {
		return radius;
	}
	
	//���������� �̿��� ���� �������ִ� �޼ҵ�
	public double area(double radius) {
		return PI*radius*radius; //���� ����ؼ� ����
	}
	
	//���� ���� �����ִ� �޼ҵ�
	public void showCircle() {
		System.out.println("������: "+radius);
		System.out.println("���� ����: "+area(radius));
	}
	
	
}
