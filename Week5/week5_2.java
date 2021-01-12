package week;

import java.util.Scanner;

//Facto class
class Facto {
	//팩토리얼 계산 결과를 받을 result 변수
	static int result;	
	//팩토리얼 계산 메서드
	static int facto_sum(int x) {
		//result 1로 초기화
		result = 1;
		//1에서 x까지 반복해서
		for(int i=1; i<=x; i++) {
			//곱한다
			result *= i;
		}
		//result 리턴
		return result;
	}
}


public class week5_2_김서영 {
	public static void main(String[] args) {
		//키보드 입력을 위한 참조변수 정의
		Scanner kbd = new Scanner(System.in);
		
		//사용자에게 원소 입력받을 변수들
		int first, second;
		
		//첫번째 원소 입력 받기
		System.out.print("첫번째 원소 입력:");
		first = kbd.nextInt();
		
		//두번째 원소 입력 받기
		System.out.print("두번째 원소 입력:");
		second = kbd.nextInt();
		
		//계산결과 출력하기, static 메서드 호출하여 계산하기
		System.out.printf("Factorial(%d) - Factorial(%d) = %d", first, second, Facto.facto_sum(first)- Facto.facto_sum(second));
	}

}
