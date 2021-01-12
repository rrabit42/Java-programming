import java.util.Scanner;

public class week6_2_�輭�� {

	public static void main(String[] args) {
		//�迭 �������� ����
		Dog[] dogs = new Dog[3]; //�� 3������ ����ų ��������
		Cat[] cats = new Cat[3]; //����� 3������ ����ų ��������
		
		//Ű���� �Է��� �ޱ����� �������� ���� �� ��ü ����
		Scanner kbd = new Scanner(System.in);

		//�� 3���� ���� ���� �Է� �ޱ�
		for(int i=0; i<3; i++) {
			System.out.println("<<Dog " + (i+1) +">>");
			//�迭 ���ҿ� �� �Ѹ��� ��ü �����ϱ�
			dogs[i]= new Dog();
			
			//�ش� �� ���� �Է¹޾Ƽ� setter�� ���� ����
			 //�̸�
			System.out.print("Name: ");
			dogs[i].setName(kbd.nextLine());
			 //����
			System.out.print("Age: ");
			dogs[i].setAge(kbd.nextInt());
			 //����
			System.out.print("Weight: ");
			dogs[i].setWeight(kbd.nextDouble());
			 //���� ����
			System.out.print("BoosterShot(y/n): ");
			String done = kbd.next();
			    //���� y�� �Է��ϸ� ���� ���� ���̹Ƿ� boosterShot ���� true ����
			if(done.equalsIgnoreCase("y")) dogs[i].setBoosterShot(true);
			    //n�� �Է��ϸ� �ȸ����Ŵϱ� false ����
			else if(done.equalsIgnoreCase("n")) dogs[i].setBoosterShot(false);
			
			kbd.nextLine();        //���� ���� ����
			System.out.print("\n");//���� ���ϵ��� �� �� ����
		}
		
		//����� 3���� ���� ���� �Է� �ޱ�
		for(int i=0; i<3; i++) {
			System.out.println("<<Cat " + (i+1) +">>");
			//�迭 ���ҿ� ����� �Ѹ��� ��ü �����ϱ�
			cats[i]= new Cat();
			
			//�ش� ����� ���� �Է¹޾Ƽ� setter �̿��� ���� ����
			 //�̸�
			System.out.print("Name: ");
			cats[i].setName(kbd.nextLine());
			 //����
			System.out.print("Age: ");
			cats[i].setAge(kbd.nextInt());
			 //����
			System.out.print("Weight: ");
			cats[i].setWeight(kbd.nextDouble());
			
			kbd.nextLine(); //����� �Է� �ޱ� ���� ���� ����
			 //����
			System.out.print("Color: ");
			cats[i].setColor(kbd.nextLine());
			
			System.out.print("\n"); //���� ���ϰ� �� ��  ����
		}
		
		//�Է��� ���� ���� ���
		System.out.println("<<Dog List>>");
		for(int i=0; i<3; i++) {
			dogs[i].writeOutput();  //�ش� Dog ���� ����ϴ� method �̿�
			System.out.print("\n"); //���� ���ϰ� �� �� ����
		}
		
		//�Է��� ����̵� ���� ���
		System.out.println("<<Cat List>>");
		for(int i=0; i<3; i++) {
			cats[i].writeOutput();  //�ش� Cat ���� ����ϴ� method �̿�
			System.out.print("\n"); //���� ���ϰ� �� �� ����
		}
		
		System.out.println();       //�� �� ����
		
		//���� �� 2�캸�� ���� ���� �ȸ��� ���� �����ϱ�
		System.out.println("* Dogs older than 2 years and no boostershot are...");
		for(int i=0; i<3; i++) {      //�ݺ��� ����ؼ� ���� �ϳ��� ���캸��
			int age=dogs[i].getAge();               //�ش� ���� ����
			boolean shot = dogs[i].getBoosterShot();//�ش� ���� ���� ����
			
			//���̰� 2�� �ʰ���, ������ ���� �ʾ��� ���, �ش� ���� �̸� ���
			if( age>2 && !shot) {System.out.println(dogs[i].getName());}
		}
		
		//����̵� �� ������ �������̰� ���԰� 3kg �ʰ��� ����̵� ����
		System.out.println("\n* Black cats weighs more than 3Kg are...");
		for(int i=0; i<3; i++) {      //�ݺ��� ����ؼ� ����̵� �ϳ��� ���캸��
			double weight = cats[i].getWeight();    //�ش� ����� ����
			String color = cats[i].getColor();      //�ش� ����� ����
			
			//������ �������̰�, ���԰� 3kg �ʰ���, �ش� ����� �̸� ���
			if(color.equalsIgnoreCase("black") && weight > 3.0) {System.out.println(cats[i].getName());}
		}
	}

}


//Pet class
class Pet {
	//�ν��Ͻ� ����
	private String name;   //�̸�
	private int age;       //����
	private double weight; //����
	
	//Pet ���� ���
	public void writeOutput() {
		System.out.println("Name: "+name);     //�̸�
		System.out.println("Age: "+age);       //����
		System.out.println("Weight: "+weight); //����
	}
	
	//setter
	 //Pet ���� �����ϱ�(�̸�, ����, ���� ���)
	public void setPet(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	 //Pet �̸� �����ϱ�
	public void setName(String name) {
		this.name = name;
	}
	
	 //Pet ���� �����ϱ�
	public void setAge(int age) {
		this.age = age;
	}
	
	 //Pet ���� �����ϱ�
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	//getter
	 //Pet �̸� �޾ƿ���
	public String getName() {
		return name;
	}
	
	 //Pet ���� �޾ƿ���
	public int getAge() {
		return age;
	}
	
	 //Pet ���� �޾ƿ���
	public double getWeight() {
		return weight;
	}
	
	//Pet�� �̵��� �˷��ִ� method
	public void move() {
		System.out.println(name+ " moves.");
	}
}



//Pet ����� ���� Dog class
class Dog extends Pet{
	//�߰� �ν��Ͻ� ����, ���� ����
	private boolean boosterShot;
	
	//Dog ���� ���(�������̵�)
	public void writeOutput() {
		super.writeOutput(); //���� ������ ���� ��� �޼ҵ忡
		                     //���� ���� ��� �߰�
		if(boosterShot) System.out.println("BoosterShot: O"); //���� boosterShot�� true�̸� ���� ���� ������ ���
		else System.out.println("BoosterShot: X");            //false�� �ȸ��� ������ ���
		move();              //Dog�� ������ ��� �߰�
	}
	
	//���� ���� �������ִ� setter
	public void setBoosterShot(boolean status) {
		boosterShot = status;
	}
	//���� ���� ������ִ� getter
	public boolean getBoosterShot() {
		return boosterShot;
	}
	
	//Dog�� ������ �� method(�������̵�)
	public void move() {
		System.out.println(getName()+" walks and runs");
	}
}


//Pet ��ӹ��� Cat class
class Cat extends Pet{
	//�߰� �ν��Ͻ� ����, ����
	private String color;
	
	//Cat ���� ���(�������̵�)
	public void writeOutput() {
		super.writeOutput(); //���� ������ ���� ��� �޼ҵ忡
		                     //���� ������ �߰� ���
		System.out.println("Color: "+color);
		move();              //cat ������ �߰� ���
	}
	
	//���� ���� setter
	public void setColor(String col) {
		color = col;
	}
	
	//���� ��� getter
	public String getColor() {
		return color;
	}
	
	//Cat�� ������ �� method(�������̵�)
	public void move() {
		System.out.println(getName()+" creeps and jumps");
	}
}