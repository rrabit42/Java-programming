import java.util.Scanner;

public class week3_4_김서영 {

	public static void main(String[] args) {
		//키보드 입력을 위한 객체 생성
		Scanner keyboard = new Scanner(System.in);
		
		//사용자에게 나무의 높이 입력 받기
		System.out.print("Enter the height of the triangle : ");
		int num = keyboard.nextInt();
		
		//나무 출력
		for(int i=1; i<=num ; i++) {      //출력할 나무의 높이만큼 반복
			
			for(int j=1; j<=num-i; j++) { //각 줄에서 출력할 공백
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++) { //각 줄에서 출력할 *
				System.out.print("*");
			}
			
			System.out.print("\n");       //한 줄이 끝나면 줄을 바꾼다
			
		}

	}

}
