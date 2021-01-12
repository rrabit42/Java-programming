package week7;

import java.util.Scanner;

public class week7_2_김서영 {

	public static void main(String[] args) {
		//키보드 입력을 위한 객체 및 참조변수 선언
		Scanner kbd = new Scanner(System.in);
		
		//Emergency 객체 및 참조변수 선언
		Emergency e = new Emergency();
		//소방차 객체 및 참조변수
		FireEngine f = new FireEngine();
		//구급차 객체 및 참조변수
		Ambulance a = new Ambulance();
		//경찰차 객체 및 참조변수
		PoliceCar p = new PoliceCar();
		//사용자의 호출을 받을 변수
		int choose;
		
		
		//반복문
		do {
			//사용자에게 어떤 응급상황인지 입력받기
			System.out.println("What kind of Emergency");
			System.out.println("1.Fire\t2.Patient\t3.Thief\t4.Record\t5.End");
			choose = kbd.nextInt();
			
			//사용자의 입력에 따라 각자 다른 응급차 호출
			switch(choose) {
				case 1: e.EM_CALL(f); break; //1이면 소방차 호출
				case 2: e.EM_CALL(a); break; //2면 구급차 호출
				case 3: e.EM_CALL(p); break; //3이면 경찰차 호출
				case 4: e.EM_record(); break;//4면 여태까지 기록한 호출 기록 출력
				case 5: break;               //5면 반복문 종료
				default: System.out.println("Wrong Input"); //그외 다른 숫자는 잘못된 입력이라 출력해주기
			}
			
		}while(choose != 5); //5 이외 선택일때만 반복
		
		//반복문 끝나면 종료문 출력
		System.out.println("Finished");
	}

}

//Emergency class
class Emergency{
	//응급상황 기록을 위한 배열 선언
	public Car[] emgList = new Car[10];
	//배열에 객체 추가를 위한 변수
	int i;
	
	//응급차 호출 method
	public void EM_CALL(Car c) {   //부모 클래스 참조변수로 인자 받기
		//만약 C가 소방차 객체를 가리키면
		if(c instanceof FireEngine) {
			//119 호출
			System.out.println("Call 119");
		}
		//만약 C가 구급차 객체를 가리키면
		else if (c instanceof Ambulance) {
			//119 호출
			System.out.println("Call 119");
		}
		//만약 C가 경찰차 객체를 가리키면
		else if ( c instanceof PoliceCar) {
			//112 호출
			System.out.println("Call 112");
		}
		
		//그리고 그 객체 c에 배열에 객체 추가하기
		emgList[i++] = c;
	}

	//응급차 호출 기록 호출 method
	public void EM_record() {
		//응급차 호출 기록 출력하기
		System.out.println("Emgergency\tNumber\tCar_Type\tRequired");
		for(int j =0; j<i; j++) System.out.println(emgList[j].getStr());
	}
}

//Car class
class Car{
	//인스턴스 변수
	private String emgType;   //응급 상황
	private int number;       //호출 번호
	private String carType;   //응급차 타입
	private String reqPerson; //구하는 사람
	
	//생성자, 인자로 Car의 인스턴스 변수들의 값을 모두 받는다
	Car(String emgType, int number, String carType, String reqPerson){
		//그리고 인스턴스 변수에 값을 대입한다
		this.emgType= emgType;
		this.number = number;
		this.carType = carType;
		this.reqPerson = reqPerson;
	}
	
	//getter
	  //응급 상황 출력해주는 method
	public String getEmgType() {
		return emgType;
	}
	  //호출 번호 출력해주는 method
	public int getNumber() {
		return number;
	}
	  //응급차 타입 출력해주는 method
	public String getCarType() {
		return carType;
	}
	  //구하는 사람 출력해주는 method
	public String getReqPerson() {
		return reqPerson;
	}
	//Car의 인스턴스 변수값 모두 출력
	public String getStr() {
		return getEmgType()+"\t\t"+getNumber()+"\t"+getCarType()+"\t"+getReqPerson();
	}
}

//Car 자식 중 소방차 클래스
class FireEngine extends Car{
	
	//소방차 생성자
	FireEngine(){
		//Car 생성자에 밑의 값 대입하기
		super("Fire", 119, "FireEngine", "FireFighter");
	}
	//소방차 참조변수 호출 시 getStr method 출력
	public String toString() {
		return getStr();
	}
}

//Car 자식 중 구급차 클래스
class Ambulance extends Car{
	//구급차 생성자
	Ambulance(){
		//Car 생성자에 밑의 값 대입하기
		super("Patient", 119, "Ambulance", "Doctor");
	}
	//구급차 참조변수 호출 시 getStr method 출력
	public String toString() {
		return getStr();
	}
}

//Car 자식 중 경찰차 클래스
class PoliceCar extends Car{
	//경찰차 생성자
	PoliceCar(){
		//Car 생성자에 밑의 값 대입하기
		super("Thief", 112, "PoliceCar", "PoliceOfficer");
	}
	//경찰차 참조변수 호출 시 getStr method 출력
	public String toString() {
		return getStr();
	}
}