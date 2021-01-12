package practice;

import java.util.Scanner;

public class week4_4_김서영 {
	public static void main(String[] args) {
		//키보드로부터 입력받을 참조 변수 설정
		Scanner keyboard = new Scanner(System.in);
		
		//메뉴객체 만들기
		MenuOrder menu = new MenuOrder();

		//반복을 위한 변수
		String choose = "y";
		
		//만든 객체에서 음료 가격 설정해주기
		System.out.println("---음료가격 설정---");
		System.out.print("Coke가격:");                 //콜라
		menu.setPrice("coke", keyboard.nextInt());    //가격 set해주는 메소드 이용해 가격 설정
		System.out.print("Lemonade가격:");             //레몬에이드
		menu.setPrice("lemon", keyboard.nextInt());
		System.out.print("Coffee가격:");               //커피
		menu.setPrice("coffee", keyboard.nextInt());
		
		while(choose.equalsIgnoreCase("y")) { //choose변수가 y,Y일 때 반복
			//사용자로부터 지불할 돈 입력받기
			System.out.println("\n---돈을 넣으세요---");
			menu.setMoney(keyboard.nextInt());
			
			//주문할 음료 선택하기
			System.out.println("---음료를선택하세요---");
			//메뉴판 보여주기
			menu.showMenu();
			//음료 주문하기(번호로)
			int order = keyboard.nextInt();
			
			//음료 주문한 결과 보여주기
			menu.showResult(order);
			
			//계속할건지 묻기
			System.out.println("계속 하시겠습니까?(y/n)");
			choose=keyboard.next();
		}
		
	}
}