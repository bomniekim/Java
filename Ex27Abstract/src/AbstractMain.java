
public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] anis = new Animal[5];

		anis[0] = new Dog();
		anis[1] = new Pig();
		anis[2] = new Cat();
		anis[3] = new Dog();
		anis[4] = new Cat();

		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();

		// ����� �ȵǴ� Animal ��ü�� ����
		// Animal ani = new Animal();//error

		// �߻�Ŭ������ ��ٷ� ��ü ���� �Ұ�!!
		// Test t= new Test();
		// �ڡڡڡڡڡ��߻�Ŭ���� �׳� ����ϴ� ���� �ƴ϶� ����ؼ� ����ԡڡڡڡڡڡ�
		// TestŬ������ ����� AAAŬ���� ����� ����غ���!!
		AAA obj = new AAA();
		obj.aaa();
		obj.show();
		Test.bbb(); // static�޼ҵ�� ��ü���� �ƴ϶� Ŭ���������� ����

		Test t = null; // �θ���������

		t = new AAA(); // �� ĳ����
		t.aaa();

		t = new BBB(); //�� ĳ����
		t.aaa();
		

		//Test���� �߻�Ŭ������ �׻� ����� ������ 
		//����� �޾ƾ� �ϱ⿡ ���ο� Class�� �����߸� �Ѵ�.
		//�̷������� �ϴٺ���.. ���߿� class�̸� ����ϴ� ���� �ſ� ¥��
		//Ŭ������ ���� ���ο� Ŭ������ ����� ���� ����
		//�̸� ���� Ŭ���� �����! [��ӹ޴� Ŭ������ ���� ������]
		
		
		
		//Test�� ����� �̸����� ���ο� class�� �����ϸ鼭 ��ü�� ������ ��
		//�̸��� ���� Ŭ����: �͸�Ŭ����(Anonymous Class)
		
		//��ü�� ����鼭 Ŭ������ ����!
		t= new Test() { //�͸�Ŭ������ �����ϰ� �ִ� �� (�� ĳ����) - �͸� ��ü �ȿ� Test��ü�� ����

			@Override
			void aaa() {
				// TODO Auto-generated method stub
				System.out.println("�͸�Ŭ������ aaa()");
			}

			@Override
			void ccc() {
				// TODO Auto-generated method stub
				
			} //Ŭ���� �ۼ� ����
		
			
		};
		t.aaa(); //�͸�Ŭ������ aaa()
		
		//�͸�Ŭ������ 1ȸ�� ��ü�� ���� �� ���� ���
		
		
	}// main method..
	

}// Main class...


class BBB extends Test {

	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("BBB aaa()");
	}

	@Override
	void ccc() {
		// TODO Auto-generated method stub
		
	}
	
}



// �߻�Ŭ������ ����ϴ� Ŭ����
class AAA extends Test {
	// �߻�޼ҵ带 ���� �߻�Ŭ������ ��ӹ�����...
	// ����� �������� ���� �޼ҵ尡 �ִٴ� ���̹Ƿ�..�׳� ��ü�� �����ϵ��� �ϸ�
	// ��ɾ��� �޼ҵ带 �����ϴ� ���°� �ǹǷ�..�̴� �ڹٿ��� ������� ����!!
	// �ݵ�� �߻�޼ҵ�� �������̵带 �ؾ߸� ��!!!
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AAA aaa()");
	}

	@Override
	void ccc() {
		// TODO Auto-generated method stub

	}

	// �����ڸ޼ҵ�
	public AAA() {
		System.out.println("AAA ������!!");
	}

}

//�߻�Ŭ���� : ��ü������ �ȵǴ� Ŭ����
abstract class Animal { // public class�� �ϳ���! - ���ϸ�� ���ƾ� ��
	// ��ӿ� �޼ҵ�
	// ������ ���� �̸��� �����ϴ� �޼ҵ�
	abstract void say(); // �߻�޼ҵ�
	// �߻�޼ҵ�� �ڽ�Ŭ�������� [�ݵ��] �������̵� �ؾ߸� ��(������)

}

class Dog extends Animal {
	// �������̵�
	void say() {
		System.out.println("�۸�!");
	}
}

class Cat extends Animal {
	// �������̵�
	void say() {
		System.out.println("�߿�~");
	}
}

class Pig extends Animal {
	// �������̵�
	void say() {
		System.out.println("�ܲ�!");
	}
}

class Duck extends Animal {
	// �߻�޼ҵ�� �ݵ�� �������̵� �ؾ߸� �Ѵ�.
	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("��!��!");
	}
}
