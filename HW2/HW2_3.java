//�ʿ��� ��Ű�� import
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//���� �׸� frame
class calFrame extends JFrame implements ActionListener {
	//���� ������ �ʿ��� ����������
	JPanel panel_1, panel_2; //�г� 2��
	JTextField text;         //�ؽ�Ʈ�ʵ�
	
	//������
	public calFrame() {
		//������ setting
		setSize(500,300);
		//������ ������ ���α׷� ����ǵ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ �̸� ����
		setTitle("Calculator");
		
		//�гε� ���� ��ü �������ֱ�
		panel_1 = new JPanel();
		panel_2 = new JPanel();
		//�ؽ�Ʈ �ʵ� ���ڼ� ������ ũ��� �����ؼ� ����
		text = new JTextField(43);
		//�ؽ�Ʈ �ʵ忡 ������ �Է� �� �����ʺ��� ���� �Էµǵ���
		text.setHorizontalAlignment(JTextField.RIGHT);
		//�г� 1�� �ؽ�Ʈ �ʵ� add
		panel_1.add(text);
		//�г� 2�� gridlayout���� ���̾ƿ� ����
		panel_2.setLayout(new GridLayout(0,4,3,0)); //���� 4���� �ǰ�, ���� ������ 3px
		
		//�г�2�� ���� ��ư�� ����
		makeButton("7", panel_2);
		makeButton("8", panel_2);
		makeButton("9", panel_2);
		makeButton("/", panel_2);
		makeButton("4", panel_2);
		makeButton("5", panel_2);
		makeButton("6", panel_2);
		makeButton("*", panel_2);
		makeButton("1", panel_2);
		makeButton("2", panel_2);
		makeButton("3", panel_2);
		makeButton("-", panel_2);
		makeButton("New", panel_2);
		makeButton("0", panel_2);
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
		//��ư�� �̺�Ʈ listener �߰�
		button.addActionListener(this);
		//�Է¹��� �гο� ��ư ��ü �ְ�
		panel.add(button);
	}
	//�̺�Ʈ handling method
	//action event������
	public void actionPerformed(ActionEvent e) {
		//���� e�� ��Ÿ�� ���� = ��ư�̸�
		if(e.getActionCommand().equals("=")) {
			//textfield�� text�� �����ͼ� StringŸ������ ���� �ɰ�
			String[] equation = text.getText().split("");
			//���ڸ� ���� ����ϹǷ� left ���ڿ�
			int left = Integer.parseInt(equation[0]);
			//�߰��� �����ȣ
			String op = equation[1];
			//right ���ڸ� ���� �޾Ƽ�
			int right = Integer.parseInt(equation[2]);
			//����Ѵ�
			//�����ڰ� +�϶�
			if(op.equals("+")) {
				//textfield�� �������ϹǷ� ��� �� String���� ��ȯ
				text.setText(Integer.toString(left+right));
			}
			//�����ڰ� -�϶�
			else if(op.equals("-")) {
				text.setText(Integer.toString(left-right));
			}
			//�����ڰ� *�϶�
			else if (op.equals("*")) {
				text.setText(Integer.toString(left*right));
			}
			//�����ڰ� /�϶�
			else if (op.equals("/")) {
				//������� �Ҽ������� ��� �����ϰ� double type����
				text.setText(Double.toString((double)left/right));
			}
		}
		//e�� ��Ÿ�� ���� New ��ư�̸�
		else if(e.getActionCommand().equals("New")) {
			//textfield �ʱ�ȭ
			text.setText("");
		}
		//e�� ��Ÿ�� ���� ���� ��ư���̸�
		else if(e.getActionCommand().equals(e.getActionCommand())) {
			//���� textfield�� �ִ� text�� �� ���� �߰��ؼ� �Է�
			text.setText(text.getText()+e.getActionCommand());
		}
	}
}



public class HW2_3_�輭�� {

	public static void main(String[] args) {
		//���� ���
		new calFrame();

	}

}
