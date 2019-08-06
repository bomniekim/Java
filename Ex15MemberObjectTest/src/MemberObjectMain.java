
public class MemberObjectMain {

	public static void main(String[] args) {

		//Ŭ���� �ȿ� ��� ������ �ٸ� Ŭ������ ���������� �ִ� ��쿡 ���� ������׿� ������ �н�
		Test t = new Test();
		System.out.println( t.a ); // 0
		System.out.println( t.p ); // null
		System.out.println();
		
		//������� �� ����
		t.a = 10;
		t.p = new Person(); //���������� ������ �� �ִ� ���� ��ü!
							//��ü�� �����Ͽ� ���������� ����
		
		
		System.out.println( t.a ); // 10
		System.out.println( t.p ); // ������ ���
		System.out.println();
		//��������� �����ϴ� �� �ٸ� ��ü�� ������� �� ���
		
		System.out.println( t.p.name ); // �⺻�� null
		System.out.println( t.p.age );  // �⺻�� 0
		System.out.println();
		
		
		//�ᱹ ��������� �����ϴ� ��ü�� ������� �������־�� �ùٸ� �������� ����� ����
		t.p.name = "Sam";
		t.p.age = 20;
		System.out.println( t.a );
		System.out.println( t.p.name ); 
		System.out.println( t.p.age );  
		System.out.println();
		
		//��ó�� ����ϴ� ���� �� ¥��..
		//Person��ü�� ������� Person�� �˾Ƽ� ���������...
		//PersonŬ������ ����� ��±���� ���� �޼ҵ� ����
		System.out.println( t.a );
		t.p.show(); //�ڱⰪ�� �ڱⰡ ���
		System.out.println();
		
		//�׷� Test Ŭ������ ��±���� �ִٸ�?
	
		t.show();
		System.out.println();
		
		
		
		//���ο� Test��ü�� ���� ����� �ʰ� ����� ��� ����
		Test t2 = new Test();
		t2.a=100;
		t2.p=new Person();
		
//		t2.p.name = "Robin";
//		t2.p.age = 23;
		//�̷� ���̸� ��ü�� ����� ���Ե� �޼ҵ带 �̿��ϸ� �������� ������?
		t2.p.setMembers("Robin", 23);
		t2.show();
		
		//�� ��Ȳ�� ���ٸ� TestŬ������ �Է±���� �ִٸ� �� ���ϰ� ������ �������� ������?
		Test t3 = new Test();
		//Person��ü�� �־�� ������� ������ ����
		Person p = new Person();
		p.setMembers("Kim", 30);
		
		t3.setMembers(1000, p);
		t3.show();
		System.out.println();
		
		//���� ���� �ᱹ TestŬ���� ��ü�� ������� �� �� 
		//a���� ���Ҿ� name�� age���� ��� ������ �־���� (��������� 2������ �� ������ 3��)
		
		Test t4 = new Test();
		t4.setMembers(152, "Hong", 40);
		t4.show();
	
		
		//������� ���ϱ�.. ��ü���� �� ����� ������ ����
		//�Ź� .setMembers()�޼ҵ带 ȣ���ϴ� �ڵ带 �����
		//��ü�� ����(new)�� �� ������� �� ���� ������ �� �� ������ ���� ������?
		//��ü ������ �ڵ����� �ѹ� ȣ��Ǵ� Ư���� �޼ҵ�: ������(constructor) �޼ҵ�!
		
		Test t5=new Test();
		t5.show();
		System.out.println();
		
		Test t6=new Test(10, new Person("Choi", 25) );
		t6.show();
		System.out.println();
		
		Test t7 = new Test(20, new String ("Lee"), 55);
		t7.show();
		System.out.println();
		
		
		
	
		
		
	}

}
