package week4;

import java.util.Scanner;

public class week4_1_김서영 {

	public static void main(String[] args) {
		//입력받을 노래 객체 생성
		Song song1 = new Song();
		Song song2 = new Song();
		
		//키보드로부터 입력 받을 참조변수 선언
		Scanner keyboard = new Scanner(System.in);
		
		//첫번째 노래 객체 정보 설정
		System.out.println("*Song 1*");
		System.out.print("곡명입력:");
		song1.title = keyboard.nextLine();  //곡명 입력받아 설정
		System.out.print("가수명입력:");
		song1.singer = keyboard.nextLine(); //가수명 입력받아 설정
		System.out.print("가격입력:");
		song1.price = keyboard.nextInt();  //가격 입력받아 설정
		
		keyboard.nextLine(); //버퍼를 없애기 위함
		//두번째 노래 객체 정보 설정
		System.out.println("\n*Song 2*");
		System.out.print("곡명입력:");
		song2.title = keyboard.nextLine();     //곡명 입력받아 설정
		System.out.print("가수명입력:");
		song2.singer = keyboard.nextLine();  //가수명 입력받아 설정
		System.out.print("가격입력:");
		song2.price = keyboard.nextInt();     //가격입력받아 설정
		
		//노래 고르기
		System.out.println("\n노래를 고르세요");
		System.out.println("1:"+song1.title+" 2:"+song2.title);
		//선택 입력받기
		int choose = keyboard.nextInt();
		if (choose==1) { //1번 고르면
			song1.play(); //1번 듣고있다는 내용의 메소드 출력
			song1.price(); //가격 알려주기
		}
		else {
			song2.play();  //이하동문
			song2.price();
		}
		System.out.println("감사합니다.");
		
	}

}
