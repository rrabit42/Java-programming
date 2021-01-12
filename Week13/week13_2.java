package week13;

//�ʿ��� ��Ű�� import
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//������, �׼��ڵ鸵 implement
class carFrame extends JFrame implements ActionListener{
	//������Ʈ�� ��������
	JRadioButton b1,b2,b3;    //������ư
	JButton button;           //��ư
	Color color = Color.red;  //����
	JPanel sel;               //�г�
	
	//������
	carFrame(){
		//����
		setTitle("MyCar-�̸�");
		//������
		setSize(500,350);
		
		//�׸� �ִ� �г� ��ü �� �������� ����
		PicPanel pic = new PicPanel();
		//���� ȭ�� �г� ��ü �� �������� ����
		sel = new JPanel();
		
		//Frame��ġ�� ����� ���߾ӿ� ��ġ�ϵ���
		Toolkit tk = getToolkit();        //���� �������� �� ��ü
 		Dimension d = tk.getScreenSize(); //ȭ�� ������ �ҷ�����
		int screenW = d.width;            //��ũ�� ����
		int screenH = d.height;           //��ũ�� ����
		                                  //���߾ӿ� location ��ġ
		setLocation(screenW/2 - this.getWidth()/2, screenH/2 - this.getHeight()/2);
		
		//��ư ��ü ����
		button = new JButton("Paint");
		//��ư�� �̺�Ʈ ���̱�
		button.addActionListener(this);
		
		//������ư ��ü ����
		b1 = new JRadioButton("RED");
		b2 = new JRadioButton("GREEN");
		b3 = new JRadioButton("BLUE");
		//��������� ��ư�� ����
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		//�⺻���� red ������ư select
		b1.setSelected(true);
		
		//�гο� ������ư�� ��ư ���̱�
		sel.add(b1);
		sel.add(b2);
		sel.add(b3);
		sel.add(button);
		
		//frame�� �гε� ���̱�
		add(pic,"Center");
		add(sel,"South");
		//â������ �����
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�����ֱ�
		setVisible(true);
	}
	
	//�̺�Ʈ �ڵ鸵
	public void actionPerformed(ActionEvent e) {
		//b1�� ���õǸ�
		if(b1.isSelected()) {
			//���� ������
			color = Color.red;
		}
		//b2�� ���õǸ�
		else if (b2.isSelected()) {
			//���� �ʷϻ�
			color = Color.green;
		}
		//b3�� ���õǸ�
		else if (b3.isSelected()) {
			//���� �Ķ�
			color = Color.blue;
		}
		//�ٽ� paint�ϱ�
		repaint();
	}
	
	//�׸��� �ִ� �г�
	class PicPanel extends JPanel{
		public void paint(Graphics g) {
			//���� �޾Ƽ�
			g.setColor(color);
			//���簢�� �ΰ� �׸���(�� ��ü)
			g.fillRect(160,50,140,60);
			g.fillRect(90,110, 280,100);
			//���� light gray�� �ٲ㼭
			g.setColor(Color.LIGHT_GRAY);
			//�� �ΰ� �׸���(����)
			g.fillOval(150,190,40,40);
			g.fillOval(290,190,40,40);
			//�� �������� �ٲ㼭
			g.setColor(Color.black);
			//�� �� �׷��ֱ�
			g.drawArc(230,80,70,30,10,60);
			g.drawArc(230,80,70,30,60,60);
			
		}
	}
}

public class week13_2_�輭�� {
	public static void main(String[] args) {
		//frame �ҷ�����
		new carFrame();
	}
}
