
public class ThreadControlTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//타이어조립하는 직원객체 생성[직원 채용]
		CThread t= new CThread();
		t.start();
		
		//3초후에 일시정지(pause) - wait()메소드 이용
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//t.wait();//이 wait()메서드를 호출하는 Main스레드가 wait됨!
		//System.out.println("main");
		t.pauseThread();
		
		
		//3초후에 이어하기(resume) - notify()메소드 이용!
		Thread.sleep(3000); //throws를 했기에 try생략가능
		
		t.resumeThread();
		
		
		//3초후에 퇴근(Thread종료 : run()메소드 종료)
		Thread.sleep(3000);
		
		//Thread에는 run()을 종료시키는 메소드가 존재함.
		//t.stop();// deprecate된 메소드, 강제종료이므로 작업의 마무리가 안된상태에서 갑자기 멈출여지가 있음...
		//while문 때문에 run()이 종료되지 않는 것이므로 while문의 조건을 false로 변경하여 종료하도록 해야 안전함.
		//t.isRun= false;
		//객체의 멤버값은 그 객체가 직접하도록 하는 것이 OOP의 기본 원칙!
		t.stopThread();
		
		

	}//main method..

}//ThreadControlTest class...

//특정 작업을 수행하는 직원[스레드] 클래스
class CThread extends Thread{
	
	boolean isWait= false;
	boolean isRun= true;
	
	@Override
	public void run() {
		//타이어 4개 조립작업
		while(isRun) {
			System.out.println("1번 타이어 조립");
			System.out.println("2번 타이어 조립");
			System.out.println("3번 타이어 조립");
			System.out.println("4번 타이어 조립");
			System.out.println();
			
			if(isWait) {
				try {
					//wait()을 사용하려면 반드시 동기화 처리해야 만 함.
					synchronized (this) {
						wait();//이 코드를 실행하는 스레드(CThread)가 wait됨
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//1초 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//while...
		
	}//run method..
	
	//isWait변수의 값을 변경하는 메소드
	//일시정지하는 기능메소드
	void pauseThread() {
		isWait= true;
	}
	
	//이어하기 기능메소드
	void resumeThread() {
		isWait= false;
		
		synchronized (this) {
			this.notify();
		}		
	}
	
	//스레드 종료 기능 메소드
	void stopThread() {
		isRun= false;
		
		//혹시 wait()되어 있을 수도 있기에...
		//while문의 조건 검사를 못하므로...
		//wait()되어 있는 스레드를 깨우기!!
		synchronized (this) {
			this.notify();
		}
		
	}
	
	
	
}//CThread class...

















