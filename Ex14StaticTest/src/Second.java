
public class Second {

	
	int a;
	static int b;
	
	static
	{
		System.out.println("static �ʱ�ȭ��");
		a=10; // error - �ν��Ͻ� ������ �ʱ�ȭ �Ұ���
		b=50;
	}
	
	//�ʱ�ȭ �� - �ν��Ͻ� �ʱ�ȭ ��
	{
		System.out.println("instance �ʱ�ȭ ��");
		a=10;
		b=50;
	}
}
