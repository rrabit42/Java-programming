package week;

public class week5_3_�輭�� {

	public static void main(String[] args) {
		//��꿡 �ʿ��� ������
		int a = 5, b = 10;                        //����
		double da = 3.4, db= 5.2;                 //�Ǽ�
		char ca= 'a', cb = 'b';                   //����
		int iarr[] = {1,2,3};                     //������
		double darr[] = {1.1, 2.2, 3.3};          //�Ǽ���
		char carr[] = {'a', 'p', 'p', 'l', 'e'};  //���ڿ�
		
		//+������ ���
		System.out.println("a+b = " +sum(a,b));
		System.out.println("da+b = "+sum(da,b));
		System.out.println("a+db = "+sum(a,db));
		System.out.println("da+db ="+sum(da,db));
		System.out.println("ca+cb = "+sum(ca,cb));           //String "ab" ��ȯ�ϵ���
		System.out.println("sum of Int_Arr = "+sum(iarr));   //��� ������ �� ��ȯ
		System.out.println("sum of Double Arr = "+sum(darr));//��� ������ �� ��ȯ
		System.out.println("sum of Char_Arr = "+sum(carr));  //��� ���� ����
	}
	
	//sum �޼ҵ� ����, �׳� �״�� sum �� �� �ֵ��� static �޼���� ����
	
	//int �� ��� �޼ҵ�
	static int sum(int a, int b) {
		return a+b;
	}
	
	//double�� int �� ��� �޼ҵ�
	static double sum(double da, int b) {
		return da+b;
	}

	//int�� double �� ��� �޼ҵ�
	static double sum(int a, double db) {
		return a+db;
	}
	
	//double �� ��� �޼ҵ�
	static double sum(double da, double db) {
		return da+db;
	} 
	
	//char ��������ִ� �޼ҵ�
	static String sum(char ca, char cb) {
		//char�� string���� �ٲ㼭 ���� ��Ű��, ""+ca+cb�ص� ��!
		String result = Character.toString(ca) + Character.toString(cb);
		return result;
	}
	
	//int�迭 ���ҵ� �� ��� �޼ҵ�
	static int sum(int[] iarr) {
		int result = 0;
		for(int i=0; i<iarr.length; i++) {
			result += iarr[i];
		}
		return result;
	}
	
	//double �迭 ���ҵ� �� ��� �޼ҵ�
	static double sum(double[] darr) {
		double result = 0d;
		for(int i=0; i<darr.length; i++) {
			result+= darr[i];
		}
		return result;
	}
	
	//char �迭 ���ҵ� ���� �޼ҵ�
	static String sum(char[] carr) {
		String result = "";
		for(int i=0; i<carr.length; i++) {
			result += carr[i];
		}
		return result;
	}
}
