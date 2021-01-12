import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//��Ʈ ������
class chartFrame extends JFrame implements ActionListener{
	//�ʿ��� ����������
	 //�г�
	JPanel input;
	 //�ؽ�Ʈ �ʵ�, �达, �̾�, �ھ�, �� �� �� ���� �ޱ�����
	JTextField kim, lee, park, etc;
	 //��ư
	JButton button;
	
	//������
	chartFrame(){
		//������ Ÿ��Ʋ
		setTitle("Pie Chart of Student names-�輭��");
		//������ ������
		setSize(700,500);
		
		//input�г� ����
		 //�г� ��ü
		input = new JPanel();
		 //�󺧵�
		JLabel Kim = new JLabel("Kim");
		JLabel Lee = new JLabel("Lee");
		JLabel Park = new JLabel("Park");
		JLabel Etc = new JLabel("Etc");
		 //��ư ��ü
		button = new JButton("Graph");
		 //��ư�� �׼Ǹ����� ����
		button.addActionListener(this);
		 //�ؽ�Ʈ�ʵ� ��ü
		kim = new JTextField(5);
		lee = new JTextField(5);
		park = new JTextField(5);
		etc = new JTextField(5);
		 //������� �ٿ��ֱ�
		input.add(Kim);input.add(kim);
		input.add(Lee);input.add(lee);
		input.add(Park);input.add(park);
		input.add(Etc);input.add(etc);
		input.add(button);
		
		//chart�г�
		chartPanel chart = new chartPanel();
		
		//�����ӿ� �г� �ٿ��ֱ�
		add(input, BorderLayout.SOUTH);
		add(chart, BorderLayout.CENTER);
		
		//â ���� �� ���α׷� ����ǰ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//+������ ������ �� ������
		setResizable(false);
		//ȭ�� �߾ӿ� ��ġ
		 //������ �����
		Toolkit tk = getToolkit();
		 //������ ��ũ�� ����� �����´�
		Dimension d = tk.getScreenSize();
		 //�׸��� ���̿�
		int sh = d.height;
		 //�ʺ� ���� ���ϰ�
		int sw = d.width;
		 //�߾ӿ� ��ġ�ǵ��� ������ ����
		setLocation(sw/2-this.getWidth()/2, sh/2-this.getHeight()/2);
		//ȭ�� ����
		setVisible(true);	
	}
	//�׼��̺�Ʈ handler
	public void actionPerformed(ActionEvent e) {
		//��ư ������ repaint�ϱ�
		repaint();
	}
	
	class chartPanel extends JPanel {
		public void paint(Graphics g) {
			//������ white�� ������ֱ� ����(setBackgroundColor�� �ȵż� �̷����߾��Ф�)
			g.clearRect(0, 0, 1000, 500);
			//�ؽ�Ʈ�ʵ忡�� �� �ޱ� ���� ������ �� �ʱ�ȭ
			int yellow=0, red=0, blue=0, green=0;
			//exception�� �߻��ߴ��� Ȯ���ϱ�����
			boolean excep = false;
			
			//�ؽ�Ʈ�ʵ忡 �ִ� ������ �����ͼ� int�� �ٲ㺸�µ�
			try {
				yellow = Integer.parseInt(kim.getText());
				red = Integer.parseInt(lee.getText());
				blue = Integer.parseInt(park.getText());
			}
			//format ���ܰ� �߻��ϸ�
			catch(NumberFormatException e) {
				//exception �߻��� true�� �ٲ�
				excep = true;
			}
			
			//����Ʈ �׸���
			 //1. ���ڵ��� ���� ���� ����� ��.
			if(yellow<0 || yellow>100 || red<0 || red>100 || blue<0 ||blue >100|| (yellow+red+blue)>100) {
				//������ ��� 0
				yellow = 0; red = 0; blue = 0; green = 0;
				//100�� ���� ��� ������� �˷��ֱ�
				g.drawString("Number of students is 100", 250, 370);
			}
			 //2. ���ܰ� �߻����� ��
			else if(excep){
				//���� 0
				yellow = 0; red = 0; blue = 0; green = 0;
				//���� �Է��ش޶�� ���
				g.drawString("Input numbers of student names", 250, 370);
			}
			 //3. ���� �Է��� ������ ��
			else {
				//etc�� ���
				green = 100-yellow-red-blue;
				//�ؽ�Ʈ�ʵ忡�� ������ ����� ���׷������� ���� ���� ���
				int yellows = (int)(yellow/100.0*360);
				int reds = (int)(red/100.0*360);
				int blues = (int)(blue/100.0*360);
				int greens = (int)(green/100.0*360);
				
				//���������
				g.setColor(Color.yellow);
				//������ ��Ÿ���� �ǹ� ǥ���ϰ�
				g.drawString("Yellow:KIMs", 490, 170);
				//���׷��� �׸���
				g.fillArc(200, 100, 200, 200, 0, yellows);
				
				//����������
				g.setColor(Color.red);
				//�ǹ� ǥ��
				g.drawString("Red:LEEs", 490, 190);
				//�׸���
				g.fillArc(200, 100, 200, 200, yellows, reds);
				
				//�Ķ�������
				g.setColor(Color.blue);
				//�ǹ�ǥ��
				g.drawString("BLUE:PARKs", 490, 210);
				//�׸���
				g.fillArc(200, 100, 200, 200, yellows+reds, blues);
				
				//�������
				g.setColor(Color.green);
				//�ǹ� ǥ��
				g.drawString("GREEN:Etc", 490, 230);
				//�׸���
				g.fillArc(200, 100, 200, 200, yellows+reds+blues, greens);
				}
			
				//�׸��� �ؽ�Ʈ�ʵ� ���� setting���ֱ�
				kim.setText(Integer.toString(yellow));
				lee.setText(Integer.toString(red));
				park.setText(Integer.toString(blue));
				etc.setText(Integer.toString(green));
			}
	}
}

public class HW2_5_�輭�� {

	public static void main(String[] args) {
		//��Ʈ������ ȣ��
		new chartFrame();
	}
}
