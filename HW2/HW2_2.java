import java.util.*;

public class HW2_2_김서영 {

	public static void main(String[] args) {
		//키보드 입력을 위한 참조변수 및 객체
		Scanner kbd = new Scanner(System.in);
		//Stack(LinkedList)
		LinkedList<Character> stack = new LinkedList<Character>();
		
		//0입력시까지 반복
		while(true) {
			//괄호쌍이 맞는지를 판단해 주는 변수
			Boolean correct = true;
			
			//사용자로부터 괄호쌍을 입력받는다
			System.out.print("Input: ");
			String input = kbd.nextLine();
			if(input.equals("0")) break;  //만약 0을 입력하면 그 즉시 while문 탈출
			
			//아니라면 입력받는 String을 char 배열로 바꾼다
			char[] array = input.toCharArray();
			
			//char 배열을 모두 돈다
			for(int i=0; i< array.length; i++) {
				//char 배열에서 원소 하나를 받아서
				char bracket = array[i];
				//여는 괄호이면
				if(bracket == '(' || bracket == '{' || bracket =='[') {
					//stack에 넣는다
					stack.addLast(bracket);
				}
				//닫는 괄호중 ')'면
				else if(bracket == ')') {
					//우선 stack이 비어있는지 확인
					if(stack.peek() == null) {
						//비어 있으면 괄호쌍을 만들 수 없으므로 false주고
						correct = false;
						//바로 for문 탈출
						break;
					}
					//비어있지 않다면 stack에서 마지막 원소 받아서
					//짝이 맞으면 continue
					if(stack.removeLast() == '(') continue;
					else {
						//아니라면 false주고 바로 for문 탈출
						correct = false;
						break;
					}
					
				}
				//닫는 괄호중 '}'면
				else if(bracket == '}') {
					//우선 stack이 비어있는지 확인
					if(stack.peek() == null) {
						//비어 있으면 괄호쌍을 만들 수 없으므로 false주고
						correct = false;
						//바로 for문 탈출
						break;
					}
					//비어있지 않다면 stack에서 마지막 원소 받아서
					//짝이 맞으면 continue
					if(stack.removeLast() == '{') continue;
					else {
						//아니라면 false주고 바로 for문 탈출
						correct = false;
						break;
					}
				}
				//닫는 괄호중 ']'면
				else if(bracket ==']') {
					//우선 stack이 비어있는지 확인
					if(stack.peek() == null) {
						//비어 있으면 괄호쌍을 만들 수 없으므로 false주고
						correct = false;
						//바로 for문 탈출
						break;
					}
					//비어있지 않다면 stack에서 마지막 원소 받아서
					//짝이 맞으면 continue
					if(stack.removeLast() == '[') continue;
					else {
						//아니라면 false주고 바로 for문 탈출
						correct = false;
						break;
					}
				}
			}
			
			//만약 for문 다 돌때까지 true였으면
			//괄호쌍이 맞는것
			if (correct) {
				System.out.println("Correct\n\n");
			}
			//아니면 incorrect
			else {
				System.out.println("Incorrect\n\n");
			}
		}
		//0입력해 while문 탈출했으면
		//프로그램 종료
		System.out.println("Program finished");
	}
}
