package week10;

//필요한 패키지 import
import java.util.*;
import java.io.*;

//serializable을 구현한 Pet class
class Pet implements Serializable{
	//private 인스턴스 변수들
	private String name;  //Pet의 이름
	private int age;      //나이
	private double weight;//무게
	
	//setter method
	 //Pet정보 set하는 method(이름, 나이, 무게 입력받았을 시)
	public void setPet(String newName, int newAge, double newWeight) {
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
	}
	 //Pet 이름 set하는 method
	public void setName(String newName) {
		this.name = newName;
	}
	 //Pet 나이 set하는 method
	public void setAge(int newAge) {
		this.age = newAge;
	}
	 //Pet 무게 set하는 method
	public void setWeight(double newWeight) {
		this.weight = newWeight;
	}
	
	//getter method
	 //Pet 이름 get하는 method
	public String getName() {
		return name;
	}
	 //Pet 나이 get하는 method
	public int getAge() {
		return age;
	}
	 //Pet 무게 get하는 method
	public double getWeight() {
		return weight;
	}
}


//Pet class 상속받고, serializable 구현한 Dog class
class Dog extends Pet implements Serializable{
	//private 인스턴스 변수들
	private String breed;        //종
	private boolean boosterShot; //예방접종 여부
	
	//생성자(Dog의 이름, 나이, 무게, 종, 예방접종 여부 변수 값 입력받을 시)
	public Dog(String name, int age, double weight, String breed, boolean bshot) {
		//각 정보 인스턴스 변수에 저장
		setName(name);
		setAge(age);
		setWeight(weight);
		this.breed = breed;
		this.boosterShot = bshot;
	}
	
	//setter method
	 //종 set 하는 method
	public void setBreed(String breed) {
		this.breed = breed;
	}
	 //예방접종여부 set하는 method
	public void setBoosterShot(boolean boosterShot) {
		this.boosterShot = boosterShot;
	}
	
	//getter method
	 //종 get 하는 method
	public String getBreed() {
		return breed;
	}
	 //예방접종 여부 get 하는 method
	public boolean getBoosterShot() {
		return boosterShot;
	}
	
	//toString method
	public String toString() {
		//객체의 이름, 나이, 무게, 종, 예방접종 여부 O,X로 출력하기 
		return(getName() + "\t"+getAge()+"\t"+getWeight()+"\t"+breed+"\t"+(boosterShot? 'O' : 'X'));
	}
}


public class week10_2_김서영 {

	public static void main(String[] args) {
		//변수들
		 //입력할 파일명
		String fileName;
		 //출력 stream
		ObjectOutputStream outputStream = null;
		 //입력 stream
		ObjectInputStream inputStream = null;
		 //키보드 입력 참조변수 및 객체
		Scanner kbd = new Scanner(System.in);
		 //Dog 클래스 배열(초기화 위해)
		Dog[] myDog = new Dog[10];
		 //Dog 클래스 배열(읽어오기 위해)
		Dog[] dogs = null;
		
		//Dog class 배열 초기화
		myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog", false);
		myDog[1] = new Dog("JJong", 5, 5.5, "Mix", false);
		myDog[2] = new Dog("Kong", 4, 3, "Poodle", true);
		myDog[3] = new Dog("Apple", 2, 2.5, "Collie", true);
		myDog[4] = new Dog("Candy", 5, 5.5, "Coca", false);
		myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
		myDog[6] = new Dog("Peace", 3, 2.5, "Huskey", false);
		myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
		myDog[8] = new Dog("Windy", 2, 9, "Jindo", true);
		myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz", false);
		
		//Dog object 정보들을 입력할 파일명 입력받기
		System.out.println("Input File name to write Dog data");
		fileName = kbd.nextLine();
		
		
		try {
			//출력 stream과 파일명 연결 시도하기
			outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			//Dog 배열 파일에 입력하기
			outputStream.writeObject(myDog);
			//출력 stream 종료하기
			outputStream.close();
		}
		//입출력 오류 예외처리
		catch(IOException e) {
			System.out.println("ERROR writing to file "+ fileName+".");
			System.exit(0);
		}
		
		//파일의 배열들 정보 출력하기
		System.out.println("Name\tAge\tWeight\tBreed\tBoosterShot");
		
		try {
			//입력 stream이랑 파일명 연결시도
			inputStream = new ObjectInputStream(new FileInputStream(fileName));
			//파일에 있는 객체 불러오기, 형변환
			dogs = (Dog[])inputStream.readObject();
			//배열 참조변수를 통해 각 객체에 접근하여, 각 객체 정보 출력하기
			for(int i=0; i<dogs.length; i++) {
				System.out.println(dogs[i]);
			}
			//입력 stream close
			inputStream.close();
		}
		//파일 없을 시 예외처리
		catch(FileNotFoundException e) {
			System.out.println("File not found Exception");
		}
		//입출력 오류시 예외처리
		catch(IOException e) {
			System.out.println("IO Exception");
		}
		//그 외 예외처리
		catch(Exception e) {
			System.out.println("Exception");
		}
		
		//객체들 중에 2세초과&예방접종 안한 강아지 출력하기
		System.out.println("\nDogs older than 2 years and did not get the boosterShot");
		for(int i=0; i<dogs.length; i++) {
			//for 구문을 통해서, dogs 참조변수를 이용해
			if(dogs[i].getAge() > 2 && !dogs[i].getBoosterShot()) {
				//조건에 해당하는 강아지 이름과 종 출력하기
				System.out.println(dogs[i].getName()+"\t"+dogs[i].getBreed());
			}
		}
		//프로그램 종료
		System.out.println("\nProgram finished");
	}
}

