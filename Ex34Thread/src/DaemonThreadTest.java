
public class DaemonThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DThread t= new DThread();
		t.setDaemon(true); //Main Thread가 종료되면 자동으로 같이 종료되도록!
		t.start();
		
		try {
			Thread.sleep(5000);//Main Thread 5초간 멈추기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main 종료!!");
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


















