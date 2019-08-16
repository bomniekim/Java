public class SynchronizedTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���°�ü ����
		Account acc = new Account();

		// acc���¿� 100���� �Ա��ϰ� ���� ��1
		TestThread t1 = new TestThread(acc);

		// acc���¿� 100���� �Ա��ϰ� ���� ��2 - ���� �ڿ��� ���ÿ� �����ϰ� ���� �� ���� �߻�
		TestThread t2 = new TestThread(acc);

		// ����� ������ �� �� 100�� �Ա� ���� ����
		t1.start(); // run()�޼ҵ尡 �߻�
		t2.start();

	}

}// main class

//������� Ŭ����
class Account {

	int money = 0;

	// �Աݱ�� : ����ȭ ó���� �Ǿ� ���� ������ ���������� �߸��� ������ ����
	/// �̸� �ذ��ϱ� ���� ����ȭ(synchronized)ó��
	// ���1. �޼ҵ忡 ����ȭ ó�� - 0���� ���� ������ 1���� ���
//	synchronized void add(int m) {
//		String name=Thread.currentThread().getName(); //�ð�����
//		System.out.println(name+" �����ܾ� : "+ money);
//		money += m;
//		
//		//����ó�� �ð��� �����Ͽ� �������� �����ɸ��� �۾� �ڵ�
//		for(int i=0; i<200000; i++) {
//			String a = "aaa";
//		}///////////////////////////////////////
//		
//		System.out.println(name+" �Ա� �� �ܾ� : "+ money);
//		System.out.println();
//}

	// ���2. ����ȭ�� - ���� ����?
	void add(int m) {
		
		System.out.println("�Ա��۾��� �����մϴ�.");
		synchronized (this) {
	
		String name = Thread.currentThread().getName(); // �ð�����
		System.out.println(name + " �����ܾ� : " + money);
		money += m;

		// ����ó�� �ð��� �����Ͽ� �������� �����ɸ��� �۾� �ڵ�
		for (int i = 0; i < 200000; i++) {
			String a = "aaa";
		} ///////////////////////////////////////

		System.out.println(name + " �Ա� �� �ܾ� : " + money);
		System.out.println();
		}
	}
		
}// Account class

//������¿� �Ա��ϴ� ����� �����ϴ� ThreadŬ���� ����
class TestThread extends Thread{
	
	Account acc;//������ ���� Ŭ���� ��������
	
	public TestThread(Account acc) {
		this.acc= acc;		
	}
	
	@Override
	public void run() {
		//100���� ���¿� �Ա��ϴ� ���� ����
		acc.add(100);
		}
	
}
