import java.util.Scanner;

public class week1_3_�輭�� {

	public static void main(String[] args) {
		//�Է� �����ϰ� �ϴ� ��ü ����
		Scanner keyboard = new Scanner(System.in);
		
		//���� ȭ��, ���� ����
		int hwa;  //ȭ��
		float sup;//����
		
		//ȭ���µ��� �Է¹޴´�
		System.out.print("ȭ���µ� �Է�:");
		hwa = keyboard.nextInt();
		
		//�Է¹��� ȭ���µ��� �̿��� �����µ��� ����Ѵ�
		sup = (float)5/9*(hwa-32);
		
		//ȭ���µ��� ���� �µ��� ����Ѵ�
		System.out.printf("\nȭ���µ�:%d\n", hwa);
		System.out.printf("�����µ�:%.1f\n", sup); //�Ҽ��� ���� 1�ڸ��� ���
		
	
		

	}

}
