package week12;

//�ʿ��� ��Ű�� import
import javax.swing.*;
import java.awt.*;

//���� �׸� frame
class myFrame extends JFrame {
	//���� ������ �ʿ��� ����������
	JPanel panel_1, panel_2; //�г� 2��
	JTextField text;         //�ؽ�Ʈ�ʵ�
	
	//������
	public myFrame() {
		//������ setting
		setSize(300,200);
		//������ ������ ���α׷� ����ǵ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ �̸� ����
		setTitle("Calculator");
		
		//�гε� ���� ��ü �������ֱ�
		panel_1 = new JPanel();
		panel_2 = new JPanel();
		//�ؽ�Ʈ �ʵ� ���ڼ� 200���� ����
		text = new JTextField(200);
		//�ؽ�Ʈ �ʵ忡 ������ �Է� �� �����ʺ��� ���� �Էµǵ���
		text.setHorizontalAlignment(JTextField.RIGHT);
		//�г� 1�� �ؽ�Ʈ �ʵ� add
		panel_1.add(text);
		//�г� 2�� gridlayout���� ���̾ƿ� ����
		panel_2.setLayout(new GridLayout(0,4,3,0)); //���� 4���� �ǰ�, ���� ������ 3px
		
		//�г�2�� ���� ��ư�� ����
		makeButton("ON", panel_2);
		makeButton("AC", panel_2);
		makeButton("C", panel_2);
		makeButton("OFF", panel_2);
		makeButton("7", panel_2);
		makeButton("8", panel_2);
		makeButton("9", panel_2);
		makeButton("/", panel_2);
		makeButton("4", panel_2);
		makeButton("5", panel_2);
		makeButton("6", panel_2);
		makeButton("X", panel_2);
		makeButton("1", panel_2);
		makeButton("2", panel_2);
		makeButton("3", panel_2);
		makeButton("-", panel_2);
		makeButton("0", panel_2);
		makeButton(".", panel_2);
		makeButton("=", panel_2);
		makeButton("+", panel_2);
		
		//�����ӿ� �гε� add
		  //�г�1�� frame�� borderlayout���� �� �� ����
		add(panel_1, BorderLayout.NORTH);
		  //�г�2�� frame�� borderlayout���� �߰� ����
		add(panel_2, BorderLayout.CENTER);
		//ȸ�鿡 ���
		setVisible(true);
	}
	
	//�гΰ� text�Է¹޾� �ش� text ��ư�� panel�� ������ִ� �޼ҵ�
	public void makeButton(String text, JPanel panel) {
		//text�� ������ ��ư ��ü ����
		JButton button = new JButton(text);
		//�Է¹��� �гο� ��ư ��ü �ְ�
		panel.add(button);
	}
}



public class Week12_1_�輭�� {

	public static void main(String[] args) {
		//���� gui ��ü ���� �� ȣ��
		new myFrame();

	}

}
