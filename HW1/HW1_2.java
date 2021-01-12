import java.util.Scanner;

public class HW1_2_�輭�� {
	public static void main(String[] args) {
		//Scanner �������� �� ��ü ����
		Scanner kbd = new Scanner(System.in);
		
		//DiceGame �������� �� ��ü ����
		DiceGame game = new DiceGame(1);
		
		//�ݺ��� ���� ���� ���� �� �ʱ�ȭ
		String repeat = "y";
		
		//y�� Y�϶��� ���� �ݺ�
		do {
			//game��ü�� �ֻ��� ���� ����
			game.startPlaying();
			//���� ������ ���� �ݺ� ���� ����
			System.out.println("Try again?(y/n)");
			repeat = kbd.nextLine();
		} while(repeat.equalsIgnoreCase("y")); //����ڰ� �ݺ����ο� y��� ���ϴ� ��, �ݺ��� �ݺ��Ͽ� ���� �ݺ� ����
		
		//n�̳� N�Է� �� ���� ����
		System.out.println("Game finished.");
	}
}


//DiceGame class
class DiceGame {
	//�ν��Ͻ� ����
	private int diceFace;  //���� �ֻ����� ��
	private int userGuess; //����ڰ� ������ �ֻ����� ��
	
	//������
	DiceGame(int diceFace){
		this.diceFace = diceFace; //��ó�� ����������, �������� int���� ������� �ϼ����� �ƹ����� �־��ش�
	}
	
	//�ֻ����� ���� �ֻ����� �� ���ؼ� �������ִ� method
	private int rollDice() {
		//�ֻ������� random()�̿��ؼ� 1~6 ���� �������� �ޱ�
		diceFace = (int)(Math.random()*6)+1;
		//diceFace�� ����
		return diceFace;
	}
	
	//����ڷκ��� �ֻ����� ������ �޴� method
	private int getUserInput() {
		//Ű���� �Է� �ް� Scanner �������� �� ��ü ����
		Scanner kbd = new Scanner(System.in);
		//������� ������ �Է� �ޱ�
		userGuess = kbd.nextInt();
		
		//���� �Է°��� �������� ����� ��Ȯ�� �� �Է��� �� ���� �ݺ� �Է¹ޱ�
		while(userGuess < 1 || userGuess > 6) {
			//�Է��� �� �ִ� ���� �˷��ְ�
			System.out.println("Input number between 1~6");
			//�ٽ� �Է¹ޱ�
			userGuess = kbd.nextInt();
		}
		
		//������ ����
		return userGuess;
	}
	
	//����ڰ� �����Ѱ��� ���� �ֻ��������� ��ġ�ϴ��� Ȯ��
	private void checkUserGuess(int diceFace) {
		//getUserInput�޼ҵ�� user�� ������ ��������
		int user = getUserInput();
		
		//���ڷ� �Է¹��� ���� �ֻ��� ���� user ������ ��
		if(user == diceFace) {
			//������ bingo ���
			System.out.println("Bingo!");
		}
		//Ʋ���� wrong ���
		else System.out.println("Wrong!\nThe face was "+diceFace);
	}
	
	//�����ϴ� method
	public void startPlaying() {
		//���ӽ��� �˷��ֱ�
		System.out.println("\n<< GAME START >>");
		
		//�ֻ��� ������
		System.out.println("Dice is rolled!!!");
		int dice = rollDice(); //�޼ҵ� �̿��ؼ� ���� �ֻ����� ���ؼ� dice������ ����
		
		//����ڿ��� ������ �Է¹ޱ�
		System.out.println("Guess the number! WHat do you think?");
		checkUserGuess(dice); //�ֻ����� ���ڷ� �Ѱ��༭ checkUserGuess �޼ҵ忡��
		                      //����� ������ �Է¹ް� �񱳱��� ��
	}
}