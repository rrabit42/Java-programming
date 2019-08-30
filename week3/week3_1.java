import java.util.Scanner;

public class week3_1_김서영 {

	public static void main(String[] args) {
		//키보드 입력을 위한 객체 생성
		Scanner keyboard = new Scanner(System.in);
		
		//사용자에게 월(정수) 입력 받기
		System.out.print("월 입력:");
		int month = keyboard.nextInt();
		
		//switch문을 이용해 월마다 일 수 출력해주기
		switch(month) {
		//1,3,5,7,8,10,12 월은 31일
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month+"월에는 31일이 있습니다.");
			break;
		//4,6,9,11월은 30일
		case 4: case 6: case 9: case 11:
			System.out.println(month+"월에는 30일이 있습니다.");
			break;
		//2월은 28일
		case 2:
			System.out.println("2월에는 28일이 있습니다.");
			break;
		//1~12의 정수가 아닌 다른 정수를 입력 했을 때는 입력 오류 출력
		default:
			System.out.println("입력 오류");
				
		}
		
	}

}
