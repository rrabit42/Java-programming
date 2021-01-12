package week;
import java.util.Scanner;
class Song {
	//인스턴스 변수 선언
	public String title;  //곡명
	public String singer; //가수명
	public int price;     //가격
	
	//default 생성자 정의
	public Song() {};
	
	//title, singer,price 있는 생성자
	public Song(String initialtitle, String initialsinger, int initialprice) {
		title = initialtitle;   //인자 전달 받으면 인스턴스 변수에 대입
		singer = initialsinger; //이하 동문
		price = initialprice;   //이하 동문
	}
	
	//singer가 없는, title, price만 있는 생성자
	public Song(String initialtitle, int initialprice) {
		this(initialtitle, "모름", initialprice); //signer에 "모름"넣어서 생성자 만든다
	}
	
	//노래 재생시킨다는 출력문 나오는 메서드
	public void play() {
		System.out.println(title+" by "+ singer);
	}
}

public class week5_1_김서영 {

	public static void main(String[] args) {
		//키보드 입력 받을 참조 변수 생성
		Scanner kbd = new Scanner(System.in);
		//Song객체 참조할 변수 생성
		Song mysong;
		
		//사용자에게 입력받을 변수들
		String title;  //곡제목
		String singer; //가수
		int price;     //가격
		int count;     //얼마나 들을 건지
		
		
		System.out.println("*Song 정보*");
		//곡제목은 사용자에게 반드시 입력 받기
		do {
			System.out.print("곡명:");
			title = kbd.nextLine();
			//만약 사용자가 입력하지 않는다면 곡명 필요하다고 출력하고
			if (title.equalsIgnoreCase("")) {
				System.out.println("곡명은 반드시 필요합니다.");
			}
		}while(title.equalsIgnoreCase("")); //반복해서 계속 입력받기
		
		//가수명 입력받기
		System.out.print("가수명:");
		singer = kbd.nextLine();
		
		//가격 입력받기
		System.out.print("가격:");
		price = kbd.nextInt();
		
		//만약 사용자가 가수명을 입력하지 않았으면
		if(singer.equalsIgnoreCase("")) {
			mysong = new Song(title, price); //가수명 필요없는 생성자 정의
		}
		//가수명 입력했으면
		else {
			mysong = new Song(title, singer, price); //모든 정보 입력해서 생성자 정의
		}
		
		//몇번 들을건지 물어보고
		System.out.println("몇번 들으시겠습니까?");
		count = kbd.nextInt();
		
		//듣는 횟수만큼 play해주기
		for(int i=0; i<count; i++) {
			mysong.play();
		}
		
		//가격도 출력해주기
		System.out.println("총 "+mysong.price+"원입니다.");
	
	
	}

}
