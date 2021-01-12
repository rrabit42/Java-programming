package exception;

//알고리즘에 필요한 클래스 import
import java.util.InputMismatchException;
import java.util.Scanner;


//Test class
public class week9_김서영 {

	public static void main(String[] args) {
		//게임 객체 및 참조변수 생성
		Game game = new Game();
		
		//게임 시작
		game.start();
		
		//누가 이길 때까지 게임 반복
		while(true) {
			
			//setValue method로 값 설정
			game.setValue();
			//게임 결과 출력
			game.writeOutput();

			//누군가 3번 이기면 게임 종료
			if(game.userwin == 3) {
				//사용자가 이겼을 시, 문장 출력하고 루프 탈출
				System.out.println("\n당신이 이겼습니다.");
				break;
			}
			else if (game.comwin == 3) {
				//컴?가 이겼을 시, 문장 출력하고 루프 탈출
				System.out.println("\n컴퓨터가 이겼습니다.");
				break;
			}
		}
		//게임 종료문
		System.out.println("게임을 종료합니다.");
	}
}


//정수이지만 범위 벗어났을 때의 예외
class WrongRangeException extends Exception{ //Exception 상속
	//생성자 정의
	WrongRangeException(){};
	WrongRangeException(String str){
		super(str);
	}
}


//게임 class
class Game{
	//인스턴스 변수들
	int userwin, comwin; //사용자가 이긴횟수, 컴퓨터가 이긴 횟수
	int user, com;       //사용자의 선택, 컴퓨터의 선택
	
	//키보드 입력을 위한 참조변수 및 변수 생성
	Scanner kbd = new Scanner(System.in);
	
	//게임 class 생성자
	Game(){};
	
	
	//METHOD
	
	 //게임시작 메소드
	void start () {
		//시작을 알린다
		System.out.println("가위바위보 게임을 시작합니다.");
	}
	
	 //사용자와 컴퓨터의 선택 set해주는 method
	void setValue(){
		//컴퓨터의 선택값을 1,2,3중에서 랜덤으로 설정
		com = (int)(Math.random()*3)+1;
		
		//정상적인 값을 입력할 때 까지 사용자로부터 선택 입력받기
		while(true) {
			//선택지 알려주기
			System.out.println("\n당신의 선택은?");
			System.out.println("가위(1) 바위(2) 보(3)");
		
			try {
				//사용자로부터 값 입력받기
				user = kbd.nextInt();
				//만약 입력값이 범위를 벗어나면
				if(user<1 || user>3) {
					//값을 벗어났다는 예외 발생시키기
					throw new WrongRangeException();
				}
				
				//만약 올바른 값이라면 while문 탈출
				if(user>=1 && user<=3) {
					break;
				}
			}
			//값이 범위를 벗어난 예외일 때는
			catch(WrongRangeException we) {
				//범위 잘못되었다고 알려주고
				System.out.println("범위가 잘못되었습니다.");
				//반복문 continue, 다시 입력값 물어보기
				continue;
			}
			//Int값이 아닌 다른 값을 입력 받았을 때는
			catch(InputMismatchException ie) {
				//정수를 입력해달라 요청하고
				System.out.println("정수를 입력해주세요.");
				//버퍼를 비우고
				kbd.nextLine();
				//반복문 continue, 다시 입력값 물어보기
				continue;
			}
		}
	}
	
	 //사용자와 컴퓨터의 값을 비교해주는 method
	String compare() {
		//가위<바위<보 가 차례대로 1,2,3이므로 그 경우와, 보<가위인 경우 일 때를 짧게 압축한 식
		//사용자가 이기면
		if (user == (com+1) || (user+2) == com ) {
			userwin++;   //사용자가 이긴횟수 +1
			return "u";  //u라는 String return
		}
		//둘이 값이 같으면 비긴 것이므로
		else if (user == com) {
			return "s";  //same이라는 뜻의 String return
		}
		//그 외는 컴퓨터가 이긴 것이므로
		else {
			comwin++;    //컴퓨터가 이긴횟수 +1
			return "c";  //c String return
		}
	}
	
	 //매번 누가 이겼는지 결과 출력해주는 method
	void writeOutput() {
		//compare method를 불러와서 결과 String 받기
		String res = compare();
		//결과 String에 따라 출력값 달라짐
		switch(res) {
		case "u": System.out.println("당신 승"); break;  //u면 사용자 승리
		case "s": System.out.println("비김"); break;    //s면 비김
		case "c": System.out.println("컴퓨터 승"); break; //c이면 컴퓨터 승리
		}
	}
}