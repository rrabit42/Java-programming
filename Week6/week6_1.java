import java.util.Scanner;

public class week6_1_김서영 {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Play play = new Play(); //극 객체
		Film film = new Film(); //영화 객체
		
		//사용자로부터 키보드 입력을 받기 위한 참조변수 선언 및 객체 생성
		Scanner kbd = new Scanner(System.in);
		
		//극 정보 입력받아서 play객체의 인스턴스 변수들에 setter를 통해 대입하기
		 //극 제목
		System.out.println("Input Title for Play");
		play.setTitle(kbd.nextLine());
		
		 //극 감독
		System.out.println("Input Director for Play");
		play.setDirector(kbd.nextLine());
		
		 //극 작가
		System.out.println("Input Writer for play");
		play.setWriter(kbd.nextLine());
		
		
		//영화 정보 입력받아서 film객체의 인스턴스 변수들에 setter를 통해 대입하기
		 //영화 제목
		System.out.println("Input Title for Film");
		film.setTitle(kbd.nextLine());
		
		 //영화 감독
		System.out.println("Input Director for Film");
		film.setDirector(kbd.nextLine());
		
		 //영화 작가
		System.out.println("Input Writer for Film");
		film.setWriter(kbd.nextLine());
		
		//연극 하는데 드는 비용 입력받아서 play의 변수에 setter 통해 대입
		System.out.println("Input Performance Cost for Play");
		play.setPerformanceCost(kbd.nextInt());
		
		//영화의 box office gross 입력받아서 film의 변수에 setter 통해 대입
		System.out.println("Input boxOfficeGross for Film");
		film.setBoxOfficeGross(kbd.nextInt());
		
		//연극 정보 출력 메서드 호출
		play.display();
		
		System.out.print("\n");
		
		//영화 정보 출력 메서드 호출
		film.display();
		
	}
}


//production class 선언
class Production{
	//인스턴스 변수들(private)
	private String title;    //제목
	private String director; //감독
	private String writer;   //작가
	
	//getter method
	 //제목 값 돌려주기
	public String getTitle() {
		return title;
	}
	 //감독 값 돌려주기
	public String getDirector() {
		return director;
	}
	 //작가 값 돌려주기
	public String getWriter() {
		return writer;
	}
	
	
	//setter method
	 //제목 값 입력받기
	public void setTitle (String title) {
		this.title = title;
	}
	
	 //감독 값 입력받기
	public void setDirector(String director) {
		this.director = director;
	}
	
	 //작가 값 입력받기
	public void setWriter (String writer) {
		this.writer = writer;
	}
	
	//정보 출력 메서드
	public void display() {
		System.out.println("Title:"+title);        //제목 출력
		System.out.println("Director:"+director);  //감독 출력
		System.out.println("Writer:"+writer);      //작가 출력
	}
}


//Production 상속받은 Play class 선언
class Play extends Production{
	//인스턴스 변수
	private int performanceCost;   //연극 비용
	
	//연극 비용 값 돌려주는 getter method
	public int getPerformanceCost() {
		return performanceCost;
	}
	
	//연극 비용 값 대입해주는 setter method
	public void setPerformanceCost(int cost) {
		performanceCost = cost;
	}
	
	//연극 정보 출력
	public void display() {
		super.display();   //조상의 method에
		                   //연극 비용 값 정보만 추가로 출력(오버라이딩)
		System.out.println("performance cost:"+performanceCost);
	}
}


//Production 상속받은 Film class 선언
class Film extends Production{
	//인스턴스 변수
	private int boxOfficeGross; //box office gross
	
	//흥행비용(?) 값 돌려주는 getter method
	public int getBoxOfficeGross() {
		return boxOfficeGross;
	}
	
	//흥행비용 값 대입해주는 setter method
	public void setBoxOfficeGross(int gross) {
		boxOfficeGross = gross;
	}
	
	//영화 정보 출력해주는 method
	public void display() {
		super.display();  //조상의 method에
		                  //흥행비용 값 정보만 추가로 출력(오버라이딩)
		System.out.println("boxOfficeGross:"+boxOfficeGross);
	}
}