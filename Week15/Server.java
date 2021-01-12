package week15;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//����
public class Server {

	public static void main(String[] args) {
		//���� ����
		ServerSocket serverSocket = null;
		//��û ������ communication�� ���� ������� ����
		Socket socket = null;
		
		//communication
		try {
			//���� ������ 9000��Ʈ�� ����
			serverSocket = new ServerSocket(9000);
			//��û������ �������Ͽ� �� ������ ����� �ٿ��ش�
			socket = serverSocket.accept();
			
			//���������� inputstream
			Scanner in = new Scanner(socket.getInputStream());
			//���Ͽ��������� outputstream
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			//client�� String �޾Ƽ� ����ϱ�
			System.out.println(in.nextLine());
			//�׸��� client���� �󸶳� �Է��Ѱ��� �����
			out.println("How many numbers?");
			out.flush(); //flush!
			//client���� number�� �ް�
			String number = in.nextLine();
			//server ȭ�鿡 ���
			System.out.println(number);
			
			//�׸��� �ݺ��� ���� int�� �ٲ��ֱ�
			int num = Integer.parseInt(number);
			
			//client���� �󸶳� �Է��Ұ��� �����
			out.println("Input "+num+" numbers");
			out.flush();
			
			//����� ���� ����
			int result = 0;
			//num��ŭ �ݺ��ؼ�
			for(int i=0; i < num; i++) {
				//����ڿ��� ���� ����String, int�� �����ϱ�
				result += Integer.parseInt(in.nextLine());
			}
			
			//sum ���
			out.println("Sum: "+ result);
			out.flush();
			//��� ���
			out.println("Avg: "+ (double)result/num);
			out.flush();
			
			//�׸��� client�� �޼��� �ޱ�
			System.out.println(in.nextLine());
		}
		//���� ������ ���� ��
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//��� communication�� ������
		finally {
			//server ���� �ݱ�
			try {
				serverSocket.close();
			}
			//���� �� ���� handle
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			//clinet���� ���� �ݱ�
			try {
				socket.close();
			}
			//���� �� ���� handle
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
