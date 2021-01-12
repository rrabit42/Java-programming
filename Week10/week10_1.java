package week10;

//�ʿ��� ��Ű�� import
import java.io.*;
import java.util.*;

public class week10_1_�輭�� {

	public static void main(String[] args) {
		//������
		 //�Է�stream ��������
		ObjectInputStream inputStream = null;
		 //���stream ��������
		ObjectOutputStream outputStream = null;
		 //���� ���ϸ�
		String fileName=null;
		 //����� ���ϸ�
		String newfileName=null;
		 //Ű���� �Է� ���� �������� �� ��ü
		Scanner kbd = new Scanner(System.in);
		
		
		//����ڿ��� ���� ���ϸ� �Է¹ޱ�
		System.out.println("File name for input:");
		fileName = kbd.nextLine();
		
		//����ڿ��� ��� ���ϸ� �Է¹ޱ�
		System.out.println("File name for output");
		newfileName = kbd.nextLine();
		try {
			//���stream ��� ���ϰ� ���� �õ�
			outputStream = new ObjectOutputStream(new FileOutputStream(newfileName));
		}
		//����� ���� ����ó��
		catch(IOException e) {
			System.out.println("Problem with input from file "+ newfileName);
		}
		
		//�Է� ���Ͽ� �ִ� ���� ����ϱ�
		System.out.println("The numbers in File, numbers.dat");
		try {
			//�Է�stream �Է� ���ϰ� ���� �õ�
			inputStream = new ObjectInputStream(new FileInputStream(fileName));
			try {
				//�Է����Ͽ��� ���� �о�� �ݺ���
				while(true) {
					//���� �ϳ��� �о���� �õ�
					int num = inputStream.readInt();
					//���� �о�°� ���
					System.out.println(num);
					
					//���stream �̿��� ������ �ι踦 ��������� ���
					outputStream.writeInt(num*2);
				}
			}
			//����� ���� ����ó��
			catch(EOFException e) {
				System.out.println("End of reading from File, "+ fileName);
			}
			//������ �Է����Ͽ��� �� �о���� ���
			 //�Է½�Ʈ���� ��� ��Ʈ�� close
			inputStream.close();
			outputStream.close();
		}
		//������ ���� �� ����ó��
		catch(FileNotFoundException e) {
			System.out.println("Cannot find file "+ fileName);
		}
		//����� ���� ����ó��
		catch(IOException e) {
			System.out.println("Problem with input from file "+ fileName);
		}
		
		
		//��������� �ϼ��Ǿ����� �˸���
		System.out.println(newfileName+" is generated.");
		
		//��������� ���� ����ϱ�
		System.out.println("\nThe numbers in new File, doublenumbers.dat");
		try {
			//��������� �о�� inputstream ���Ӱ� ���� ����
			inputStream = new ObjectInputStream(new FileInputStream(newfileName));
			try {
				while(true) {
					//������Ͽ��� �� �о���� �õ�
					int num = inputStream.readInt();
					//������� �� ����ϱ�
					System.out.println(num);
				}
			}
			//����� ���� ����ó��
			catch(EOFException e) {
				System.out.println("End of reading from 2nd File, "+newfileName);
			}
			//�Է�stream ����
			inputStream.close();
		}
		//������ ���� �� ����ó��
		catch(FileNotFoundException e) {
			System.out.println("Cannot find file "+ newfileName);
		}
		//����� ���� ����ó��
		catch(IOException e) {
			System.out.println("Problem with input from file "+ newfileName);
		}
	}
}
