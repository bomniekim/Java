
public class YieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadAA t1= new ThreadAA();
		ThreadBB t2= new ThreadBB();
		
		t1.start();
		t2.start();
		
		//5초후에 B만 실행되도록..(A가 cpu사용을 양보[yield]하도록)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.flag= false;
		
		//5초후에 A만 실행하도록..(B가 cpu사용을 양보)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.flag= false;
		t1.flag= true;
		
		//5초뒤에 A, B 둘다 종료!!!
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//스레드 종료!![스레드의 run()메소드가 종료되면 스레드가 멈춤]
		//t1.stop();//이 메소드는 가급적 사용금지
		//while문을 종료하도록..
		t1.isRun= false;
		t2.isRun= false;
		
		

	
	}

}
