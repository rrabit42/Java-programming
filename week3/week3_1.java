import java.util.Scanner;

public class week3_1_�輭�� {

	public static void main(String[] args) {
		//Ű���� �Է��� ���� ��ü ����
		Scanner keyboard = new Scanner(System.in);
		
		//����ڿ��� ��(����) �Է� �ޱ�
		System.out.print("�� �Է�:");
		int month = keyboard.nextInt();
		
		//switch���� �̿��� ������ �� �� ������ֱ�
		switch(month) {
		//1,3,5,7,8,10,12 ���� 31��
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month+"������ 31���� �ֽ��ϴ�.");
			break;
		//4,6,9,11���� 30��
		case 4: case 6: case 9: case 11:
			System.out.println(month+"������ 30���� �ֽ��ϴ�.");
			break;
		//2���� 28��
		case 2:
			System.out.println("2������ 28���� �ֽ��ϴ�.");
			break;
		//1~12�� ������ �ƴ� �ٸ� ������ �Է� ���� ���� �Է� ���� ���
		default:
			System.out.println("�Է� ����");
				
		}
		
	}

}
