package week4;
public class MyFile {
//	System.out.println("===================");
//	System.out.println("����:���̹�����");
//	System.out.println("�й�:1871063");
//	System.out.println("�̸�:�輭��");
//	System.out.println("===================");
	
	//�ν��Ͻ� ���� ����
	private String title; //����
	private int page;    //��������
	
	//�ν��Ͻ��� ������ �����ϴ� �޼ҵ�
	public void setTitle(String title) {
		this.title= title;
	}
	
	//�ν��Ͻ��� ����� �����ϴ� �޼ҵ�
	public String getTitle() {
		return title;
	}
	
	//�ν��Ͻ��� ���������� �����ϴ� �޼ҵ�
	public void setPage(int page) {
		this.page = page;
	}
	
	//�ν��Ͻ��� �������� �����ϴ� �޼ҵ�
	public int getPage() {
		return page;
	}
	
	//���� ���� ����ϴ� �޼ҵ�
	public void fileInfo() {
		System.out.println("��������:"+this.title); //���� ���� ���
		System.out.println("������:"+this.page);  //�������� ���
	}
	
	//���� �����ϴ� �޼ҵ�
	public void fileCopy(MyFile newfile) {
		newfile.title = this.title;    //���ڷ� ���� ��ü�� �� �ν��Ͻ��� �����
		newfile.page = this.page; //���������� ������(�����Ѵ�)
	}
}
