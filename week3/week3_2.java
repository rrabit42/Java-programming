import java.util.Scanner;

public class week3_2_김서영 {

	public static void main(String[] args) {
		//키보드 입력을 위한 객체 생성
		Scanner keyboard = new Scanner(System.in);
		
		//필요한 변수들 설정
		char grade;      //등급 변수
		String re = "y"; //반복을 결정하는 변수
		
		//re가 y일 동안은 반복하고 그 이외는 반복문을 종료한다
		while(re.equalsIgnoreCase("y")){
			//사용자에게 점수를 입력받는다
			System.out.print("점수입력:");
			int score = keyboard.nextInt();
			
			//1~100사이의 숫자를 입력하지 않으면
			if (score>100 || score <0) {
				//입력 가능한 정수 범위를 알려주고
				System.out.println("점수는 0~100사이입니다.");
				//사용자에게 반복 여부를 다시 물어본다.
				System.out.println("반복하시겠습니까?(y/n)");
				re = keyboard.next();
			}
			
			//올바른 범위의 숫자를 입력할 시
			else {
				//switch문을 이용해 등급을 결정한다
				int score2 = score/10;
				switch(score2) {
					case 10:
					case 9: grade = 'A'; break; //90~100점은 A등급
					case 8: grade = 'B'; break; //80~89점은 B
					case 7: grade = 'C'; break; //70~79점은 C
					case 6: grade = 'D'; break; //60~69점은 D
					default: grade = 'F'; //나머지는 F등급
				}
				//등급이 결정되면 점수와 등급을 출력해주고
				System.out.println("점수는 "+score+"점이고 grade는 "+grade+"입니다.");
				
				//사용자에게 반복 여부를 다시 물어본다
				System.out.println("반복하시겠습니까?(y/n)");
				re = keyboard.next();
			}
		
		}
		//사용자가 반복을 원하지 않을 시 종료를 출력하고 프로그램을 종료한다
		System.out.println("종료");
	}

}
