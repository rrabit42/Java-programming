import java.util.Scanner;

public class week3_2_�輭�� {

	public static void main(String[] args) {
		//Ű���� �Է��� ���� ��ü ����
		Scanner keyboard = new Scanner(System.in);
		
		//�ʿ��� ������ ����
		char grade;      //��� ����
		String re = "y"; //�ݺ��� �����ϴ� ����
		
		//re�� y�� ������ �ݺ��ϰ� �� �ܴ̿� �ݺ����� �����Ѵ�
		while(re.equalsIgnoreCase("y")){
			//����ڿ��� ������ �Է¹޴´�
			System.out.print("�����Է�:");
			int score = keyboard.nextInt();
			
			//1~100������ ���ڸ� �Է����� ������
			if (score>100 || score <0) {
				//�Է� ������ ���� ������ �˷��ְ�
				System.out.println("������ 0~100�����Դϴ�.");
				//����ڿ��� �ݺ� ���θ� �ٽ� �����.
				System.out.println("�ݺ��Ͻðڽ��ϱ�?(y/n)");
				re = keyboard.next();
			}
			
			//�ùٸ� ������ ���ڸ� �Է��� ��
			else {
				//switch���� �̿��� ����� �����Ѵ�
				int score2 = score/10;
				switch(score2) {
					case 10:
					case 9: grade = 'A'; break; //90~100���� A���
					case 8: grade = 'B'; break; //80~89���� B
					case 7: grade = 'C'; break; //70~79���� C
					case 6: grade = 'D'; break; //60~69���� D
					default: grade = 'F'; //�������� F���
				}
				//����� �����Ǹ� ������ ����� ������ְ�
				System.out.println("������ "+score+"���̰� grade�� "+grade+"�Դϴ�.");
				
				//����ڿ��� �ݺ� ���θ� �ٽ� �����
				System.out.println("�ݺ��Ͻðڽ��ϱ�?(y/n)");
				re = keyboard.next();
			}
		
		}
		//����ڰ� �ݺ��� ������ ���� �� ���Ḧ ����ϰ� ���α׷��� �����Ѵ�
		System.out.println("����");
	}

}
