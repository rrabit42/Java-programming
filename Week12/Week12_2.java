package week12;

//필요한 패키지 import
import java.awt.*;
import javax.swing.*;

//window frame class
class SYFrame extends JFrame{
	
	//필요한 참조변수들
	 //패널 참조변수
	JPanel north, center, south, button;
	 //라벨 참조변수
	JLabel title, name, gender, id, department;
	 //텍스트 필드 참조변수
	JTextField nametext, idtext, departext;
	 //라디오 버튼 참조변수
	JRadioButton male, female;
	
	//생성자
	public SYFrame() {
		//윈도우 제목
		setTitle("Student Information");
		//윈도우 닫히면 프로그램 종료되도록
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//사이즈 지정
		setSize(350,200);
		
		//패널들 각자 객체 생성
		north = new JPanel();
		center = new JPanel(new GridLayout(0,2)); //center 패널은 열이 2인 grid layout
		button = new JPanel();
		south = new JPanel();
		
		//라벨들 각자 객체 생성
		title = new JLabel("STUDENT INFORMATION");
		name = new JLabel("NAME");
		gender = new JLabel("GENDER");
		id = new JLabel("ID");
		department = new JLabel("DEPARTMENT");
		
		//텍스트 필드 각자 객체 생성, 크기는 모두 25글자수를 담을 수 있게
		nametext = new JTextField(25);
		idtext = new JTextField(25);
		departext = new JTextField(25);
		
		//라디오 버튼 각자 객체 생성
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		
		//라디오버튼들을 button panel에 추가
		button.add(male);
		button.add(female);
		//라디오버튼을 기능적으로 묶을 참조변수와 객체
		ButtonGroup bg = new ButtonGroup();
		 //버튼 그룹에 라디오버튼들 추가해서 그룹으로 묶기(둘 중 하나만 선택 가능하도록)
		bg.add(male);
		bg.add(female);
		 //그 중에서 female 버튼이 초기에 선택된 상태이도록
		female.setSelected(true);
		
		//title텍스트 필드는 north panel에 추가
		north.add(title);
		
		//center panel에 라벨과 텍스트필드 순서대로 추가
		 //학생 이름 입력받는 열
		center.add(name);
		center.add(nametext);
		 //학생 성별 입력받는 열
		center.add(gender);
		center.add(button); //라디오버튼들을 담고있는 panel
		 //학생 아이디 입력받는 열
		center.add(id);
		center.add(idtext);
		 //학생의 부서 입력받는 열
		center.add(department);
		center.add(departext);
		
		//south panel에 save와 cancel 버튼 추가
		south.add(new JButton("Save"));
		south.add(new JButton("Cancel"));	
		
		//패널들을 각각 frame에 추가
		add(north, BorderLayout.NORTH);  //north 패널은 borderlayout의 north에
		add(center, BorderLayout.CENTER);//center 패널은 borderlayout의 center에
		add(south, BorderLayout.SOUTH);  //south 패널은 borderlayout의 south에
		
		//화면에 보이기
		setVisible(true);
	}
}

public class Week12_2_김서영 {
	public static void main(String[] args) {
		//SYframe gui 객체 생성 및 출력
		new SYFrame();

	}

}
