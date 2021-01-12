package week15;

import java.io.PrintWriter;
import java.net.*;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		//server와 소통을 위한 소켓
		Socket socket = null;
		
		//communication
		try {
			//소켓 연결하기, server의 주소와 포트값
			socket = new Socket("172.30.1.3", 9000);
			
			//연결을 위한 inputstream
			Scanner in = new Scanner(socket.getInputStream());
			//outputstream
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			//사용자에게서 키보드 입력을 받기 위한 Scanner
			Scanner kbd = new Scanner(System.in);
		
			//서버에게 인사함
			out.println("Hello?");
			out.flush();
			//server에게서 문장 받기
			System.out.println(in.nextLine());
			//사용자에게서 얼마나 입력받건지 입력받고
			String number = kbd.nextLine();
			//서버에다가 넘겨주기
			out.println(number);
			out.flush();
			//그리고 반복문 위해 int로 변환
			int num = Integer.parseInt(number);
			
			//server에서 온 문장 받고 출력
			System.out.println(in.nextLine());
			//처음 입력했던 숫자만큼
			for(int i=0; i<num; i++) {
				//숫자를 사용자에게 입력받아서(string type)
				//서버에게 넘김
				out.println(kbd.nextLine());
				out.flush();
			}
			//서버에서온 결과 문장들 출력
			System.out.println(in.nextLine());
			System.out.println(in.nextLine());
			
			//서버에게 끝이라고 알리는 문장
			out.println("Sevice finished.");
			out.flush();
		}
		//연결이 안될 경우 exception handler
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
