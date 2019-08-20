
public class ThreadControlTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//Ÿ�̾������ϴ� ������ü ����[���� ä��]
		CThread t= new CThread();
		t.start();
		
		//3���Ŀ� �Ͻ�����(pause) - wait()�޼ҵ� �̿�
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//t.wait();//�� wait()�޼��带 ȣ���ϴ� Main�����尡 wait��!
		//System.out.println("main");
		t.pauseThread();
		
		
		//3���Ŀ� �̾��ϱ�(resume) - notify()�޼ҵ� �̿�!
		Thread.sleep(3000); //throws�� �߱⿡ try��������
		
		t.resumeThread();
		
		
		//3���Ŀ� ���(Thread���� : run()�޼ҵ� ����)
		Thread.sleep(3000);
		
		//Thread���� run()�� �����Ű�� �޼ҵ尡 ������.
		//t.stop();// deprecate�� �޼ҵ�, ���������̹Ƿ� �۾��� �������� �ȵȻ��¿��� ���ڱ� ���⿩���� ����...
		//while�� ������ run()�� ������� �ʴ� ���̹Ƿ� while���� ������ false�� �����Ͽ� �����ϵ��� �ؾ� ������.
		//t.isRun= false;
		//��ü�� ������� �� ��ü�� �����ϵ��� �ϴ� ���� OOP�� �⺻ ��Ģ!
		t.stopThread();
		
		

	}//main method..

}//ThreadControlTest class...

//Ư�� �۾��� �����ϴ� ����[������] Ŭ����
class CThread extends Thread{
	
	boolean isWait= false;
	boolean isRun= true;
	
	@Override
	public void run() {
		//Ÿ�̾� 4�� �����۾�
		while(isRun) {
			System.out.println("1�� Ÿ�̾� ����");
			System.out.println("2�� Ÿ�̾� ����");
			System.out.println("3�� Ÿ�̾� ����");
			System.out.println("4�� Ÿ�̾� ����");
			System.out.println();
			
			if(isWait) {
				try {
					//wait()�� ����Ϸ��� �ݵ�� ����ȭ ó���ؾ� �� ��.
					synchronized (this) {
						wait();//�� �ڵ带 �����ϴ� ������(CThread)�� wait��
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//1�� ���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//while...
		
	}//run method..
	
	//isWait������ ���� �����ϴ� �޼ҵ�
	//�Ͻ������ϴ� ��ɸ޼ҵ�
	void pauseThread() {
		isWait= true;
	}
	
	//�̾��ϱ� ��ɸ޼ҵ�
	void resumeThread() {
		isWait= false;
		
		synchronized (this) {
			this.notify();
		}		
	}
	
	//������ ���� ��� �޼ҵ�
	void stopThread() {
		isRun= false;
		
		//Ȥ�� wait()�Ǿ� ���� ���� �ֱ⿡...
		//while���� ���� �˻縦 ���ϹǷ�...
		//wait()�Ǿ� �ִ� �����带 �����!!
		synchronized (this) {
			this.notify();
		}
		
	}
	
	
	
}//CThread class...

















