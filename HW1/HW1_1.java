import java.util.Scanner;

public class HW1_1_�輭�� {

	public static void main(String[] args) {
		//����ڿ��� ���� �Է¹��� ������
		int hour;    //��
		int minute;  //��
		
		//Time �������� �� ��ü ����
		Time time = new Time();
		//Scanner �������� �� ��ü ����
		Scanner kbd = new Scanner(System.in);
		
		//����ڿ��� �� �Է¹ޱ�
		System.out.println("Hour:");
		hour = kbd.nextInt();
		
		//����ڿ��� �� �Է¹ޱ�
		System.out.println("Minute:");
		minute = kbd.nextInt();
		
		//����ڰԿ� �Է¹��� �ÿ� ���� ��ü ������ set�ϱ�
		time.setTime(hour,minute);
		
		//����ڰ� �Է��� �ð� ���
		System.out.println(time.getTime('h')+":"+time.getTime('m'));
	}
}

//Time class
class Time{
	private int hour;   //�� ����
	private int minute; //�� ����
	
	//�Է¹��� ��, ���� ���� �� ������ Ȯ���ϴ� method
	private boolean isValid(int hour, int minute) {
		//�ÿ� ���� ���� �ùٸ� ���� ���� ���̸� true return
		if ((hour>=0 && hour<=23) && (minute >=0 && minute <=59)) {
			return true;
		}
		//������ ���� ������ false return
		else return false;
	}
	
	//��ü�� �ν��Ͻ� �����鿡 �ÿ� �� �� set ���ִ� method
	public void setTime(int hour, int minute) {
		if(isValid(hour, minute)) { //isValid method�� �ÿ� �� ������ �´��� Ȯ��
			//������ �ν��Ͻ� �����鿡 �� ����
			this.hour = hour;      //��
			this.minute = minute;  //��
		}
		else {
			//���� ����ڰ� �Է��� �ÿ� ���� �������� ����� �߸��� �Է��̶�� ���
			System.out.println("Wrong Input");
		}
	}
	
	//�ν��Ͻ� ���� �����ִ� method
	public int getTime(char ch) {
		if(ch == 'H' || ch == 'h') {     //H�� h������
			return hour;          //�� �� ����
		}
		else if (ch == 'M' || ch=='m') { //M�� m������
			return minute;        //�� �� ����
		}
		else //�׿� �Է½� 0 ����
			return 0;
	}
}
	