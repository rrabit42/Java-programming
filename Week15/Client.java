package week15;

import java.io.PrintWriter;
import java.net.*;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		//server�� ������ ���� ����
		Socket socket = null;
		
		//communication
		try {
			//���� �����ϱ�, server�� �ּҿ� ��Ʈ��
			socket = new Socket("172.30.1.3", 9000);
			
			//������ ���� inputstream
			Scanner in = new Scanner(socket.getInputStream());
			//outputstream
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			//����ڿ��Լ� Ű���� �Է��� �ޱ� ���� Scanner
			Scanner kbd = new Scanner(System.in);
		
			//�������� �λ���
			out.println("Hello?");
			out.flush();
			//server���Լ� ���� �ޱ�
			System.out.println(in.nextLine());
			//����ڿ��Լ� �󸶳� �Է¹ް��� �Է¹ް�
			String number = kbd.nextLine();
			//�������ٰ� �Ѱ��ֱ�
			out.println(number);
			out.flush();
			//�׸��� �ݺ��� ���� int�� ��ȯ
			int num = Integer.parseInt(number);
			
			//server���� �� ���� �ް� ���
			System.out.println(in.nextLine());
			//ó�� �Է��ߴ� ���ڸ�ŭ
			for(int i=0; i<num; i++) {
				//���ڸ� ����ڿ��� �Է¹޾Ƽ�(string type)
				//�������� �ѱ�
				out.println(kbd.nextLine());
				out.flush();
			}
			//���������� ��� ����� ���
			System.out.println(in.nextLine());
			System.out.println(in.nextLine());
			
			//�������� ���̶�� �˸��� ����
			out.println("Sevice finished.");
			out.flush();
		}
		//������ �ȵ� ��� exception handler
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
