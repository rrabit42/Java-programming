package week7;

import java.util.Scanner;

public class week7_2_�輭�� {

	public static void main(String[] args) {
		//Ű���� �Է��� ���� ��ü �� �������� ����
		Scanner kbd = new Scanner(System.in);
		
		//Emergency ��ü �� �������� ����
		Emergency e = new Emergency();
		//�ҹ��� ��ü �� ��������
		FireEngine f = new FireEngine();
		//������ ��ü �� ��������
		Ambulance a = new Ambulance();
		//������ ��ü �� ��������
		PoliceCar p = new PoliceCar();
		//������� ȣ���� ���� ����
		int choose;
		
		
		//�ݺ���
		do {
			//����ڿ��� � ���޻�Ȳ���� �Է¹ޱ�
			System.out.println("What kind of Emergency");
			System.out.println("1.Fire\t2.Patient\t3.Thief\t4.Record\t5.End");
			choose = kbd.nextInt();
			
			//������� �Է¿� ���� ���� �ٸ� ������ ȣ��
			switch(choose) {
				case 1: e.EM_CALL(f); break; //1�̸� �ҹ��� ȣ��
				case 2: e.EM_CALL(a); break; //2�� ������ ȣ��
				case 3: e.EM_CALL(p); break; //3�̸� ������ ȣ��
				case 4: e.EM_record(); break;//4�� ���±��� ����� ȣ�� ��� ���
				case 5: break;               //5�� �ݺ��� ����
				default: System.out.println("Wrong Input"); //�׿� �ٸ� ���ڴ� �߸��� �Է��̶� ������ֱ�
			}
			
		}while(choose != 5); //5 �̿� �����϶��� �ݺ�
		
		//�ݺ��� ������ ���Ṯ ���
		System.out.println("Finished");
	}

}

//Emergency class
class Emergency{
	//���޻�Ȳ ����� ���� �迭 ����
	public Car[] emgList = new Car[10];
	//�迭�� ��ü �߰��� ���� ����
	int i;
	
	//������ ȣ�� method
	public void EM_CALL(Car c) {   //�θ� Ŭ���� ���������� ���� �ޱ�
		//���� C�� �ҹ��� ��ü�� ����Ű��
		if(c instanceof FireEngine) {
			//119 ȣ��
			System.out.println("Call 119");
		}
		//���� C�� ������ ��ü�� ����Ű��
		else if (c instanceof Ambulance) {
			//119 ȣ��
			System.out.println("Call 119");
		}
		//���� C�� ������ ��ü�� ����Ű��
		else if ( c instanceof PoliceCar) {
			//112 ȣ��
			System.out.println("Call 112");
		}
		
		//�׸��� �� ��ü c�� �迭�� ��ü �߰��ϱ�
		emgList[i++] = c;
	}

	//������ ȣ�� ��� ȣ�� method
	public void EM_record() {
		//������ ȣ�� ��� ����ϱ�
		System.out.println("Emgergency\tNumber\tCar_Type\tRequired");
		for(int j =0; j<i; j++) System.out.println(emgList[j].getStr());
	}
}

//Car class
class Car{
	//�ν��Ͻ� ����
	private String emgType;   //���� ��Ȳ
	private int number;       //ȣ�� ��ȣ
	private String carType;   //������ Ÿ��
	private String reqPerson; //���ϴ� ���
	
	//������, ���ڷ� Car�� �ν��Ͻ� �������� ���� ��� �޴´�
	Car(String emgType, int number, String carType, String reqPerson){
		//�׸��� �ν��Ͻ� ������ ���� �����Ѵ�
		this.emgType= emgType;
		this.number = number;
		this.carType = carType;
		this.reqPerson = reqPerson;
	}
	
	//getter
	  //���� ��Ȳ ������ִ� method
	public String getEmgType() {
		return emgType;
	}
	  //ȣ�� ��ȣ ������ִ� method
	public int getNumber() {
		return number;
	}
	  //������ Ÿ�� ������ִ� method
	public String getCarType() {
		return carType;
	}
	  //���ϴ� ��� ������ִ� method
	public String getReqPerson() {
		return reqPerson;
	}
	//Car�� �ν��Ͻ� ������ ��� ���
	public String getStr() {
		return getEmgType()+"\t\t"+getNumber()+"\t"+getCarType()+"\t"+getReqPerson();
	}
}

//Car �ڽ� �� �ҹ��� Ŭ����
class FireEngine extends Car{
	
	//�ҹ��� ������
	FireEngine(){
		//Car �����ڿ� ���� �� �����ϱ�
		super("Fire", 119, "FireEngine", "FireFighter");
	}
	//�ҹ��� �������� ȣ�� �� getStr method ���
	public String toString() {
		return getStr();
	}
}

//Car �ڽ� �� ������ Ŭ����
class Ambulance extends Car{
	//������ ������
	Ambulance(){
		//Car �����ڿ� ���� �� �����ϱ�
		super("Patient", 119, "Ambulance", "Doctor");
	}
	//������ �������� ȣ�� �� getStr method ���
	public String toString() {
		return getStr();
	}
}

//Car �ڽ� �� ������ Ŭ����
class PoliceCar extends Car{
	//������ ������
	PoliceCar(){
		//Car �����ڿ� ���� �� �����ϱ�
		super("Thief", 112, "PoliceCar", "PoliceOfficer");
	}
	//������ �������� ȣ�� �� getStr method ���
	public String toString() {
		return getStr();
	}
}