import java.util.Scanner;
public class week1_1_�輭�� {
	public static void main(String[] args) {		
		//�Է°����ϰ� �ϴ� ��ü ����
		Scanner keyboard = new Scanner(System.in);
		//�Է� ���� ������ ������, ���� �غ�, ����
		int base, height;
		
		//�غ� �Է� �ޱ�
		System.out.print("Input base: ");
		base = keyboard.nextInt();
		
		//���� �Է¹ޱ�
		System.out.print("Input height: ");
		height = keyboard.nextInt();
		
		//�ﰢ���� ���̸� �Ǽ������� ����Ѵ�
		System.out.print("The area: ");
		System.out.print((float)base*height/2);
	
	}
}
