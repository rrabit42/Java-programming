package week4;

import java.util.Scanner;

public class week4_1_�輭�� {

	public static void main(String[] args) {
		//�Է¹��� �뷡 ��ü ����
		Song song1 = new Song();
		Song song2 = new Song();
		
		//Ű����κ��� �Է� ���� �������� ����
		Scanner keyboard = new Scanner(System.in);
		
		//ù��° �뷡 ��ü ���� ����
		System.out.println("*Song 1*");
		System.out.print("����Է�:");
		song1.title = keyboard.nextLine();  //��� �Է¹޾� ����
		System.out.print("�������Է�:");
		song1.singer = keyboard.nextLine(); //������ �Է¹޾� ����
		System.out.print("�����Է�:");
		song1.price = keyboard.nextInt();  //���� �Է¹޾� ����
		
		keyboard.nextLine(); //���۸� ���ֱ� ����
		//�ι�° �뷡 ��ü ���� ����
		System.out.println("\n*Song 2*");
		System.out.print("����Է�:");
		song2.title = keyboard.nextLine();     //��� �Է¹޾� ����
		System.out.print("�������Է�:");
		song2.singer = keyboard.nextLine();  //������ �Է¹޾� ����
		System.out.print("�����Է�:");
		song2.price = keyboard.nextInt();     //�����Է¹޾� ����
		
		//�뷡 ����
		System.out.println("\n�뷡�� ������");
		System.out.println("1:"+song1.title+" 2:"+song2.title);
		//���� �Է¹ޱ�
		int choose = keyboard.nextInt();
		if (choose==1) { //1�� ����
			song1.play(); //1�� ����ִٴ� ������ �޼ҵ� ���
			song1.price(); //���� �˷��ֱ�
		}
		else {
			song2.play();  //���ϵ���
			song2.price();
		}
		System.out.println("�����մϴ�.");
		
	}

}
