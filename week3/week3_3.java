import java.util.Scanner;

public class week3_3_�輭�� {

	public static void main(String[] args) {
		//Ű���� �Է��� ���� ��ü ����
		Scanner keyboard = new Scanner(System.in);
	
		//����� ������ ����ڷκ��� �Է� �ޱ�
		System.out.println("Factorial�� ����� ���� �Է�");
		int num = keyboard.nextInt();
		
		//1~10 ���� ���� ������ �Է� ��, ���Է� �ޱ�
		while (num<1 || num >10) { //����� �Է��� �� ���� �ݺ�
			System.out.println("���� ���Է�(1~10):");
			num = keyboard.nextInt();
		}
		
		//���丮�� ����� ���� ���� �� �ʱ�ȭ
		int result=1;
		//���丮�� �Ի�
		for (int i= 1; i<= num; i++) {
			result *= i;
		}
		
		//����� �������� �䱸�ϴ� �ٿ� ���� ����ϱ� ���� �ݺ���
		//n! = n*(n-1)* ... * 2*1 ��
		System.out.print(num+"! = "+num+" X ");
		for (int i= num-1; i>1; i-- ) {
			System.out.print(i+" X ");
		}
		System.out.print("1 = "+result);
		
	}

}
