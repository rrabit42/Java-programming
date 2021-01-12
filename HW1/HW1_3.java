import java.util.Scanner;

public class HW1_3_�輭�� {

	public static void main(String[] args) {
		//Ű���� �Է¹��� Scanner �������� �� ��ü
		Scanner kbd = new Scanner(System.in);
		//�ʿ��� ������
		char Arr[] = new char[100]; //String�� ���ڹ迭�� �ٲ� �� �ʿ��� ���ڹ迭 �������� �� ��ü
		boolean result;             //��Ī ���� �� ���� ����
		String rep;                 //����ڷκ��� String �Է� ���� ����
		
		//�ݺ���
		do {
			
		//����ڷκ��� �ܾ� �Է¹ޱ�
		System.out.println("Input a word");
		String str = kbd.nextLine();
		 //String���� �Է¹��� �ܾ char �迭�� �ٲ㼭 �����Ѵ�
		Arr = str.toCharArray();
		
		//check method�� ��Ī���� �Ǵ�
		result = check(Arr);
		
		//���� true�� ���ϵǸ�
		if (result) {
			//�� �ܾ�� ��Ī
			System.out.println("symmetry");
		}
		//false ���ϵǸ�
		else {
			//���Ī
			System.out.println("Asymmetry");
		}
		
		//����ڿ��� �ݺ����� ����
		System.out.print("\nTry again?(y/n) ");
		rep = kbd.nextLine();
		
		System.out.println(""); //�ٶ��
		
		}while(rep.equalsIgnoreCase("y")); //y�� Y�Է��ϸ� ��� �ݺ�
	}
	
	
	//�Էµ� �ܾ ��Ī�̸� true, �ƴϸ� false�� ��ȯ�ϴ� public static method
	public static boolean check(char[] Arr) {
		//�ʿ��� ������
		int len = Arr.length;  //�迭�� ����
		boolean result = true; //��Ī ���θ� �Ǵ����� boolean, default���� true
		
		//char �迭�� ��Ī�� Ȯ���Ѵ�
		for(int i=0; i< len; i++) {
			if(Arr[i] != Arr[(len-1)-i]) { //char ���� �ϳ��� ��Ī���� �Ǵ��ؼ� Ʋ����
				result = false;            //result�� false ����
			}
		}
		
		//result���� ��ȯ�Ѵ�
		return result;
	}

}