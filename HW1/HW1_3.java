import java.util.Scanner;

public class HW1_3_김서영 {

	public static void main(String[] args) {
		//키보드 입력받을 Scanner 참조변수 및 객체
		Scanner kbd = new Scanner(System.in);
		//필요한 변수들
		char Arr[] = new char[100]; //String을 문자배열로 바꿀 때 필요한 문자배열 참조변수 및 객체
		boolean result;             //대칭 여부 값 받을 변수
		String rep;                 //사용자로부터 String 입력 받을 변수
		
		//반복문
		do {
			
		//사용자로부터 단어 입력받기
		System.out.println("Input a word");
		String str = kbd.nextLine();
		 //String으로 입력받은 단어를 char 배열로 바꿔서 대입한다
		Arr = str.toCharArray();
		
		//check method로 대칭여부 판단
		result = check(Arr);
		
		//만약 true가 리턴되면
		if (result) {
			//그 단어는 대칭
			System.out.println("symmetry");
		}
		//false 리턴되면
		else {
			//비대칭
			System.out.println("Asymmetry");
		}
		
		//사용자에게 반복여부 묻기
		System.out.print("\nTry again?(y/n) ");
		rep = kbd.nextLine();
		
		System.out.println(""); //줄띄기
		
		}while(rep.equalsIgnoreCase("y")); //y나 Y입력하면 계속 반복
	}
	
	
	//입력된 단어가 대칭이면 true, 아니면 false를 반환하는 public static method
	public static boolean check(char[] Arr) {
		//필요한 변수들
		int len = Arr.length;  //배열의 길이
		boolean result = true; //대칭 여부를 판단해줄 boolean, default값은 true
		
		//char 배열의 대칭을 확인한다
		for(int i=0; i< len; i++) {
			if(Arr[i] != Arr[(len-1)-i]) { //char 원소 하나씩 대칭여부 판단해서 틀리면
				result = false;            //result에 false 대입
			}
		}
		
		//result값을 반환한다
		return result;
	}

}