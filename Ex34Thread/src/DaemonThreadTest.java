
public class DaemonThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DThread t= new DThread();
		t.setDaemon(true); //Main Thread�� ����Ǹ� �ڵ����� ���� ����ǵ���!
		t.start();
		
		try {
			Thread.sleep(5000);//Main Thread 5�ʰ� ���߱�
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main ����!!");
	}

}

class DThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


















