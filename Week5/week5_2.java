package week;

import java.util.Scanner;

//Facto class
class Facto {
	//���丮�� ��� ����� ���� result ����
	static int result;	
	//���丮�� ��� �޼���
	static int facto_sum(int x) {
		//result 1�� �ʱ�ȭ
		result = 1;
		//1���� x���� �ݺ��ؼ�
		for(int i=1; i<=x; i++) {
			//���Ѵ�
			result *= i;
		}
		//result ����
		return result;
	}
}


public class week5_2_�輭�� {
	public static void main(String[] args) {
		//Ű���� �Է��� ���� �������� ����
		Scanner kbd = new Scanner(System.in);
		
		//����ڿ��� ���� �Է¹��� ������
		int first, second;
		
		//ù��° ���� �Է� �ޱ�
		System.out.print("ù��° ���� �Է�:");
		first = kbd.nextInt();
		
		//�ι�° ���� �Է� �ޱ�
		System.out.print("�ι�° ���� �Է�:");
		second = kbd.nextInt();
		
		//����� ����ϱ�, static �޼��� ȣ���Ͽ� ����ϱ�
		System.out.printf("Factorial(%d) - Factorial(%d) = %d", first, second, Facto.facto_sum(first)- Facto.facto_sum(second));
	}

}
