package week7;

import java.util.Scanner;

public class week7_1_김서영 {

	public static void main(String[] args) {
		//사용자 객체 정의
		Buyer user = new Buyer();
		//사용자의 선택 변수
		int choose;
		
		//제품 객체와 참조변수들
		Tv t = new Tv();              //TV
		Computer c = new Computer();  //컴퓨터
		Video v = new Video();        //비디오
		Audio a = new Audio();        //오디오
		Notebook n = new Notebook();  //노트북
		
		//키보드 입력을 위한 참조변수 및 객체
		Scanner kbd = new Scanner(System.in);
		
		
		//사용자에게 현재 가진 돈을 입력받기
		System.out.println("How much money do you have?");
		  //받아서 사용자 객체 돈 변수에 입력
		user.money = kbd.nextInt();
		
		//반복
		do{
			System.out.println("What do you want to buy? Input 0 to quit.");
			//살 메뉴 선택
			System.out.println("1. TV(100)\t2. Computer(200)\t3. Video(110)\t4. Audio(50)\t5. Notebook(300)");	
			choose = kbd.nextInt();
			//만약 0을 입력하면 반복문 탈출
			if (choose == 0) break;
			//메뉴 선택에 따라 사는 물품
			switch(choose) {
				case 1: user.buy(t); break; //1이면 티비 구매
				case 2: user.buy(c); break; //2면 컴퓨터  구매
				case 3: user.buy(v); break; //3이면 비디오 구매
				case 4: user.buy(a); break; //4면 오디오 구매
				case 5: user.buy(n); break; //5면 노트북 구매
				default: System.out.println("No such item"); break;
			}
		}while(choose != 0); //사용자가 0을 입력하면 반복문 탈출
		
		//구매가 끝나면, 산 제품과 남은 금액, 포인트 출력
		user.summary();
	}

}


//구매자 class
class Buyer{
	//인스턴스 변수
	public int money;   //구매자가 가지고 있는 돈
	int i;              //배열에 객체 추가를 위한 변수
	int bonusPoint = 0; //구매자의 포인트
	Product item[] = new Product[10]; //산 물품 목록 배열 선언
	
	//물품 구매 method
	void buy(Product pd) {
		//만약 물품 가격이 가지고 있는 돈보다 많으면
		if(pd.price > money) {
			//돈이 부족하다고 출력하고
			System.out.println("\nMoney is not enough. \n");
			//구매목록 및 돈, 포인트 출력
			summary();
			//프로그램 종료
			System.exit(0);
		}
		//가지고 있는 돈이 충분하면, 살 물품과 가격을 출력
		System.out.println("You bought "+pd+"("+pd.price+")");
		//물품 가격 지불
		money = money - pd.price;
		//보너스 포인트 쌓기
		bonusPoint = bonusPoint + pd.bonusPoint;
		//목록에 제품 객체 추가
		item[i++] = pd;
	}
	
	//구매목록 총 정리
	void summary() {
		//쇼핑목록 출력
		System.out.print("\nShopping list: ");
		for(int j=0; j<i; j++) System.out.print(item[j]+ " ");
		//남은 돈 출력
		System.out.println("\nMoney left: " + money);
		//포인트 출력
		System.out.println("Current bonus point: "+bonusPoint);
	}
}

//물품 class
class Product{
	int price;       //물품 가격
	int bonusPoint;  //물품으로 얻을 수 있는 포인트
	//생성자
	Product(int price){
		this.price = price;   //가격 받아 가격 대입
		bonusPoint = price/10;//포인트 대입
	}
}

//물품 중 Tv
class Tv extends Product{
	Tv(){
		super(100);   //티비 가격은 100
	}
	public String toString() {
		return "Tv";  //Tv 참조변수 부르면 Tv 리턴
	}
}

//물품 중 컴퓨터
class Computer extends Product{
	Computer(){
		super(200);  //컴퓨터 가격은 200
	}
	public String toString() {
		return "Computer"; //컴퓨터 참조변수 부르면 컴퓨터 리턴
	}
}

//물품 중 비디오
class Video extends Product{
	Video(){
		super(110);  //비디오 가격은 110
	}
	public String toString() {
		return "Video";    //비디오 참조변수 부르면 비디오 리턴
	}
}

//물품 중 오디오
class Audio extends Product{
	Audio(){
		super(50);  //오디오 가격은 50
	}
	public String toString() {
		return "Audio";    //오디오 참조변수 부르면 오디오 리턴
	}
}

//물품 중 노트북
class Notebook extends Product{
	Notebook(){
		super(300); //노트북 가격은 300
	}
	public String toString() {
		return "NoteBook";  //노트북 참조변수 부르면 노트북 리턴
	}
}