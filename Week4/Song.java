package week4;

public class Song {
	//인스턴스 변수 생성
	public String title;    //노래 제목
	public String singer; //가수
	public int price;       //가격
	
	//무슨 노래 듣는지 알려주는 메소드
	public void play() {
		System.out.printf("노래들어요: \"%s\" by %s\n", title, singer); //노래 제목, 가수명 출력
	}
	//노래 가격 알려주는 메소드
	public void price() {
		System.out.println(price+"원입니다.");
	}
}
