
public class Main {

	public static void main(String[] args) {

		Robot robot = new Robot();
		robot.attack();
		robot.move();
		System.out.println();
		
		Fly fbot = new Fly();
		fbot.attack();
		fbot.move();	//������ ��ӹ��� ��� ��� ����
		fbot.fly();
		System.out.println();
		
		Swim sbot = new Swim();
		sbot.attack(); //������ ��ӹ��� ��� ��� ����
		sbot.move();   //������ ��ӹ��� ��� ��� ����
		sbot.swim();
		
		//�� ������ �������(��ӹ��� �޼ҵ�)�� ������ ���� �ȵ�� ��Ȳ�̾
		//�޼ҵ� �ȿ� ������ ������ ���Ӱ� �ۼ��� �����
		
		//������, ���� �޼ҵ��� ��ɿ� �Ϻκ� ���븸 �߰��ϰ� ���� ��쵵 ����!!
		//���� ������Ʈ���� �н��غ���!
		
		}


}
