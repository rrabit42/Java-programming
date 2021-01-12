package week12;

//필요한 패키지 import
import javax.swing.*;
import java.awt.*;

//계산기 그릴 frame
class myFrame extends JFrame {
	//계산기 구성에 필요한 참조변수들
	JPanel panel_1, panel_2; //패널 2개
	JTextField text;         //텍스트필드
	
	//생성자
	public myFrame() {
		//사이즈 setting
		setSize(300,200);
		//윈도우 닫히면 프로그램 종료되도록
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우 이름 지정
		setTitle("Calculator");
		
		//패널들 각자 객체 생성해주기
		panel_1 = new JPanel();
		panel_2 = new JPanel();
		//텍스트 필드 글자수 200으로 생성
		text = new JTextField(200);
		//텍스트 필드에 데이터 입력 시 오른쪽부터 글자 입력되도록
		text.setHorizontalAlignment(JTextField.RIGHT);
		//패널 1에 텍스트 필드 add
		panel_1.add(text);
		//패널 2는 gridlayout으로 레이아웃 변경
		panel_2.setLayout(new GridLayout(0,4,3,0)); //열이 4개가 되고, 열간 간격이 3px
		
		//패널2에 계산기 버튼들 생성
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
		//입력받은 패널에 버튼 객체 주가
		panel.add(button);
	}
}



public class Week12_1_김서영 {

	public static void main(String[] args) {
		//계산기 gui 객체 생성 및 호출
		new myFrame();

	}

}
