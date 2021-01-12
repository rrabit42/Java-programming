package week14;

import java.util.*;

//thread끼리 공유하는 공간
class SharedArea{
	//앞면이 나온 비율
	double ratio;
	//준비가 됐는지
	boolean isReady;
}

//main method가 있는 class
public class week14_1_김서영 {
	public static void main(String[] args) {
		//키보드 입력을 위한 참조변수 및 객체
		Scanner kbd = new Scanner(System.in);
		//shared area 참조변수
		SharedArea sa = new SharedArea();
		//thread들 참조변수
		SimulThread st = new SimulThread();
		PrintThread pt = new PrintThread();
		
		//thread가 같은 주소의 shared area를 공유하게 한다
		st.sharedArea = sa;
		pt.sharedArea = sa;
		
		//사용자에게 동전을 몇번 던질지 물어본다
		System.out.println("Input the number of coin toss:");
		st.num = kbd.nextInt(); //SimulThread에 그 값 전달
		
		//thread들 시작
		st.start();
		pt.start();
	}
}

//동전 던지는 Thread
class SimulThread extends Thread{
	//동전을 던지는 횟수
	int num;
	//앞면이 나온 횟수
	int count=0;
	//공유 공간
	SharedArea sharedArea;
	
	//run method
	public void run() {
		//동전을 던진다
		for(int i=0; i<num; i++) {
			//랜덤method와 반올림 method로 1이 나오면
			if(Math.round(Math.random())==1) {
				//앞면이 나온 횟수 +1
				count += 1;
			}
		}
		//앞면이 나온 횟수 비율 구해서 공유공간에 집어넣기
		sharedArea.ratio = ((double)count / num)*100;
		//공유공간에 준비가 비율 값 준비가 됐음을 알림
		sharedArea.isReady = true;
		//sharedarea에 접근한 thread에게 알려준다.
		synchronized(sharedArea) {
			sharedArea.notify();
		}
	}
}

//시뮬레이션 결과 출력 thread
class PrintThread extends Thread{
	//공유공간
	SharedArea sharedArea;
	
	//run method
	public void run() {
		//공유공간에서 비율값 준비가 true가 아니면
		if(sharedArea.isReady != true) {
			try {
				//sharedarea작업 하려던걸 기다린다
				synchronized(sharedArea) {
					sharedArea.wait();
				}
			}
			//혹시나 synchronized에서 interraupted 예외가 발생하면
			catch(InterruptedException e) {
				//오류 메세지 출력
				System.out.println(e.getMessage());
			}
		}
		//notify알림을 받으면 앞면이 나온 비율 출력
		System.out.printf("Front Ratio: %.2f%%", sharedArea.ratio);
	}
}
