package week4;

import java.util.Scanner;

public class week4_3_�輭�� {
	public static void main(String[] args) {
		//Ű���� �Է¹��� ���� ����
		Scanner kbd = new Scanner(System.in);
		
		//�ʿ��� ������
		String title; //���� ����
		int page;     //������ ��
		MyFile fOld = new MyFile(); //���� �ִ� ���� ��ü ����
		MyFile fNew = new MyFile(); //fOld�� ������ ���� ��ü
		System.out.println("--File�����Է�(����,��������)--");
		//���� ������ �Է� �޴´�
		fOld.setTitle(kbd.nextLine());
		fOld.setPage(kbd.nextInt());
		//fNew�� fOld������ �����Ѵ�
		fOld.fileCopy(fNew);
		
		//����� ����Ѵ�
		System.out.println("<����File>");
		fOld.fileInfo();
		System.out.println("<�����File>");
		fNew.fileInfo();
	}
}
