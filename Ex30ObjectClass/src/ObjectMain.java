import java.util.Random;

public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Object class : ��� Ŭ������ �θ�Ŭ����(�ֻ��� Ŭ����)

		// Java�� �����ϴ� ��� Ŭ�������� extends�� ��ÿ��ο� �������
		// ������ ObjectŬ������ ��ӹ��� ���·� ���������.
		// ��������� �ٸ� Ŭ������ ��ӹ޾Ҵ��� ObjectŬ������ ��ӵ� (���߻���� ����OK)

		Test t = new Test();
		// TestŬ������ ��������� �ƹ��͵� ������� �ʾ�����
		// �⺻������ ObjectŬ������ ��ӹ��� ������

		// ObjectŬ������ �ֿ� �޼ҵ��
		// 1. toString() - ��ü�� �Ұ��ϴ� ���ڿ��� �����ϴ� �޼ҵ�
		// 2. equals(Object obj) - ���޹��� obj�� ���� ��ü���� ���� ����[true, false]
		// 3. hashCode() - ��ü�� �ؽ��ڵ带 ��ȯ [����Ÿ�� int]
		// 4. getClass() - Ŭ������ ������ ���� [����Ÿ�� Class]
		// 5. finalize() - �Ҹ��� (�������� �ݴ�)
		// 6. wait(), notify(), notifyAll() - �̰� Thread���� ��

		// �� �߿��� �׳��� ����ϴ� ���� toString(), hashCode(), getClass()

		// 1. toString()�޼ҵ� : ��ü�� ���� �Ұ� ���ڿ� ����
		String s = t.toString();
		System.out.println(s); // default: "Ŭ������@�ؽ��ڵ�"
		// �ؽ��ڵ�: �޸��� �����ּҸ� ����ּҷ� ǥ���� �ڵ�(�ڹٿ����� �ּ�) : ex)����â���� ��ǰ��ȣ ���� ����

		Test t2 = new Test();
		String s2 = t2.toString();
		System.out.println(s2);

		Random rnd = new Random();
		String s3 = rnd.toString();
		System.out.println(s3); // default: "��Ű����.Ŭ������@�ؽ��ڵ�" //java.util.Random@�ؽ��ڵ�

		// toString()�� Ư���� ���
		String str = new String("Hello");
		String s4 = str.toString();
		System.out.println(s4); // Hello

		// ��ӹ��� toString()�޼ҵ��� ��ɺ��� ���� - override
		// ��, ��ü �Ұ����� �� ������� �����ϰ� �ʹٸ�? ex) ������� �� ����ϱ�
		// toString() �������̵� �ؼ� ����ϱ�
		First f = new First();
		String s5 = f.toString();
		System.out.println(s5);

		// ��ǥ������ ����� Ŭ������ StringŬ������!

		First f2 = new First();
		System.out.println(f2.toString());

		// �� System.out.println()�޼ҵ��� Ư���� �����
		// �Ķ���ͷ� ��ü�� ���޵Ǹ� �ڵ����� toString�� ���ش�.
		System.out.println(f2);
		System.out.println(f2.toString());
		// �� ������ ���� ����� ������. why? �ڵ� toString()�� ȣ��Ǳ� ������

		// 2. equals(Object obj) : ���� ��ü������ Ȯ���ϴ� �޼ҵ�
		Test t3 = new Test();
		Test t4 = new Test();
		System.out.println(t3.equals(t4));// false

		Test t5 = t3;
		System.out.println(t3.equals(t5));// true

		// ������� �� �Ⱦ�....��?? �׳� ������������ ���ϸ� �Ǵϱ�..
		System.out.println(t3 == t4); // false
		System.out.println(t3 == t5); // true

		// Ư���ϰ�.. StringŬ������ equals()�� �������̵��ؼ�
		// String�� ��ü�񱳰� �ƴ϶�..������ ���ڿ����� �񱳸� �ϵ��� �����Ͽ� ���.
		
		
		//3. getClass() : Ŭ������ ������ ���� Class��ü ����
		Test t6= new Test();
		Class c=t6.getClass();
		System.out.println( c.getName() );
		System.out.println( c.getSuperclass() );
		System.out.println( c.getPackage() );
		System.out.println( c.getFields() );
		
		
		// 4. hashCode() : �ڹٿ����� �ּҰ�(����)
		Test t7 = new Test();
		int hc = t7.hashCode();
		System.out.println( hc );
		
		Test t8 = new Test();
		hc = t8.hashCode();
		System.out.println( hc ); //���� �ٸ� �ּ�
		
		
		
		// 5. finalize() - �Ҹ��� : �������� �ݴ�
		//��ü�� �Ҹ�� �� �ڵ� ȣ��
		Sample sample = new Sample();
		sample = null; //���������� ���̻� ��ü�� �������� �ʵ��� 
		//�׷��� �Ǹ� GC(Garbage Collector)�� �ڵ����� ��ü�� �Ҹ��Ŵ
		
		
		
		//Object���������� ��� Ŭ������ �θ��̹Ƿ�..
		//� ��ü�� ������ �� ����
		//���� �������� ���� ����
		Object obj= null;
		obj= new Test(); //�θ�->�ڽ� ��������
		obj= new First(); //�� ĳ����
		obj= new Sample();
		obj= new String();
		obj= new Random();
		
		//��ǥ������ ����� �� - �޼ҵ��� �Ķ���ͷ� � ��ü�� �ް� ���� ��! [����Ÿ�Ե� ��������]
		//System.out.println();
		System.out.println( new Random().toString() );
		System.out.println( new String() );
		System.out.println( new Test() );
		
		
		//����//////////////////////////////
		// |(��Ʈ)�� ||(��) �������� ����
		int age=15;
		if(age<2 || age>10) System.out.println("aaa"); // aaa
		if(age<2 | age>10) System.out.println("aaa"); // aaa : error�ƴ�
		
		String k=""; //null�� �ƴ�
		int len=k.length();
		
		
		if( k.length()==0 || k==null ) { //�ȵ���̵忡�� ���� ���̴� �ڵ�
			System.out.println("���ڿ��� ����.");
		}
		
		
		if( k==null | k.length()==0 ) {
			System.out.println("���ڿ��� ����.");
		}
		
	}
	
	

}
