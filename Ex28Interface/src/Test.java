//�������̽��� ���� ��� : Ŭ���� ���� ����� ������
//�������̽��� ��ü ���� �Ұ�!
public interface Test { //abstract ��ſ� interface

	//interface�� Ư¡��
	
	//1. �������̽� �ȿ����� �ν��Ͻ�����, static����, �ν��Ͻ� �޼ҵ带 ���� �� ����.
	//2. �������̽� �ȿ����� �߻�޼ҵ�, static�޼ҵ�, ����ʵ�� public static final�� ������.
	//3. �������̽� �ȿ� �ִ� ����� ���� �ڵ� public��.
	//4. �������̽��� ���(�޼ҵ�)������ �ϼ��� ���� �ƴϱ⿡ �׳� ����� ���� ���� �ݵ�� ����� �����ؾ߸� ��� ������.
	//5. �������̽��� ����Ϸ��� ���ο� Ŭ������ �����ϸ鼭 implementsŰ����� �����ؾ߸� �Ѵ�. 
	//6. �������̽��� ������ ��Ӱ����̹Ƿ� �� ĳ������ ����
	
	//7. �������̽��� Ŭ������ �����̹Ƿ� �̳�Ŭ������ ���� �� ������.. �ڵ����� public static�� �ȴ�. 	
	
	//8. �������̽��� ���߱���(���߻��)�� ������.//AAA, BBB�������̽� -> SampleŬ�������� ����
		//9. �������̽��� �ٸ� �������̽��� ����� �� ����.//kkk�������̽��� ����� SSS�������̽��� ������ NiceŬ����...
	
	//������� ���Ұ�!
	//int a; 
	//static int b;
	
	
	//������� �߿��� final���� ��� ����
	public static final int a=10; //final�� ����鼭 ���� �����
	int b=2; //�ڵ����� public static final (��, ����� �ʱ�ȭ�� �Ǿ� ��������) 
	
	//���������ڴ� ���� public�� ��.
	//private static final int c=5;// error
	//protected static final int d=5;
	
	
	
	//�ν��Ͻ� �޼ҵ�: �Ϲ����� �޼ҵ�
//	void show() {
//		//error
//	}
	//����� ���ִ� ���� �����̱� ������
	
	
	//���������ڴ� ������ public�� ������ : �Ƚᵵ �ڵ� public (default X)
	//�߻�޼ҵ�: �̸��� �ִ� �޼ҵ�
	public abstract void aaa();
	void bbb(); //�ڵ� public abstract�� ��
	
	//protected abstract void ccc(); //error: ���������ڴ� public�� ����
	
	//static�޼ҵ�(JDK 1.8 ���� ����) : �ڵ� public
	static void ccc() {
		System.out.println("ccc");
	}
	
	
	//�̳�Ŭ���� ���谡�� : �ڵ� public static
	class Hello{
		void show() {
			System.out.println("Hello show!");
		}
	}
	
	
	
}//Test Interface...
