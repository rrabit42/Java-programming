package week4;

import java.util.Scanner;

public class week4_2_�輭�� {
	public static void main(String[] args) {
		//�� ��ü ����
		Circle circle = new Circle();
		
		//Ű���� �Է¹��� �������� ����
		Scanner keyboard = new Scanner(System.in);

		//������ �Է¹޾�
		System.out.print("������ �Է�:");
		double rad= keyboard.nextDouble();
		//��ü�� ���������� ����
		circle.setRadius(rad);
		//���� �������� ���� ���
		circle.showCircle();
		
	}

}
