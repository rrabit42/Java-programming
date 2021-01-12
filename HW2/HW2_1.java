import java.io.*;
import java.util.*;

public class HW2_1_김서영 {

	public static void main(String[] args) {
		//필요한 변수들
		  //키보드 입력
		Scanner kbd = new Scanner(System.in);
		  //데이터 읽기
		Scanner inputStream = null;
		  //데이터 쓰기
		PrintWriter outputStream = null;
		  //파일 이름들
		String read_file, write_file;
		  //단어 분리
		StringTokenizer tokenizer;
		
		//사용자로부터 읽을 파일 이름 받기
		System.out.println("Input the filename to read.");
		read_file = kbd.nextLine();
		//그리고 stream 연결 예외처리
		try {
			inputStream = new Scanner(new File(read_file));
		}
		catch(FileNotFoundException e) {
			//파일이 없을 경우
			System.out.println("Error in opening a file.\n");
			System.exit(1);
		}
		
		//사용자로부터 쓸 파일 이름 받기
		System.out.println("Input the filename to write");
		write_file = kbd.nextLine();
		//그리고 stream 연결 예외처리
		try {
			outputStream = new PrintWriter(write_file);
		}
		catch(IOException e) {
			//IO 예외가 발생할 경우
			System.out.println("Exception occurs.\n");
			System.exit(1);
		}
		
		//읽을 파일에서 쓸 단어들 고르기
		 //읽을 파일에서 줄 단위로 읽어오기
		while(inputStream.hasNextLine()) {
			//줄 하나 선택해서
			String line = inputStream.nextLine();
			//tokenizer로 이용해 단어들만 추린다.
			tokenizer = new StringTokenizer(line, " \n,");
			//token, 즉 단어가 있으면
			while(tokenizer.hasMoreTokens()) {
				//단어들중 하나를 가져온다.
				String word = tokenizer.nextToken();
				//단어의 길이가 4보다 클 경우에만
				if(word.length() > 4) {
					//outputStream을 이용해 단어를 파일에 적는다.
					outputStream.println(word);
				}
			}
		}
		//파일을 close하고, 스트림을 disconnect한다.
		inputStream.close();
		outputStream.close();
		//파일이 만들어졌음을 알리기
		System.out.println("animalOutput.txt is generated.");
	}
}
