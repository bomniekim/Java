
public class Swim extends Robot{

	//�̹� attack(), move() ����� ������ ����
	
	//���ο� ��ɸ� �߰�
	void swim() {
		System.out.println("��������");
	}
	

	// �̹� �ִ� ����� ������ ���� �ʾ� �ٽ� �����ϴ� ���
	// Overriding(�������̵�) : ����(��ӹ���) �޼ҵ�� ���� �޼ҵ带 �ٽ� ����
	void attack() {
		System.out.println("��� �߻�!!");
	}
	
	@Override
	void move() {
		System.out.println("÷��÷��!!!");		
	}
	
	

}










