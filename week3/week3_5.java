import java.util.Scanner;

public class week3_5_�輭�� {

	public static void main(String[] args) {
		//�ױ׷��� �л����� ���� ���� �迭
		int[][] Score = new int [][] { {90, 87, 85, 69, 71, 80},
										{83, 74, 95, 62},
										{93, 66, 87, 88, 79},
										{65, 96, 79, 84, 89, 90}
		};
		
		//�׷캰 �л� ���� ���
		System.out.println("<�л��� ����>");
		
		//�켱 �� �׷쿡 �����Ѵ�, ��ü �迭�� �����ŭ �ݺ�
		for (int i=0; i<Score.length; i++) {
			System.out.print("�׷�"+(i+1)+":    ");
			
			//�׷쿡 �ִ� �� �л����� ������ ���ʷ� ����Ѵ�, �� ���� ���� ��ŭ �ݺ�
			for(int j=0; j<Score[i].length; j++) {
				System.out.print(Score[i][j]+"    ");
			}
			
			System.out.print("\n");
		}
		
		//�׷캰 ���� ��� ���
		System.out.println("\n<�׷캰 ��>");
		//�� �׷쿡 �����Ѵ�. ��ü �迭�� �����ŭ �ݺ�
		for (int i=0; i<Score.length; i++) {
			//������ �ջ��� ���� ���� �� �ʱ�ȭ
			double sum=0;
			
			//���� �ջ�
			for(int j=0; j<Score[i].length; j++) {
				sum += Score[i][j];
			}
			
			//�׷캰 ���� �ջ��Ͽ� �л� �� ��ŭ ���� ����� ����
			System.out.printf("�׷�%d:  %.2f", i+1, sum/Score[i].length);
			
			//�׷츶�� �ٸ� �ٿ� ��µǰ�
			System.out.print("\n");
		}
		
		
	}

}
