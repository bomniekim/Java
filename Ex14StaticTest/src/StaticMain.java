
public class StaticMain {

	public static void main(String[] args) {
		
		//static int a; //������������ static ��� �Ұ�
		
		Test t1 = new Test(10,20); //� Ŭ������ ��ü�ΰ�? TestŬ������ �ν��Ͻ���.
		Test t2 = new Test(30,40); //�޸𸮿� ������� ��ü = �ν��Ͻ��� ��ü
		Test t3 = new Test(50,60);

		//�� 3���� ���๮�� �׸����� Ȯ��!
		
		//t1 ���������� �����ϴ� ��ü�� �������(a)�� �����ص�
		//�ٸ� ��ü�� a�� ���� ������� ����! �ٸ� �����ϱ�
		//��, �Ϲ� ��������� ��ü���� ������ �ִ� ����!
		t1.a=100;
		System.out.println( tl.a ); //100
		System.out.println( t2.a ); //
		System.out.println( t3.a );
		System.out.println();
		
		//static������ ��ü���� �ִ� ���� �ƴ϶� 
		//1���� �����ϹǷ� � ��ü�� �̿��ؼ� �����ϵ�
		//������ ��ü���� ������ ��ĥ �� �ۿ� ����
		t2.b=200;
		System.out.println( t1.b );
		System.out.println( t2.b );
		System.out.println( t3.b );
		System.out.println();
		
		//�׷���... static������ �� ��ü�� ������� ���⿡�� ������
		//����� �� ��ü���� �̿��ϱ⺸�ٴ� Ŭ������ 1���̹Ƿ�
		//Ŭ�������� �Ἥ �����ϴ� ����� ������
		Test.b=500;
		System.out.println( t1.b );
		System.out.println( t2.b );
		System.out.println( t3.b );
		System.out.println();
		
		
		
		//static���� (Ŭ���� ����) �� ����ұ�?
		//���� Ŭ������ ��ü���� ��� ���� ���� �����ϰ� ���� �� ���
		//ex) FirstŬ������ ��ü�� � ����� ���°�?
		//-- ��ü���� ������ ���������� ������ FirstŬ������ ���� 1���� ������ ī����
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		new First();
		
		
		
		//�޼ҵ嵵 static Ű���� ���밡��
		//static ����� ��ü���� �ƴ϶� Ŭ������ ���  : Ŭ���� �޼ҵ����� �θ�
		t1.show();
		Test.show(); //-��ü���� ���� Ŭ������ �ٷ� ȣ���� ����! �׷��� staticŰ���带 �޼ҵ� �տ� ��
		//Test.aaaaa(); //error : �Ϲݸ޼ҵ�� ��ü�� �����ؾ߸� ȣ���� ����
		
		t1.aaaaa();
		
		
		//���� �� �����ϰ�..
		//AAA.obj.show(); - �ν��Ͻ� ����
		System.out.println();
		//���� �Ʒ��� �Ȱ��� ����
		
		AAA.obj.bb();
		//AAA.BBB.bb(); //error

		BBB.bb();
		
		
		//�ʱ�ȭ����
		new Second();
		new Second();
		new Second();
		new Second();
		new Second();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}