
public class JoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JThread j = new JThread();
		j.start(); // 5초가 소요되는 작업시작!

		// j의 작업이 끝날때 까지 다른 스레드들은 작업을 기다려줬으면..(block)
		try {
			j.join(); // JThread의 run()작업이 끝날때 까지 다른 스레드들은 모두 all stop

		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// synchronized와 비슷하지만 다름.
		// synchronized는 같은 자원(객체)를 건드릴때만 블럭킹됨.

		// join()은 같은 객체사용이고 뭐고. 상관없이 그냥 다 블럭킹!!

		// Main Thread가 다른 작업 수행
		for (int i = 0; i < 10; i++) {
			System.out.println("main...");

			try {
				Thread.sleep(500); // 0.5초
			} catch (Exception e) {
			}

		}
	}

}

class JThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("aaa");

			try {
				Thread.sleep(500); // 0.5초
			} catch (Exception e) {
			}
		}
	}
}