package week;

public class week5_3_김서영 {

	public static void main(String[] args) {
		//계산에 필요한 변수들
		int a = 5, b = 10;                        //정수
		double da = 3.4, db= 5.2;                 //실수
		char ca= 'a', cb = 'b';                   //문자
		int iarr[] = {1,2,3};                     //정수열
		double darr[] = {1.1, 2.2, 3.3};          //실수열
		char carr[] = {'a', 'p', 'p', 'l', 'e'};  //문자열
		
		//+연산결과 출력
		System.out.println("a+b = " +sum(a,b));
		System.out.println("da+b = "+sum(da,b));
		System.out.println("a+db = "+sum(a,db));
		System.out.println("da+db ="+sum(da,db));
		System.out.println("ca+cb = "+sum(ca,cb));           //String "ab" 반환하도록
		System.out.println("sum of Int_Arr = "+sum(iarr));   //모든 원소의 합 반환
		System.out.println("sum of Double Arr = "+sum(darr));//모든 원소의 합 반환
		System.out.println("sum of Char_Arr = "+sum(carr));  //모든 문자 연결
	}
	
	//sum 메소드 정의, 그냥 그대로 sum 쓸 수 있도록 static 메서드로 정의
	
	//int 합 계산 메소드
	static int sum(int a, int b) {
		return a+b;
	}
	
	//double과 int 합 계산 메소드
	static double sum(double da, int b) {
		return da+b;
	}

	//int와 double 합 계산 메소드
	static double sum(int a, double db) {
		return a+db;
	}
	
	//double 합 계산 메소드
	static double sum(double da, double db) {
		return da+db;
	} 
	
	//char 연결시켜주는 메소드
	static String sum(char ca, char cb) {
		//char를 string으로 바꿔서 연결 시키기, ""+ca+cb해도 됨!
		String result = Character.toString(ca) + Character.toString(cb);
		return result;
	}
	
	//int배열 원소들 합 계산 메소드
	static int sum(int[] iarr) {
		int result = 0;
		for(int i=0; i<iarr.length; i++) {
			result += iarr[i];
		}
		return result;
	}
	
	//double 배열 원소들 합 계산 메소드
	static double sum(double[] darr) {
		double result = 0d;
		for(int i=0; i<darr.length; i++) {
			result+= darr[i];
		}
		return result;
	}
	
	//char 배열 원소들 연결 메소드
	static String sum(char[] carr) {
		String result = "";
		for(int i=0; i<carr.length; i++) {
			result += carr[i];
		}
		return result;
	}
}
