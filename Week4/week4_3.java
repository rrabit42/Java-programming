package week4;

import java.util.Scanner;

public class week4_3_김서영 {
	public static void main(String[] args) {
		//키보드 입력받을 참조 변수
		Scanner kbd = new Scanner(System.in);
		
		//필요한 변수들
		String title; //파일 제목
		int page;     //페이지 수
		MyFile fOld = new MyFile(); //원래 있던 파일 객체 생성
		MyFile fNew = new MyFile(); //fOld를 복사할 파일 객체
		System.out.println("--File정보입력(제목,페이지수)--");
		//파일 정보를 입력 받는다
		fOld.setTitle(kbd.nextLine());
		fOld.setPage(kbd.nextInt());
		//fNew에 fOld정보를 복사한다
		fOld.fileCopy(fNew);
		
		//결과를 출력한다
		System.out.println("<원래File>");
		fOld.fileInfo();
		System.out.println("<복사된File>");
		fNew.fileInfo();
	}
}
