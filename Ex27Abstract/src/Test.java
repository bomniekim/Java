//�߻�Ŭ���� : �׳� ����ϴ� ���� �ƴ϶� �ݵ�� ����ؼ� ����ؾ� �Ѵ�.
public abstract class Test {
	int a; //�ν��Ͻ� ����
	static int b=10; //static����[Ŭ��������]
	
	//�����ڸ޼ҵ�
	public Test() {
		System.out.println("Test ������!");
	}
	
	//�ν��Ͻ� �޼ҵ�
	void show() {
		System.out.println("show!");
	}
	
	//�߻� �޼ҵ� : �̸��� �ְ� ������ ���� �޼ҵ�
	//����� Ŭ�������� �ݵ�� �������̵带 �ؾ߸� �Ѵ�. 
	abstract void aaa();
	abstract void ccc();
	
	//static �޼ҵ�
	static void bbb() {
		System.out.println("Test static..."+b);
	}
}

