
public class Main {

	public static void main(String[] args) {
		
		//�Ϲ����� Ŭ�������� ������ �������
		Test t = new Test(); //�Ϲ� Ŭ������ �׳� �νĵ�
		
		//InnerŬ������ OuterŬ���� �ۿ����� �ν��� ���� ����
		//Nice n; //error
		
		//OuterŬ�������� ����ϸ� �νİ���
		Test.Nice n;
		
		//�ν��� ������ ��ü������ �Ұ�!
		//Test.Nice n2 = new Test.Nice(); //error
		
		
		//InnerŬ���� ����ϱ�! : Outer��ü���� Inner��ü ������ �Ƿ��ϱ�! 
		Test.Nice n3 = t.makeInnerClassObject();
		n3.aaa();
		
		//�����ڵ��� ��ȣ���� �ʴ� �̳ʰ�ü ����� ǥ���
		Test.Nice n4= t.new Nice();
		
		
		//�̳�Ŭ�������� staticŰ���� ���� ������.
		//�ƿ��Ͱ�ü���� static �̳�Ŭ������ü ���� ������!
		First.Hello h= new First.Hello();
		h.show();
	}

}
