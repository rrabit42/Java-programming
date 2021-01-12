import java.util.*;

public class HW2_2_�輭�� {

	public static void main(String[] args) {
		//Ű���� �Է��� ���� �������� �� ��ü
		Scanner kbd = new Scanner(System.in);
		//Stack(LinkedList)
		LinkedList<Character> stack = new LinkedList<Character>();
		
		//0�Է½ñ��� �ݺ�
		while(true) {
			//��ȣ���� �´����� �Ǵ��� �ִ� ����
			Boolean correct = true;
			
			//����ڷκ��� ��ȣ���� �Է¹޴´�
			System.out.print("Input: ");
			String input = kbd.nextLine();
			if(input.equals("0")) break;  //���� 0�� �Է��ϸ� �� ��� while�� Ż��
			
			//�ƴ϶�� �Է¹޴� String�� char �迭�� �ٲ۴�
			char[] array = input.toCharArray();
			
			//char �迭�� ��� ����
			for(int i=0; i< array.length; i++) {
				//char �迭���� ���� �ϳ��� �޾Ƽ�
				char bracket = array[i];
				//���� ��ȣ�̸�
				if(bracket == '(' || bracket == '{' || bracket =='[') {
					//stack�� �ִ´�
					stack.addLast(bracket);
				}
				//�ݴ� ��ȣ�� ')'��
				else if(bracket == ')') {
					//�켱 stack�� ����ִ��� Ȯ��
					if(stack.peek() == null) {
						//��� ������ ��ȣ���� ���� �� �����Ƿ� false�ְ�
						correct = false;
						//�ٷ� for�� Ż��
						break;
					}
					//������� �ʴٸ� stack���� ������ ���� �޾Ƽ�
					//¦�� ������ continue
					if(stack.removeLast() == '(') continue;
					else {
						//�ƴ϶�� false�ְ� �ٷ� for�� Ż��
						correct = false;
						break;
					}
					
				}
				//�ݴ� ��ȣ�� '}'��
				else if(bracket == '}') {
					//�켱 stack�� ����ִ��� Ȯ��
					if(stack.peek() == null) {
						//��� ������ ��ȣ���� ���� �� �����Ƿ� false�ְ�
						correct = false;
						//�ٷ� for�� Ż��
						break;
					}
					//������� �ʴٸ� stack���� ������ ���� �޾Ƽ�
					//¦�� ������ continue
					if(stack.removeLast() == '{') continue;
					else {
						//�ƴ϶�� false�ְ� �ٷ� for�� Ż��
						correct = false;
						break;
					}
				}
				//�ݴ� ��ȣ�� ']'��
				else if(bracket ==']') {
					//�켱 stack�� ����ִ��� Ȯ��
					if(stack.peek() == null) {
						//��� ������ ��ȣ���� ���� �� �����Ƿ� false�ְ�
						correct = false;
						//�ٷ� for�� Ż��
						break;
					}
					//������� �ʴٸ� stack���� ������ ���� �޾Ƽ�
					//¦�� ������ continue
					if(stack.removeLast() == '[') continue;
					else {
						//�ƴ϶�� false�ְ� �ٷ� for�� Ż��
						correct = false;
						break;
					}
				}
			}
			
			//���� for�� �� �������� true������
			//��ȣ���� �´°�
			if (correct) {
				System.out.println("Correct\n\n");
			}
			//�ƴϸ� incorrect
			else {
				System.out.println("Incorrect\n\n");
			}
		}
		//0�Է��� while�� Ż��������
		//���α׷� ����
		System.out.println("Program finished");
	}
}
