package week4;
public class MyFile {
//	System.out.println("===================");
//	System.out.println("전공:사이버보안");
//	System.out.println("학번:1871063");
//	System.out.println("이름:김서영");
//	System.out.println("===================");
	
	//인스턴스 변수 생성
	private String title; //제목
	private int page;    //페이지수
	
	//인스턴스의 제목을 설정하는 메소드
	public void setTitle(String title) {
		this.title= title;
	}
	
	//인스턴스의 제목명 리턴하는 메소드
	public String getTitle() {
		return title;
	}
	
	//인스턴스의 페이지수를 설정하는 메소드
	public void setPage(int page) {
		this.page = page;
	}
	
	//인스턴스의 페이지수 리턴하는 메소드
	public int getPage() {
		return page;
	}
	
	//파일 정보 출력하는 메소드
	public void fileInfo() {
		System.out.println("파일제목:"+this.title); //파일 제목 출력
		System.out.println("페이지:"+this.page);  //페이지수 출력
	}
	
	//파일 복사하는 메소드
	public void fileCopy(MyFile newfile) {
		newfile.title = this.title;    //인자로 받은 객체에 이 인스턴스의 제목과
		newfile.page = this.page; //페이지수를 덮어씌운다(복사한다)
	}
}
