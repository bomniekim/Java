import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ���� ���̸��� ��ǻ�� ��ü ����
		Computer com = new Computer();

		// ��ǻ�� ��ü���� ���䰪�� �����ϰ� ����� ����
		com.makeRnd();

		// Ű���� �Է��� �޴� ����� ���� ��ü ����
		Scanner sc = new Scanner(System.in);

		while (true) {

			// Ű����� ���� �Է¹ޱ�
			String userNum = sc.next(); // ���ڿ��Է�

			// ��ǻ�� ��ü���� ���� �Է¹��� ���� �������ְ� ��������� ����ϵ���!
			boolean result = com.checkAnswer(userNum);
			
			//�����̸� while�� ����
			if(result) break;
		}

	}//

}
