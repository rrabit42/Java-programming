import java.io.*;
import java.util.*;

public class HW2_1_�輭�� {

	public static void main(String[] args) {
		//�ʿ��� ������
		  //Ű���� �Է�
		Scanner kbd = new Scanner(System.in);
		  //������ �б�
		Scanner inputStream = null;
		  //������ ����
		PrintWriter outputStream = null;
		  //���� �̸���
		String read_file, write_file;
		  //�ܾ� �и�
		StringTokenizer tokenizer;
		
		//����ڷκ��� ���� ���� �̸� �ޱ�
		System.out.println("Input the filename to read.");
		read_file = kbd.nextLine();
		//�׸��� stream ���� ����ó��
		try {
			inputStream = new Scanner(new File(read_file));
		}
		catch(FileNotFoundException e) {
			//������ ���� ���
			System.out.println("Error in opening a file.\n");
			System.exit(1);
		}
		
		//����ڷκ��� �� ���� �̸� �ޱ�
		System.out.println("Input the filename to write");
		write_file = kbd.nextLine();
		//�׸��� stream ���� ����ó��
		try {
			outputStream = new PrintWriter(write_file);
		}
		catch(IOException e) {
			//IO ���ܰ� �߻��� ���
			System.out.println("Exception occurs.\n");
			System.exit(1);
		}
		
		//���� ���Ͽ��� �� �ܾ�� ����
		 //���� ���Ͽ��� �� ������ �о����
		while(inputStream.hasNextLine()) {
			//�� �ϳ� �����ؼ�
			String line = inputStream.nextLine();
			//tokenizer�� �̿��� �ܾ�鸸 �߸���.
			tokenizer = new StringTokenizer(line, " \n,");
			//token, �� �ܾ ������
			while(tokenizer.hasMoreTokens()) {
				//�ܾ���� �ϳ��� �����´�.
				String word = tokenizer.nextToken();
				//�ܾ��� ���̰� 4���� Ŭ ��쿡��
				if(word.length() > 4) {
					//outputStream�� �̿��� �ܾ ���Ͽ� ���´�.
					outputStream.println(word);
				}
			}
		}
		//������ close�ϰ�, ��Ʈ���� disconnect�Ѵ�.
		inputStream.close();
		outputStream.close();
		//������ ����������� �˸���
		System.out.println("animalOutput.txt is generated.");
	}
}
