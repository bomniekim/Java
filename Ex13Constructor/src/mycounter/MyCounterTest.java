package mycounter;

public class MyCounterTest {

	public static void main(String[] args) {
		
		MyCounter obj1 = new MyCounter(); 
		MyCounter obj2 = new MyCounter();
		//new�� �� ������ ȣ�� - ��ü�� ������ �� ��ü�� �ʱ�ȭ�ϴ� Ư�� �޼ҵ�
		
		System.out.println("��ü 1�� counter = "+ obj1.cnt);
		System.out.println("��ü 2�� counter = "+ obj2.cnt);

		//������ �޼ҵ��� �����ε�
		MyCounter obj3 = new MyCounter(100); 
		MyCounter obj4 = new MyCounter(200);
		
		System.out.println("��ü 3�� counter = "+ obj3.cnt);
		System.out.println("��ü 4�� counter = "+ obj4.cnt);
	}

}
