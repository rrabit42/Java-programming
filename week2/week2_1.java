package week2;
import java.util.*;
import java.util.Scanner;

public class week2_1_김서영 {
	public static void main(String[] args) {
		//키보드 입력 받을 수 있는 객체 생성
		Scanner keyboard = new Scanner(System.in);
		
		//사용자로부터 금액 입력 받기
		System.out.print("Input the amount of money(0~1000000):");
		int money = keyboard.nextInt();
		
		//거스름돈 출력해주기
		System.out.println("THe output will be");
		
		//거스름돈 계산을 도와줄 변수
		int left;
		
		//50000원 거스름돈 계산 및 출력
		System.out.println("50000 won: " + money/50000);
		
		//오만원 거스르고 남은 돈으로 10000원 거스름돈 계산 및 출력
		left = money % 50000;
		System.out.println("10000 won: " + left/10000);
		
		//만원 거스르고 남은 돈으로 5000원 거스름돈 계산 및 출력
		left = left % 10000;
		System.out.println("5000 won: " + left/5000);
		
		//오천원 거스르고 남은 돈으로 1000원 거스름돈 계산 및 출력
		left = left % 5000;
		System.out.println("1000 won: " + left/1000);
		
		//천원 거스르고 남은 돈으로 500원 거스름돈 계산 및 출력
		left = left % 1000;
		System.out.println("500 won: " + left/500);
		
		//오백원 거스르고 남은 돈으로 100원 거스름돈 계산 및 출력
		left = left % 500;
		System.out.println("100 won: "+ left/100);
		
		//백원 거스르고 남은 돈으로 50원 거스름돈 계산 및 출력
		left = left % 100;
		System.out.println("50 won: "+ left/50);
		
		//50 거스르고 남은 돈으로 10원 거스름돈 계산 및 출력
		left = left % 50;
		System.out.println("10 won: "+ left/10);
		
		//모두 거스르고 남은 돈으로 게산 및 출력
		left = left % 10;
		System.out.println("Remainder: "+ left);
	}

}
