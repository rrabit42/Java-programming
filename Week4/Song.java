package week4;

public class Song {
	//�ν��Ͻ� ���� ����
	public String title;    //�뷡 ����
	public String singer; //����
	public int price;       //����
	
	//���� �뷡 ����� �˷��ִ� �޼ҵ�
	public void play() {
		System.out.printf("�뷡����: \"%s\" by %s\n", title, singer); //�뷡 ����, ������ ���
	}
	//�뷡 ���� �˷��ִ� �޼ҵ�
	public void price() {
		System.out.println(price+"���Դϴ�.");
	}
}
