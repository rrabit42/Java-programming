import java.util.Scanner;

public class HW1_2_김서영 {
	public static void main(String[] args) {
		//Scanner 참조변수 및 객체 생성
		Scanner kbd = new Scanner(System.in);
		
		//DiceGame 참조변수 및 객체 생성
		DiceGame game = new DiceGame(1);
		
		//반복을 위한 변수 선언 및 초기화
		String repeat = "y";
		
		//y나 Y일때는 게임 반복
		do {
			//game객체로 주사위 게임 실행
			game.startPlaying();
			//게임 끝나면 게임 반복 여부 질문
			System.out.println("Try again?(y/n)");
			repeat = kbd.nextLine();
		} while(repeat.equalsIgnoreCase("y")); //사용자가 반복여부에 y라고 답하는 한, 반복문 반복하여 게임 반복 진행
		
		//n이나 N입력 시 게임 종료
		System.out.println("Game finished.");
	}
}


//DiceGame class
class DiceGame {
	//인스턴스 변수
	private int diceFace;  //실제 주사위눈 값
	private int userGuess; //사용자가 추즉한 주사위눈 값
	
	//생성자
	DiceGame(int diceFace){
		this.diceFace = diceFace; //어처피 덮어씌울거지만, 교수님이 int인자 받으라고 하셨으니 아무데나 넣어준다
	}
	
	//주사위를 굴려 주사위눈 값 정해서 리턴해주는 method
	private int rollDice() {
		//주사위값은 random()이용해서 1~6 사이 랜덤으로 받기
		diceFace = (int)(Math.random()*6)+1;
		//diceFace값 리턴
		return diceFace;
	}
	
	//사용자로부터 주사위값 추측값 받는 method
	private int getUserInput() {
		//키보드 입력 받게 Scanner 참조변수 및 객체 생성
		Scanner kbd = new Scanner(System.in);
		//사용자의 추측값 입력 받기
		userGuess = kbd.nextInt();
		
		//만약 입력값이 범위에서 벗어나면 정확한 값 입력할 때 까지 반복 입력받기
		while(userGuess < 1 || userGuess > 6) {
			//입력할 수 있는 범위 알려주고
			System.out.println("Input number between 1~6");
			//다시 입력받기
			userGuess = kbd.nextInt();
		}
		
		//추측값 리턴
		return userGuess;
	}
	
	//사용자가 추측한값이 실제 주사위눈값과 일치하는지 확인
	private void checkUserGuess(int diceFace) {
		//getUserInput메소드로 user의 추측값 가져오기
		int user = getUserInput();
		
		//인자로 입력받은 실제 주사위 값과 user 추측값 비교
		if(user == diceFace) {
			//같으면 bingo 출력
			System.out.println("Bingo!");
		}
		//틀리면 wrong 출력
		else System.out.println("Wrong!\nThe face was "+diceFace);
	}
	
	//게임하는 method
	public void startPlaying() {
		//게임시작 알려주기
		System.out.println("\n<< GAME START >>");
		
		//주사위 던지기
		System.out.println("Dice is rolled!!!");
		int dice = rollDice(); //메소드 이용해서 실제 주사위값 구해서 dice변수에 대입
		
		//사용자에게 추측값 입력받기
		System.out.println("Guess the number! WHat do you think?");
		checkUserGuess(dice); //주사위값 인자로 넘겨줘서 checkUserGuess 메소드에서
		                      //사용자 추측값 입력받고 비교까지 함
	}
}