import java.util.Scanner;

public class week1_3_김서영 {

	public static void main(String[] args) {
		//입력 가능하게 하는 객체 생성
		Scanner keyboard = new Scanner(System.in);
		
		//각각 화씨, 섭씨 변수
		int hwa;  //화씨
		float sup;//섭씨
		
		//화씨온도를 입력받는다
		System.out.print("화씨온도 입력:");
		hwa = keyboard.nextInt();
		
		//입력받은 화씨온도를 이용해 섭씨온도를 계산한다
		sup = (float)5/9*(hwa-32);
		
		//화씨온도와 섭씨 온도를 출력한다
		System.out.printf("\n화씨온도:%d\n", hwa);
		System.out.printf("섭씨온도:%.1f\n", sup); //소수점 이하 1자리로 출력
		
	
		

	}

}
