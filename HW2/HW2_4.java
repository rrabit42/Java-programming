import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//그래프 프레임
class graphFrame extends JFrame implements ActionListener{
	//패널 참조변수
	JPanel input;
	//버튼 참조변수
	JButton button;
	//텍스트필드 참조변수
	JTextField kor, eng, math;
	
	//생성자
	public graphFrame(){
		//제목
		setTitle("Score Graph");
		//크기
		setSize(700,500);
		//input패널 구성
		 //객체 생성
		input = new JPanel();
		 //라벨들 생성
		JLabel Kor = new JLabel("Kor");
		JLabel Eng = new JLabel("Eng");
		JLabel Math = new JLabel("Math");
		 //텍스트필드 객체 생성
		kor = new JTextField(3);
		eng = new JTextField(3);
		math = new JTextField(3);
		 //버튼 객체 생성
		button = new JButton("Show Graph");
		  //버튼에 이벤트리스너 추가
		button.addActionListener(this);
		 //input 패널에 순서대로 붙이기
		input.add(Kor);
		input.add(kor);
		input.add(Eng);
		input.add(eng);
		input.add(Math);
		input.add(math);
		input.add(button);
		
		//picture패널 구성
		 //picture panel 객체 및 참조변수
		picture pic = new picture();
		
		//패널들 frame에 배치
		 //picture은 중앙
		add(pic, BorderLayout.CENTER);
		 //input은 남쪽
		add(input, BorderLayout.SOUTH);
		
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
	//버튼 눌렀을 때 이벤트 처리
	public void actionPerformed(ActionEvent e) {
		//그래픽을 다시 그려준다
		repaint();
	}
	
	//picture inner class
	class picture extends JPanel{
		//paint method
		public void paint(Graphics g) {
			//배경색을 white로 만들어주기 위해(setBackgroundColor가 안돼서 이렇게했어요ㅠㅠ)
			g.clearRect(0, 0, 1000, 500);
			//텍스트필드에서 가져올 막대그래프들의 높이 값 초기화
			int kh=0, eh=0, mh=0;
			//텍스트필드에서 값들을 integer로 바꾸는데
			try {
				kh = Integer.parseInt(kor.getText());
				eh = Integer.parseInt(eng.getText());
				mh = Integer.parseInt(math.getText());
			}
			//만약 정수로 바꿀 수 없으면
			catch(NumberFormatException e){
				//wrong input 출력
				g.drawString("Wrong Input", 300, 110);
			}
			
			//정수로 바꿨지만 범위에서 벗어나면
			if(kh<0 || kh>100 || eh<0 || eh>100 || mh<0 || mh>100) {
				//wrong input 출력
				g.drawString("Wrong Input", 300, 110);
			}
			else {
				//아니라면 빨간색으로 막대그래프 그려주기
				g.setColor(Color.red);
				g.fillRect(260, 350-kh*2, 10, kh*2);
				g.fillRect(340, 350-eh*2, 10, eh*2);
				g.fillRect(420, 350-mh*2, 10, mh*2);
			}
			
			//검정색으로 막대그래프 줄들 그려주기
			g.setColor(Color.black);
			g.drawLine(180, 150, 500, 150); //줄
			g.drawString("100", 155, 155);  //옆에 숫자 크기
			g.drawLine(180, 170, 500, 170);
			g.drawString("90", 155, 175);
			g.drawLine(180, 190, 500, 190);
			g.drawString("80", 155, 195);
			g.drawLine(180, 210, 500, 210);
			g.drawString("70", 155, 215);
			g.drawLine(180, 230, 500, 230);
			g.drawString("60", 155, 235);
			g.drawLine(180, 250, 500, 250);
			g.drawString("50", 155, 255);
			g.drawLine(180, 270, 500, 270);
			g.drawString("40", 155, 275);
			g.drawLine(180, 290, 500, 290);
			g.drawString("30", 155, 295);
			g.drawLine(180, 310, 500, 310);
			g.drawString("20", 155, 315);
			g.drawLine(180, 330, 500, 330);
			g.drawString("10", 155, 335);
			g.drawLine(180, 350, 500, 350);
			//항목들 알려주기
			g.drawString("KOR", 250, 370);
			g.drawString("ENG", 330, 370);
			g.drawString("MATH", 410, 370);
			//세로선
			g.drawLine(180, 140, 180, 350);
		}
	}
}


public class HW2_4_김서영 {
	public static void main(String[] args) {
		//그래프 출력
		new graphFrame();
	}
}
