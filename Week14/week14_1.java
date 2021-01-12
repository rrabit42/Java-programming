package week14;

import java.util.*;

//thread���� �����ϴ� ����
class SharedArea{
	//�ո��� ���� ����
	double ratio;
	//�غ� �ƴ���
	boolean isReady;
}

//main method�� �ִ� class
public class week14_1_�輭�� {
	public static void main(String[] args) {
		//Ű���� �Է��� ���� �������� �� ��ü
		Scanner kbd = new Scanner(System.in);
		//shared area ��������
		SharedArea sa = new SharedArea();
		//thread�� ��������
		SimulThread st = new SimulThread();
		PrintThread pt = new PrintThread();
		
		//thread�� ���� �ּ��� shared area�� �����ϰ� �Ѵ�
		st.sharedArea = sa;
		pt.sharedArea = sa;
		
		//����ڿ��� ������ ��� ������ �����
		System.out.println("Input the number of coin toss:");
		st.num = kbd.nextInt(); //SimulThread�� �� �� ����
		
		//thread�� ����
		st.start();
		pt.start();
	}
}

//���� ������ Thread
class SimulThread extends Thread{
	//������ ������ Ƚ��
	int num;
	//�ո��� ���� Ƚ��
	int count=0;
	//���� ����
	SharedArea sharedArea;
	
	//run method
	public void run() {
		//������ ������
		for(int i=0; i<num; i++) {
			//����method�� �ݿø� method�� 1�� ������
			if(Math.round(Math.random())==1) {
				//�ո��� ���� Ƚ�� +1
				count += 1;
			}
		}
		//�ո��� ���� Ƚ�� ���� ���ؼ� ���������� ����ֱ�
		sharedArea.ratio = ((double)count / num)*100;
		//���������� �غ� ���� �� �غ� ������ �˸�
		sharedArea.isReady = true;
		//sharedarea�� ������ thread���� �˷��ش�.
		synchronized(sharedArea) {
			sharedArea.notify();
		}
	}
}

//�ùķ��̼� ��� ��� thread
class PrintThread extends Thread{
	//��������
	SharedArea sharedArea;
	
	//run method
	public void run() {
		//������������ ������ �غ� true�� �ƴϸ�
		if(sharedArea.isReady != true) {
			try {
				//sharedarea�۾� �Ϸ����� ��ٸ���
				synchronized(sharedArea) {
					sharedArea.wait();
				}
			}
			//Ȥ�ó� synchronized���� interraupted ���ܰ� �߻��ϸ�
			catch(InterruptedException e) {
				//���� �޼��� ���
				System.out.println(e.getMessage());
			}
		}
		//notify�˸��� ������ �ո��� ���� ���� ���
		System.out.printf("Front Ratio: %.2f%%", sharedArea.ratio);
	}
}
