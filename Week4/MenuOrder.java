package practice;

public class MenuOrder {
	//인스턴스 변수들
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected; //사용하지 않았다..
	
	//가격책정해주는 메소드
	public void setPrice(String menu,int price) {//사용자로부터 메뉴이름과 그 가격 인자로 받기
		if(menu=="coke") {    //콜라면
			cokePrice = price;//콜라 가격 설정
		}
		else if(menu=="lemon") {//레몬에이드 가격 설정
			lemonadePrice=price;
		}
		else if(menu=="coffee") {//커피 가격 설정
			coffeePrice=price;
		}
	}
	
	//메뉴 보여주는 메소드
	public void showMenu() {
		//순서대로 메뉴번호, 이름, 가격을 보여준다
		System.out.println("1. Coke: "+cokePrice);
		System.out.println("2. Lemonade: "+lemonadePrice);
		System.out.println("3. Coffee: "+coffeePrice);
	}
	
	//사용자로부터 사용자가 지불한 돈 입력받아서
	public void setMoney(int money) {
		inputMoney = money;  //inputMoney로 설정해준다
	}
	
	//결과 보여주는 메소드
	public void showResult(int order) {//사용자의 음료선택을 인자로 받는다
		switch(order) {
			case 1: System.out.println("Coke를 선택하셨습니다.");break;      //1번이면 콜라
			case 2: System.out.println("Lemonade를 선택하셨습니다."); break; //2번이면 레몬에이드
			case 3: System.out.println("Coffee를 선택하셨습니다."); break;   //3번이면 커피
			default: System.out.println("없는 메뉴를 선택하셨습니다.");         //그 외는 없는 메뉴라고 출력
		}
		
		//콜라를 주문했을 시,
		if(order == 1) {
			if(inputMoney>=cokePrice) {//지불한돈이 콜라 가격보다 더 많을 때
				System.out.printf("잔돈은 %d입니다.\n", inputMoney-cokePrice);//잔돈계산
			}
			else {//지불한 돈이 콜라 가격보다 적을 때
				System.out.println(cokePrice-inputMoney+"원 더 넣어주세요.");//얼마나 돈을 더 넣어줘야하는지 계산
			}
		}
		
		//레몬에이드를 주문했을시
		else if(order == 2){
			if(inputMoney>=lemonadePrice) {//지불한돈이 레몬에이드 가격보다 많을 때
				System.out.printf("잔돈은 %d입니다.\n",inputMoney-lemonadePrice); //잔돈계산
			}
			else {//지불한 돈이 레몬에이드 가격보다 적을 때
				System.out.println(lemonadePrice-inputMoney+"원 더 넣어주세요.");//추가 필요한 돈 계산
			}
		}
		
		//커피주문했을 시, 이하동문
		else if(order ==3) {
			if(inputMoney>=coffeePrice) {
				System.out.printf("잔돈은 %d입니다.\n",inputMoney-coffeePrice);
			}
			else {
				System.out.println(coffeePrice-inputMoney+"원 더 넣어주세요.");
			}
		}
		
	}
}