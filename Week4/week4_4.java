package practice;

import java.util.Scanner;

public class week4_4_�輭�� {
	public static void main(String[] args) {
		//Ű����κ��� �Է¹��� ���� ���� ����
		Scanner keyboard = new Scanner(System.in);
		
		//�޴���ü �����
		MenuOrder menu = new MenuOrder();

		//�ݺ��� ���� ����
		String choose = "y";
		
		//���� ��ü���� ���� ���� �������ֱ�
		System.out.println("---���ᰡ�� ����---");
		System.out.print("Coke����:");                 //�ݶ�
		menu.setPrice("coke", keyboard.nextInt());    //���� set���ִ� �޼ҵ� �̿��� ���� ����
		System.out.print("Lemonade����:");             //�����̵�
		menu.setPrice("lemon", keyboard.nextInt());
		System.out.print("Coffee����:");               //Ŀ��
		menu.setPrice("coffee", keyboard.nextInt());
		
		while(choose.equalsIgnoreCase("y")) { //choose������ y,Y�� �� �ݺ�
			//����ڷκ��� ������ �� �Է¹ޱ�
			System.out.println("\n---���� ��������---");
			menu.setMoney(keyboard.nextInt());
			
			//�ֹ��� ���� �����ϱ�
			System.out.println("---���Ḧ�����ϼ���---");
			//�޴��� �����ֱ�
			menu.showMenu();
			//���� �ֹ��ϱ�(��ȣ��)
			int order = keyboard.nextInt();
			
			//���� �ֹ��� ��� �����ֱ�
			menu.showResult(order);
			
			//����Ұ��� ����
			System.out.println("��� �Ͻðڽ��ϱ�?(y/n)");
			choose=keyboard.next();
		}
		
	}
}