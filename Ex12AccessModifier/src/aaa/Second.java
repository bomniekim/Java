package aaa;

public class Second {

	// ���������ڰ� �ο��� �������
	private int a;
	int b;
	protected int c;
	public int d;

	
	//�޼ҵ�
	void aaa() {
		System.out.println("aaa");
		
		//���� ��Ű���� default ���� �������� class ��밡��
		Third t = new Third();
	}
	
	//public ������������ �޼ҵ�
	public void bbb() {
		System.out.println("bbb");
	}
}
