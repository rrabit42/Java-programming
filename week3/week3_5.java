import java.util.Scanner;

public class week3_5_김서영 {

	public static void main(String[] args) {
		//네그룹의 학생들의 점수 정보 배열
		int[][] Score = new int [][] { {90, 87, 85, 69, 71, 80},
										{83, 74, 95, 62},
										{93, 66, 87, 88, 79},
										{65, 96, 79, 84, 89, 90}
		};
		
		//그룹별 학생 성적 출력
		System.out.println("<학생별 성적>");
		
		//우선 각 그룹에 접근한다, 전체 배열의 행수만큼 반복
		for (int i=0; i<Score.length; i++) {
			System.out.print("그룹"+(i+1)+":    ");
			
			//그룹에 있는 각 학생들의 정보를 차례로 출력한다, 각 행의 열수 만큼 반복
			for(int j=0; j<Score[i].length; j++) {
				System.out.print(Score[i][j]+"    ");
			}
			
			System.out.print("\n");
		}
		
		//그룹별 점수 평균 출력
		System.out.println("\n<그룹별 평군>");
		//각 그룹에 접근한다. 전체 배열의 행수만큼 반복
		for (int i=0; i<Score.length; i++) {
			//점수를 합산할 변수 생성 및 초기화
			double sum=0;
			
			//점수 합산
			for(int j=0; j<Score[i].length; j++) {
				sum += Score[i][j];
			}
			
			//그룹별 점수 합산하여 학생 수 만큼 나눠 평균을 낸다
			System.out.printf("그룹%d:  %.2f", i+1, sum/Score[i].length);
			
			//그룹마다 다른 줄에 출력되게
			System.out.print("\n");
		}
		
		
	}

}
