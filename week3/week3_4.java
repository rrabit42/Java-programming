import java.util.Scanner;

public class week3_4_�輭�� {

	public static void main(String[] args) {
		//Ű���� �Է��� ���� ��ü ����
		Scanner keyboard = new Scanner(System.in);
		
		//����ڿ��� ������ ���� �Է� �ޱ�
		System.out.print("Enter the height of the triangle : ");
		int num = keyboard.nextInt();
		
		//���� ���
		for(int i=1; i<=num ; i++) {      //����� ������ ���̸�ŭ �ݺ�
			
			for(int j=1; j<=num-i; j++) { //�� �ٿ��� ����� ����
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++) { //�� �ٿ��� ����� *
				System.out.print("*");
			}
			
			System.out.print("\n");       //�� ���� ������ ���� �ٲ۴�
			
		}

	}

}
