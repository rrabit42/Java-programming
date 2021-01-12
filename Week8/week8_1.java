package week8;

import java.util.Scanner;

public class week8_1_�輭�� {

	public static void main(String[] args) {
		//���� ����
		  //Ű���� �Է��� ���� ���� ���� �� ��ü
		Scanner kbd = new Scanner(System.in);
		  //�� ���� ���� �������� �迭
		Pet[] pets = new Pet[10];
		  //����ڿ��� ������ ������
		int rep, type;  //���ϴ� �۾� ����, ���� ���� ����
		  //�ݺ��� ���� �ε��� ����
		int i =0;
		  //��ü ���� ����
		String name;  //�̸�
		int age;      //����
		
		//�ݺ���
		do {
			//���ϴ� �۾� ����
		System.out.println("\n���ϴ� �۾��� �����Դϱ�?");
		System.out.println("1. New input\t2. Output\t3.Exit");
		rep = kbd.nextInt();
		
		   //������ ���ڿ� ���� �۾� ����
		switch(rep){
		//1�� �������� ��, �� ��ü �߰�
		case 1:
			//�� �����
			System.out.println("���� �����Դϱ�?");
			System.out.println("1. Dog\t2. Cat\t3. Snake\t4. Bird");
			//�� Ÿ�� �Է¹ް�
			type= kbd.nextInt();
			kbd.nextLine();    //���� ����
			//������ �̸� �Է¹ް�
			System.out.print("Name:");
			name = kbd.nextLine();
			//������ ���� �Է¹ޱ�
			System.out.print("Age:");
			age = kbd.nextInt();
			
			//������ �� Ÿ�Կ� ���� ��������� ��ü �޸��ϱ�
			switch(type) { 
			case 1: //1�϶� Dog ��ü ���� �������� �迭�� �����ϱ�
				pets[i] = new Dog(name, age);
				break;
			case 2: //2�϶� Cat ��ü
				pets[i] = new Cat(name, age);
				break;
			case 3: //3�϶� Snake ��ü
				pets[i] = new Snake(name, age);
				break;
			case 4: //4�ϋ� Bird ��ü
				pets[i] = new Bird(name, age);
				break;
			}
			i++;   //���� ���������� ������ �� �ֵ���
			break;
			
		//2�� �������� �� ��ü ���
		case 2:
			//��ü�� ��, �̸�, ����, �ൿ ���
			System.out.println("Species\tName\tAge\tMovement");
			//��ü ���
			for(int j =0; j< i; j++) { //����ڿ��� �Է� ���� ��ŭ��
				System.out.print(pets[j].species+"\t"+pets[j].name+"\t"+pets[j].age+"\t");
				pets[j].move();
			}
			break;
			
		//3�� �������� �� switch Ż��
		case 3:
			break;
		}
		}while(rep != 3); // 3�϶��� �ݺ��� Ż��
		
		//�ݺ��� ������ ���� ���
		System.out.println("����");
	}

}

//�߻� Ŭ���� pet
abstract class Pet{
	//�ν��Ͻ� ������
	public String species; //�� ��
	public String name;    //�̸�
	public int age;        //����
	
	//������ method
	public abstract void move();
}

//Dog - pet�� �ڼ� Ŭ����
class Dog extends Pet{
	//������, �̸��� ���� �Է� �޾��� ��
	Dog (String name, int age){
		species = "Dog";  //�� ����
		this.name = name; //�̸� ����
		this.age= age;    //���� ����
	}
	
	//������ method overwritting
	public void move() {
		System.out.println("run!"); //Dog�� run
	}
}

//Cat - pet�� �ڼ� Ŭ����
class Cat extends Pet {
	//������, �̸��� ���� �Է� �޾��� ��
	Cat(String name, int age){
		species = "Cat";  //�� ����
		this.name = name; //�̸� ����
		this.age= age;    //���� ����
	}
	
	//������ method overwritting
	public void move() {
		System.out.println("jump!");//Cat�� jump
	}
}

//Bird - pet�� �ڼ� Ŭ����
class Bird extends Pet{
	//������, �̸��� ���� �Է� �޾��� ��
	Bird(String name, int age){
		species = "Bird";  //�� ����
		this.name = name;  //�̸� ����
		this.age= age;     //���� ����
	}
	
	//������ method overwritting
	public void move() {
		System.out.println("fly!");//Bird�� fly
	}
}

//Snake - pet�� �ڼ� Ŭ����
class Snake extends Pet{
	//������, �̸��� ���� �Է� �޾��� ��
	Snake(String name, int age){
		species = "Snake"; //�� ����
		this.name = name;  //�̸� ����
		this.age= age;     //���� ����
	}
	
	public void move() {
		System.out.println("crawl!"); //Snake�� crawl
	}
}