import java.util.Scanner;
public class week1_1_김서영 {
	public static void main(String[] args) {		
		//입력가능하게 하는 객체 생성
		Scanner keyboard = new Scanner(System.in);
		//입력 받을 값들의 변수명, 각각 밑변, 높이
		int base, height;
		
		//밑변 입력 받기
		System.out.print("Input base: ");
		base = keyboard.nextInt();
		
		//높이 입력받기
		System.out.print("Input height: ");
		height = keyboard.nextInt();
		
		//삼각형의 넓이를 실수형으로 출력한다
		System.out.print("The area: ");
		System.out.print((float)base*height/2);
	
	}
}
