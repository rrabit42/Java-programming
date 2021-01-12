package week11;
import java.util.*;

public class week11_1_�輭�� {

	public static void main(String[] args) {
		//�ʿ��� ������
		 //ArrayList
		ArrayList <Student> students = new ArrayList<Student> ();
		 //Student ��ü
		Student people = new Student();
		 //Ű���� �Է�
		Scanner kbd = new Scanner(System.in);
		 //�л� �̸�
		String name;
		 //�л� ���̵�
		String ID;
		 //�л� ����
		int age;
		 //������� ����
		int choice;
		
		//����ڿ��� �л��� �̸�, ���̵�, ���̸� �Է¹޴´�. �̸� �Է� ���� �� 0�� ������ 
		System.out.println("Input Student Name, ID, and age. 0 for name to quit.");
		while(true) {
			//�̸� �Է¹ޱ�
			name = kbd.next();
			//���� 0�̸� �ݺ��� Ż��
			if(name.equalsIgnoreCase("0")) break;
			//ID �Է¹ޱ�
			ID = kbd.next();
			//���� �Է¹ޱ�
			age = kbd.nextInt();
			//ArrayList�� �л� ���� �Է��� ��ü �߰�
			students.add(new Student(name, ID, age));
		}
		//ArrayList ��� ���
		people.printResult(students);
		
		//for�ݺ����� �̸��� LOOP
		LOOP:
		for(;;) { //���ѷ���
			      //����ڰ� ���ϴ� ���� �Է� �ޱ�
		System.out.println("\nChoose the operation you want");
		System.out.println("1.add information\t2.delete information\t3.show list\t4.Finish program");
		choice = kbd.nextInt();
		kbd.nextLine(); //���� ����
		
		//���ÿ� ���� ���� ����ϱ�
		switch(choice) {
			 //1 ���ý�
			case 1:
				//���ϴ� ��ġ�� �л� ��ü �߰�
				people.addStudent(students);
				//����Ʈ ��� ���
				people.printResult(students);
				break;
			 //2 ���ý�
			case 2:
				//���ϴ� ��ġ�� �л� ��ü ����
				people.deleteStudent(students);
				//����Ʈ ��� ���
				people.printResult(students);
				break;
			 //3 ���ý�
			case 3:
				//����Ʈ ��� ���
				people.printResult(students);
				break;
			 //4 ���ý�
			case 4:
				//���α׷� ����(�ݺ��� Ż��)
				System.out.println("Finished program");
				break LOOP;
			 //�� �� ���ð�
			default:
				System.out.println("Wrong input.");
			}
		}
	}
}

//�л� class
class Student{
	//�ν��Ͻ� ����
	String name; //�л� �̸�
	String ID;   //�л� ID
	int age;     //�л� ����
	
	//Ű���� �Է� �������� �� ��ü
	Scanner kbd = new Scanner(System.in);
	
	//������
	 //�⺻ ������
	Student(){};
	 //���� �Է¹޾��� ��, ������
	Student(String name, String ID, int age){
		this.name = name;
		this.ID = ID;
		this.age = age;
	}
	
	//����Ʈ ��� ����ϴ� method
	public void printResult(List<Student> student) {
		System.out.println("NUMBER\tNAME\tID\tAGE");
		//���ڷ� ���޹��� ����Ʈ�� �л� ��ü�� �̸��� ���̵� ���
		for(int i=0; i<student.size(); i++) {
			System.out.println((i+1)+"\t"+student.get(i).name+"\t"+student.get(i).ID+"\t"+student.get(i).age);
		}
	}
	
	//��ü �����ϴ� method
	public void deleteStudent(List<Student> Stu) {
		//����ڿ��� ������ index �� �Է¹ޱ�
		System.out.println("Input Student Number to delete.");
		int index = kbd.nextInt();
		//�����ϱ�
		Stu.remove(Stu.get(index-1));
		//Stu.remove(index-1) -->overloading
	}
	
	//��ü �߰��ϴ� method
	public void addStudent(List<Student> Stu) {
		//����ڿ��� �߰��� �л� ������ �ε��� �Է¹ޱ�
		System.out.println("Input new Student Name, ID, and age, and the location");
		name = kbd.next();
		ID = kbd.next();
		age = kbd.nextInt();
		int index = kbd.nextInt();
		//��ü �߰��ϱ�
		Stu.add((index-1), new Student(name,ID,age));
	}
	
}
