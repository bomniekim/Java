
//interface == abstract class �� ����� ����
public class InterfaceMain {

	public static void main(String[] args) {
	
		//�������̽� interface
		//[�߻�޼ҵ常 ���� �߻�Ŭ���� ���� ��]
		//�������̽��� ���� new ��ü���� �Ұ�!
		//Test t= new Test(); //error
		
		//����Ϸ���? �������̽��� ����Ͽ� ���ο� Ŭ������ ����� �̸� ��ü�� �����ؾ߸� ��.
		First f = new First();
		f.aaa();
		f.bbb();
		
		//Test�������̽��� ������ SecondŬ������
		//�ڡڡڡڡڹ����� aaa(), bbb()�� �������̵��ؼ� �����ߴٴ� Ȯ���� �����ڡڡڡڡ�
		Second s = new Second();
		s.aaa();
		s.bbb();
		
		Test t; //�������̽��� ��������(�θ���������)
		t= new First(); //����: �� ĳ����
		t.aaa(); //First aaa...
		t.bbb(); //First bbb...
		
		t= new Second();
		t.aaa(); //Second aaa...
		t.bbb(); //Second bbb...
		
		
		//Test�������̽� �ȿ� �ִ� �̳�Ŭ����(Hello) ��ü ����
		//Hello h; //error �ƿ���Ŭ������ ���!
		Test.Hello h = new Test.Hello(); //static innerŬ������ �ƿ��Ͱ�ü ���� ���� ����
		h.show();
		
		
		
		
	}
}
