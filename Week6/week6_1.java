import java.util.Scanner;

public class week6_1_�輭�� {
	public static void main(String[] args) {
		//��ü ���� �� ����
		Play play = new Play(); //�� ��ü
		Film film = new Film(); //��ȭ ��ü
		
		//����ڷκ��� Ű���� �Է��� �ޱ� ���� �������� ���� �� ��ü ����
		Scanner kbd = new Scanner(System.in);
		
		//�� ���� �Է¹޾Ƽ� play��ü�� �ν��Ͻ� �����鿡 setter�� ���� �����ϱ�
		 //�� ����
		System.out.println("Input Title for Play");
		play.setTitle(kbd.nextLine());
		
		 //�� ����
		System.out.println("Input Director for Play");
		play.setDirector(kbd.nextLine());
		
		 //�� �۰�
		System.out.println("Input Writer for play");
		play.setWriter(kbd.nextLine());
		
		
		//��ȭ ���� �Է¹޾Ƽ� film��ü�� �ν��Ͻ� �����鿡 setter�� ���� �����ϱ�
		 //��ȭ ����
		System.out.println("Input Title for Film");
		film.setTitle(kbd.nextLine());
		
		 //��ȭ ����
		System.out.println("Input Director for Film");
		film.setDirector(kbd.nextLine());
		
		 //��ȭ �۰�
		System.out.println("Input Writer for Film");
		film.setWriter(kbd.nextLine());
		
		//���� �ϴµ� ��� ��� �Է¹޾Ƽ� play�� ������ setter ���� ����
		System.out.println("Input Performance Cost for Play");
		play.setPerformanceCost(kbd.nextInt());
		
		//��ȭ�� box office gross �Է¹޾Ƽ� film�� ������ setter ���� ����
		System.out.println("Input boxOfficeGross for Film");
		film.setBoxOfficeGross(kbd.nextInt());
		
		//���� ���� ��� �޼��� ȣ��
		play.display();
		
		System.out.print("\n");
		
		//��ȭ ���� ��� �޼��� ȣ��
		film.display();
		
	}
}


//production class ����
class Production{
	//�ν��Ͻ� ������(private)
	private String title;    //����
	private String director; //����
	private String writer;   //�۰�
	
	//getter method
	 //���� �� �����ֱ�
	public String getTitle() {
		return title;
	}
	 //���� �� �����ֱ�
	public String getDirector() {
		return director;
	}
	 //�۰� �� �����ֱ�
	public String getWriter() {
		return writer;
	}
	
	
	//setter method
	 //���� �� �Է¹ޱ�
	public void setTitle (String title) {
		this.title = title;
	}
	
	 //���� �� �Է¹ޱ�
	public void setDirector(String director) {
		this.director = director;
	}
	
	 //�۰� �� �Է¹ޱ�
	public void setWriter (String writer) {
		this.writer = writer;
	}
	
	//���� ��� �޼���
	public void display() {
		System.out.println("Title:"+title);        //���� ���
		System.out.println("Director:"+director);  //���� ���
		System.out.println("Writer:"+writer);      //�۰� ���
	}
}


//Production ��ӹ��� Play class ����
class Play extends Production{
	//�ν��Ͻ� ����
	private int performanceCost;   //���� ���
	
	//���� ��� �� �����ִ� getter method
	public int getPerformanceCost() {
		return performanceCost;
	}
	
	//���� ��� �� �������ִ� setter method
	public void setPerformanceCost(int cost) {
		performanceCost = cost;
	}
	
	//���� ���� ���
	public void display() {
		super.display();   //������ method��
		                   //���� ��� �� ������ �߰��� ���(�������̵�)
		System.out.println("performance cost:"+performanceCost);
	}
}


//Production ��ӹ��� Film class ����
class Film extends Production{
	//�ν��Ͻ� ����
	private int boxOfficeGross; //box office gross
	
	//������(?) �� �����ִ� getter method
	public int getBoxOfficeGross() {
		return boxOfficeGross;
	}
	
	//������ �� �������ִ� setter method
	public void setBoxOfficeGross(int gross) {
		boxOfficeGross = gross;
	}
	
	//��ȭ ���� ������ִ� method
	public void display() {
		super.display();  //������ method��
		                  //������ �� ������ �߰��� ���(�������̵�)
		System.out.println("boxOfficeGross:"+boxOfficeGross);
	}
}