 
public class Test {

	public int a; // �������				  ----�ν��Ͻ��� ��ü���� �����Ƿ� --> �ٸ� ����: �ν��Ͻ� ����
	public static int b; // ����(static) ������� -- Ŭ������ �Ѱ� �����Ƿ�  --> �ٸ� ����: Ŭ���� ����

	// ������ �޼ҵ�: constructor - ��ü�� ������ ��(new) �ڵ����� �ѹ� ȣ��Ǵ� �޼ҵ�
	public Test() {
		a = 10;
		b = 20;
	}

	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	
	//static�� ������ ���� �� �ֵ���.. //static�� ��ü�� ��� �޸𸮿� ����
	//static �޼ҵ嵵 ������
	static void show() {
		//static �޼ҵ� �ȿ����� �ν��Ͻ� ������ ����� �Ұ���
		
		//System.out.println("������� a: "+ a); //��ü�� ���������� �����ϴ� a(�ν��Ͻ� ����)�� ����϶�� �ϴϱ� error 
		System.out.println("������� b: "+ b); //static������ ��� ����
	}
	
	//�Ϲ� �޼ҵ� - ��ü�� �ν��Ͻ��Ǿ�߸�(�����߸�) ��밡�� : �ν��Ͻ� �޼ҵ�
		void aaaaa() {
			System.out.println("������� a: "+ a);
			System.out.println("������� b: "+ b);
		}
	
}