package exception;

//�˰��� �ʿ��� Ŭ���� import
import java.util.InputMismatchException;
import java.util.Scanner;


//Test class
public class week9_�輭�� {

	public static void main(String[] args) {
		//���� ��ü �� �������� ����
		Game game = new Game();
		
		//���� ����
		game.start();
		
		//���� �̱� ������ ���� �ݺ�
		while(true) {
			
			//setValue method�� �� ����
			game.setValue();
			//���� ��� ���
			game.writeOutput();

			//������ 3�� �̱�� ���� ����
			if(game.userwin == 3) {
				//����ڰ� �̰��� ��, ���� ����ϰ� ���� Ż��
				System.out.println("\n����� �̰���ϴ�.");
				break;
			}
			else if (game.comwin == 3) {
				//��?�� �̰��� ��, ���� ����ϰ� ���� Ż��
				System.out.println("\n��ǻ�Ͱ� �̰���ϴ�.");
				break;
			}
		}
		//���� ���Ṯ
		System.out.println("������ �����մϴ�.");
	}
}


//���������� ���� ����� ���� ����
class WrongRangeException extends Exception{ //Exception ���
	//������ ����
	WrongRangeException(){};
	WrongRangeException(String str){
		super(str);
	}
}


//���� class
class Game{
	//�ν��Ͻ� ������
	int userwin, comwin; //����ڰ� �̱�Ƚ��, ��ǻ�Ͱ� �̱� Ƚ��
	int user, com;       //������� ����, ��ǻ���� ����
	
	//Ű���� �Է��� ���� �������� �� ���� ����
	Scanner kbd = new Scanner(System.in);
	
	//���� class ������
	Game(){};
	
	
	//METHOD
	
	 //���ӽ��� �޼ҵ�
	void start () {
		//������ �˸���
		System.out.println("���������� ������ �����մϴ�.");
	}
	
	 //����ڿ� ��ǻ���� ���� set���ִ� method
	void setValue(){
		//��ǻ���� ���ð��� 1,2,3�߿��� �������� ����
		com = (int)(Math.random()*3)+1;
		
		//�������� ���� �Է��� �� ���� ����ڷκ��� ���� �Է¹ޱ�
		while(true) {
			//������ �˷��ֱ�
			System.out.println("\n����� ������?");
			System.out.println("����(1) ����(2) ��(3)");
		
			try {
				//����ڷκ��� �� �Է¹ޱ�
				user = kbd.nextInt();
				//���� �Է°��� ������ �����
				if(user<1 || user>3) {
					//���� ����ٴ� ���� �߻���Ű��
					throw new WrongRangeException();
				}
				
				//���� �ùٸ� ���̶�� while�� Ż��
				if(user>=1 && user<=3) {
					break;
				}
			}
			//���� ������ ��� ������ ����
			catch(WrongRangeException we) {
				//���� �߸��Ǿ��ٰ� �˷��ְ�
				System.out.println("������ �߸��Ǿ����ϴ�.");
				//�ݺ��� continue, �ٽ� �Է°� �����
				continue;
			}
			//Int���� �ƴ� �ٸ� ���� �Է� �޾��� ����
			catch(InputMismatchException ie) {
				//������ �Է��ش޶� ��û�ϰ�
				System.out.println("������ �Է����ּ���.");
				//���۸� ����
				kbd.nextLine();
				//�ݺ��� continue, �ٽ� �Է°� �����
				continue;
			}
		}
	}
	
	 //����ڿ� ��ǻ���� ���� �����ִ� method
	String compare() {
		//����<����<�� �� ���ʴ�� 1,2,3�̹Ƿ� �� ����, ��<������ ��� �� ���� ª�� ������ ��
		//����ڰ� �̱��
		if (user == (com+1) || (user+2) == com ) {
			userwin++;   //����ڰ� �̱�Ƚ�� +1
			return "u";  //u��� String return
		}
		//���� ���� ������ ��� ���̹Ƿ�
		else if (user == com) {
			return "s";  //same�̶�� ���� String return
		}
		//�� �ܴ� ��ǻ�Ͱ� �̱� ���̹Ƿ�
		else {
			comwin++;    //��ǻ�Ͱ� �̱�Ƚ�� +1
			return "c";  //c String return
		}
	}
	
	 //�Ź� ���� �̰���� ��� ������ִ� method
	void writeOutput() {
		//compare method�� �ҷ��ͼ� ��� String �ޱ�
		String res = compare();
		//��� String�� ���� ��°� �޶���
		switch(res) {
		case "u": System.out.println("��� ��"); break;  //u�� ����� �¸�
		case "s": System.out.println("���"); break;    //s�� ���
		case "c": System.out.println("��ǻ�� ��"); break; //c�̸� ��ǻ�� �¸�
		}
	}
}