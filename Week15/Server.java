package week15;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버
public class Server {

	public static void main(String[] args) {
		//서버 소켓
		ServerSocket serverSocket = null;
		//요청 받으면 communication을 위해 만들어줄 소켓
		Socket socket = null;
		
		//communication
		try {
			//서버 소켓을 9000포트에 연다
			serverSocket = new ServerSocket(9000);
			//요청받으면 서버소켓에 새 소켓을 만들어 붙여준다
			socket = serverSocket.accept();
			
			//소켓으로의 inputstream
			Scanner in = new Scanner(socket.getInputStream());
			//소켓에서부터의 outputstream
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			//client의 String 받아서 출력하기
			System.out.println(in.nextLine());
			//그리고 client에게 얼마나 입력한건지 물어본다
			out.println("How many numbers?");
			out.flush(); //flush!
			//client에게 number를 받고
			String number = in.nextLine();
			//server 화면에 출력
			System.out.println(number);
			
			//그리고 반복을 위해 int로 바꿔주기
			int num = Integer.parseInt(number);
			
			//client에게 얼마나 입력할건지 물어보기
			out.println("Input "+num+" numbers");
			out.flush();
			
			//계산을 위한 변수
			int result = 0;
			//num만큼 반복해서
			for(int i=0; i < num; i++) {
				//사용자에게 받은 숫자String, int로 변경하기
				result += Integer.parseInt(in.nextLine());
			}
			
			//sum 출력
			out.println("Sum: "+ result);
			out.flush();
			//평균 출력
			out.println("Avg: "+ (double)result/num);
			out.flush();
			
			//그리고 client의 메세지 받기
			System.out.println(in.nextLine());
		}
		//연결 오류가 났을 시
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//모든 communication이 끝나면
		finally {
			//server 소켓 닫기
			try {
				serverSocket.close();
			}
			//닫을 때 오류 handle
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			//clinet와의 소켓 닫기
			try {
				socket.close();
			}
			//닫을 때 오류 handle
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
