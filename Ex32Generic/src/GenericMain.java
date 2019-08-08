import java.util.Random;

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ �ϳ��� ��������� �����Ͽ� ������ �ִ� Box��ü
		Box box = new Box();

		box.setA(10);
		System.out.println(box.getA());

		box.setA(3.14);
		System.out.println(box.getA());

		box.setA("Hello");
		System.out.println(box.getA());

		
		// ���ɹڽ��� ���� ��ó�� ����.. �Ϻ� �����Ҹ� ��
		// ���� ������ ���� �� ¥�� [��������� �ٿ�ĳ������ �ؾ߸� ��� ����]
		box.setA(10);
		int n = (int) box.getA(); // Object->Integer->int

		box.setA(3.12);
		double d = (double) box.getA(); // Object->Double->double

		box.setA(new String("Nice"));
		String s = (String) box.getA();// �ٿ�ĳ����: Object->String

		
		
		
		
		// Ŭ���� �ϳ��� �����ؼ� ���� �ڷ����� ��� ���� �� �ִ� ��ü�� �����!
		// ��ü�� ������ �� �ڷ����� �����ϴ� ���!
		Box2<String> box2 = new Box2<String>();
		box2.a = "aaa";

		Box2<Random> box3 = new Box2<Random>();
		box3.a = new Random();

		
		
		// �⺻�� �ڷ����� Generic <>�� ��� �Ұ�!
		// Box2<int> box4= new Box2<int>();//error

		// ���׸��� �������� ����
		// �׷� �⺻�������ʹ� ���? WrapperŬ���� �̿�
		
		Box2<Integer> box5 = new Box2<Integer>();
		box5.setA(10);// ���� �ڽ�
		int k = box5.getA();// ���� ��ڽ�

		
		
		
		// 2�� �̻��� ���׸�
		Box3<String, Integer> box6 = new Box3<String, Integer>();
		box6.a = "Hello";
		box6.b = 10;

		Box3<Integer, Random> box7 = new Box3<Integer, Random>();
		box7.a = 100;
		box7.b = new Random();

	}

}// Main class



//���׸��� 2���� �̻��� �ڷ����� ������.
class Box3<T, K> {
	T a;
	K b;
}



//Ŭ������< > : ���׸� ���� - �ڷ����� ���� ������ ���·� Ŭ������ �����ϴ� ���
//���ڹٲ�ġ�� ���� ���� : T��� ���ڰ� new�� �� ������ Ŭ������ �����.
class Box2<T> {
	// ������� - �� �ڷ����� �����̾�����.....
	T a;

	public void setA(T a) {
		this.a = a;
	}

	public T getA() {
		return a;
	}
}




class Box {

	// ���� �ڷ���! � �ڷ����̵� ���� �� �ִ� �������
	// [Object]
	private Object a;

	public void setA(Object a) {
		this.a = a;
	}

	public Object getA() {
		return this.a;
	}

}



