import java.util.Scanner;

public class HW1_1_김서영 {

	public static void main(String[] args) {
		//사용자에게 값을 입력받을 변수들
		int hour;    //시
		int minute;  //분
		
		//Time 참조변수 및 객체 생성
		Time time = new Time();
		//Scanner 참조변수 및 객체 생성
		Scanner kbd = new Scanner(System.in);
		
		//사용자에게 시 입력받기
		System.out.println("Hour:");
		hour = kbd.nextInt();
		
		//사용자에게 분 입력받기
		System.out.println("Minute:");
		minute = kbd.nextInt();
		
		//사용자게에 입력받은 시와 분을 객체 변수에 set하기
		time.setTime(hour,minute);
		
		//사용자가 입력한 시간 출력
		System.out.println(time.getTime('h')+":"+time.getTime('m'));
	}
}

//Time class
class Time{
	private int hour;   //시 변수
	private int minute; //분 변수
	
	//입력받은 시, 분이 범위 내 값인지 확인하는 method
	private boolean isValid(int hour, int minute) {
		//시와 분이 각각 올바른 범위 내의 값이면 true return
		if ((hour>=0 && hour<=23) && (minute >=0 && minute <=59)) {
			return true;
		}
		//범위에 맞지 않으면 false return
		else return false;
	}
	
	//객체의 인스턴스 변수들에 시와 분 값 set 해주는 method
	public void setTime(int hour, int minute) {
		if(isValid(hour, minute)) { //isValid method로 시와 분 범위가 맞는지 확인
			//맞으면 인스턴스 변수들에 값 대입
			this.hour = hour;      //시
			this.minute = minute;  //분
		}
		else {
			//만약 사용자가 입력한 시와 분이 범위에서 벗어나면 잘못된 입력이라고 출력
			System.out.println("Wrong Input");
		}
	}
	
	//인스턴스 변수 돌려주는 method
	public int getTime(char ch) {
		if(ch == 'H' || ch == 'h') {     //H나 h받으면
			return hour;          //시 값 리턴
		}
		else if (ch == 'M' || ch=='m') { //M나 m받으면
			return minute;        //분 값 리턴
		}
		else //그외 입력시 0 리턴
			return 0;
	}
}
	