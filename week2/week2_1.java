package week2;
import java.util.*;
import java.util.Scanner;

public class week2_1_�輭�� {
	public static void main(String[] args) {
		//Ű���� �Է� ���� �� �ִ� ��ü ����
		Scanner keyboard = new Scanner(System.in);
		
		//����ڷκ��� �ݾ� �Է� �ޱ�
		System.out.print("Input the amount of money(0~1000000):");
		int money = keyboard.nextInt();
		
		//�Ž����� ������ֱ�
		System.out.println("THe output will be");
		
		//�Ž����� ����� ������ ����
		int left;
		
		//50000�� �Ž����� ��� �� ���
		System.out.println("50000 won: " + money/50000);
		
		//������ �Ž����� ���� ������ 10000�� �Ž����� ��� �� ���
		left = money % 50000;
		System.out.println("10000 won: " + left/10000);
		
		//���� �Ž����� ���� ������ 5000�� �Ž����� ��� �� ���
		left = left % 10000;
		System.out.println("5000 won: " + left/5000);
		
		//��õ�� �Ž����� ���� ������ 1000�� �Ž����� ��� �� ���
		left = left % 5000;
		System.out.println("1000 won: " + left/1000);
		
		//õ�� �Ž����� ���� ������ 500�� �Ž����� ��� �� ���
		left = left % 1000;
		System.out.println("500 won: " + left/500);
		
		//����� �Ž����� ���� ������ 100�� �Ž����� ��� �� ���
		left = left % 500;
		System.out.println("100 won: "+ left/100);
		
		//��� �Ž����� ���� ������ 50�� �Ž����� ��� �� ���
		left = left % 100;
		System.out.println("50 won: "+ left/50);
		
		//50 �Ž����� ���� ������ 10�� �Ž����� ��� �� ���
		left = left % 50;
		System.out.println("10 won: "+ left/10);
		
		//��� �Ž����� ���� ������ �Ի� �� ���
		left = left % 10;
		System.out.println("Remainder: "+ left);
	}

}
