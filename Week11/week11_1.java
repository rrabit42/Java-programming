package week11;
import java.util.*;

public class week11_1_김서영 {

	public static void main(String[] args) {
		//필요한 변수들
		 //ArrayList
		ArrayList <Student> students = new ArrayList<Student> ();
		 //Student 객체
		Student people = new Student();
		 //키보드 입력
		Scanner kbd = new Scanner(System.in);
		 //학생 이름
		String name;
		 //학생 아이디
		String ID;
		 //학생 나이
		int age;
		 //사용자의 선택
		int choice;
		
		//사용자에게 학생의 이름, 아이디, 나이를 입력받는다. 이름 입력 받을 때 0이 나오면 
		System.out.println("Input Student Name, ID, and age. 0 for name to quit.");
		while(true) {
			//이름 입력받기
			name = kbd.next();
			//만약 0이면 반복문 탈출
			if(name.equalsIgnoreCase("0")) break;
			//ID 입력받기
			ID = kbd.next();
			//나이 입력받기
			age = kbd.nextInt();
			//ArrayList에 학생 정보 입력한 객체 추가
			students.add(new Student(name, ID, age));
		}
		//ArrayList 결과 출력
		people.printResult(students);
		
		//for반복문의 이름은 LOOP
		LOOP:
		for(;;) { //무한루프
			      //사용자가 원하는 행위 입력 받기
		System.out.println("\nChoose the operation you want");
		System.out.println("1.add information\t2.delete information\t3.show list\t4.Finish program");
		choice = kbd.nextInt();
		kbd.nextLine(); //버퍼 비우기
		
		//선택에 따라 행위 출력하기
		switch(choice) {
			 //1 선택시
			case 1:
				//원하는 위치에 학생 객체 추가
				people.addStudent(students);
				//리스트 결과 출력
				people.printResult(students);
				break;
			 //2 선택시
			case 2:
				//원하는 위치에 학생 객체 제거
				people.deleteStudent(students);
				//리스트 결과 출력
				people.printResult(students);
				break;
			 //3 선택시
			case 3:
				//리스트 결과 출력
				people.printResult(students);
				break;
			 //4 선택시
			case 4:
				//프로그램 종료(반복문 탈출)
				System.out.println("Finished program");
				break LOOP;
			 //그 외 선택값
			default:
				System.out.println("Wrong input.");
			}
		}
	}
}

//학생 class
class Student{
	//인스턴스 변수
	String name; //학생 이름
	String ID;   //학생 ID
	int age;     //학생 나이
	
	//키보드 입력 참조변수 및 객체
	Scanner kbd = new Scanner(System.in);
	
	//생성자
	 //기본 생성자
	Student(){};
	 //정보 입력받았을 시, 생성자
	Student(String name, String ID, int age){
		this.name = name;
		this.ID = ID;
		this.age = age;
	}
	
	//리스트 결과 출력하는 method
	public void printResult(List<Student> student) {
		System.out.println("NUMBER\tNAME\tID\tAGE");
		//인자로 전달받은 리스트의 학생 객체의 이름과 아이디 출력
		for(int i=0; i<student.size(); i++) {
			System.out.println((i+1)+"\t"+student.get(i).name+"\t"+student.get(i).ID+"\t"+student.get(i).age);
		}
	}
	
	//객체 제거하는 method
	public void deleteStudent(List<Student> Stu) {
		//사용자에게 제거할 index 값 입력받기
		System.out.println("Input Student Number to delete.");
		int index = kbd.nextInt();
		//제거하기
		Stu.remove(Stu.get(index-1));
		//Stu.remove(index-1) -->overloading
	}
	
	//객체 추가하는 method
	public void addStudent(List<Student> Stu) {
		//사용자에게 추가할 학생 정보와 인덱스 입력받기
		System.out.println("Input new Student Name, ID, and age, and the location");
		name = kbd.next();
		ID = kbd.next();
		age = kbd.nextInt();
		int index = kbd.nextInt();
		//객체 추가하기
		Stu.add((index-1), new Student(name,ID,age));
	}
	
}
