
public class Second extends First {

	//�̹� First�� a ������ ������ ����
	private int b;
	
	//����� ����ϴ� ��� �޼ҵ� (��ӹ��� a������ ����� �� �ǹ� ����)
	public void show() { //�������̵��� ���������� �����ϰ�
		//System.out.println("a: "+a); //error : First a�� private�̶�
		//�θ�ü�� ������� ����ϴ� ��� �޼ҵ带 ȣ��
		//show(); //�θ���show()�� ȣ���Ϸ� ������ �̸��� ���⿡ ���ȣ��..
		
		//�������̵�Ǿ� ������ �θ�Ŭ������ show()�޼ҵ带 ȣ���Ϸ���
		//�θ�ü�� �����ϴ� Ư���� �������� super�� �̿��ؾ߸� ��.
		
		super.show();//�θ��� show()ȣ��
		System.out.println("b: "+b);
	}
	
}
