package week7;

import java.util.Scanner;

public class week7_1_�輭�� {

	public static void main(String[] args) {
		//����� ��ü ����
		Buyer user = new Buyer();
		//������� ���� ����
		int choose;
		
		//��ǰ ��ü�� ����������
		Tv t = new Tv();              //TV
		Computer c = new Computer();  //��ǻ��
		Video v = new Video();        //����
		Audio a = new Audio();        //�����
		Notebook n = new Notebook();  //��Ʈ��
		
		//Ű���� �Է��� ���� �������� �� ��ü
		Scanner kbd = new Scanner(System.in);
		
		
		//����ڿ��� ���� ���� ���� �Է¹ޱ�
		System.out.println("How much money do you have?");
		  //�޾Ƽ� ����� ��ü �� ������ �Է�
		user.money = kbd.nextInt();
		
		//�ݺ�
		do{
			System.out.println("What do you want to buy? Input 0 to quit.");
			//�� �޴� ����
			System.out.println("1. TV(100)\t2. Computer(200)\t3. Video(110)\t4. Audio(50)\t5. Notebook(300)");	
			choose = kbd.nextInt();
			//���� 0�� �Է��ϸ� �ݺ��� Ż��
			if (choose == 0) break;
			//�޴� ���ÿ� ���� ��� ��ǰ
			switch(choose) {
				case 1: user.buy(t); break; //1�̸� Ƽ�� ����
				case 2: user.buy(c); break; //2�� ��ǻ��  ����
				case 3: user.buy(v); break; //3�̸� ���� ����
				case 4: user.buy(a); break; //4�� ����� ����
				case 5: user.buy(n); break; //5�� ��Ʈ�� ����
				default: System.out.println("No such item"); break;
			}
		}while(choose != 0); //����ڰ� 0�� �Է��ϸ� �ݺ��� Ż��
		
		//���Ű� ������, �� ��ǰ�� ���� �ݾ�, ����Ʈ ���
		user.summary();
	}

}


//������ class
class Buyer{
	//�ν��Ͻ� ����
	public int money;   //�����ڰ� ������ �ִ� ��
	int i;              //�迭�� ��ü �߰��� ���� ����
	int bonusPoint = 0; //�������� ����Ʈ
	Product item[] = new Product[10]; //�� ��ǰ ��� �迭 ����
	
	//��ǰ ���� method
	void buy(Product pd) {
		//���� ��ǰ ������ ������ �ִ� ������ ������
		if(pd.price > money) {
			//���� �����ϴٰ� ����ϰ�
			System.out.println("\nMoney is not enough. \n");
			//���Ÿ�� �� ��, ����Ʈ ���
			summary();
			//���α׷� ����
			System.exit(0);
		}
		//������ �ִ� ���� ����ϸ�, �� ��ǰ�� ������ ���
		System.out.println("You bought "+pd+"("+pd.price+")");
		//��ǰ ���� ����
		money = money - pd.price;
		//���ʽ� ����Ʈ �ױ�
		bonusPoint = bonusPoint + pd.bonusPoint;
		//��Ͽ� ��ǰ ��ü �߰�
		item[i++] = pd;
	}
	
	//���Ÿ�� �� ����
	void summary() {
		//���θ�� ���
		System.out.print("\nShopping list: ");
		for(int j=0; j<i; j++) System.out.print(item[j]+ " ");
		//���� �� ���
		System.out.println("\nMoney left: " + money);
		//����Ʈ ���
		System.out.println("Current bonus point: "+bonusPoint);
	}
}

//��ǰ class
class Product{
	int price;       //��ǰ ����
	int bonusPoint;  //��ǰ���� ���� �� �ִ� ����Ʈ
	//������
	Product(int price){
		this.price = price;   //���� �޾� ���� ����
		bonusPoint = price/10;//����Ʈ ����
	}
}

//��ǰ �� Tv
class Tv extends Product{
	Tv(){
		super(100);   //Ƽ�� ������ 100
	}
	public String toString() {
		return "Tv";  //Tv �������� �θ��� Tv ����
	}
}

//��ǰ �� ��ǻ��
class Computer extends Product{
	Computer(){
		super(200);  //��ǻ�� ������ 200
	}
	public String toString() {
		return "Computer"; //��ǻ�� �������� �θ��� ��ǻ�� ����
	}
}

//��ǰ �� ����
class Video extends Product{
	Video(){
		super(110);  //���� ������ 110
	}
	public String toString() {
		return "Video";    //���� �������� �θ��� ���� ����
	}
}

//��ǰ �� �����
class Audio extends Product{
	Audio(){
		super(50);  //����� ������ 50
	}
	public String toString() {
		return "Audio";    //����� �������� �θ��� ����� ����
	}
}

//��ǰ �� ��Ʈ��
class Notebook extends Product{
	Notebook(){
		super(300); //��Ʈ�� ������ 300
	}
	public String toString() {
		return "NoteBook";  //��Ʈ�� �������� �θ��� ��Ʈ�� ����
	}
}