package week12;

//�ʿ��� ��Ű�� import
import java.awt.*;
import javax.swing.*;

//window frame class
class SYFrame extends JFrame{
	
	//�ʿ��� ����������
	 //�г� ��������
	JPanel north, center, south, button;
	 //�� ��������
	JLabel title, name, gender, id, department;
	 //�ؽ�Ʈ �ʵ� ��������
	JTextField nametext, idtext, departext;
	 //���� ��ư ��������
	JRadioButton male, female;
	
	//������
	public SYFrame() {
		//������ ����
		setTitle("Student Information");
		//������ ������ ���α׷� ����ǵ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ����
		setSize(350,200);
		
		//�гε� ���� ��ü ����
		north = new JPanel();
		center = new JPanel(new GridLayout(0,2)); //center �г��� ���� 2�� grid layout
		button = new JPanel();
		south = new JPanel();
		
		//�󺧵� ���� ��ü ����
		title = new JLabel("STUDENT INFORMATION");
		name = new JLabel("NAME");
		gender = new JLabel("GENDER");
		id = new JLabel("ID");
		department = new JLabel("DEPARTMENT");
		
		//�ؽ�Ʈ �ʵ� ���� ��ü ����, ũ��� ��� 25���ڼ��� ���� �� �ְ�
		nametext = new JTextField(25);
		idtext = new JTextField(25);
		departext = new JTextField(25);
		
		//���� ��ư ���� ��ü ����
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		
		//������ư���� button panel�� �߰�
		button.add(male);
		button.add(female);
		//������ư�� ��������� ���� ���������� ��ü
		ButtonGroup bg = new ButtonGroup();
		 //��ư �׷쿡 ������ư�� �߰��ؼ� �׷����� ����(�� �� �ϳ��� ���� �����ϵ���)
		bg.add(male);
		bg.add(female);
		 //�� �߿��� female ��ư�� �ʱ⿡ ���õ� �����̵���
		female.setSelected(true);
		
		//title�ؽ�Ʈ �ʵ�� north panel�� �߰�
		north.add(title);
		
		//center panel�� �󺧰� �ؽ�Ʈ�ʵ� ������� �߰�
		 //�л� �̸� �Է¹޴� ��
		center.add(name);
		center.add(nametext);
		 //�л� ���� �Է¹޴� ��
		center.add(gender);
		center.add(button); //������ư���� ����ִ� panel
		 //�л� ���̵� �Է¹޴� ��
		center.add(id);
		center.add(idtext);
		 //�л��� �μ� �Է¹޴� ��
		center.add(department);
		center.add(departext);
		
		//south panel�� save�� cancel ��ư �߰�
		south.add(new JButton("Save"));
		south.add(new JButton("Cancel"));	
		
		//�гε��� ���� frame�� �߰�
		add(north, BorderLayout.NORTH);  //north �г��� borderlayout�� north��
		add(center, BorderLayout.CENTER);//center �г��� borderlayout�� center��
		add(south, BorderLayout.SOUTH);  //south �г��� borderlayout�� south��
		
		//ȭ�鿡 ���̱�
		setVisible(true);
	}
}

public class Week12_2_�輭�� {
	public static void main(String[] args) {
		//SYframe gui ��ü ���� �� ���
		new SYFrame();

	}

}
