package week14;

import javax.swing.JOptionPane;

//공유 공간
class SharedBox{
	//문자열 배열
	String[] words = {"love", "happy", "cake", "dog", "cat", "mine", "java", "python", "car", "apple", "video", "snap", "water", "trello", "git"};
	//문자열의 인덱스
	int index;
}

//문자열의 단어를 랜덤으로 출력해주면서 초를 세는 thread
class CountThread extends Thread{
	//thread 동작 여부 결정 변수(true면 thread 중지)
	private boolean stop=false;
	//공유 공간
	SharedBox sharedbox;
	
	//run method
	public void run() {
		//반복문을 돌려서
		LOOP:
		while(true) {
			//20초 동안 반복(한 단어 나오는데 약 1초가 걸려서)
			for(int i=0; i< 20; i++) {
				//만약 동작을 멈추라고 명령이 나오면 모든 반복문 탈출, thread 종료
				if(stop) break LOOP;
				//단어 출력은 랜덤으로 하기위해 index값을 랜덤으로 얻는다
				//index값은 공유 공간에 공유한다.
				sharedbox.index = (int)(Math.random()*(sharedbox.words.length));
				//그리고 단어 출력을 랜덤으로 한다
				System.out.println(sharedbox.words[sharedbox.index]);
				//1초를 기다린다(단어 나오는데 1초가 걸리는 이유)
				try {
					sleep(1000);
				}
				//thread method를 위한 예외처리
				catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
			//for 구문이 무사히 마쳤다는 것은 20초가 지났다는 것이므로 timeout이라 실패
			System.out.println("실패!");
			//그리고 프로그램 종료
			break;
		}
	}
	
	//thread를 중지시킬 method
	public void setStop(boolean stop) {
		//stop값을 변화시킨다
		this.stop = stop;
	}
}


public class week14_2_김서영 {
	public static void main(String[] args) {
		//공유공간 참조변수 및 객체
		SharedBox sb = new SharedBox();
		//Count thread 참조변수 및 객체
		CountThread ct = new CountThread();
		//count thread와 main은 같은 공유공간을 쓴다
		ct.sharedbox = sb;
		//count thread 시작
		ct.start();
		
		//반복문 반복하여
		while(true) {
			//JOptionPane으로 사용자에게 문자열을 입력 받는다
			String st = JOptionPane.showInputDialog("문자열 입력");
			//사용자가 입력한 문자열 알려주기
			System.out.println("<"+st+">을 입력하셨습니다.");
			//만약 사용자가 입력한 문자열이 방금 나왔던 단어와 같으면
			if(sb.words[sb.index].equals(st)) {
				//성공
				System.out.println("성공!");
				System.out.println("Timer is stopped.");
				//thread를 멈추고
				ct.setStop(true);
				//이 반복문도 탈출하며 프로그램 종료
				break;
			}
		}
	}

}
