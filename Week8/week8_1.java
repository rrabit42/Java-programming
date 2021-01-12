package week8;

import java.util.Scanner;

public class week8_1_김서영 {

	public static void main(String[] args) {
		//변수 설정
		  //키보드 입력을 받을 참조 변수 및 객체
		Scanner kbd = new Scanner(System.in);
		  //펫 정보 담을 참조변수 배열
		Pet[] pets = new Pet[10];
		  //사용자에게 사용받을 변수들
		int rep, type;  //원하는 작업 묻기, 동물 종류 묻기
		  //반복을 위한 인덱스 변수
		int i =0;
		  //객체 정보 변수
		String name;  //이름
		int age;      //나이
		
		//반복문
		do {
			//원하는 작업 묻기
		System.out.println("\n원하는 작업은 무엇입니까?");
		System.out.println("1. New input\t2. Output\t3.Exit");
		rep = kbd.nextInt();
		
		   //선택한 숫자에 따라 작업 실행
		switch(rep){
		//1번 선택했을 시, 새 객체 추가
		case 1:
			//종 물어보기
			System.out.println("종은 무엇입니까?");
			System.out.println("1. Dog\t2. Cat\t3. Snake\t4. Bird");
			//종 타입 입력받고
			type= kbd.nextInt();
			kbd.nextLine();    //버퍼 비우기
			//동물의 이름 입력받고
			System.out.print("Name:");
			name = kbd.nextLine();
			//동물의 나이 입력받기
			System.out.print("Age:");
			age = kbd.nextInt();
			
			//동물의 종 타입에 따라 만들어지는 객체 달리하기
			switch(type) { 
			case 1: //1일때 Dog 객체 만들어서 참조변수 배열로 참조하기
				pets[i] = new Dog(name, age);
				break;
			case 2: //2일때 Cat 객체
				pets[i] = new Cat(name, age);
				break;
			case 3: //3일때 Snake 객체
				pets[i] = new Snake(name, age);
				break;
			case 4: //4일떄 Bird 객체
				pets[i] = new Bird(name, age);
				break;
			}
			i++;   //다음 참조변수에 저장할 수 있도록
			break;
			
		//2번 선택했을 때 객체 출력
		case 2:
			//객체의 종, 이름, 나이, 행동 출력
			System.out.println("Species\tName\tAge\tMovement");
			//객체 출력
			for(int j =0; j< i; j++) { //사용자에게 입력 받은 만큼만
				System.out.print(pets[j].species+"\t"+pets[j].name+"\t"+pets[j].age+"\t");
				pets[j].move();
			}
			break;
			
		//3번 선택했을 때 switch 탈출
		case 3:
			break;
		}
		}while(rep != 3); // 3일때는 반복문 탈출
		
		//반복문 끝나면 종료 출력
		System.out.println("종료");
	}

}

//추상 클래스 pet
abstract class Pet{
	//인스턴스 변수들
	public String species; //펫 종
	public String name;    //이름
	public int age;        //나이
	
	//움직임 method
	public abstract void move();
}

//Dog - pet의 자손 클래스
class Dog extends Pet{
	//생성자, 이름과 나이 입력 받았을 때
	Dog (String name, int age){
		species = "Dog";  //종 대입
		this.name = name; //이름 대입
		this.age= age;    //나이 대입
	}
	
	//움직임 method overwritting
	public void move() {
		System.out.println("run!"); //Dog은 run
	}
}

//Cat - pet의 자손 클래스
class Cat extends Pet {
	//생성자, 이름과 나이 입력 받았을 때
	Cat(String name, int age){
		species = "Cat";  //종 대입
		this.name = name; //이름 대입
		this.age= age;    //나이 대입
	}
	
	//움직임 method overwritting
	public void move() {
		System.out.println("jump!");//Cat은 jump
	}
}

//Bird - pet의 자손 클래스
class Bird extends Pet{
	//생성자, 이름과 나이 입력 받았을 때
	Bird(String name, int age){
		species = "Bird";  //종 대입
		this.name = name;  //이름 대입
		this.age= age;     //나이 대입
	}
	
	//움직임 method overwritting
	public void move() {
		System.out.println("fly!");//Bird는 fly
	}
}

//Snake - pet의 자손 클래스
class Snake extends Pet{
	//생성자, 이름과 나이 입력 받았을 때
	Snake(String name, int age){
		species = "Snake"; //종 대입
		this.name = name;  //이름 대입
		this.age= age;     //나이 대입
	}
	
	public void move() {
		System.out.println("crawl!"); //Snake은 crawl
	}
}