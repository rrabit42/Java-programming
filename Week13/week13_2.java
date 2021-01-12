package week13;

//필요한 패키지 import
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//프레임, 액션핸들링 implement
class carFrame extends JFrame implements ActionListener{
	//컴포넌트들 참조변수
	JRadioButton b1,b2,b3;    //라디오버튼
	JButton button;           //버튼
	Color color = Color.red;  //색깔
	JPanel sel;               //패널
	
	//생성자
	carFrame(){
		//제목
		setTitle("MyCar-이름");
		//사이즈
		setSize(500,350);
		
		//그림 있는 패널 객체 및 참조변수 생성
		PicPanel pic = new PicPanel();
		//선택 화면 패널 객체 및 참조변수 생성
		sel = new JPanel();
		
		//Frame위치가 모니터 정중앙에 위치하도록
		Toolkit tk = getToolkit();        //공구 참조변수 및 객체
 		Dimension d = tk.getScreenSize(); //화면 사이즈 불러오기
		int screenW = d.width;            //스크린 넓이
		int screenH = d.height;           //스크린 높이
		                                  //정중앙에 location 위치
		setLocation(screenW/2 - this.getWidth()/2, screenH/2 - this.getHeight()/2);
		
		//버튼 객체 생성
		button = new JButton("Paint");
		//버튼에 이벤트 붙이기
		button.addActionListener(this);
		
		//라디오버튼 객체 생성
		b1 = new JRadioButton("RED");
		b2 = new JRadioButton("GREEN");
		b3 = new JRadioButton("BLUE");
		//기능적으로 버튼들 묶기
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		//기본으로 red 라디오버튼 select
		b1.setSelected(true);
		
		//패널에 라디오버튼과 버튼 붙이기
		sel.add(b1);
		sel.add(b2);
		sel.add(b3);
		sel.add(button);
		
		//frame에 패널들 붙이기
		add(pic,"Center");
		add(sel,"South");
		//창닫으면 종료되
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//보여주기
		setVisible(true);
	}
	
	//이벤트 핸들링
	public void actionPerformed(ActionEvent e) {
		//b1이 선택되면
		if(b1.isSelected()) {
			//색깔 빨간색
			color = Color.red;
		}
		//b2가 선택되면
		else if (b2.isSelected()) {
			//색깔 초록색
			color = Color.green;
		}
		//b3가 선택되면
		else if (b3.isSelected()) {
			//색깔 파랑
			color = Color.blue;
		}
		//다시 paint하기
		repaint();
	}
	
	//그림이 있는 패널
	class PicPanel extends JPanel{
		public void paint(Graphics g) {
			//색깔 받아서
			g.setColor(color);
			//직사각형 두개 그리기(차 본체)
			g.fillRect(160,50,140,60);
			g.fillRect(90,110, 280,100);
			//색깔 light gray로 바꿔서
			g.setColor(Color.LIGHT_GRAY);
			//원 두개 그리기(바퀴)
			g.fillOval(150,190,40,40);
			g.fillOval(290,190,40,40);
			//색 검정으로 바꿔서
			g.setColor(Color.black);
			//차 눈 그려주기
			g.drawArc(230,80,70,30,10,60);
			g.drawArc(230,80,70,30,60,60);
			
		}
	}
}

public class week13_2_김서영 {
	public static void main(String[] args) {
		//frame 불러오기
		new carFrame();
	}
}
