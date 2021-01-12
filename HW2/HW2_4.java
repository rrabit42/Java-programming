import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//�׷��� ������
class graphFrame extends JFrame implements ActionListener{
	//�г� ��������
	JPanel input;
	//��ư ��������
	JButton button;
	//�ؽ�Ʈ�ʵ� ��������
	JTextField kor, eng, math;
	
	//������
	public graphFrame(){
		//����
		setTitle("Score Graph");
		//ũ��
		setSize(700,500);
		//input�г� ����
		 //��ü ����
		input = new JPanel();
		 //�󺧵� ����
		JLabel Kor = new JLabel("Kor");
		JLabel Eng = new JLabel("Eng");
		JLabel Math = new JLabel("Math");
		 //�ؽ�Ʈ�ʵ� ��ü ����
		kor = new JTextField(3);
		eng = new JTextField(3);
		math = new JTextField(3);
		 //��ư ��ü ����
		button = new JButton("Show Graph");
		  //��ư�� �̺�Ʈ������ �߰�
		button.addActionListener(this);
		 //input �гο� ������� ���̱�
		input.add(Kor);
		input.add(kor);
		input.add(Eng);
		input.add(eng);
		input.add(Math);
		input.add(math);
		input.add(button);
		
		//picture�г� ����
		 //picture panel ��ü �� ��������
		picture pic = new picture();
		
		//�гε� frame�� ��ġ
		 //picture�� �߾�
		add(pic, BorderLayout.CENTER);
		 //input�� ����
		add(input, BorderLayout.SOUTH);
		
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
	//��ư ������ �� �̺�Ʈ ó��
	public void actionPerformed(ActionEvent e) {
		//�׷����� �ٽ� �׷��ش�
		repaint();
	}
	
	//picture inner class
	class picture extends JPanel{
		//paint method
		public void paint(Graphics g) {
			//������ white�� ������ֱ� ����(setBackgroundColor�� �ȵż� �̷����߾��Ф�)
			g.clearRect(0, 0, 1000, 500);
			//�ؽ�Ʈ�ʵ忡�� ������ ����׷������� ���� �� �ʱ�ȭ
			int kh=0, eh=0, mh=0;
			//�ؽ�Ʈ�ʵ忡�� ������ integer�� �ٲٴµ�
			try {
				kh = Integer.parseInt(kor.getText());
				eh = Integer.parseInt(eng.getText());
				mh = Integer.parseInt(math.getText());
			}
			//���� ������ �ٲ� �� ������
			catch(NumberFormatException e){
				//wrong input ���
				g.drawString("Wrong Input", 300, 110);
			}
			
			//������ �ٲ����� �������� �����
			if(kh<0 || kh>100 || eh<0 || eh>100 || mh<0 || mh>100) {
				//wrong input ���
				g.drawString("Wrong Input", 300, 110);
			}
			else {
				//�ƴ϶�� ���������� ����׷��� �׷��ֱ�
				g.setColor(Color.red);
				g.fillRect(260, 350-kh*2, 10, kh*2);
				g.fillRect(340, 350-eh*2, 10, eh*2);
				g.fillRect(420, 350-mh*2, 10, mh*2);
			}
			
			//���������� ����׷��� �ٵ� �׷��ֱ�
			g.setColor(Color.black);
			g.drawLine(180, 150, 500, 150); //��
			g.drawString("100", 155, 155);  //���� ���� ũ��
			g.drawLine(180, 170, 500, 170);
			g.drawString("90", 155, 175);
			g.drawLine(180, 190, 500, 190);
			g.drawString("80", 155, 195);
			g.drawLine(180, 210, 500, 210);
			g.drawString("70", 155, 215);
			g.drawLine(180, 230, 500, 230);
			g.drawString("60", 155, 235);
			g.drawLine(180, 250, 500, 250);
			g.drawString("50", 155, 255);
			g.drawLine(180, 270, 500, 270);
			g.drawString("40", 155, 275);
			g.drawLine(180, 290, 500, 290);
			g.drawString("30", 155, 295);
			g.drawLine(180, 310, 500, 310);
			g.drawString("20", 155, 315);
			g.drawLine(180, 330, 500, 330);
			g.drawString("10", 155, 335);
			g.drawLine(180, 350, 500, 350);
			//�׸�� �˷��ֱ�
			g.drawString("KOR", 250, 370);
			g.drawString("ENG", 330, 370);
			g.drawString("MATH", 410, 370);
			//���μ�
			g.drawLine(180, 140, 180, 350);
		}
	}
}


public class HW2_4_�輭�� {
	public static void main(String[] args) {
		//�׷��� ���
		new graphFrame();
	}
}
