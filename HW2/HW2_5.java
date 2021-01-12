import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//차트 프레임
class chartFrame extends JFrame implements ActionListener{
	//필요한 참조변수들
	 //패널
	JPanel input;
	 //텍스트 필드, 김씨, 이씨, 박씨, 그 외 성 비율 받기위함
	JTextField kim, lee, park, etc;
	 //버튼
	JButton button;
	
	//생성자
	chartFrame(){
		//윈도우 타이틀
		setTitle("Pie Chart of Student names-김서영");
		//윈도우 사이즈
		setSize(700,500);
		
		//input패널 구성
		 //패널 객체
		input = new JPanel();
		 //라벨들
		JLabel Kim = new JLabel("Kim");
		JLabel Lee = new JLabel("Lee");
		JLabel Park = new JLabel("Park");
		JLabel Etc = new JLabel("Etc");
		 //버튼 객체
		button = new JButton("Graph");
		 //버튼에 액션리스너 설정
		button.addActionListener(this);
		 //텍스트필드 객체
		kim = new JTextField(5);
		lee = new JTextField(5);
		park = new JTextField(5);
		etc = new JTextField(5);
		 //순서대로 붙여넣기
		input.add(Kim);input.add(kim);
		input.add(Lee);input.add(lee);
		input.add(Park);input.add(park);
		input.add(Etc);input.add(etc);
		input.add(button);
		
		//chart패널
		chartPanel chart = new chartPanel();
		
		//프레임에 패널 붙여넣기
		add(input, BorderLayout.SOUTH);
		add(chart, BorderLayout.CENTER);
		
		//창 닫을 때 프로그램 종료되게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//+사이즈 변경할 수 없도록
		setResizable(false);
		//화면 중앙에 배치
		 //도구를 사용해
		Toolkit tk = getToolkit();
		 //윈도우 스크린 사이즈를 가져온다
		Dimension d = tk.getScreenSize();
		 //그리고 높이와
		int sh = d.height;
		 //너비 각각 구하고
		int sw = d.width;
		 //중앙에 배치되도록 적절히 조절
		setLocation(sw/2-this.getWidth()/2, sh/2-this.getHeight()/2);
		//화면 띄우기
		setVisible(true);	
	}
	//액션이벤트 handler
	public void actionPerformed(ActionEvent e) {
		//버튼 누르면 repaint하기
		repaint();
	}
	
	class chartPanel extends JPanel {
		public void paint(Graphics g) {
			//배경색을 white로 만들어주기 위해(setBackgroundColor가 안돼서 이렇게했어요ㅠㅠ)
			g.clearRect(0, 0, 1000, 500);
			//텍스트필드에서 값 받기 위한 변수들 및 초기화
			int yellow=0, red=0, blue=0, green=0;
			//exception이 발생했는지 확인하기위해
			boolean excep = false;
			
			//텍스트필드에 있는 값들을 가져와서 int로 바꿔보는데
			try {
				yellow = Integer.parseInt(kim.getText());
				red = Integer.parseInt(lee.getText());
				blue = Integer.parseInt(park.getText());
			}
			//format 예외가 발생하면
			catch(NumberFormatException e) {
				//exception 발생을 true로 바꿈
				excep = true;
			}
			
			//원차트 그리기
			 //1. 숫자들이 범위 밖을 벗어났을 때.
			if(yellow<0 || yellow>100 || red<0 || red>100 || blue<0 ||blue >100|| (yellow+red+blue)>100) {
				//각도는 모두 0
				yellow = 0; red = 0; blue = 0; green = 0;
				//100명에 맞춰 명수 적으라고 알려주기
				g.drawString("Number of students is 100", 250, 370);
			}
			 //2. 예외가 발생했을 때
			else if(excep){
				//각도 0
				yellow = 0; red = 0; blue = 0; green = 0;
				//숫자 입력해달라고 출력
				g.drawString("Input numbers of student names", 250, 370);
			}
			 //3. 정상 입력이 들어왔을 때
			else {
				//etc값 계산
				green = 100-yellow-red-blue;
				//텍스트필드에서 가져온 값들로 원그래프에서 쓰일 각도 계산
				int yellows = (int)(yellow/100.0*360);
				int reds = (int)(red/100.0*360);
				int blues = (int)(blue/100.0*360);
				int greens = (int)(green/100.0*360);
				
				//노란색으로
				g.setColor(Color.yellow);
				//색깔이 나타내는 의미 표시하고
				g.drawString("Yellow:KIMs", 490, 170);
				//원그래프 그리기
				g.fillArc(200, 100, 200, 200, 0, yellows);
				
				//빨간색으로
				g.setColor(Color.red);
				//의미 표시
				g.drawString("Red:LEEs", 490, 190);
				//그리기
				g.fillArc(200, 100, 200, 200, yellows, reds);
				
				//파란색으로
				g.setColor(Color.blue);
				//의미표시
				g.drawString("BLUE:PARKs", 490, 210);
				//그리기
				g.fillArc(200, 100, 200, 200, yellows+reds, blues);
				
				//녹색으로
				g.setColor(Color.green);
				//의미 표시
				g.drawString("GREEN:Etc", 490, 230);
				//그리기
				g.fillArc(200, 100, 200, 200, yellows+reds+blues, greens);
				}
			
				//그리고 텍스트필드 값을 setting해주기
				kim.setText(Integer.toString(yellow));
				lee.setText(Integer.toString(red));
				park.setText(Integer.toString(blue));
				etc.setText(Integer.toString(green));
			}
	}
}

public class HW2_5_김서영 {

	public static void main(String[] args) {
		//차트프레임 호출
		new chartFrame();
	}
}
