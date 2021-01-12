import java.util.Scanner;

public class week6_2_김서영 {

	public static void main(String[] args) {
		//배열 참조변수 선언
		Dog[] dogs = new Dog[3]; //개 3마리를 가리킬 참조변수
		Cat[] cats = new Cat[3]; //고양이 3마리를 가리킬 참조변수
		
		//키보드 입력을 받기위한 참조변수 선언 및 객체 생성
		Scanner kbd = new Scanner(System.in);

		//개 3마리 각각 정보 입력 받기
		for(int i=0; i<3; i++) {
			System.out.println("<<Dog " + (i+1) +">>");
			//배열 원소에 개 한마리 객체 생성하기
			dogs[i]= new Dog();
			
			//해당 개 정보 입력받아서 setter로 정보 대입
			 //이름
			System.out.print("Name: ");
			dogs[i].setName(kbd.nextLine());
			 //나이
			System.out.print("Age: ");
			dogs[i].setAge(kbd.nextInt());
			 //무게
			System.out.print("Weight: ");
			dogs[i].setWeight(kbd.nextDouble());
			 //접종 여부
			System.out.print("BoosterShot(y/n): ");
			String done = kbd.next();
			    //만약 y를 입력하면 접종 맞은 것이므로 boosterShot 값에 true 대입
			if(done.equalsIgnoreCase("y")) dogs[i].setBoosterShot(true);
			    //n을 입력하면 안맞은거니까 false 대입
			else if(done.equalsIgnoreCase("n")) dogs[i].setBoosterShot(false);
			
			kbd.nextLine();        //버퍼 비우기 위해
			System.out.print("\n");//보기 편하도록 한 줄 띄우기
		}
		
		//고양이 3마리 정보 각각 입력 받기
		for(int i=0; i<3; i++) {
			System.out.println("<<Cat " + (i+1) +">>");
			//배열 원소에 고양이 한마리 객체 생성하기
			cats[i]= new Cat();
			
			//해당 고양이 정보 입력받아서 setter 이용해 정보 대입
			 //이름
			System.out.print("Name: ");
			cats[i].setName(kbd.nextLine());
			 //나이
			System.out.print("Age: ");
			cats[i].setAge(kbd.nextInt());
			 //무게
			System.out.print("Weight: ");
			cats[i].setWeight(kbd.nextDouble());
			
			kbd.nextLine(); //제대로 입력 받기 위해 버퍼 비우기
			 //색깔
			System.out.print("Color: ");
			cats[i].setColor(kbd.nextLine());
			
			System.out.print("\n"); //보기 편하게 한 줄  띄우기
		}
		
		//입력한 개들 정보 출력
		System.out.println("<<Dog List>>");
		for(int i=0; i<3; i++) {
			dogs[i].writeOutput();  //해당 Dog 정보 출력하는 method 이용
			System.out.print("\n"); //보기 편하게 한 줄 띄우기
		}
		
		//입력한 고양이들 정보 출력
		System.out.println("<<Cat List>>");
		for(int i=0; i<3; i++) {
			cats[i].writeOutput();  //해당 Cat 정보 출력하는 method 이용
			System.out.print("\n"); //보기 편하게 한 줄 띄우기
		}
		
		System.out.println();       //한 줄 띄우기
		
		//개들 중 2살보다 많고 접종 안맞은 개들 선별하기
		System.out.println("* Dogs older than 2 years and no boostershot are...");
		for(int i=0; i<3; i++) {      //반복문 사용해서 개들 하나씩 살펴보기
			int age=dogs[i].getAge();               //해당 개의 나이
			boolean shot = dogs[i].getBoosterShot();//해당 개의 접종 여부
			
			//나이가 2살 초과고, 접종을 맞지 않았을 경우, 해당 개의 이름 출력
			if( age>2 && !shot) {System.out.println(dogs[i].getName());}
		}
		
		//고양이들 중 색상이 검은색이고 무게가 3kg 초과인 고양이들 선별
		System.out.println("\n* Black cats weighs more than 3Kg are...");
		for(int i=0; i<3; i++) {      //반복문 사용해서 고양이들 하나씩 살펴보기
			double weight = cats[i].getWeight();    //해당 고양이 무게
			String color = cats[i].getColor();      //해당 고양이 색깔
			
			//색깔이 검은색이고, 무게가 3kg 초과면, 해당 고양이 이름 출력
			if(color.equalsIgnoreCase("black") && weight > 3.0) {System.out.println(cats[i].getName());}
		}
	}

}


//Pet class
class Pet {
	//인스턴스 변수
	private String name;   //이름
	private int age;       //나이
	private double weight; //무게
	
	//Pet 정보 출력
	public void writeOutput() {
		System.out.println("Name: "+name);     //이름
		System.out.println("Age: "+age);       //나이
		System.out.println("Weight: "+weight); //무게
	}
	
	//setter
	 //Pet 정보 대입하기(이름, 나이, 무게 모두)
	public void setPet(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	 //Pet 이름 대입하기
	public void setName(String name) {
		this.name = name;
	}
	
	 //Pet 나이 대입하기
	public void setAge(int age) {
		this.age = age;
	}
	
	 //Pet 무게 대입하기
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	//getter
	 //Pet 이름 받아오기
	public String getName() {
		return name;
	}
	
	 //Pet 나이 받아오기
	public int getAge() {
		return age;
	}
	
	 //Pet 무게 받아오기
	public double getWeight() {
		return weight;
	}
	
	//Pet의 이동을 알려주는 method
	public void move() {
		System.out.println(name+ " moves.");
	}
}



//Pet 상속을 받은 Dog class
class Dog extends Pet{
	//추가 인스턴스 변수, 접종 여부
	private boolean boosterShot;
	
	//Dog 정보 출력(오버라이딩)
	public void writeOutput() {
		super.writeOutput(); //원래 조상의 정보 출력 메소드에
		                     //접종 여부 출력 추가
		if(boosterShot) System.out.println("BoosterShot: O"); //만약 boosterShot가 true이면 접족 맞은 것으로 출력
		else System.out.println("BoosterShot: X");            //false면 안맞은 것으로 출력
		move();              //Dog의 움직임 출력 추가
	}
	
	//접종 여부 대입해주는 setter
	public void setBoosterShot(boolean status) {
		boosterShot = status;
	}
	//접종 여부 출력해주는 getter
	public boolean getBoosterShot() {
		return boosterShot;
	}
	
	//Dog가 움직일 때 method(오버라이딩)
	public void move() {
		System.out.println(getName()+" walks and runs");
	}
}


//Pet 상속받은 Cat class
class Cat extends Pet{
	//추가 인스턴스 변수, 색깔
	private String color;
	
	//Cat 정보 출력(오버라이딩)
	public void writeOutput() {
		super.writeOutput(); //원래 조상의 정보 출력 메소드에
		                     //색깔 정보만 추가 출력
		System.out.println("Color: "+color);
		move();              //cat 움직임 추가 출력
	}
	
	//색깔 대입 setter
	public void setColor(String col) {
		color = col;
	}
	
	//색깔 출력 getter
	public String getColor() {
		return color;
	}
	
	//Cat가 움직일 때 method(오버라이딩)
	public void move() {
		System.out.println(getName()+" creeps and jumps");
	}
}