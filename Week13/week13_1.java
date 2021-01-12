package week13;

//�ʿ��� ��Ű�� import
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//������
class myFrame extends JFrame{
	//������Ʈ�� ��������
	JButton button; //��ư
	JPanel panel;   //��ư ���� �г�
	
	//������
	public myFrame() {
		//����
		setTitle("�� ��ƺ�~��!-�輭��");
		//������
		setSize(300,300);
		//������ ����
		setResizable(false);
		
		//��ü ����
		panel = new JPanel();           //�г�
		button = new JButton("Click!"); //��ư
		
		//��ư ��ġ ���ϱ�
		button.setLocation(0,0);
		//��ư �̺�Ʈ �ٿ��ֱ�
		button.addMouseListener(new MyListener());
		
		//��ư �гο� �ٿ��ֱ�
		panel.add(button);
		
		//�����ӿ� �г� �ٿ��ֱ�
		add(panel);
		
		//â ������ ����ǰ�
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�����ֱ�
		setVisible(true);
	}
	
	//���콺 �̺�Ʈ �ڵ鸵 class
	private class MyListener extends MouseAdapter{
		//���콺�� ��ó�� ����������
		public void mouseEntered(MouseEvent e) {
			//��ġ �������� ����
			int x = (int)(Math.random()*200);
			int y = (int)(Math.random()*200);
			//��ư ��ġ ����
			button.setLocation(x, y);
			//�ֿܼ� ���
			System.out.println("x="+x+"\ty="+y);
		}
		//���콺�� Ŭ�� �Ǿ��� ��
		public void mouseClicked(MouseEvent e) {
			System.out.println("��,,,�����٤Ф�");
		}
	} 
}


public class week13_1_�輭�� {

	public static void main(String[] args) {
		//class ȣ��
		new myFrame();		
	}

}
