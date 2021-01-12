package week14;

import javax.swing.JOptionPane;

//���� ����
class SharedBox{
	//���ڿ� �迭
	String[] words = {"love", "happy", "cake", "dog", "cat", "mine", "java", "python", "car", "apple", "video", "snap", "water", "trello", "git"};
	//���ڿ��� �ε���
	int index;
}

//���ڿ��� �ܾ �������� ������ָ鼭 �ʸ� ���� thread
class CountThread extends Thread{
	//thread ���� ���� ���� ����(true�� thread ����)
	private boolean stop=false;
	//���� ����
	SharedBox sharedbox;
	
	//run method
	public void run() {
		//�ݺ����� ������
		LOOP:
		while(true) {
			//20�� ���� �ݺ�(�� �ܾ� �����µ� �� 1�ʰ� �ɷ���)
			for(int i=0; i< 20; i++) {
				//���� ������ ���߶�� ����� ������ ��� �ݺ��� Ż��, thread ����
				if(stop) break LOOP;
				//�ܾ� ����� �������� �ϱ����� index���� �������� ��´�
				//index���� ���� ������ �����Ѵ�.
				sharedbox.index = (int)(Math.random()*(sharedbox.words.length));
				//�׸��� �ܾ� ����� �������� �Ѵ�
				System.out.println(sharedbox.words[sharedbox.index]);
				//1�ʸ� ��ٸ���(�ܾ� �����µ� 1�ʰ� �ɸ��� ����)
				try {
					sleep(1000);
				}
				//thread method�� ���� ����ó��
				catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
			//for ������ ������ ���ƴٴ� ���� 20�ʰ� �����ٴ� ���̹Ƿ� timeout�̶� ����
			System.out.println("����!");
			//�׸��� ���α׷� ����
			break;
		}
	}
	
	//thread�� ������ų method
	public void setStop(boolean stop) {
		//stop���� ��ȭ��Ų��
		this.stop = stop;
	}
}


public class week14_2_�輭�� {
	public static void main(String[] args) {
		//�������� �������� �� ��ü
		SharedBox sb = new SharedBox();
		//Count thread �������� �� ��ü
		CountThread ct = new CountThread();
		//count thread�� main�� ���� ���������� ����
		ct.sharedbox = sb;
		//count thread ����
		ct.start();
		
		//�ݺ��� �ݺ��Ͽ�
		while(true) {
			//JOptionPane���� ����ڿ��� ���ڿ��� �Է� �޴´�
			String st = JOptionPane.showInputDialog("���ڿ� �Է�");
			//����ڰ� �Է��� ���ڿ� �˷��ֱ�
			System.out.println("<"+st+">�� �Է��ϼ̽��ϴ�.");
			//���� ����ڰ� �Է��� ���ڿ��� ��� ���Դ� �ܾ�� ������
			if(sb.words[sb.index].equals(st)) {
				//����
				System.out.println("����!");
				System.out.println("Timer is stopped.");
				//thread�� ���߰�
				ct.setStop(true);
				//�� �ݺ����� Ż���ϸ� ���α׷� ����
				break;
			}
		}
	}

}
