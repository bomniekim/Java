
public class Second extends First{
	
	private int b;
	
	public void show() {
		showFirst();
		System.out.println("b : "+b);
		System.out.println();
	}
	
	//�����ڸ޼ҵ� : ��ü�� ������ �� �ѹ� ȣ��Ǵ� �޼ҵ�
	public Second() {
		//�θ�Ŭ������ �����ڸ� ȣ���ϴ� �۾��� �ڵ� �����
		System.out.println("Second ��ü ����!");
	}
	
	//������ �����ε�
	public Second(int a, int b) {
		//���޹��� �Ķ���� ���� ��������� ����
		//super.a=a;//�� error? �θ��� private�� ���� �Ұ�
		
		//�θ�ü�� �����ϸ鼭 a���� �����ϵ��� �ϱ�!
		//�θ�Ŭ���� �����ڿ� a���� ����
		//First(a); //error �̷� ��������.. �����ڴ� newŰ����� �Բ� ����ϴ� ��
		//this()������ ȣ�⹮���� �����ϵ���
		
		//�θ�����ڸ� ȣ���ϴ� ������ ������ ������ -> super()
		super(a); //���� ������ (�ڽ� Ŭ�������� �θ� Ŭ������ �����ڸ� ��������� ȣ���� ��)
		//���ۻ����ڵ� �޼ҵ��� ù��° �������� �־����

		
		this.b=b;
		System.out.println("Second ��ü ����! int, int");
		
		
		//����Ŭ������ ���ÿ� ��ӹޱ�(���� ���)�� �ȵ�!
		//�ڹپ��� ���߻���� ������� ����.
		//Test, Second ���� ��ӹ޴� Nice Ŭ���� ������
		
		
	}
}
	
