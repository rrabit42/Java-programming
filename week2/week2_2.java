package week2;
import java.util.*;

public class week2_2_�輭�� {
	public static void main(String[] args) {
		//Ű���� �Է� ���� �� �ִ� ��ü ����
		Scanner keyboard = new Scanner(System.in);
		
		//����ڿ��� ���� �Է� �ޱ�
		System.out.println("Enter a line of text.");
		String origin = keyboard.nextLine();
		
		//������� ���� Ȯ�ο� ���
		System.out.printf("Your text is \"%s\".", origin);
		
		//����ڿ��� ��ü�ϰ� ���� �ܾ� ����� �Է¹ޱ�
		System.out.println("\nInput a word to replace.");
		String replace = keyboard.next(); //��ü���ϴ� �ܾ�
		
		//����ڿ��� �� �ܾ ���� �ܾ�� ��ü�ϰ� ������ ���� �Է¹ޱ�
		System.out.println("Input a word to insert.");
		String change = keyboard.next(); //��ü�� �ܾ�
		
		//���� ����ڰ� �Է��� ���忡��, ���ϴ´�� �ܾ� ��ü�ϱ�
		origin = origin.replace(replace, change);
		//���� ��ü�� �빮�ڷ� �ٲٱ�
		origin = origin.toUpperCase();
		
		//�ٲ� ���� ���
		System.out.printf("New sentence is \"%s\".", origin);
		//������ ���� ���
		System.out.printf("\nThe length of \"%s\" is %d.", origin, origin.length());
	}
}
