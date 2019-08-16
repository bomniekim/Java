
public class SynchronizedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MP3 mp3 = new MP3();
		
		mp3.play(); //Main Thread�� ����
		
		MyThread myThread = new MyThread(mp3);
		myThread.start(); //run()�޼ҵ� �ߵ�! : 5�� �ҿ�Ǵ� �۾�
			
		//Main Thread�� ���ÿ� mp3�� �����Ű�� ��찡 �߻��� �� ����.
		mp3.play();
		
		//���ÿ� 1���� mp3�� �ǵ帮�� �Ǿ� �� ����� ���׹����� ��
		
		//�̸� �ذ��ϱ� ���� �ϳ��� �����尡 play()�� �ϰ� �ִٸ�
		//�ٸ� �����尡 ���� play()�� �� ȣ���ϴ��� ��� ����Ű���� �ϴ� ����� �ʿ�
		//���ÿ� ����Ǹ� �ȵǴ� �޼ҵ�(play())�� ����ȭ(synchronized) ó��

	}

}

//Thread Ŭ���� : mp3�÷��̾ �����Ű�� ����� ����
class MyThread extends Thread{
	
	MP3 mp3;
	
	public MyThread(MP3 mp3) {
		this.mp3=mp3;
	}
	
	@Override
	public void run() {
		mp3.play();
	}
}

//�����÷��̾� Ŭ���� [MP3 �÷��̾�]
class MP3{
	
	int musicNum= 0;
	
	//����ȭ ó��
	//���1. �޼ҵ带 ��ä�� ����ȭ ó���ϱ�!-Ư����Ʈ���� �ǵ帮�� �ʰԲ�
//	synchronized void play() {
//	
//		System.out.println("�÷��� ����� ����Ǿ���!!");
//		
//		//5������ musicNum�� �ش��ϴ� �������� ����!
//		musicNum++;
//		for(int i=0; i<5; i++) {
//			System.out.println(musicNum+"�� ���� �����~~");
//			
//			//1�� ���
//			try {
//				Thread.sleep(1000);//1000ms : 1��
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}
	
	//���2. Ư�� �ڵ� ������ ����ȭ �� ó��..
	void play() {
		
		//����ȭ�� �ۿ� �ִ� �� �ڵ�� ����ȭ ó������ ����.
		System.out.println("�÷��� ����� ����Ǿ���!!");
		
		//5������ musicNum�� �ش��ϴ� �������� ����!		
		//�� ������ ����ȭ ��ó��
		synchronized (this) {
			musicNum++;
			for(int i=0; i<5; i++) {
				System.out.println(musicNum+"�� ���� �����~~");
				
				//1�� ���
				try {
					Thread.sleep(1000);//1000ms : 1��
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
		
		
	}
	
}




