import java.util.Scanner;

public class week3_3_김서영 {

	public static void main(String[] args) {
		//키보드 입력을 위한 객체 생성
		Scanner keyboard = new Scanner(System.in);
	
		//계산할 정수를 사용자로부터 입력 받기
		System.out.println("Factorial을 계산할 정수 입력");
		int num = keyboard.nextInt();
		
		//1~10 범위 외의 정수를 입력 시, 재입력 받기
		while (num<1 || num >10) { //제대로 입력할 때 까지 반복
			System.out.println("정수 재입력(1~10):");
			num = keyboard.nextInt();
		}
		
		//팩토리얼 계산할 변수 생성 및 초기화
		int result=1;
		//팩토리얼 게산
		for (int i= 1; i<= num; i++) {
			result *= i;
		}
		
		//결과를 과제에서 요구하는 바와 같이 출력하기 위한 반복문
		//n! = n*(n-1)* ... * 2*1 꼴
		System.out.print(num+"! = "+num+" X ");
		for (int i= num-1; i>1; i-- ) {
			System.out.print(i+" X ");
		}
		System.out.print("1 = "+result);
		
	}

}
