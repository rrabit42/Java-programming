package week;
import java.util.Scanner;
class Song {
	//�ν��Ͻ� ���� ����
	public String title;  //���
	public String singer; //������
	public int price;     //����
	
	//default ������ ����
	public Song() {};
	
	//title, singer,price �ִ� ������
	public Song(String initialtitle, String initialsinger, int initialprice) {
		title = initialtitle;   //���� ���� ������ �ν��Ͻ� ������ ����
		singer = initialsinger; //���� ����
		price = initialprice;   //���� ����
	}
	
	//singer�� ����, title, price�� �ִ� ������
	public Song(String initialtitle, int initialprice) {
		this(initialtitle, "��", initialprice); //signer�� "��"�־ ������ �����
	}
	
	//�뷡 �����Ų�ٴ� ��¹� ������ �޼���
	public void play() {
		System.out.println(title+" by "+ singer);
	}
}

public class week5_1_�輭�� {

	public static void main(String[] args) {
		//Ű���� �Է� ���� ���� ���� ����
		Scanner kbd = new Scanner(System.in);
		//Song��ü ������ ���� ����
		Song mysong;
		
		//����ڿ��� �Է¹��� ������
		String title;  //������
		String singer; //����
		int price;     //����
		int count;     //�󸶳� ���� ����
		
		
		System.out.println("*Song ����*");
		//�������� ����ڿ��� �ݵ�� �Է� �ޱ�
		do {
			System.out.print("���:");
			title = kbd.nextLine();
			//���� ����ڰ� �Է����� �ʴ´ٸ� ��� �ʿ��ϴٰ� ����ϰ�
			if (title.equalsIgnoreCase("")) {
				System.out.println("����� �ݵ�� �ʿ��մϴ�.");
			}
		}while(title.equalsIgnoreCase("")); //�ݺ��ؼ� ��� �Է¹ޱ�
		
		//������ �Է¹ޱ�
		System.out.print("������:");
		singer = kbd.nextLine();
		
		//���� �Է¹ޱ�
		System.out.print("����:");
		price = kbd.nextInt();
		
		//���� ����ڰ� �������� �Է����� �ʾ�����
		if(singer.equalsIgnoreCase("")) {
			mysong = new Song(title, price); //������ �ʿ���� ������ ����
		}
		//������ �Է�������
		else {
			mysong = new Song(title, singer, price); //��� ���� �Է��ؼ� ������ ����
		}
		
		//��� �������� �����
		System.out.println("��� �����ðڽ��ϱ�?");
		count = kbd.nextInt();
		
		//��� Ƚ����ŭ play���ֱ�
		for(int i=0; i<count; i++) {
			mysong.play();
		}
		
		//���ݵ� ������ֱ�
		System.out.println("�� "+mysong.price+"���Դϴ�.");
	
	
	}

}
