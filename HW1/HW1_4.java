import java.util.Scanner;

public class HW1_4_김서영 {
	public static void main(String[] args) {
		//키보드 입력 위한 참조변수 선언 및 객체 생성
		Scanner kbd = new Scanner(System.in);
		
		//사용자로부터 학생 수 입력 받기
		System.out.println("How many studnets are there?");
		int num = kbd.nextInt();
		
		kbd.nextLine(); //버퍼 비우기
		
		//사용자로부터 학생 정보 입력 받기
		System.out.println("Input the information.");
		 //StudentScore class로 학생 수만큼 배열 만들기
		StudentScore[] students = new StudentScore[num];
		
		//반복문 사용해서 정보 입력
		for (int i =0; i<students.length; i++) {
				//배열 원소로 학생 객체 생성
				students[i] = new StudentScore();
				
				//학생 정보 입력 받기
				 //ID
				System.out.print("\nID:");
				students[i].setId(kbd.nextLine());
				 //이름
				System.out.print("Name:");
				students[i].setName(kbd.nextLine());
				 //국어 점수
				System.out.print("Korean:");
				students[i].setKorean(kbd.nextInt());
				 //수학 점수
				System.out.print("Math:");
				students[i].setMath(kbd.nextInt());
				 //영어 점수
				System.out.print("English:");
				students[i].setEnglish(kbd.nextInt());
				
				kbd.nextLine(); //버퍼 비우기
		}
		
		System.out.println(); //한줄 띄기
		
		//점수 합계 변수들 및 초기화(순서대로 국어, 수학, 영어 점수 합계)
		int Ksum=0, Msum=0, Esum=0;		
		
		//점수 합계 출력
		System.out.println("NAME\t\tID\tKOREAN\tMATH\tENGLISH\tSUM\tAVG\t");
		for(int i=0; i<students.length; i++) {
			//한 학생 개인의 점수 총합 담을 변수
			int sum=0;
			//한 학생 개인의 점수 평균 담을 변수
			double avg;
			
			//과목별 점수 합계를 위해 학생 개인의 점수 반복문 통해 입력 받기
			Ksum += students[i].getKorean();  //국어
			Msum += students[i].getMath();    //영어
			Esum += students[i].getEnglish(); //수학
			
			//한 학생 개인의 점수 합계 계산
			sum += students[i].getKorean() + students[i].getMath() + students[i].getEnglish();
			  //평균 계산
			avg = sum / 3.0;
			
			//학생 정보와 점수 및 총합, 평균 출력
			students[i].display();
			System.out.printf("%d\t%.2f\n", sum, avg);
		}
		
		//과목별 학생들 점수 평균
		double Kavg = Ksum/(double)num; //국어
		double Mavg = Msum/(double)num; //수학
		double Eavg = Esum/(double)num; //영어
		
		//과목별 점수 평균 출력
		System.out.printf("Subject Avg\t\t%.2f\t%.2f\t%.2f", Kavg, Mavg, Eavg);
		
		//학생 들 중 과목별 점수 평균 넘은 학생들 출력
		System.out.println("\n\n<Students over the average>\n");
		 //국어
		System.out.println("Korean:");
		for(int i=0; i<students.length; i++) {
			if(students[i].getKorean()>Kavg) {                //국어 평균보다 점수 높으면
				System.out.print(students[i].getName()+"\t"); //그 학생 이름 출력
			}
		}
		 //수학
		System.out.println("\nMath:");
		for(int i=0; i<students.length; i++) {
			if(students[i].getMath()>Mavg) {                  //수학 평균보다 점수 높으면
				System.out.print(students[i].getName()+"\t"); //그 학생 이름 출력
			}
		}
		 //영어
		System.out.println("\nEnglish:");
		for(int i=0; i<students.length; i++) {
			if(students[i].getEnglish()>Eavg) {               //영어 평균보다 점수 높으면
				System.out.print(students[i].getName()+"\t"); //그 학생 이름 출력
			}
		}
	}
}


//StudenInformation class
class StudentInformation {
	//학생 이름, 학번 담을 변수
	private String name, id;
	
	//setter method
	  //이름 대입 method
	public void setName(String name) {
		this.name = name;
	}
	  //학번 대입 method
	public void setId(String id) {
		this.id = id;
	}
	
	//getter method
	  //이름 출력 method
	public String getName() {
		return name;
	}
	  //학번 출력 method
	public String getId() {
		return id;
	}
	
	//학생 이름, 학번 출력 method
	public void display() {
		System.out.print(name+"\t\t"+id+"\t");
	}
}

//StudentInformation class 상속받은 StudenScore class
class StudentScore extends StudentInformation {
	//학생들의 국어, 수학, 영어 점수 받을 변수
	private int korean, math, english;
	
	//setter method
	  //국어 점수 대입 method
	public void setKorean(int korean) {
		this.korean = korean;
	}
	  //수학 점수 대입 method
	public void setMath(int math) {
		this.math = math;
	}
	  //영어 점수 대입 method
	public void setEnglish(int english) {
		this.english = english;
	}
	
	//getter method
	  //국어 점수 출력 method
	public int getKorean() {
		return korean;
	}
	  //수학 점수 출력 method
	public int getMath() {
		return math;
	}
	  //영어 점수 출력 method
	public int getEnglish() {
		return english;
	}
	
	//학생 정보 및 점수 출력 method
	public void display() {
		super.display(); //기존 부모 method에 추가로
		                 //학생들 점수 출력
		System.out.print(korean+"\t"+math+"\t"+english+"\t");
	}
	
}