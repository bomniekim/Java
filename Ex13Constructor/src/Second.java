
public class Second {

	// �������(field) - private����
	private int a;
	private int b;

	// ��������� �ʱ�ȭ�ϴ� ������ �޼ҵ�
	public Second(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int, int");
	}
	
	//������ �����ε��� �䱸 (������ ��������� ���� +1��ŭ ����)
	//����: �ڽ��� ���ϴ� ������ �ʱ�ȭ ���� (!=0)
	public Second() {
//		this.a=10;
//		this.b=20;
		//���� ���� ������ ��������� ���� �����ϸ� �ʹ� ���ŷο�!
		
		//���� �������ִ� �ٸ� ������ �̿��ϱ�~
		//�ٸ� ������ �޼ҵ� ȣ���ϱ�!
		//Second(10,20); error! �����ڴ� new Ű����� �Բ��� ���� ȣ�� ������
		//�Ϲ� �޼ҵ� ȣ���ϵ� ȣ���ϴ� ��� error
		//���� Ŭ������ �����ڸ� ȣ���ϴ� Ű���� this() ���
		this(10, 20); //�� ������
		
	}
	public Second(int a) {
		//System.out.println("aaa");
		this(a,a); //��.��.��.Ģ! this �����ڴ� �ݵ�� ù��° ���๮�̾�� �Ѵ�.  
		System.out.println("bbb");
		
	}
	
	
	//�Ϲ� �޼ҵ�
	void aaa() {
		bbb(); //�ٸ� �޼ҵ��� ȣ���� ������.
		//��, ������ �޼ҵ嵵 �ٸ� ������ �޼ҵ带 ȣ���� �� ����.
	}
	
	void bbb() {
		
	}
	
}
