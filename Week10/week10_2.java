package week10;

//�ʿ��� ��Ű�� import
import java.util.*;
import java.io.*;

//serializable�� ������ Pet class
class Pet implements Serializable{
	//private �ν��Ͻ� ������
	private String name;  //Pet�� �̸�
	private int age;      //����
	private double weight;//����
	
	//setter method
	 //Pet���� set�ϴ� method(�̸�, ����, ���� �Է¹޾��� ��)
	public void setPet(String newName, int newAge, double newWeight) {
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
	}
	 //Pet �̸� set�ϴ� method
	public void setName(String newName) {
		this.name = newName;
	}
	 //Pet ���� set�ϴ� method
	public void setAge(int newAge) {
		this.age = newAge;
	}
	 //Pet ���� set�ϴ� method
	public void setWeight(double newWeight) {
		this.weight = newWeight;
	}
	
	//getter method
	 //Pet �̸� get�ϴ� method
	public String getName() {
		return name;
	}
	 //Pet ���� get�ϴ� method
	public int getAge() {
		return age;
	}
	 //Pet ���� get�ϴ� method
	public double getWeight() {
		return weight;
	}
}


//Pet class ��ӹް�, serializable ������ Dog class
class Dog extends Pet implements Serializable{
	//private �ν��Ͻ� ������
	private String breed;        //��
	private boolean boosterShot; //�������� ����
	
	//������(Dog�� �̸�, ����, ����, ��, �������� ���� ���� �� �Է¹��� ��)
	public Dog(String name, int age, double weight, String breed, boolean bshot) {
		//�� ���� �ν��Ͻ� ������ ����
		setName(name);
		setAge(age);
		setWeight(weight);
		this.breed = breed;
		this.boosterShot = bshot;
	}
	
	//setter method
	 //�� set �ϴ� method
	public void setBreed(String breed) {
		this.breed = breed;
	}
	 //������������ set�ϴ� method
	public void setBoosterShot(boolean boosterShot) {
		this.boosterShot = boosterShot;
	}
	
	//getter method
	 //�� get �ϴ� method
	public String getBreed() {
		return breed;
	}
	 //�������� ���� get �ϴ� method
	public boolean getBoosterShot() {
		return boosterShot;
	}
	
	//toString method
	public String toString() {
		//��ü�� �̸�, ����, ����, ��, �������� ���� O,X�� ����ϱ� 
		return(getName() + "\t"+getAge()+"\t"+getWeight()+"\t"+breed+"\t"+(boosterShot? 'O' : 'X'));
	}
}


public class week10_2_�輭�� {

	public static void main(String[] args) {
		//������
		 //�Է��� ���ϸ�
		String fileName;
		 //��� stream
		ObjectOutputStream outputStream = null;
		 //�Է� stream
		ObjectInputStream inputStream = null;
		 //Ű���� �Է� �������� �� ��ü
		Scanner kbd = new Scanner(System.in);
		 //Dog Ŭ���� �迭(�ʱ�ȭ ����)
		Dog[] myDog = new Dog[10];
		 //Dog Ŭ���� �迭(�о���� ����)
		Dog[] dogs = null;
		
		//Dog class �迭 �ʱ�ȭ
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
		
		//Dog object �������� �Է��� ���ϸ� �Է¹ޱ�
		System.out.println("Input File name to write Dog data");
		fileName = kbd.nextLine();
		
		
		try {
			//��� stream�� ���ϸ� ���� �õ��ϱ�
			outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			//Dog �迭 ���Ͽ� �Է��ϱ�
			outputStream.writeObject(myDog);
			//��� stream �����ϱ�
			outputStream.close();
		}
		//����� ���� ����ó��
		catch(IOException e) {
			System.out.println("ERROR writing to file "+ fileName+".");
			System.exit(0);
		}
		
		//������ �迭�� ���� ����ϱ�
		System.out.println("Name\tAge\tWeight\tBreed\tBoosterShot");
		
		try {
			//�Է� stream�̶� ���ϸ� ����õ�
			inputStream = new ObjectInputStream(new FileInputStream(fileName));
			//���Ͽ� �ִ� ��ü �ҷ�����, ����ȯ
			dogs = (Dog[])inputStream.readObject();
			//�迭 ���������� ���� �� ��ü�� �����Ͽ�, �� ��ü ���� ����ϱ�
			for(int i=0; i<dogs.length; i++) {
				System.out.println(dogs[i]);
			}
			//�Է� stream close
			inputStream.close();
		}
		//���� ���� �� ����ó��
		catch(FileNotFoundException e) {
			System.out.println("File not found Exception");
		}
		//����� ������ ����ó��
		catch(IOException e) {
			System.out.println("IO Exception");
		}
		//�� �� ����ó��
		catch(Exception e) {
			System.out.println("Exception");
		}
		
		//��ü�� �߿� 2���ʰ�&�������� ���� ������ ����ϱ�
		System.out.println("\nDogs older than 2 years and did not get the boosterShot");
		for(int i=0; i<dogs.length; i++) {
			//for ������ ���ؼ�, dogs ���������� �̿���
			if(dogs[i].getAge() > 2 && !dogs[i].getBoosterShot()) {
				//���ǿ� �ش��ϴ� ������ �̸��� �� ����ϱ�
				System.out.println(dogs[i].getName()+"\t"+dogs[i].getBreed());
			}
		}
		//���α׷� ����
		System.out.println("\nProgram finished");
	}
}

