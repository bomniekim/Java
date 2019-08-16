//sleep: Thread의 동작을 잠시 멈추게

public class SleepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SThread t =new SThread();
		t.start(); //10초후에 "Hello"출력 동작
		
		//5초 후에 강제로 깨우기
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		//sleep()메소드에 의해 자고 있는 SThread에 강제로 예외를 발생! - interrupt
		t.interrupt();
		
	}

}//

class SThread extends Thread{
	@Override
	public void run() {
//		//10초 대기 후 "Hello" 글씨 출력
//		try {
//			Thread.sleep(10000); 
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			System.out.println("왜 자는데 깨워ㅠ_ㅠ!");
//		}
//		
//		System.out.println("Hello");
		
		//interrupt의 특이한 사용 [무한반복 종료]
//		while(true) {
//			System.out.println("kkk");
//			
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				System.out.println("interrupt 발생!");
//				break;
//
//			}
//		}
		//하지만 위 방법은 어찌되었든 잠시동안(1ms) 멈추는 명령이므로
		//프로그래밍 성능에 영향을 줄 수 있어 권장하지는 않음.
		
		
		while(true) {
			System.out.println("kkk");
			
			//혹시 인터럽트( .interrupt() )메소드가 호출되었는가?
			if( this.isInterrupted() ) {
				break;
			}
			
		}
	}
}
