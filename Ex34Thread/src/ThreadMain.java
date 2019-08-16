
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread(������) : ���ÿ� ���� �۾��� ó���ϴ� ���
		// 1. ���μ��� : �������� �ϳ��� �ڹ� ���α׷� [���θ��� �޸𸮿����� ����(Method, Stack, Heap)] - ���μ��������� �ڿ����� �Ұ�
		// 2. ������ : �ϳ��� ���μ����ȿ��� �����ϴ� �ϲ�(����)���� ���� - �ϳ��� ���μ��� �ȿ��� ������ ������ �ڿ����� ����

		// ���ÿ� ������ �ϴ� �۾� 2�� ����!
		// ��) ���� �ٿ�ε� �ϸ鼭 ���ǵ�� & ä���ϱ� ��

		// ���� ��Ʈ��ũ�� ����� �ʾ����� �׳� ������ �ִ� �ڵ�

		// 20���� ������ �ٿ�ε��ϴ� �۾�
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "�� ���� �ٿ�ε� ��...");

			// ������ ��� ���
			for (long k = 0; k < 1000000000; k++) {
			}
		}
		System.out.println("���� �ٿ�ε� �Ϸ�!");

		// 20���� ������ ����ϴ� �۾�
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "�� ���� ���");

			// ������ ��� ���
			for (long k = 0; k < 1000000000; k++) {
			}
		}
		System.out.println("���� ��� �Ϸ�!");
		
		
		//�� 2���� �۾��� ���ÿ� �Ǹ� �� ���� �۾�ó�� ����
		// ���? ������ �� ä���ϸ� ����
		// ���⼭ ���� �Ϲ� ��ü�� Thread��ü�� ȥ����
		// ��ü�� ���� ����ٰ� �ؼ� ���ο� ������ ����� ���� �ƴ�!
		
		// ���� �ٸ� ��ü�� ����� �����غ���..
//		WorkerA workerA= new WorkerA();
//		workerA.work(); // �� �޼ҵ带 �����ϴ� ������� Main Thread
//		
//		WorkerB workerB= new WorkerB();
//		workerB.work();
		// �� �۾��� ��ü�� 2������ �� �����δ� Main Thread(����)�� ȥ�ڼ� �۾��ϴ� ����.
		// Main Thread�� worker�� �����Ű�� ��
		// �׷��� ���� �۾��� �ȵ�!

		// �׷� ��¥ ����(Main Thread)����.. ����(Thread��)��ü�� ������ ���� �۾��� ����.
		// How?--> Thread�� �ɷ��� �ϻ�ޱ�--> ThreadŬ���� [���]
		// ��, �Ϲ� Ŭ������ �ƴ϶� Thread�� ����� Ŭ������ ��ü�� ���� ���!
		ThreadA a = new ThreadA();
		a.start();// �۾� ���� ��û(Thread��ü�� run()�޼ҵ尡 �ڵ� ����)

		ThreadB b = new ThreadB();
		b.start();
		
		//Thread�� �켱��(cpu�����ð�) ���� �ο� ����(0~10):setPriority (����~����)
		a.setPriority(1); //����
		b.setPriority(10); //����
		
		//Thread.sleep()�� �ϸ� �켱������ ���ǹ�
		//�ݺ�Ƚ���� �ʹ� ������ �켱���� ȿ���� ���� ����
		//�ݺ�Ƚ���� 20->2000
		//Main Thread�� �⺻ �켱����(5)�� �����Ǿ� ����.
				
		//Main Thread�� Thread�̹Ƿ� �� a,b �۾���(������)�� ���ÿ� ������ �۾� ����
		for(int k=100; k<12000; k++) {
			//���� �� �ڵ带 �����ϴ� �����尡 ��������?
			Thread t= Thread.currentThread();
			String name= t.getName();
			
			System.out.println( name+ " : " + k ); //Main Thread
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

	}

}//Main class

//���� �ٿ�ε带 �ϴ� ���� Ŭ����(Thread�� ��ӹ���)
class ThreadA extends Thread{
	//��� ThreadŬ������ �۾��� �� �޼ҵ�ȿ��� �ۼ��ؾ� �� ��.
	//ThreadŬ���� �ȿ� �ִ� run()�޼ҵ带 �������̵� �ؼ� ����ؾ߸� ��.
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(i + "�� ���� �ٿ�ε� ��...");
			
			//1�ʵ��� ���
			try {				
				Thread.sleep(1000); //1000ms���� ��� �����
			} catch(Exception e) {}
			
			
			//������ ��� ���
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("���� �ٿ�ε� �Ϸ�!");		
	}
	
}

//������� �۾� ���� Ŭ����(Thread�� �����)
class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println( i + "�� ���� ���");
			
			//1�ʵ��� ���
			try {				
				Thread.sleep(1000); //1000ms���� ��� �����
			} catch(Exception e) {}
			
			//������ ��� ���
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("���� ��� �Ϸ�!");
	}	
}



//���� �ٿ�ε��ϴ� �۾��� Ŭ���� ����
class WorkerA{
	//���ϴٿ�ε� �۾��޼ҵ�
	void work() {
		for(int i=0; i<20; i++) {
			System.out.println(i + "�� ���� �ٿ�ε� ��...");
			
			//������ ��� ���
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("���� �ٿ�ε� �Ϸ�!");		
	}
}


//���� ����� ���ִ� �۾��� Ŭ���� ����
class WorkerB{
	//20���� ���� ����۾� �޼ҵ�
	void work() {
		for(int i=0; i<20; i++) {
			System.out.println( i + "�� ���� ���");
			
			//������ ��� ���
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("���� ��� �Ϸ�!");
	}
}




