package week11;
import java.util.*;

public class week11_2_�輭�� {

	public static void main(String[] args) {
		//�ʿ��� ������
		  //hashmap
		Map<String, String> stumap = new HashMap<String, String>();
		  //Ű���� �Է�
		Scanner kbd = new Scanner(System.in);
		  //�л� ID, �̸�
		String ID, Name;
		  //�ִ�, �ּ� ���� ���� ����
		int maxLen, minLen;
		  //�ִ�, �ּ� ������ �̸��� value�� ���� id ����
		String maxId, minId;
		
		//����ڿ��� �л�ID�� �̸� �Է¹ޱ�
		System.out.println("�л��� ID�� �̸��� ���ʷ� �Է��ϼ���. (����� 0 0 �Է�)");
		
		//0 0 �Է¹��� ������ ����ڿ��� �л� ���� ��� �Է¹ޱ�
		while(true) {
			//ID �Է¹ޱ�
			ID = kbd.next();
			//�̸� �Է¹ޱ�
			Name = kbd.next();
			//0 0�� �� �ݺ��� Ż��
			if(ID.equalsIgnoreCase("0") && Name.equalsIgnoreCase("0")) break;
			//0 0�� �ƴϸ� map�� �� �߰�
			stumap.put(ID, Name);
		}
		
		//keyset
		Set s = stumap.keySet();
		//set �� �ϳ��� �������� ���� iterator ���
		Iterator<String> it = s.iterator();
		
		//�л���� ���
		System.out.println("<�л����>");
		System.out.println("[ID]\t\t[NAME]");
		//���� ������ iterator�� �̿��� �� �ҷ�����
		while(it.hasNext()) {
			//id �� �ϳ� �����ͼ�
			String id = it.next();
			//id�� value(�̸�) ���
			System.out.println(id+"\t\t"+stumap.get(id));
		}
		
		//�ٽ� iterator �ʱ�ȭ
		it = s.iterator();
		//�׸��� maxId, minId �ʱ�ȭ
		maxId = it.next();
		minId = it.next();
				
		//��ü �л��� ���
		System.out.println("\n\n��ü �л���:"+s.size());
		
		//�ִ� ������ �̸��� �ּ� ������ �̸� ���ϱ�
		maxLen = stumap.get(maxId).length();
		minLen = stumap.get(minId).length();
		
		//iterator �ʱ�ȭ
		it = s.iterator();
		//��� ���� ���ؼ� �ִ� ���̿� �ּ� ���̿� �� ���� id ã��
		while(it.hasNext()) {
			//id �ϳ� ��������
			String j = it.next();
			//�� id���� ���ؼ� �ִ� ���̿� �� id ã��
			if(maxLen < stumap.get(j).length()) {
				maxLen = stumap.get(j).length();
				maxId = j;
			}
			//�ּ� ���̿� �� id ã��
			if(minLen > stumap.get(j).length()) {
				minLen = stumap.get(j).length();
				minId = j;
			}
		}
		
		//���� �� �̸��� ���� �л� ���� ���
		System.out.println("<���� �� �̸��� ���� �л�>");
		System.out.println("ID:"+maxId+"\tName:"+stumap.get(maxId)+"\t����:"+maxLen);
		//���� ª�� �̸��� ���� �л� ���� ���
		System.out.println("<���� ª�� �̸��� ���� �л�");
		System.out.println("ID:"+minId+"\tName:"+stumap.get(minId)+"\t����:"+minLen);
	}

}
