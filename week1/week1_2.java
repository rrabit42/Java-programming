import java.util.Scanner;
public class week1_2_�輭�� {

	public static void main(String[] args) {
		//�Է°����ϰ� �ϴ� ��ü ����
		Scanner keyboard = new Scanner(System.in);
		//�Է� ���� �������� �������
		int n1, n2, n3;
		
		//���� ���� �Է� �ޱ�
		System.out.println("���� �� �� �Է�");
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		n3 = keyboard.nextInt();
		
		//��հ� ���� ����
		float avg;
		//��հ� ���
		avg = (float)(n1+n2+n3)/3;
				
		//������ ��հ��� �Ҽ��� ���� ��°�ڸ����� ����Ѵ�
		System.out.printf("���:%.2f",avg);

	}

}
