
public class InheritanceMain {

	public static void main(String[] args) {

		// �����ϰ� ��ӿ� ���� �˾ƺ���

		Robot robot = new Robot();
		robot.attack();
		robot.move();
		System.out.println();
		
		//���ƴٴϴ� �κ��� ������ ������
		//��, ���� ����� �߰��� �κ�!
		//������ RobotŬ������ ���� ����� �߰��ϸ� ������ �ִ� �κ����� �ɷ��� �����
		//���ο� Ŭ������ ����� ���� ����� �߰��ؾ� ��
		
		Flying fbot = new Flying();
		fbot.attack();
		fbot.move();
		fbot.flying();
		System.out.println();
		
		//�̹����� �����ϴ� �κ��� �ʿ�
		//�� ���� �۾��� �ϴ� Ŭ���������� ����� �߰��� swimming()��� �߰�
		//�̷� �� ����ϴ� ���� java�� ���!
		Swimming sbot = new Swimming();
		sbot.attack();
		sbot.move();
		sbot.swimming(); 
		System.out.println();
		
		
		
	}
}
