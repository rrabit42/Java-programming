package week2;
import java.util.*;

public class week2_2_김서영 {
	public static void main(String[] args) {
		//키보드 입력 받을 수 있는 객체 생성
		Scanner keyboard = new Scanner(System.in);
		
		//사용자에게 문장 입력 받기
		System.out.println("Enter a line of text.");
		String origin = keyboard.nextLine();
		
		//사용자의 문장 확인용 출력
		System.out.printf("Your text is \"%s\".", origin);
		
		//사용자에게 교체하고 싶은 단어 물어보고 입력받기
		System.out.println("\nInput a word to replace.");
		String replace = keyboard.next(); //교체당하는 단어
		
		//사용자에게 그 단어를 무슨 단어로 교체하고 싶은지 묻고 입력받기
		System.out.println("Input a word to insert.");
		String change = keyboard.next(); //교체될 단어
		
		//원래 사용자가 입력한 문장에서, 원하는대로 단어 교체하기
		origin = origin.replace(replace, change);
		//문장 전체를 대문자로 바꾸기
		origin = origin.toUpperCase();
		
		//바꾼 문장 출력
		System.out.printf("New sentence is \"%s\".", origin);
		//문장의 길이 출력
		System.out.printf("\nThe length of \"%s\" is %d.", origin, origin.length());
	}
}
