import java.util.Scanner;

public class HW1_4_�輭�� {
	public static void main(String[] args) {
		//Ű���� �Է� ���� �������� ���� �� ��ü ����
		Scanner kbd = new Scanner(System.in);
		
		//����ڷκ��� �л� �� �Է� �ޱ�
		System.out.println("How many studnets are there?");
		int num = kbd.nextInt();
		
		kbd.nextLine(); //���� ����
		
		//����ڷκ��� �л� ���� �Է� �ޱ�
		System.out.println("Input the information.");
		 //StudentScore class�� �л� ����ŭ �迭 �����
		StudentScore[] students = new StudentScore[num];
		
		//�ݺ��� ����ؼ� ���� �Է�
		for (int i =0; i<students.length; i++) {
				//�迭 ���ҷ� �л� ��ü ����
				students[i] = new StudentScore();
				
				//�л� ���� �Է� �ޱ�
				 //ID
				System.out.print("\nID:");
				students[i].setId(kbd.nextLine());
				 //�̸�
				System.out.print("Name:");
				students[i].setName(kbd.nextLine());
				 //���� ����
				System.out.print("Korean:");
				students[i].setKorean(kbd.nextInt());
				 //���� ����
				System.out.print("Math:");
				students[i].setMath(kbd.nextInt());
				 //���� ����
				System.out.print("English:");
				students[i].setEnglish(kbd.nextInt());
				
				kbd.nextLine(); //���� ����
		}
		
		System.out.println(); //���� ���
		
		//���� �հ� ������ �� �ʱ�ȭ(������� ����, ����, ���� ���� �հ�)
		int Ksum=0, Msum=0, Esum=0;		
		
		//���� �հ� ���
		System.out.println("NAME\t\tID\tKOREAN\tMATH\tENGLISH\tSUM\tAVG\t");
		for(int i=0; i<students.length; i++) {
			//�� �л� ������ ���� ���� ���� ����
			int sum=0;
			//�� �л� ������ ���� ��� ���� ����
			double avg;
			
			//���� ���� �հ踦 ���� �л� ������ ���� �ݺ��� ���� �Է� �ޱ�
			Ksum += students[i].getKorean();  //����
			Msum += students[i].getMath();    //����
			Esum += students[i].getEnglish(); //����
			
			//�� �л� ������ ���� �հ� ���
			sum += students[i].getKorean() + students[i].getMath() + students[i].getEnglish();
			  //��� ���
			avg = sum / 3.0;
			
			//�л� ������ ���� �� ����, ��� ���
			students[i].display();
			System.out.printf("%d\t%.2f\n", sum, avg);
		}
		
		//���� �л��� ���� ���
		double Kavg = Ksum/(double)num; //����
		double Mavg = Msum/(double)num; //����
		double Eavg = Esum/(double)num; //����
		
		//���� ���� ��� ���
		System.out.printf("Subject Avg\t\t%.2f\t%.2f\t%.2f", Kavg, Mavg, Eavg);
		
		//�л� �� �� ���� ���� ��� ���� �л��� ���
		System.out.println("\n\n<Students over the average>\n");
		 //����
		System.out.println("Korean:");
		for(int i=0; i<students.length; i++) {
			if(students[i].getKorean()>Kavg) {                //���� ��պ��� ���� ������
				System.out.print(students[i].getName()+"\t"); //�� �л� �̸� ���
			}
		}
		 //����
		System.out.println("\nMath:");
		for(int i=0; i<students.length; i++) {
			if(students[i].getMath()>Mavg) {                  //���� ��պ��� ���� ������
				System.out.print(students[i].getName()+"\t"); //�� �л� �̸� ���
			}
		}
		 //����
		System.out.println("\nEnglish:");
		for(int i=0; i<students.length; i++) {
			if(students[i].getEnglish()>Eavg) {               //���� ��պ��� ���� ������
				System.out.print(students[i].getName()+"\t"); //�� �л� �̸� ���
			}
		}
	}
}


//StudenInformation class
class StudentInformation {
	//�л� �̸�, �й� ���� ����
	private String name, id;
	
	//setter method
	  //�̸� ���� method
	public void setName(String name) {
		this.name = name;
	}
	  //�й� ���� method
	public void setId(String id) {
		this.id = id;
	}
	
	//getter method
	  //�̸� ��� method
	public String getName() {
		return name;
	}
	  //�й� ��� method
	public String getId() {
		return id;
	}
	
	//�л� �̸�, �й� ��� method
	public void display() {
		System.out.print(name+"\t\t"+id+"\t");
	}
}

//StudentInformation class ��ӹ��� StudenScore class
class StudentScore extends StudentInformation {
	//�л����� ����, ����, ���� ���� ���� ����
	private int korean, math, english;
	
	//setter method
	  //���� ���� ���� method
	public void setKorean(int korean) {
		this.korean = korean;
	}
	  //���� ���� ���� method
	public void setMath(int math) {
		this.math = math;
	}
	  //���� ���� ���� method
	public void setEnglish(int english) {
		this.english = english;
	}
	
	//getter method
	  //���� ���� ��� method
	public int getKorean() {
		return korean;
	}
	  //���� ���� ��� method
	public int getMath() {
		return math;
	}
	  //���� ���� ��� method
	public int getEnglish() {
		return english;
	}
	
	//�л� ���� �� ���� ��� method
	public void display() {
		super.display(); //���� �θ� method�� �߰���
		                 //�л��� ���� ���
		System.out.print(korean+"\t"+math+"\t"+english+"\t");
	}
	
}