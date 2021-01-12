package week13;

//필요한 패키지 import
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//프레임
class myFrame extends JFrame{
	//컴포넌트들 참조변수
	JButton button; //버튼
	JPanel panel;   //버튼 붙일 패널
	
	//생성자
	public myFrame() {
		//제목
		setTitle("나 잡아봐~라!-김서영");
		//사이즈
		setSize(300,300);
		//사이즈 고정
		setResizable(false);
		
		//객체 생성
		panel = new JPanel();           //패널
		button = new JButton("Click!"); //버튼
		
		//버튼 위치 정하기
		button.setLocation(0,0);
		//버튼 이벤트 붙여주기
		button.addMouseListener(new MyListener());
		
		//버튼 패널에 붙여주기
		panel.add(button);
		
		//프레임에 패널 붙여주기
		add(panel);
		
		//창 닫으면 종료되게
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//보여주기
		setVisible(true);
	}
	
	//마우스 이벤트 핸들링 class
	private class MyListener extends MouseAdapter{
		//마우스를 근처에 가져갔을때
		public void mouseEntered(MouseEvent e) {
			//위치 랜덤으로 설정
			int x = (int)(Math.random()*200);
			int y = (int)(Math.random()*200);
			//버튼 위치 변경
			button.setLocation(x, y);
			//콘솔에 출력
			System.out.println("x="+x+"\ty="+y);
		}
		//마우스가 클릭 되었을 때
		public void mouseClicked(MouseEvent e) {
			System.out.println("윽,,,잡혔다ㅠㅠ");
		}
	} 
}


public class week13_1_김서영 {

	public static void main(String[] args) {
		//class 호출
		new myFrame();		
	}

}
