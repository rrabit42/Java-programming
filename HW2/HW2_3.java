//필요한 패키지 import
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//계산기 그릴 frame
class calFrame extends JFrame implements ActionListener {
	//계산기 구성에 필요한 참조변수들
	JPanel panel_1, panel_2; //패널 2개
	JTextField text;         //텍스트필드
	
	//생성자
	public calFrame() {
		//사이즈 setting
		setSize(500,300);
		//윈도우 닫히면 프로그램 종료되도록
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우 이름 지정
		setTitle("Calculator");
		
		//패널들 각자 객체 생성해주기
		panel_1 = new JPanel();
		panel_2 = new JPanel();
		//텍스트 필드 글자수 적절한 크기로 지정해서 생성
		text = new JTextField(43);
		//텍스트 필드에 데이터 입력 시 오른쪽부터 글자 입력되도록
		text.setHorizontalAlignment(JTextField.RIGHT);
		//패널 1에 텍스트 필드 add
		panel_1.add(text);
		//패널 2는 gridlayout으로 레이아웃 변경
		panel_2.setLayout(new GridLayout(0,4,3,0)); //열이 4개가 되고, 열간 간격이 3px
		
		//패널2에 계산기 버튼들 생성
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
		
		//프레임에 패널들 add
		  //패널1은 frame의 borderlayout에서 맨 위 차지
		add(panel_1, BorderLayout.NORTH);
		  //패널2는 frame의 borderlayout에서 중간 차지
		add(panel_2, BorderLayout.CENTER);
		//회면에 출력
		setVisible(true);
	}
	
	//패널과 text입력받아 해당 text 버튼을 panel에 만들어주는 메소드
	public void makeButton(String text, JPanel panel) {
		//text가 쓰여진 버튼 객체 생성
		JButton button = new JButton(text);
		//버튼에 이벤트 listener 추가
		button.addActionListener(this);
		//입력받은 패널에 버튼 객체 주가
		panel.add(button);
	}
	//이벤트 handling method
	//action event받으면
	public void actionPerformed(ActionEvent e) {
		//만약 e가 나타난 곳이 = 버튼이면
		if(e.getActionCommand().equals("=")) {
			//textfield의 text들 가져와서 String타입으로 각각 쪼갬
			String[] equation = text.getText().split("");
			//한자리 수만 계산하므로 left 숫자와
			int left = Integer.parseInt(equation[0]);
			//중간의 연산기호
			String op = equation[1];
			//right 숫자를 각각 받아서
			int right = Integer.parseInt(equation[2]);
			//계산한다
			//연산자가 +일때
			if(op.equals("+")) {
				//textfield에 보여야하므로 계산 후 String으로 변환
				text.setText(Integer.toString(left+right));
			}
			//연산자가 -일때
			else if(op.equals("-")) {
				text.setText(Integer.toString(left-right));
			}
			//연산자가 *일때
			else if (op.equals("*")) {
				text.setText(Integer.toString(left*right));
			}
			//연산자가 /일때
			else if (op.equals("/")) {
				//나누기는 소수점까지 계산 가능하게 double type으로
				text.setText(Double.toString((double)left/right));
			}
		}
		//e가 나타난 곳이 New 버튼이면
		else if(e.getActionCommand().equals("New")) {
			//textfield 초기화
			text.setText("");
		}
		//e가 나타난 곳이 숫자 버튼들이면
		else if(e.getActionCommand().equals(e.getActionCommand())) {
			//원래 textfield에 있던 text에 그 숫자 추가해서 입력
			text.setText(text.getText()+e.getActionCommand());
		}
	}
}



public class HW2_3_김서영 {

	public static void main(String[] args) {
		//계산기 출력
		new calFrame();

	}

}
