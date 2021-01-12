package week10;

//필요한 패키지 import
import java.io.*;
import java.util.*;

public class week10_1_김서영 {

	public static void main(String[] args) {
		//변수들
		 //입력stream 참조변수
		ObjectInputStream inputStream = null;
		 //출력stream 참조변수
		ObjectOutputStream outputStream = null;
		 //읽을 파일명
		String fileName=null;
		 //출력할 파일명
		String newfileName=null;
		 //키보드 입력 받을 참조변수 및 객체
		Scanner kbd = new Scanner(System.in);
		
		
		//사용자에게 읽을 파일명 입력받기
		System.out.println("File name for input:");
		fileName = kbd.nextLine();
		
		//사용자에게 출력 파일명 입력받기
		System.out.println("File name for output");
		newfileName = kbd.nextLine();
		try {
			//출력stream 출력 파일과 연결 시도
			outputStream = new ObjectOutputStream(new FileOutputStream(newfileName));
		}
		//입출력 오류 예외처리
		catch(IOException e) {
			System.out.println("Problem with input from file "+ newfileName);
		}
		
		//입력 파일에 있는 값들 출력하기
		System.out.println("The numbers in File, numbers.dat");
		try {
			//입력stream 입력 파일과 연결 시도
			inputStream = new ObjectInputStream(new FileInputStream(fileName));
			try {
				//입력파일에서 값을 읽어올 반복문
				while(true) {
					//정수 하나씩 읽어오기 시도
					int num = inputStream.readInt();
					//정수 읽어온것 출력
					System.out.println(num);
					
					//출력stream 이용해 정수의 두배를 출력파일의 기록
					outputStream.writeInt(num*2);
				}
			}
			//입출력 오류 예외처리
			catch(EOFException e) {
				System.out.println("End of reading from File, "+ fileName);
			}
			//무사히 입력파일에서 값 읽어왔을 경우
			 //입력스트림과 출력 스트림 close
			inputStream.close();
			outputStream.close();
		}
		//파일이 없을 시 예외처리
		catch(FileNotFoundException e) {
			System.out.println("Cannot find file "+ fileName);
		}
		//입출력 오류 예외처리
		catch(IOException e) {
			System.out.println("Problem with input from file "+ fileName);
		}
		
		
		//출력파일이 완성되었음을 알리기
		System.out.println(newfileName+" is generated.");
		
		//출력파일의 값들 출력하기
		System.out.println("\nThe numbers in new File, doublenumbers.dat");
		try {
			//출력파일을 읽어올 inputstream 새롭게 지정 지도
			inputStream = new ObjectInputStream(new FileInputStream(newfileName));
			try {
				while(true) {
					//출력파일에서 값 읽어오기 시도
					int num = inputStream.readInt();
					//출력파일 값 출력하기
					System.out.println(num);
				}
			}
			//입출력 오류 예외처리
			catch(EOFException e) {
				System.out.println("End of reading from 2nd File, "+newfileName);
			}
			//입력stream 종료
			inputStream.close();
		}
		//파일이 없을 시 예외처리
		catch(FileNotFoundException e) {
			System.out.println("Cannot find file "+ newfileName);
		}
		//입출력 오류 예외처리
		catch(IOException e) {
			System.out.println("Problem with input from file "+ newfileName);
		}
	}
}
