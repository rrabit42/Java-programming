import java.util.Scanner;
public class week1_2_김서영 {

	public static void main(String[] args) {
		//입력가능하게 하는 객체 생성
		Scanner keyboard = new Scanner(System.in);
		//입력 받을 정수들의 변수명들
		int n1, n2, n3;
		
		//정수 세개 입력 받기
		System.out.println("정수 세 개 입력");
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		n3 = keyboard.nextInt();
		
		//평균값 담을 변수
		float avg;
		//평균값 계산
		avg = (float)(n1+n2+n3)/3;
				
		//세수의 평균값을 소수점 이하 둘째자리까지 출력한다
		System.out.printf("평균:%.2f",avg);

	}

}
