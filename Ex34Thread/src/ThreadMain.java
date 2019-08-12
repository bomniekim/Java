
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread(������) : ���ÿ� ���� �۾��� ó���ϴ� ���
		// 1. ���μ��� : �������� �ϳ��� �ڹ� ���α׷� [���θ��� �޸𸮿����� ����(Method, Stack, Heap)] - ���μ���������
		// �ڿ����� �Ұ�
		// 2. ������ : �ϳ��� ���μ����ȿ��� �����ϴ� �ϲ�(����)���� ���� - �ϳ��� ���μ��� �ȿ��� ������ ������ �ڿ����� ����

		// ���ÿ� ������ �ϴ� �۾� 2�� ����!
		// ��) ���� �ٿ�ε� �ϸ鼭 ���ǵ�� & ä���ϱ� ��

		// ���� ��Ʈ��ũ�� ����� �ʾ����� �׳� ������ �ִ� �ڵ�

		// 20���� ������ �ٿ�ε��ϴ� �۾�...
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "�� ���� �ٿ�ε� ��....");

			// ������ ��� ���...
			for (long k = 0; k < 1000000000; k++) {
			}
		}
		System.out.println("���� �ٿ�ε� �Ϸ�!!!");

		// 20���� ������ ����ϴ� �۾�....
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "�� ���� ���~~");

			// ������ ��� ���..
			for (long k = 0; k < 1000000000; k++) {
			}
		}
		System.out.println("���� ��� �Ϸ�!!!");
		
		
		//�� 2���� �۾��� ���ÿ� �Ǹ� �� ���� �۾�ó�� ����
		// ���? ������ �� ä���ϸ� ����
		// ���⼭ ���� �Ϲ� ��ü�� Thread��ü�� ȥ����
		// ��ü�� ���� ����ٰ� �ؼ� ���ο� ������ ����� ���� �ƴ�!
		
		// ���� �ٸ� ��ü�� ����� �����غ���..
//		WorkerA workerA= new WorkerA();
//		workerA.work();
//		
//		WorkerB workerB= new WorkerB();
//		workerB.work();
		// �� �۾��� ��ü�� 2������ �� �����δ� Main Thread(����)�� ȥ�ڼ� �۾��ϴ� ����.
		// �׷��� ���� �۾��� �ȵ�!

		// �׷� ��¥ ����(Main Thread)����.. ����(Thread)��ü�� ������ ���� �۾��� ����.
		// How?--> Thread�� �ɷ��� �ϻ�ޱ�--> ThreadŬ���� ���
		// ��, �Ϲ� Ŭ������ �ƴ϶� Thread�� ����� Ŭ������ ��ü�� ���� ���!
		ThreadA a = new ThreadA();
		a.start();// �۾� ���� ��û(Thread��ü�� run()�޼ҵ尡 �ڵ� ����)

		ThreadB b = new ThreadB();
		b.start();

	}

}// Main class..


//���� �ٿ�ε带 �ϴ� ���� Ŭ����(Thread�� ��ӹ���)
class ThreadA extends Thread{
	//��� ThreadŬ������ �۾��� �� �޼ҵ�ȿ��� �ۼ��ؾ� �� ��.
	//ThreadŬ���� �ȿ� �ִ� run()�޼ҵ带 �������̵� �ؼ� ����ؾ߸� ��.
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(i + "�� ���� �ٿ�ε� ��....");
			
			//������ ��� ���...
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("���� �ٿ�ε� �Ϸ�!!!");		
	}
	
}

//������� �۾� ���� Ŭ����(Thread�� �����)
class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println( i + "�� ���� ���~~");
			
			//������ ��� ���..
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("���� ��� �Ϸ�!!!");
	}	
}



//���� �ٿ�ε��ϴ� �۾��� Ŭ���� ����
class WorkerA{
	//���ϴٿ�ε� �۾��޼ҵ�
	void work() {
		for(int i=0; i<20; i++) {
			System.out.println(i + "�� ���� �ٿ�ε� ��....");
			
			//������ ��� ���...
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("���� �ٿ�ε� �Ϸ�!!!");		
	}
}


//���� ����� ���ִ� �۾��� Ŭ���� ����
class WorkerB{
	//20���� ���� ����۾� �޼ҵ�
	void work() {
		for(int i=0; i<20; i++) {
			System.out.println( i + "�� ���� ���~~");
			
			//������ ��� ���..
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("���� ��� �Ϸ�!!!");
	}
}




