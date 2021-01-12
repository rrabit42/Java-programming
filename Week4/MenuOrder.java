package practice;

public class MenuOrder {
	//�ν��Ͻ� ������
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected; //������� �ʾҴ�..
	
	//����å�����ִ� �޼ҵ�
	public void setPrice(String menu,int price) {//����ڷκ��� �޴��̸��� �� ���� ���ڷ� �ޱ�
		if(menu=="coke") {    //�ݶ��
			cokePrice = price;//�ݶ� ���� ����
		}
		else if(menu=="lemon") {//�����̵� ���� ����
			lemonadePrice=price;
		}
		else if(menu=="coffee") {//Ŀ�� ���� ����
			coffeePrice=price;
		}
	}
	
	//�޴� �����ִ� �޼ҵ�
	public void showMenu() {
		//������� �޴���ȣ, �̸�, ������ �����ش�
		System.out.println("1. Coke: "+cokePrice);
		System.out.println("2. Lemonade: "+lemonadePrice);
		System.out.println("3. Coffee: "+coffeePrice);
	}
	
	//����ڷκ��� ����ڰ� ������ �� �Է¹޾Ƽ�
	public void setMoney(int money) {
		inputMoney = money;  //inputMoney�� �������ش�
	}
	
	//��� �����ִ� �޼ҵ�
	public void showResult(int order) {//������� ���ἱ���� ���ڷ� �޴´�
		switch(order) {
			case 1: System.out.println("Coke�� �����ϼ̽��ϴ�.");break;      //1���̸� �ݶ�
			case 2: System.out.println("Lemonade�� �����ϼ̽��ϴ�."); break; //2���̸� �����̵�
			case 3: System.out.println("Coffee�� �����ϼ̽��ϴ�."); break;   //3���̸� Ŀ��
			default: System.out.println("���� �޴��� �����ϼ̽��ϴ�.");         //�� �ܴ� ���� �޴���� ���
		}
		
		//�ݶ� �ֹ����� ��,
		if(order == 1) {
			if(inputMoney>=cokePrice) {//�����ѵ��� �ݶ� ���ݺ��� �� ���� ��
				System.out.printf("�ܵ��� %d�Դϴ�.\n", inputMoney-cokePrice);//�ܵ����
			}
			else {//������ ���� �ݶ� ���ݺ��� ���� ��
				System.out.println(cokePrice-inputMoney+"�� �� �־��ּ���.");//�󸶳� ���� �� �־�����ϴ��� ���
			}
		}
		
		//�����̵带 �ֹ�������
		else if(order == 2){
			if(inputMoney>=lemonadePrice) {//�����ѵ��� �����̵� ���ݺ��� ���� ��
				System.out.printf("�ܵ��� %d�Դϴ�.\n",inputMoney-lemonadePrice); //�ܵ����
			}
			else {//������ ���� �����̵� ���ݺ��� ���� ��
				System.out.println(lemonadePrice-inputMoney+"�� �� �־��ּ���.");//�߰� �ʿ��� �� ���
			}
		}
		
		//Ŀ���ֹ����� ��, ���ϵ���
		else if(order ==3) {
			if(inputMoney>=coffeePrice) {
				System.out.printf("�ܵ��� %d�Դϴ�.\n",inputMoney-coffeePrice);
			}
			else {
				System.out.println(coffeePrice-inputMoney+"�� �� �־��ּ���.");
			}
		}
		
	}
}